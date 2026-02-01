package com.streams;

import java.util.ArrayList;
import java.util.List;

class SensorReading {
    String sensorId;
    double value;

    public SensorReading(String sensorId, double value) {
        this.sensorId = sensorId;
        this.value = value;
    }
}



public class IotApp {
	 public static void main(String[] args) {

	        List<SensorReading> readings = new ArrayList<>();

	        // Sample sensor data
	        readings.add(new SensorReading("S1", 45.5));
	        readings.add(new SensorReading("S2", 72.3));
	        readings.add(new SensorReading("S3", 60.0));
	        readings.add(new SensorReading("S4", 88.9));
	        readings.add(new SensorReading("S5", 30.4));

	        double threshold = 60.0;

	        // Stream: filter readings above threshold and print them
	        readings.stream()
	                .filter(r -> r.value > threshold)
	                .forEach(r ->
	                    System.out.println(
	                        "Sensor " + r.sensorId + " reading: " + r.value
	                    )
	                );
	    }
}
