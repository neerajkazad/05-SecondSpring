package com.ss.beans;

public class FirstflightTransportImpl implements ITransportManager {

	@Override
	public String track(int code) {

		return "Product code: "+code+" reached to Ammerpet ";
	}

}
