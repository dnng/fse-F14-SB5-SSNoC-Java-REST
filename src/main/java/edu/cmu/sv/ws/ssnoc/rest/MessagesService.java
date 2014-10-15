package edu.cmu.sv.ws.ssnoc.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.annotation.XmlElementWrapper;

import edu.cmu.sv.ws.ssnoc.common.logging.Log;
import edu.cmu.sv.ws.ssnoc.common.utils.ConverterUtils;
import edu.cmu.sv.ws.ssnoc.data.dao.DAOFactory;
import edu.cmu.sv.ws.ssnoc.data.po.MessagePO;
import edu.cmu.sv.ws.ssnoc.dto.Message;

/**
 * This class contains the implementation of the RESTful API calls made with
 * respect to a message.
 * 
 */

@Path("/messages")
public class MessagesService extends BaseService {
	/**
	 * This method loads all message in the system.
	 * 
	 * @return - List of all messages.
	 */
	@GET
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@XmlElementWrapper(name = "messages")
	@Path("/wall")
	public List<Message> loadWallMessages() {
		Log.enter();

		List<Message> messages = new ArrayList<Message>();
		try {
			List<MessagePO> messagePO = DAOFactory.getInstance()
					.getMessageDAO().loadWallMessages();

			if (messagePO != null) {
				for (MessagePO po : messagePO) {
					Message dto = ConverterUtils.convert(po);
					messages.add(dto);
				}
			}
		} catch (Exception e) {
			handleException(e);
		} finally {
			Log.exit(messages);
		}

		return messages;
	}
	
	
	/**
	 * This method fetches chat messages sent between two users
	 * 
	 * @return - list of messages
	 */
	@GET
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	@Path("/{userName1}/{userName2}")
	public List<Message> getAllChatMessagesForPeers(@PathParam("userName1") String userName1, @PathParam("userName2") String userName2) {
		Log.enter(userName1, userName2);
		List<Message> messages = null;
		try {
			if (userName1 != null && userName2 != null)
			{
				List<MessagePO> peerMessages = DAOFactory.getInstance().getMessageDAO().getAllChatMessagesForPeers(userName1, userName2);
				if (peerMessages != null) {
					messages = new ArrayList<Message>();
					for (MessagePO po: peerMessages) {
						Message dto = ConverterUtils.convert(po);
						messages.add(dto);
					}
				}
			}
		} catch (Exception e) {
			handleException(e);
		} finally {
			Log.exit(messages);
		}

		return messages;
	}


	
}
