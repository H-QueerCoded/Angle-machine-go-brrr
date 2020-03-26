import java.util.Scanner;

public class angleMachine {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int selectedValue = consIn(sc);
		while(selectedValue == 1 || selectedValue == 2 || selectedValue == 3 || selectedValue == 4){
			if(selectedValue == 1) {
				double[] input = input1(sc);
				if(input!=null) {
					double value = input[0];
					double angle = input[1];
					double cos = value*Math.cos(Math.toRadians(angle));
					double sin = value*Math.sin(Math.toRadians(angle));
					String out = "Cosine: "+cos+"\nSine: "+sin+"\n";
					System.out.println(out);
				}
			}
			else if(selectedValue == 2) {
				double[] input = input2(sc);
				if(input!=null) {
					double r = input[0];
					double nr = input[1];
					double vector = Math.sqrt((r*r)+(nr*nr));
					double angle = Math.toDegrees(Math.atan(nr/r));
					String out = "Vector: "+vector+"\nAngle: "+angle+"\n";
					System.out.println(out);
				}
			}
			else if(selectedValue == 3) {
				double[] input = input3(sc);
				if(input!=null) {
					double v1 = input[0];
					double a1 = input[1];
					double v2 = input[2];
					double a2 = input[3];
					double vector = v1*v2;
					double angle = a1+a2;
					String out = "Vector: "+vector+"\nAngle: "+angle+"\n";
					System.out.println(out);
				}
			}
			else if(selectedValue == 4) {
				double[] input = input3(sc);
				if(input!=null) {
					double v1 = input[0];
					double a1 = input[1];
					double v2 = input[2];
					double a2 = input[3];
					double vector = v1/v2;
					double angle = a1-a2;
					String out = "Vector: "+vector+"\nAngle: "+angle+"\n";
					System.out.println(out);
				}
			}
			selectedValue = consIn(sc);
		}
		sc.close();
	}
	
	private static int consIn(Scanner scan) {
		System.out.print("Polar to Rectangular: 1 "
				+ "\nRectangular to Polar: 2"
				+ "\nPolar Multiplication: 3\nPolar Division:	      4"
				+ "\nOther to exit\nMake a selection: ");
	    int i = scan.nextInt();
		return i;
	}
	private static double[] input1(Scanner sc) {
		double[] input = new double[2];
		System.out.print("Enter Value: ");
		input[0] = sc.nextDouble();
		System.out.print("Enter Angle: ");
		input[1] = sc.nextDouble();
		return input;
	}
	private static double[] input2(Scanner sc) {
		double[] input = new double[2];
		System.out.print("Enter Real Value: ");
		input[0] = sc.nextDouble();
		System.out.print("Enter Non-Real Value: ");
		input[1] = sc.nextDouble();
		return input;
	}
	private static double[] input3(Scanner sc) {
		double[] input = new double[4];
		System.out.print("Enter Value 1: ");
		input[0] = sc.nextDouble();
		System.out.print("Enter Angle 1: ");
		input[1] = sc.nextDouble();
		System.out.print("Enter Value 2: ");
		input[2] = sc.nextDouble();
		System.out.print("Enter Angle 2: ");
		input[3] = sc.nextDouble();
		return input;
	}
}