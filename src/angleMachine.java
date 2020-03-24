import javax.swing.JOptionPane;

public class angleMachine {
	private static Object[] possibleValues = { "Rectangular", "Polar"};
	
	public static void main(String[] args) {
		Object selectedValue = message();
		while(selectedValue!=null) {
			if(selectedValue == "Rectangular") {
				
			}
			else {
				
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
}