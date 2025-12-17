// Program to compute volume of Earth
public class VolumeOfEarth {
    
    public static void main(String[] args) {
        double radiusInKm = 6378;
        double kmToMiles = 0.621371;
        
        // Volume of sphere: (4/3) * π * r^3
        double volumeInCubicKm = (4.0 / 3.0) * Math.PI * Math.pow(radiusInKm, 3);
        
        // Convert radius to miles and calculate volume
        double radiusInMiles = radiusInKm * kmToMiles;
        double volumeInCubicMiles = (4.0 / 3.0) * Math.PI * Math.pow(radiusInMiles, 3);
        
        System.out.println("The volume of earth in cubic kilometers is " + volumeInCubicKm + 
                         " and cubic miles is " + volumeInCubicMiles);
    }
}
