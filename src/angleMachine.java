import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class angleMachine {
	
	public static void main(String[] args) {
		int selectedValue = Integer.parseInt(message().toString());
		while(selectedValue == 1 || selectedValue == 2) {
			if(selectedValue == 1) {
				double[] input = input1();
				if(input!=null) {
					double value = input[0];
					double angle = input[1];
					double cos = value*Math.cos(Math.toRadians(angle));
					double sin = value*Math.sin(Math.toRadians(angle));
					String out = "Cosine: "+cos+"\nSine: "+sin;
					JOptionPane.showMessageDialog(null, out);
				}
			}
			else if(selectedValue == 2) {
				double[] input = input2();
				if(input!=null) {
					double one = input[0];
					double two = input[1];
					double vector = Math.sqrt((one*one)+(two*two));
					double angle = Math.toDegrees(Math.atan(two/one));
					String out = "Vector: "+vector+"\nAngle: "+angle;
					JOptionPane.showMessageDialog(null, out);
				}
			}
			selectedValue = Integer.parseInt(message().toString());
		}
	}
	
	private static Object message() {
		return JOptionPane.showInputDialog(null,
		        "Polar to Rectangular: 1 \nRectangular to Polar: 2", "Input",
		        JOptionPane.INFORMATION_MESSAGE, null,null,null);
	}
	private static double[] input1() {
		JTextField value = new JTextField(10);
	    JTextField angle = new JTextField(10);
		JPanel myPanel = new JPanel();
	      myPanel.add(new JLabel("Value:"));
	      myPanel.add(value);
	      myPanel.add(Box.createHorizontalStrut(15)); // a spacer
	      myPanel.add(new JLabel("Angle:"));
	      myPanel.add(angle);
	      int result = JOptionPane.showConfirmDialog(null, myPanel, 
	               "Polar to Rectangular", JOptionPane.OK_CANCEL_OPTION);
	      if(result == JOptionPane.OK_OPTION) {
		      double[] arr = new double[2];
		      arr[0] = Double.parseDouble(value.getText());
		      arr[1] = Double.parseDouble(angle.getText());
		      return arr;
	      }
	      else
	    	  return null;
	}
	private static double[] input2() {
		JTextField value = new JTextField(10);
	    JTextField angle = new JTextField(10);
		JPanel myPanel = new JPanel();
	      myPanel.add(new JLabel("Real:"));
	      myPanel.add(value);
	      myPanel.add(Box.createHorizontalStrut(15)); // a spacer
	      myPanel.add(new JLabel("Non-real:"));
	      myPanel.add(angle);
	      int result = JOptionPane.showConfirmDialog(null, myPanel, 
	               "Rectangular to Polar", JOptionPane.OK_CANCEL_OPTION);
	      if(result == JOptionPane.OK_OPTION) {
		      double[] arr = new double[2];
		      arr[0] = Double.parseDouble(value.getText());
		      arr[1] = Double.parseDouble(angle.getText());
		      return arr;
	      }
	      else
	    	  return null;
	}
}