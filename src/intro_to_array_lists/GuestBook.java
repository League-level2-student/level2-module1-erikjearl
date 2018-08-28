package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	JButton b1,b2;
	ArrayList<String> nList;
	String list = "";
	int count =1;
	
	public static void main(String[] args) {
		GuestBook b = new GuestBook();
		b.makeGUI();
	}
	
	
	void makeGUI() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		 b1 = new JButton("Add Name");
		 b2 = new JButton("View Names");
		frame.add(panel);
		panel.add(b1);
		panel.add(b2);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		frame.pack();
		
		nList = new ArrayList<String>();
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == b1) {
			String newName =JOptionPane.showInputDialog("Enter a Name");
			nList.add(newName);
		}
		else if (e.getSource() == b2) {
			for(String s : nList){
				list = list + "Guest #" + count + ": "+ s + "\n";
				count++;
			}
			JOptionPane.showMessageDialog(null, list);
		}
	}
}
