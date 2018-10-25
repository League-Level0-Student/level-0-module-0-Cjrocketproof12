package strings_and_dialogs;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Checkpoint {
public static void main(String[] args) {
	Robot A=new Robot();
	A.setSpeed(10);
	String name= JOptionPane.showInputDialog("Whats Your Favourite Color?");
	
	 if(name.equals("1")) {
		
		JOptionPane.showMessageDialog(null, "My Favourite Color Is Maroon Too ;D ");
	 }
		A.penDown();
	A.turn(90);
	A.move(100);
	A.turn(180);
A.move(200);	
A.turn(135);
A.move(150);
A.penUp();
A.turn(94);
A.move(150);
A.turn(180);
A.penDown();
A.move(150);

	
}
}
