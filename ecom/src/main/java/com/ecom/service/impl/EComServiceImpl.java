package com.ecom.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.entity.UserProfile;
import com.ecom.model.Response;
import com.ecom.repo.UserProfileRepository;
import com.ecom.service.EComService;

@Service
public class EComServiceImpl implements EComService {

	@Autowired
	UserProfileRepository userProfileRepository;

	@Override
	public Response signin(UserProfile profile) {
		Response response = new Response();
		try {
			response.setResponseCode("01");
			response.setResponseDesc("Failed");
			UserProfile userProfile = userProfileRepository.findByNameAndPasswordAndRoleAndSecQuesAndSecAns(
					profile.getName(), profile.getPassword(), profile.getRole(), profile.getSecQues(),
					profile.getSecAns());
			if (userProfile != null) {
				response.setResponseCode("00");
				response.setResponseDesc("Profile Created successfully");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return response;

	}

	@Override
	public Response signup(UserProfile profile) {
		Response response = new Response();
		try {

			response.setResponseCode("01");
			response.setResponseDesc("Failed");
			userProfileRepository.save(profile);

			response.setResponseCode("00");
			response.setResponseDesc("Profile Created successfully");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return response;

	}

}
