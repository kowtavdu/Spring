package com.saurabh.journaldev.driver;

public class OracleDriver implements DatabaseDriver{

	protected String url;
	public String getUrl() {
		return url;
	}



	public void setUrl(String url) {
		this.url = url;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getDriver() {
		return driver;
	}



	public void setDriver(String driver) {
		this.driver = driver;
	}



	public Integer getPort() {
		return port;
	}



	public void setPort(Integer port) {
		this.port = port;
	}



	protected String username;
	protected String password;
	protected String driver;
	protected Integer port;
	
	
	
	public String getInfo() {
		// TODO Auto-generated method stub
		return "[ Oracle driver"+
				", url: "+url+
				", username: "+username+
				", password: "+password+
				", driver: "+driver+
				", port: "+port
				+ "]";
	}

}
