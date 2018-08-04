package com.saurabh.journaldev.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	@Qualifier("mysqlDriver")
	private DatabaseDriver dbDriver;

	public String getDbDriver() {
		return dbDriver.getInfo();
	}
}
