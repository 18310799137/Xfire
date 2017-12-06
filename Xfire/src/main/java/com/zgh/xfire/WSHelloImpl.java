package com.zgh.xfire;

public class WSHelloImpl implements IWSHello {

	public String showHello(String param) {
		return "Hi Client! Service receive param - "+param;
	}

}
