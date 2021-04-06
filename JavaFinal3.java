import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class JavaFinal3 extends JFrame{
	private static final int FRAME_WIDTH = 700;
	private static final int FRAME_HEIGHT = 700;
    private static final int AREA_ROWS = 50;
	private static final int AREA_COLUMNS = 50;
	static JLabel label;
	static JPanel panel;
	static JFrame f;
    static JTextArea resultArea;
    
    public JavaFinal3() throws IOException {
    	createLabel();
    	fileReader();
    	createPanel();
    	setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }
    
    public void createLabel() {
    	label = new JLabel("file reader JFrame reading a file named file.txt");
    }
    
    public void fileReader() throws IOException{
    	resultArea = new JTextArea(AREA_ROWS, AREA_COLUMNS);
        try {
         Scanner in = new Scanner(new FileReader("file.txt"));	
    		while(in.hasNext()){     
    			String data = in.nextLine();
    			resultArea.setText(resultArea.getText()+" " + "\n" + data);
    		}

    	}
        catch(FileNotFoundException exception)
        {
           System.out.println("error ");
           exception.printStackTrace();
        }
    }
    
    public void createPanel() {
    	panel = new JPanel();
    	panel.add(label);
    	panel.add(resultArea);
    	add(panel);
    	
    }
    
	public static void main(String[] args) throws IOException {
		JFrame frame = new JavaFinal3();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
 
	
}