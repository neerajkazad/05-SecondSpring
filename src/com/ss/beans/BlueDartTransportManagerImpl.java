package com.ss.beans;

//BlueDardTransportManagerImpl.java

public class BlueDartTransportManagerImpl implements ITransportManager {

	@Override
	public String track(int code) {

		return "Product code: "+code+" reached to Hyd ";
	}

}
