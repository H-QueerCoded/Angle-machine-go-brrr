import java.util.Scanner;

public class angleMachine {
	
	public static void main(String[] args) {
		//int selectedValue = Integer.parseInt(message().toString());
		int selectedValue = consIn();
		while(selectedValue == 1 || selectedValue == 2) {
			if(selectedValue == 1) {
				double[] input = input1();
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
				double[] input = input2();
				if(input!=null) {
					double r = input[0];
					double nr = input[1];
					double vector = Math.sqrt((r*r)+(nr*nr));
					double angle = Math.toDegrees(Math.atan(nr/r));
					String out = "Vector: "+vector+"\nAngle: "+angle+"\n";
					System.out.println(out);
				}
			}
			selectedValue = consIn();
		}
	}
	
	private static int consIn() {
		System.out.print("Polar to Rectangular: 1 \nRectangular to Polar: 2\nMake a selection: ");
		Scanner sc = new Scanner(System.in);
	    int i = sc.nextInt();
		return i;
	}
	private static double[] input1() {
		double[] input = new double[2];
		System.out.print("Enter Value: ");
		Scanner sc = new Scanner(System.in);
		input[0] = sc.nextDouble();
		System.out.print("Enter Angle: ");
		input[1] = sc.nextDouble();
		return input;
	}
	private static double[] input2() {
		double[] input = new double[2];
		System.out.print("Enter Real Value: ");
		Scanner sc = new Scanner(System.in);
		input[0] = sc.nextDouble();
		System.out.print("Enter Non-Real Value: ");
		input[1] = sc.nextDouble();
		return input;
	}
}