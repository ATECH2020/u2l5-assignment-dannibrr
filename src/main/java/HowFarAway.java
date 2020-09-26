import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
      //creates a scanner object "scan"
      Scanner scan = new Scanner(System.in);
      //declaring varibles that will be needed for the program
      double startLat, startLong, endLat, endLong, distance;

      //initlizes varibles based on the user's response 
      System.out.print("Enter the latitude of the starting location: ");
      startLat = scan.nextDouble();
      System.out.print("Enter the longitude of the starting location: ");
      startLong = scan.nextDouble();
      System.out.print("Enter the latitude of the ending location: ");
      endLat = scan.nextDouble();
      System.out.print("Enter the longitude of the ending location: ");
      endLong = scan.nextDouble();

      //creates a geolocation object "startGeo"
      //responsible for the user's starting position
      GeoLocation startGeo = new GeoLocation(startLat, startLong);

      //creates a geolocation object "endGeo"
      //responsible for the user's end position
      GeoLocation endGeo = new GeoLocation(endLat, endLong);

      //uses the distanceFrom(other Geo) method to calculate the distance
      //the distance is then printed out using print :)
      distance = startGeo.distanceFrom(endGeo);
      System.out.print("The distance is " + distance + " miles.");

    }
}