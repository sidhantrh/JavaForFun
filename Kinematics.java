import java.util.Scanner;

public class KinematicFormula1 {
	//formula input v0
	public static void In_Velocity(double V, double A, double T){
		double IntialV = V - (A*T);
		System.out.println(IntialV);
	}
	//formula input v
	public static void Velocity(double IV,double A, double  T) {
		double Vel = IV + (A * T);
		System.out.println(Vel);
	}
	//formula input a
	public static void Acceleration(double V, double T,double IV) {
		double Acc = (IV-V)/T;
		System.out.println(Acc);
	}
	//formula input t
	public static void Time(double A, double IV, double V) {
		double Tm = (IV-V)/A;
		System.out.println(Tm);
	}
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		//asking for what to do
		System.out.println("v = v0 + at");
		System.out.println("What do you want to solve for?");
		System.out.println("Intial Velocity");
		System.out.println("Velocity");
		System.out.println("Acceleration");
		System.out.println("Time");
		String output = input.nextLine();
		//for Initial Velocity
		if(output.contentEquals("Intial Velocity")) {
			System.out.println("What is the Velocity");
			double Velocity = input.nextDouble();
			System.out.println("What is the Accleration");
			double Acceleration = input.nextDouble();
			System.out.println("What is the Time");
			double Time = input.nextDouble();
			KinematicFormula1.In_Velocity(Velocity,Acceleration,Time);
		}
		//For Velocity
		if(output.contentEquals("Velocity")) {
			System.out.println("What is the Initial Velocity");
			double InitailVelocity= input.nextDouble();
			System.out.println("What is the Acceleration");
			double Acceleration = input.nextDouble();
			System.out.println("What is the Time");
			double Time = input.nextDouble();
			KinematicFormula1.Velocity(InitailVelocity,Acceleration,Time);
		}
		//For Acceleration
		if(output.contentEquals("Acceleration")) {
			System.out.println("What is the Velocity?");
			double Velocity = input.nextDouble();
			System.out.println("What is the Time");
			double Tme = input.nextDouble();
			System.out.println("What is the Initial Velocity");
			double IntV = input.nextDouble();
			KinematicFormula1.Acceleration(Velocity, Tme, IntV);
		}
		//For Time
		if(output.contentEquals("Time")) {
			System.out.println("What is the Accleration");
			double Accx = input.nextDouble();
			System.out.println("What is the Initial Velocity");
			double IVx = input.nextDouble();
			System.out.println("What is the Velocity");
			double Vx = input.nextDouble();
			KinematicFormula1.Time(Accx, IVx, Vx);
		}
  }
}
