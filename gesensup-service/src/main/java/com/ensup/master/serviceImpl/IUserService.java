package com.ensup.master.serviceImpl;

import com.ensup.master.metier.User;

public interface IUserService {

	/**
	 * get an user
	 * @param login
	 * @param password
	 * @return 
	 */
	User getUser(String login, String password);

}