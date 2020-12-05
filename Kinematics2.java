import java.util.Scanner;

//7/10/2019
//v^2=v0^2+2ax


public class Kinematicformula2 {
	//formula input x
	public static void distance(double velocity,double In_velocity,double time) {
		double distance = velocity + In_velocity/2* time;
		System.out.println(distance);
	}
	//formula input v
	public static void velocity( double time,double  In_velocity,double distance) {
		double  velocity = In_velocity + distance/time*2;
		System.out.println(velocity);
	}
	//formula input t
	public static void time(double  In_velocity,double  distance,double velocity ) {
		double  time = distance/(In_velocity+velocity)/2;
		System.out.println(time);
	}
	//formula input v0
	public static void In_velocity(double  distance,double velocity,double time) {
		double  In_velocity = 2* (distance / time)- velocity;
		System.out.println(In_velocity);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//asking what to do
		System.out.println("x = [(v0+v)/2]*t");
		System.out.println("What do you want to solve for?");
		System.out.println("Distance");
		System.out.println("Velocity");
		System.out.println("Time");
		System.out.println("In_velocity");
		String output = input.nextLine();
		//For Distance
		if(output.contentEquals("Distance")) {
			System.out.println("What is the Velocity");
			double  Velocity = input.nextDouble();
			System.out.println("What is the Intial Velocity");
			double  In_Velocity = input.nextDouble();
			System.out.println("What is the Time");
			double Time = input.nextDouble();
			Kinematicformula2.distance(Velocity,In_Velocity,Time);
		}
		//For Velocity
		if(output.contentEquals("Velocity")) {
			System.out.println("What is the Time");
			double  Time = input.nextDouble();
			System.out.println("What is the Intial Velocity");
			double  In_Velocity = input.nextDouble();
			System.out.println("What is the Distance");
			double Distance = input.nextDouble();
			Kinematicformula2.velocity(Time,In_Velocity,Distance);
		}
		//For Time
		if(output.contentEquals("Time")) {
			System.out.println("What is the Intial Velocity");
			double  In_Velocity = input.nextDouble();
			System.out.println("What is the Distance");
			double  Distance = input.nextDouble();
			System.out.println("What is the Velocity");
			double  Velocity = input.nextDouble();
			Kinematicformula2.time(In_Velocity,Distance,Velocity);
		}
		//For Initial Velocity
		if(output.contentEquals("Initial Velocity")) {
			System.out.println("What is the Distance");
			double  Distance = input.nextDouble();
			System.out.println("What is the Velocity");
			double  Velocity = input.nextDouble();
			System.out.println("What is the Time");
			double  Time = input.nextDouble();
			Kinematicformula2.time(Velocity,Distance,Time);
		}

	}

}



