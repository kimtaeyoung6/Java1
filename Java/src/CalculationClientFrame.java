import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CalculationClientFrame extends JFrame {
	private JTextField starTf = new JTextField(7);
	private JTextField operatorTf = new JTextField(3);
	private JTextField endTf = new JTextField(7);
	private JTextField resTf = new JTextField(7);
	private JButton cadlcBtn = new JButton("계산");
    private Socket socket = null;
    private BufferedReader in = null;
    private BufferedWriter out = null;
    
    public CalculationClientFrame() {
    	super("계산 클라이언트");
    	setSize(410,100);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
    	Container c = getContentPane();
    	c.setLayout(new FlowLayout());
    	c.add(starTf);
    	c.add(operatorTf);
    	c.add(endTf);
    	c.add(new JLabel(" = "));
    	c.add(resTf);
    	c.add(cadlcBtn);
    	
    	setVisible(true);
    	
    	setupConnection();
    	
    	calcBtn.addActionListener(new ActionEvent)
		
    }

	private void setupConnection() {
		// TODO Auto-generated method stub
		
	}

}
