/**
 * 
 */
package com.ecom.service;

import com.ecom.entity.UserProfile;
import com.ecom.model.Response;

/**
 * 
 */

public interface EComService {

	
	public Response signin(UserProfile profile);
	public Response signup(UserProfile profile);
	
	
}
