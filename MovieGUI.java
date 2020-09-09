// Filename: MovieGUI.java
// Written by: Luigi Pisano
// Written on: September 4 2020
// GUI version version of the movie quote app from Chapter 1

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// CLASS header
public class MovieGUI extends JFrame implements ActionListener
{
		// VARIABLE(s) and CONSTANT(s)
		// Create the components
		Font myFont = new Font("Verdana", Font.BOLD, 24);
		JLabel quote = new JLabel("I'm your huckleberry...");
		JLabel movie = new JLabel("");

		JButton button = new JButton("Show Movie");
		// CONSTRUCTOR method for this class
		public MovieGUI()
		{
			super("A Clever Title");
			setBounds(600, 300, 500, 300);
			setLayout(new FlowLayout());
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setResizable(false);
			quote.setFont(myFont);
			movie.setFont(myFont);
			add(quote);
			add(button);
			add(movie);
			setVisible(true);
			// add an event listener to the button component
			button.addActionListener(this);
		} //End of CONSTRUCTOR method

		// event handling method
		@Override
		public void actionPerformed(ActionEvent evt)
		{
			movie.setText("*** Tombstone (1993) ***");
		}
	// MAIN method header
	public static void main(String[] args)
	{
		MovieGUI myFrame = new MovieGUI();
	} // End of main(String[] args)
} // End of MovieGUI