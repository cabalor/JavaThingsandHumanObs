package szkola2_6;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class AppStart  extends JFrame{

	public AppStart() {
		super();
		//JFrame window = new JFrame();
		
		setTitle("dupa dupa");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("dupa");
		this.getContentPane().add(label);
		JLabel label2 = new JLabel("dupa2");
		//window.add(label); // this.getContentPane().add(label);
		//this.getContentPane().add(label);
		//window.add(label);
		
		JButton jButton = new JButton("dupa");
		
			JTextField field1 = new JTextField();
			field1.setPreferredSize(new Dimension(100, 100));
			JTextField field2 = new JTextField();
			field2.setPreferredSize(new Dimension(100, 100));
		
			jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			jButton.setText(String.valueOf(Integer.parseInt(field1.getText()) + Integer.parseInt(field2.getText())));
			}
		});
		
		this.getContentPane().add(field1);
		this.getContentPane().add(field2);
	
		this.getContentPane().add(jButton);
		
		this.setLayout(new FlowLayout());
		
		pack();
		setSize(800, 600);
		setVisible(true);
		
		
		
		
	}
	
	
}
