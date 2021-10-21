package application;

public class Program {

	public static void main(String[] args) {
		// you can test your classes here:
		TemperatureSensor ts1 = new TemperatureSensor();
		TemperatureSensor ts2 = new TemperatureSensor();
		AverageSensor as = new AverageSensor();
		as.addSensor(ts1);
		as.addSensor(ts2);
		as.setOn();
		System.out.println("average temperature is " + as.read());
	}

}
