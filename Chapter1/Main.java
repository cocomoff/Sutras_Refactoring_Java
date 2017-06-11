import java.lang.Math.*;

public class Main {

    public static double degreeToRadian(double degree) {
	return degree / 180.0 * 3.14159265358979323846;
    }

    public static double degreeToRadian2(double degree) {
	return degree / 180.0 * Math.PI;
    }

    public static double degreeToRadian3(double degree) {
	return Math.toRadians(degree);
    }
    
    public static void main(String[] args) {
	double d = 45.0;
	System.out.println("Method 1 " + degreeToRadian(d));
	System.out.println("Method 2 " + degreeToRadian2(d));
	System.out.println("Method 3 " + degreeToRadian3(d));
    }
}
