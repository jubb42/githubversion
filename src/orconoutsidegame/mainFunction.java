package orconoutsidegame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;



public class mainFunction {

	private static int height = 1080;
	private static int width = 1920;
	
	public static void main(String[] args) {
		
//Creates all of the game objects
		
		//creates all the JFrames,JPanels,and LayeredPanes
		JFrame frame = new JFrame(); 
		PlanetSummary planetSummary = new PlanetSummary();
		Window window = new Window();
		JLayeredPane layeredPane = new JLayeredPane();
		MouseWatcher mouseWatcher = new MouseWatcher();
		
		
		//sets the layout manager to BorderLayout
		frame.setLayout(new BorderLayout());
		
		//sets up the layerPane with a dimension the same as the window
		layeredPane.setPreferredSize(new Dimension(width, height));
		
	
		//sets the window background as the color black
		window.setBackground(Color.BLACK);
		
		//allow the window to the close of the x even thought the top banner has been disabled
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//sets up the frame height and width 
		frame.setSize(width,height);
		
		
		// Sets the frame around the window with minimize and exit buttons
		
		//Uncomment to remove minimize and exit buttons
		//frame.setUndecorated(true);
		
		//I like this way so I can move the window around my screen
		frame.setUndecorated(false);
		
		//set the size of the window to equal the preferredsize which is the same as the Height/width
		window.setSize(layeredPane.getPreferredSize());
		//set the location of the window to be in the upper left hand side.
		window.setLocation(0,0);
		
		planetSummary.setSize(width/5, height*3/4);
		
		planetSummary.setLocation(width*3/4, height*1/10);
		
		//adds the layered pane to the frame
        frame.add(layeredPane, BorderLayout.CENTER);
		
		// this adds the window and PlanetSummary jpanel to the middle of the screen
		layeredPane.add(window,JLayeredPane.DEFAULT_LAYER);
		layeredPane.add(planetSummary, JLayeredPane.PALETTE_LAYER);
		layeredPane.add(mouseWatcher,BorderLayout.NORTH);
        
       mouseWatcher.setLocation(0,0);
       mouseWatcher.setSize(layeredPane.getPreferredSize());
		
		
				
		
		
		//sets the frame as visisble
		frame.setVisible(true);
		
	}

	public static int getHeight(){
		return height;
	}
	public static int getWidth(){
		return width;
	}
	
		
		
	
	
}
