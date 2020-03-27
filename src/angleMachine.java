import java.io.IOException;
import java.util.Scanner;

public class angleMachine {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int selectedValue = consIn(sc);
		while(selectedValue == 1 || selectedValue == 2 || selectedValue == 3 || selectedValue == 4 || selectedValue == 5 || selectedValue == 6){
			if(selectedValue == 1) {
				double[] input = input1(sc);
				if(input!=null) {
					double ans[] = polToRect(input[0],input[1]);
					String out = "Cosine: "+ans[0]+"\nSine: "+ans[1]+"\n";
					System.out.println(out);
				}
			}
			else if(selectedValue == 2) {
				double[] input = input2(sc);
				if(input!=null) {
					double ans[] = rectToPol(input[0],input[1]);
					String out = "Vector: "+ans[0]+"\nAngle: "+ans[1]+"\n";
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
					String out = "Vector: "+vector+"\nAngle: "+angle;
					System.out.println(out);
					double ans[] = polToRect(vector,angle);
					String out2 = "Cosine: "+ans[0]+"\nSine: "+ans[1]+"\n";
					System.out.println(out2);
				}
			}
			else if(selectedValue == 4) {
				double[] input = input3(sc);
				if(input!=null) {
					double v1 = input[0];
					double a1 = input[1];
					double v2 = input[2];
					double a2 = input[3];
					double[] ans = divide(v1,a1,v2,a2);
					double vector = ans[0];
					double angle = ans[1];
					String out = "Vector: "+vector+"\nAngle: "+angle;
					System.out.println(out);
					double ans2[] = polToRect(vector,angle);
					String out2 = "Cosine: "+ans2[0]+"\nSine: "+ans2[1]+"\n";
					System.out.println(out2);
				}
			}
			else if(selectedValue == 5){
				double[] input = input3(sc);
				if(input!=null) {
					double v1 = input[0];
					double a1 = input[1];
					double v2 = input[2];
					double a2 = input[3];
					double p1[] = divide(1,0,v1,a1);
					double p2[] = divide(1,0,v2,a2);
					//convert to rect, add, convert to polar
					double r1[] = polToRect(p1[0],p1[1]);
					double r2[] = polToRect(p2[0],p2[1]);
					double add[] = add(r1[0],r1[1],r2[0],r2[1]);
					double pol[] = rectToPol(add[0],add[1]);
					double ans[] = divide(1,0,pol[0],pol[1]);
					String out = "Vector: "+ans[0]+"\nAngle: "+ans[1]+"\n";
					System.out.println(out);
				}
				
			}
			else if(selectedValue==6) {
				double one[] = input2(sc);
				double two[] = input2(sc);
				double add[] = add(one[0],one[1],two[0],two[1]);
				String out = "Cosine: "+add[0]+"\nSine: "+add[1];
				System.out.println(out);
				double pol[] = rectToPol(add[0],add[1]);
				String out2 = "Vector: "+pol[0]+"\nAngle: "+pol[1]+"\n";
				System.out.println(out2);
				
			}
			try {
				System.in.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			selectedValue = consIn(sc);
		}
		sc.close();
	}
	
	private static int consIn(Scanner scan) {
		System.out.print("Polar to Rectangular: 1 "
				+ "\nRectangular to Polar: 2"
				+ "\nPolar Multiplication: 3\nPolar Division:	      4"
				+ "\nPolar Parallel:	      5\nRectangular Addition: 6"
				+ "\nOther to exit\nMake a selection: ");
	    int i = scan.nextInt();
		return i;
	}
	private static double[] divide(double v1, double a1, double v2, double a2) {
		double ans[] = new double[2];
		ans[0] = v1/v2;
		ans[1] = a1-a2;
		return ans;
	}
	private static double[] add(double r1, double n1, double r2, double n2) {
		double ans[] = {r1+r2,n1+n2};
		return ans;
	}
	private static double[] polToRect(double value, double angle) {
		double ans[] = new double[2];
		ans[0]= value*Math.cos(Math.toRadians(angle));
		ans[1] = value*Math.sin(Math.toRadians(angle));
		return ans;
	}
	private static double[] rectToPol(double r, double nr) {
		double vector = Math.sqrt((r*r)+(nr*nr));
		double angle = Math.toDegrees(Math.atan(nr/r));
		double ans[] = {vector,angle};
		return ans;
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