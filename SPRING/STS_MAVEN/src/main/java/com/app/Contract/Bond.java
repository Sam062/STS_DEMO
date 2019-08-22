package com.app.Contract;

public class Bond {
	private String mode;
	private int time;
	private double service;
	public Bond() {
		super();
	}
	@Override
	public String toString() {
		return "Bond [mode=" + mode + ", time=" + time + ", service=" + service + "]";
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public double getService() {
		return service;
	}
	public void setService(double service) {
		this.service = service;
	}
	

}
