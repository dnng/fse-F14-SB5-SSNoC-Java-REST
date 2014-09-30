package edu.cmu.sv.ws.ssnoc.common.utils;

import edu.cmu.sv.ws.ssnoc.data.po.StatusCrumbPO;
import edu.cmu.sv.ws.ssnoc.data.po.UserPO;
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
		dto.setLastStatusCode(po.getLastStatusCode());
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
		po.setLastStatusCode(dto.getLastStatusCode());
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
		dto.setUserId(po.getUserId());
		dto.setStatusCode(po.getStatusCode());
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
		po.setUserId(dto.getUserId());
		po.setStatusCode(dto.getStatusCode());
		po.setCreatedAt(dto.getCreatedAt());

		return po;
	}
}
