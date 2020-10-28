package com.ensup.master.daoImpl;

import com.ensup.master.metier.User;

public interface IUserDao2 {

	User getUser(String login, String password);

}