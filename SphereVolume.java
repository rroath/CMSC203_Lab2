import java.util.Scanner;
public class SphereVolume {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		double diameter, volume, radius;
		
		System.out.println("Program used to compute the volume of a sphere\nEnter the diameter of the sphere: ");
		diameter=in.nextDouble();
		
		radius=diameter/2.0;
		volume=(4*Math.PI*Math.pow(radius,3))/3;
		
		System.out.println("Volume of the sphere is "+volume+"\nBy: Richard Roath");

	}

}
