package edu.cmu.sv.ws.ssnoc.data.dao;

import java.util.List;

import edu.cmu.sv.ws.ssnoc.data.po.MessagePO;

/**
 * Interface specifying the contract that all implementations will implement to
 * provide persistence of Status Crumb information in the system.
 * 
 */
public interface IMessageDAO {
	/**
	 * This method will save the information of the wall message into the database.
	 * 
	 * @param MessagePO
	 *            - Status Crumb information to be saved.
	 */
	long saveWallMessage(MessagePO messagePO);
	
	/**
	 * This method will save the information of the chat message into the database.
	 * 
	 * @param MessagePO
	 *            - Status Crumb information to be saved.
	 */
	long saveChatMessage(MessagePO messagePO);
	
	/**
	 * This method will load all wall message in the
	 * database.
	 * 
	 * @return - List of all  wall messages.
	 */
	List<MessagePO> loadWallMessages();
	

	/**
	 * This method will load all chat message in the
	 * database.
	 * 
	 * @return - List of all  chat messages.
	 */
	List<MessagePO> loadChatMessages();
	
	/**
	 * This method will load a particular message by it's id.
	 * 
	 * @param messageId
	 *            - message id to search for.
	 * 
	 * @return - messagePO.
	 */

	MessagePO loadMessageById(long messageId);


}
