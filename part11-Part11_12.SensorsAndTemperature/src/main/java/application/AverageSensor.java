package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AverageSensor implements Sensor {
	private List<Sensor> sensors;
	private List<Integer> readings;

	public AverageSensor() {
		sensors = new ArrayList<>();
		readings = new ArrayList<>();
	}

	public void addSensor(Sensor toAdd) {
		sensors.add(toAdd);
	}
	@Override
	public void setOn() {
		sensors.forEach(Sensor::setOn);
	}

	@Override
	public void setOff() {
		sensors.get(0).setOff();
	}

	public boolean isOn() {
		for (Sensor sensor : sensors) {
			if (!sensor.isOn()) {
				return false;
			}
		}
		return true;
	}

	@Override
	public int read() {
		if (!isOn() || sensors.size() == 0) {
			throw new IllegalStateException("make sure all sensors are on and there are sensors in the average sensor.");
		}
		int read = sensors.stream()
				.mapToInt(Sensor::read)
				.sum()
				/ sensors.size();
		readings.add(read);
		return read;
	}

	public List<Integer> readings() {
		return readings;
	}
}
