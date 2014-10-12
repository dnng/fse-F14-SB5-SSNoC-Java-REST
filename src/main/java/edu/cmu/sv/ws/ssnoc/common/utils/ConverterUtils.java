package edu.cmu.sv.ws.ssnoc.common.utils;

import edu.cmu.sv.ws.ssnoc.data.po.LocationCrumbPO;
import edu.cmu.sv.ws.ssnoc.data.po.MessagePO;
import edu.cmu.sv.ws.ssnoc.data.po.StatusCrumbPO;
import edu.cmu.sv.ws.ssnoc.data.po.UserPO;
import edu.cmu.sv.ws.ssnoc.dto.LocationCrumb;
import edu.cmu.sv.ws.ssnoc.dto.Message;
import edu.cmu.sv.ws.ssnoc.dto.StatusCrumb;
import edu.cmu.sv.ws.ssnoc.dto.User;

/**
 * This is a utility class used to convert PO (Persistent Objects) and View
 * Objects into DTO (Data Transfer Objects) objects, and vice versa. <br/>
 * Rather than having the conversion code in all classes in the rest package,
 * they are maintained here for code re-usability and modularity.
 * 
 */
public class ConverterUtils {
	/**
	 * Convert UserPO to User DTO object.
	 * 
	 * @param po
	 *            - User PO object
	 * 
	 * @return - User DTO Object
	 */
	public static final User convert(UserPO po) {
		if (po == null) {
			return null;
		}

		User dto = new User();
		dto.setUserName(po.getUserName());
		dto.setLastStatus(po.getLastStatus());
		dto.setLastLocation(po.getLastLocation());
		dto.setLastStatusTime(po.getLastStatusTime());
		dto.setCreatedAt(po.getCreatedAt());
		dto.setModifiedAt(po.getModifiedAt());

		return dto;
	}

	/**
	 * Convert User DTO to UserPO object
	 * 
	 * @param dto
	 *            - User DTO object
	 * 
	 * @return - UserPO object
	 */
	public static final UserPO convert(User dto) {
		if (dto == null) {
			return null;
		}

		UserPO po = new UserPO();
		po.setUserName(dto.getUserName());
		po.setPassword(dto.getPassword());
		po.setLastStatus(dto.getLastStatus());
		po.setLastStatusTime(dto.getLastStatusTime());
		po.setLastLocation(dto.getLastLocation());
		po.setCreatedAt(dto.getCreatedAt());
		po.setModifiedAt(dto.getModifiedAt());

		return po;
	}
	
	/**
	 * Convert StatusCrumbPO to Status crumb DTO object.
	 * 
	 * @param po
	 *            - Status crumb PO object
	 * 
	 * @return - Status crumb DTO Object
	 */
	public static final StatusCrumb convert(StatusCrumbPO po) {
		if (po == null) {
			return null;
		}

		StatusCrumb dto = new StatusCrumb();
		dto.setStatusCrumbId(po.getStatusCrumbId());
		dto.setUserId(po.getUserId());
		dto.setUserName(po.getUserName());
		dto.setStatus(po.getStatus());
		dto.setLocationCrumbId(po.getLocationCrumbId());
		dto.setLocation(po.getLocation());
		dto.setCreatedAt(po.getCreatedAt());

		return dto;
	}

	/**
	 * Convert Status crumb DTO to StatusCrumbPO object
	 * 
	 * @param dto
	 *            - Status crumb DTO object
	 * 
	 * @return - StatusCrumbPO object
	 */
	public static final StatusCrumbPO convert(StatusCrumb dto) {
		if (dto == null) {
			return null;
		}

		StatusCrumbPO po = new StatusCrumbPO();
		po.setStatusCrumbId(dto.getStatusCrumbId());
		po.setUserId(dto.getUserId());
		po.setUserName(dto.getUserName());
		po.setStatus(dto.getStatus());
		po.setLocationCrumbId(dto.getLocationCrumbId());
		po.setLocation(dto.getLocation());
		po.setCreatedAt(dto.getCreatedAt());

		return po;
	}
	
	/**
	 * Convert LocationCrumbPO to Location crumb DTO object.
	 * 
	 * @param po
	 *            - Location crumb PO object
	 * 
	 * @return - Location crumb DTO Object
	 */
	public static final LocationCrumb convert(LocationCrumbPO po) {
		if (po == null) {
			return null;
		}

		LocationCrumb dto = new LocationCrumb();
		dto.setLocationCrumbId(po.getLocationCrumbId());
		dto.setUserId(po.getUserId());
		dto.setUserName(po.getUserName());
		dto.setLocation(po.getLocation());
		dto.setCreatedAt(po.getCreatedAt());

		return dto;
	}

	/**
	 * Convert Location crumb DTO to LocationCrumbPO object
	 * 
	 * @param dto
	 *            - Location crumb DTO object
	 * 
	 * @return - LocationCrumbPO object
	 */
	public static final LocationCrumbPO convert(LocationCrumb dto) {
		if (dto == null) {
			return null;
		}

		LocationCrumbPO po = new LocationCrumbPO();
		po.setLocationCrumbId(dto.getLocationCrumbId());
		po.setUserId(dto.getUserId());
		po.setUserName(dto.getUserName());
		po.setLocation(dto.getLocation());
		po.setCreatedAt(dto.getCreatedAt());

		return po;
	}
	
	
	/**
	 * Convert MessagePO to User DTO object.
	 * 
	 * @param po
	 *            - User PO object
	 * 
	 * @return - User DTO Object
	 */
	public static final Message convert(MessagePO po) {
		if (po == null) {
			return null;
		}

		Message dto = new Message();
		dto.setChatMessageId(po.getChatMessageId());
		dto.setContent(po.getContent());
		dto.setCreatedAt(po.getCreatedAt());
		dto.setLocation(po.getLocation());
		dto.setReceiverId(po.getReceiverId());
		dto.setSenderId(po.getSenderId());
		
		return dto;
	}
/*
	*//**
	 * Convert User DTO to UserPO object
	 * 
	 * @param dto
	 *            - User DTO object
	 * 
	 * @return - UserPO object
	 *//*
	public static final UserPO convert(User dto) {
		if (dto == null) {
			return null;
		}

		UserPO po = new UserPO();
		po.setUserName(dto.getUserName());
		po.setPassword(dto.getPassword());
		po.setLastStatus(dto.getLastStatus());
		po.setLastStatusTime(dto.getLastStatusTime());
		po.setLastLocation(dto.getLastLocation());
		po.setCreatedAt(dto.getCreatedAt());
		po.setModifiedAt(dto.getModifiedAt());

		return po;
	}
*/
}
