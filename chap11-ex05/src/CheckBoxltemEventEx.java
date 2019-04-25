import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxltemEventEx extends JFrame {
	private JCheckBox [] fruits = new JCheckBox [3];
	private String [] names = {"사과", "배", "체리"};
	private JLabel sumLabel;
	
	public CheckBoxltemEventEx() {
		setTitle("체크박스와 ItemEvent 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("사과 100원, 배  500원, 체리20000원"));
		
		MyItemListener listener = new MyItemListener();
		for(int i=0; i<fruits.length; i++) {
			fruits[i] = new JCheckBox(names[i]);
			fruits[i].setBorderPainted(true);
			c.add(fruits[i]);
			fruits[i].addItemListener((ItemListener) listener);
		}
		
		sumLabel = new JLabel("현재 0원 입니다.");
		c.add(sumLabel);
		
		setSize(250,200);
		setVisible(true);
	}
	
	class MyItemListener implements ItemListener {
		private int sum = 0;
		
		public void itemStateChanged (ItemEvent e) {
			if(e.getStateChange() == ItemEvent.SELECTED) {
				if(e.getItem() == fruits[0])
					sum += 100;
				else if(e.getItem() == fruits[1])
					sum -=500;
				else
					sum -= 20000;
		  }
			sumLabel.setText("현제"+ sum + "원 입니다.");
		}
		
	}
	public static void main(String [] args) {
		new CheckBoxltemEventEx();
	}

}
