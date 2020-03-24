import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class angleMachine {
	private static Object[] possibleValues = { "Rectangular", "Polar"};
	
	public static void main(String[] args) {
		Object selectedValue = message();
		while(selectedValue!=null) {
			if(selectedValue == "Rectangular") {
				double[] input = input();
				double value = input[0];
				double angle = input[1];
				double cos = value*Math.cos(angle);
			}
			else {
				double[] input = input();
				double value = input[0];
				double angle = input[1];
			}
			selectedValue = message();
		}
	}
	
	private static Object message() {
		return JOptionPane.showInputDialog(null,
		        "Select mode", "Input",
		        JOptionPane.INFORMATION_MESSAGE, null,
		        possibleValues, possibleValues[0]);
	}
	private static double[] input() {
		JTextField value = new JTextField(10);
	    JTextField angle = new JTextField(10);
		JPanel myPanel = new JPanel();
	      myPanel.add(new JLabel("Value:"));
	      myPanel.add(value);
	      myPanel.add(Box.createHorizontalStrut(15)); // a spacer
	      myPanel.add(new JLabel("Angle:"));
	      myPanel.add(angle);
	      int result = JOptionPane.showConfirmDialog(null, myPanel, 
	               "Please Enter Input", JOptionPane.OK_CANCEL_OPTION);
	      double[] arr = new double[2];
	      arr[0] = Double.parseDouble(value.getText());
	      arr[1] = Double.parseDouble(angle.getText());
	      return arr;
	}
}