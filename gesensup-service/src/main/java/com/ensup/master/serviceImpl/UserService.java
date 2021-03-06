package com.ensup.master.serviceImpl;

import com.ensup.master.dao.IUserDao;
import com.ensup.master.daoImpl.IUserDao2;
import com.ensup.master.daoImpl.StudentDao2;
import com.ensup.master.daoImpl.UserDao;
import com.ensup.master.daoImpl.UserDao2;
import com.ensup.master.metier.User;

/**
 * CourseService
 * 
 * @author DANON
 *
 */
public class UserService implements IUserService {


	//IUserDao idao;
	private IUserDao2 dao;
	
	public UserService(IUserDao2 dao) {
		
		this.dao = new UserDao2();
		}
			
			

	

	/**
	 * get an user
	 * @param login
	 * @param password
	 * @return 
	 */
	@Override
	public User getUser(String login, String password) {
		return dao.getUser(login, password);
	}

}
