package com.ss.beans;

public class Amazon {
	private ITransportManager transportManager;

	public void tracking(int code) {
		String track= transportManager.track(code);
		System.out.println(track);
	}

	public void setTransportManager(ITransportManager transportManager) {
		this.transportManager = transportManager;
	}

}
