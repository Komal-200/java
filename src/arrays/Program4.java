package arrays;

class Speed {
	   String speed;
	}
	class SpeedImplementation {
	   public String setSpeed(Speed s, int speedValue) {
	       try {
	           if (speedValue < 10 || speedValue > 200) {
	               throw new SpeedometerException("Error in speedometer");
	           } else {
	               s.speed = "Valid speed";
	           }
	       } catch (SpeedometerException e) {
	           s.speed = "Invalid Speed";
	       }
	       return s.speed;
	   }
	}
	class SpeedometerException extends Exception {
	   public SpeedometerException(String s) {
	       super(s);
	   }
	}
	public class Program4 {
	   public static void main(String[] args) {
	       Speed s = new Speed();
	       SpeedImplementation speedImpl = new SpeedImplementation();
	       System.out.println(speedImpl.setSpeed(s, 4)); // Sample Output: Error in speedometer
	   }
	}

