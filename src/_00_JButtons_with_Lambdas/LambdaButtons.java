package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		
		
		addNumbers.addActionListener((ActionEvent e)->{
			String i1 = JOptionPane.showInputDialog("Input a number"); 
			String i2 = JOptionPane.showInputDialog("Input a number");
			int itotal = Integer.parseInt(i1);
			JOptionPane.showMessageDialog(null, "Your two numbers added together are \n\n" + (itotal+Integer.parseInt(i2)));
		});
		
		randNumber.addActionListener((ActionEvent e)->{
			String i1 = JOptionPane.showInputDialog("Input the maximum range of the random. \n(From 0 - \"User Input\")");
			int irand = (int)((Integer.parseInt(i1)+1)*(Math.random()));
			JOptionPane.showMessageDialog(null, "Your random number is \n\n" + irand);
		});
		
		tellAJoke.addActionListener((ActionEvent e)->{
			int irand = (int)((12)*(Math.random()));
			if (irand == 0) {
				JOptionPane.showMessageDialog(null, "no");
			}
			else if (irand == 1) {
				JOptionPane.showMessageDialog(null, "my life");
			}
			else if (irand == 2) {
				JOptionPane.showInputDialog(null, "knock knock\n\n(this is where u say \"whos there\")");
				JOptionPane.showInputDialog(null, "potato\n\nyou know what to do in knock knock jokes");
				JOptionPane.showMessageDialog(null, "potatoes cant talk");
			}
			else if (irand == 3) {
				JOptionPane.showMessageDialog(null, "a cantaloupe walks into a bar... somehow...");
			}
			else if (irand == 4) {
				JOptionPane.showMessageDialog(null, "get dunked on");
			}
			else if (irand == 5) {
				JOptionPane.showMessageDialog(null, "According to all known laws\n" + 
						"of aviation,\n" + 
						"\n" + 
						"  \n" + 
						"there is no way a bee\n" + 
						"should be able to fly.\n" + 
						"\n" + 
						"  \n" + 
						"Its wings are too small to get\n" + 
						"its fat little body off the ground.\n" + 
						"\n" + 
						"  \n" + 
						"The bee, of course, flies anyway\n" + 
						"\n" + 
						"  \n" + 
						"because bees don't care\n" + 
						"what humans think is impossible.\n" + 
						"\n" + 
						"  \n" + 
						"Yellow, black. Yellow, black.\n" + 
						"Yellow, black. Yellow, black.\n" + 
						"\n" + 
						"  \n" + 
						"Ooh, black and yellow!\n" + 
						"Let's shake it up a little.\n" + 
						"\n" + 
						"  \n" + 
						"Barry! Breakfast is ready!\n" + 
						"\n" + 
						"  \n" + 
						"Ooming!\n" + 
						"\n" + 
						"  \n" + 
						"Hang on a second.\n" + 
						"\n" + 
						"  \n" + 
						"Hello?\n" + 
						"\n" + 
						"  \n" + 
						"- Barry?\n" + 
						"- Adam?\n" + 
						"\n" + 
						"  \n" + 
						"- Oan you believe this is happening?\n" + 
						"- I can't. I'll pick you up.\n" + 
						"\n" + 
						"  \n" + 
						"Looking sharp.\n" + 
						"\n" + 
						"  \n" + 
						"Use the stairs. Your father\n" + 
						"paid good money for those.\n" + 
						"\n" + 
						"  \n" + 
						"Sorry. I'm excited.\n" + 
						"\n" + 
						"  \n" + 
						"Here's the graduate.\n" + 
						"We're very proud of you, son.\n" + 
						"\n" + 
						"  \n" + 
						"A perfect report card, all B's.\n" + 
						"\n" + 
						"  \n" + 
						"Very proud.\n" + 
						"\n" + 
						"  \n" + 
						"Ma! I got a thing going here.\n" + 
						"\n" + 
						"  \n" + 
						"- You got lint on your fuzz.\n" + 
						"- Ow! That's me!\n" + 
						"\n" + 
						"  \n" + 
						"- Wave to us! We'll be in row 118,000.\n" + 
						"- Bye!\n" + 
						"\n" + 
						"  \n" + 
						"Barry, I told you,\n" + 
						"stop flying in the house!\n" + 
						"\n" + 
						"  \n" + 
						"- Hey, Adam.\n" + 
						"- Hey, Barry.\n" + 
						"\n" + 
						"  \n" + 
						"- Is that fuzz gel?\n" + 
						"- A little. Special day, graduation.\n" + 
						"\n" + 
						"  \n" + 
						"Never thought I'd make it.\n" + 
						"\n" + 
						"  \n" + 
						"Three days grade school,\n" + 
						"three days high school.\n");
			}
			else if (irand == 6) {
				JOptionPane.showMessageDialog(null, "code haha");
			}
			else if (irand == 7) {
				JOptionPane.showMessageDialog(null, "we are number one");
			}
			else if (irand == 8) {
				JOptionPane.showMessageDialog(null, "door");
			}
			else if (irand == 9) {
				JOptionPane.showMessageDialog(null, "*discord boop sound*");
			}
			else if (irand == 10) {
				JOptionPane.showMessageDialog(null, "despacito");
			}
			else {
				JOptionPane.showMessageDialog(null, "donald trump");
			}
			
		});
		
		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}
	
	
}
