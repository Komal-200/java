package arrays;


class hello {

    String speed;

}

class hi {

    public String setSpeed(Speed s, int speedValue) {

        try {

            if (speedValue < 10 || speedValue > 200) {

                throw new SpeedometerException("Error in speedometer");

            } else {

                s.speed = "Valid speed";

            }

        } catch (SpeedometerException e) {

            return e.getMessage(); // Return exception message directly

        }

        return s.speed;

    }

}

class SpeedometerException extends Exception {

    public SpeedometerException(String s) {

        super(s);

    }

}

public class Program6 {

    public static void main(String[] args)throws Exception {

        Speed s = new Speed();

        hi speedImpl = new hi();

        System.out.println(speedImpl.setSpeed(s, 4)); // Sample Output: Error in speedometer

    }

}
