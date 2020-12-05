//7/10/2019
//x=vt+0.5*at^2

public class Kinematicformula4{
	//formula input x
	public static void Distance(double In_Velocity,double Time,double Acceleration) {
		double Distance = In_Velocity* Time + 0.5*Acceleration*(Time*Time);
		System.out.println(Distance);
	}
	//formula input v0
	public static void In_Velocity(double Time,double Accerlation,double Distance) {
		double In_Velocity = 2*Distance-Accerlation*Time*Time/Time;
		System.out.println(In_Velocity);
	}
	//formula input t
	public static void Time(double Accerlation,double Distance, double In_Velocity) {
		double Time = Math.sqrt(Distance-2*In_Velocity/Accerlation)*3;
		System.out.println(Time);
	}
	//formula input a
	public static void Acceleration(double Distance,double In_Velocity, double Time) {
		double Acceleration= Math.sqrt(2*Distance-In_Velocity*Time/Time);
		System.out.println(Acceleration);
	}
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		//asking what to do
		System.out.println("x=vt+0.5at^2");
		System.out.println("What do you want to solve for?");
		System.out.println("Distance");
		System.out.println("In_velocity");
		System.out.println("Time");
		System.out.println("Acceleration");
		String output = input.nextLine();
		//For Distance
		if(output.contentEquals("Distance")) {
			System.out.println("What is the Initial Velocity");
			double In_Velocity = input.nextDouble();
			System.out.println("What is the Time");
			double Time = input.nextDouble();
			System.out.println("What is the Accerlation");
			double Accerlation = input.nextDouble();
			Kinematicformula4.Distance(In_Velocity,Time,Accerlation);
		}
		//For Initial Velocity
		if(output.contentEquals("Initial Velocity")) {
			System.out.println("What is the Time");
			double Time = input.nextDouble();
			System.out.println("What is the Acceleration");
			double Acceleration = input.nextDouble();
			System.out.println("What is the Distance");
			double Distance = input.nextDouble();
			Kinematicformula4.In_Velocity(Time,Acceleration, Distance);
		}
		//For Time
		if(output.contentEquals("Time")) {
			System.out.println("What is the Acceleration");
			double Accerlation = input.nextDouble();
			System.out.println("What is the Distance");
			double Distance = input.nextDouble();
			System.out.println("What is the Initial Velocity");
			double In_Velocity = input.nextDouble();
			Kinematicformula4.Time(Accerlation,Distance,In_Velocity);
		}
		//For Acceleration
		if(output.contentEquals("Acceleration")) {
			System.out.println("What is the Distance");
			double Distance = input.nextDouble();
			System.out.println("What is the Initial Velocity");
			double In_Velocity = input.nextDouble();
			System.out.println("What is the Time");
			double Time = input.nextDouble();
			Kinematicformula4.Acceleration(Distance,In_Velocity,Time);
		}
		
		
	}

}

