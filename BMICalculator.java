import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
You are going to create a Jframe. The Jframe needs following elements.

 

Height(Text field and label)
Weight (Text field and label)
Submit button
BMI Users will enter height, weight and then click submit button. 
Your program should display BMI as the label with the BMI score.
 */
public class BMICalculator extends JFrame {
	private static final int FRAME_WIDTH = 375;
	private static final int FRAME_HEIGHT = 400;
	private final int FIELD_WIDTH = 10;
	private JLabel heightLabel;
	private JLabel weightLabel;
	private JLabel BMILabel;
	private JTextField heightField;
	private JTextField weightField;
	private JButton button;
	
	public BMICalculator() {
		createTextField();
		createButton();
		createPanel();
		
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}
	public static void main(String[] args) {
		JFrame frame = new BMICalculator();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	private void createTextField() {
		heightLabel = new JLabel("Enter your height in meters ");
		heightField = new JTextField(FIELD_WIDTH);
		heightField.setText("");
		weightLabel = new JLabel("Enter your weight in kilograms ");
		weightField = new JTextField(FIELD_WIDTH);
		weightField.setText("");
		
	}
	class AddListener implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			double weight, height, bmi;
			weight = Double.parseDouble(weightField.getText());
			height = Double.parseDouble(heightField.getText());
			bmi = weight/Math.pow(height, 2);
			BMILabel.setText("Your BMI score is " + bmi);
		}
	}
	private void createButton(){
		button = new JButton("SUBMIT");
		BMILabel = new JLabel();
		ActionListener listener = new AddListener();
		button.addActionListener(listener);
	}
	private void createPanel() {
		JPanel panel = new JPanel();
		panel.add(heightLabel);
		panel.add(heightField);
		panel.add(weightLabel);
		panel.add(weightField);
		panel.add(button);
		panel.add(BMILabel);
		add(panel);
	}
	

}
