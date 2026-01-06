package com.scenariobasedquestion.cabbygo;

public interface IRideService {
    
    boolean bookRide(String passenger, String pickupLocation, String dropLocation, String vehicleType);
    
    double endRide(int rideId, double distance, double passengerRating);
}
