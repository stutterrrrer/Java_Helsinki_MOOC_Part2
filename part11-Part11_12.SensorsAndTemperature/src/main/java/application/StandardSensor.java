package application;

public class StandardSensor implements Sensor {
	private final int sensorId;
	private boolean isOn;

	public StandardSensor(int sensorId) {
		this.sensorId = sensorId;
		isOn = true;
	}

	@Override
	public boolean isOn() {
		return isOn;
	}

	public void setOn() { }

	public void setOff() { }

	@Override
	public int read() {
		return sensorId;
	}
}
