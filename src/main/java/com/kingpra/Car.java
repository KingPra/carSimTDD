package com.kingpra;

public class Car {

	private boolean engineOn;
	private int currentGear;
	private int currentSpeed;

	public boolean isEngineOn() {
		return engineOn;
	}

	public void setEngineOn(boolean engineOn) {
		this.engineOn = engineOn;
	}

	public void startCar() {
		this.setEngineOn(true);

	}

	public void turnOffCar() {
		this.setEngineOn(false);

	}

	public int getCurrentGear() {
		return currentGear;
	}

	public void setCurrentGear(int currentGear) {
		this.currentGear = currentGear;
	}

	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(int curentSpeed) {
		this.currentSpeed = curentSpeed;
	}

	public void shiftUp() {
		this.setCurrentGear(getCurrentGear() + 1);

	}

	public void shiftDown() {
		this.setCurrentGear(getCurrentGear() - 1);

	}

}
