package orconoutsidegame;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Window extends JPanel  {
private static final long serialVersionUID = 4005930978865087898L;

private ArrayList<Planet> planetList;
private Font font;
private BufferedImage bi= null;
private Point centerOfScreen= new Point(mainFunction.getWidth()/2, mainFunction.getHeight()/2);
private int centerOfScreenX = mainFunction.getWidth()/2;
private int centerOfScreenY = mainFunction.getHeight()/2;
public PlanetSummary planetSummary;
public Window(){
	
	//used to load the images	
	try {
	    bi = ImageIO.read(new File("PlanetTest.png"));
	} catch (IOException e) {
	}	
	
	// creates Handlers
	
	
	//just some example planets I've played around with
	//for loop that randomly places the stars onto the map
	Random rand = new Random();
	planetList= new ArrayList<Planet>();
	
	for(int numberOfPlanets = 0; numberOfPlanets<50;numberOfPlanets++){
	Planet sol = new Planet();
	sol.setStarMapImage(bi);
	sol.setCoordinates(rand.nextInt(2000), rand.nextInt(1000));
	sol.setPlanetName("planet " + numberOfPlanets);
	
		planetList.add(sol);
	}
	

	//applies mouse handler so that you can move around the screen
	GenericMouseHandler genericMouseHandler = new GenericMouseHandler();
	this.addMouseListener(genericMouseHandler);
	this.addMouseMotionListener(genericMouseHandler);
	this.addMouseWheelListener(genericMouseHandler);
	
	
	
}//end of constuctor

@Override
protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    
    
    //This will draw out all planet add to the planetList
    for(int i =0;i<planetList.size();i++){
    g.setColor(planetList.get(i).getPlanetColor());
    g.drawImage(planetList.get(i).getStarMapImage(),planetList.get(i).getXCoordinates(),planetList.get(i).getYCoordinates(), null);
    g.drawString(planetList.get(i).getPlanetName(), planetList.get(i).getXCoordinates(), planetList.get(i).getYCoordinates()+45);
    
    }
    
    
   
}
public class GenericMouseHandler implements MouseListener,MouseMotionListener,MouseWheelListener{
	//simple MOO style star map movement
	@Override
	public void mouseClicked(MouseEvent e) {
		int xDifference = centerOfScreen.x-e.getX();
		int yDifference = centerOfScreen.y-e.getY();
		
		for(Planet planet : planetList){
		Point clicked = e.getPoint();
	    Rectangle bounds = new Rectangle(planet.getXCoordinates(), planet.getYCoordinates(), planet.getStarMapImage().getWidth(), planet.getStarMapImage().getHeight());
	    if (bounds.contains(clicked)) {
	    	planetSummary.setJTA(planet.toString());
	        
	    }
	    else
	    {
	    	
	    }
		}
//	    for(int indexOfPlanets =0; indexOfPlanets <planetList.size();indexOfPlanets++){
//				
//				planetList.get(indexOfPlanets).setCoordinates(planetList.get(indexOfPlanets).getXCoordinates()+xDifference, planetList.get(indexOfPlanets).getYCoordinates()+yDifference);	
//
//			}
			repaint();
	    
		
		
		
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	/*
	 * so I like how this works but I need to get it so that it works like this when you click the center mouse button.
	 * Still need to figure out of to get a good drag feature for use with the primary button
	*/
	@Override
	public void mouseDragged(MouseEvent e) {
		int xDifference = centerOfScreen.x-e.getX();
		int yDifference = centerOfScreen.y-e.getY();
		
		for(int indexOfPlanets =0; indexOfPlanets <planetList.size();indexOfPlanets++){
			
			planetList.get(indexOfPlanets).setCoordinates(planetList.get(indexOfPlanets).getXCoordinates()+xDifference/100, planetList.get(indexOfPlanets).getYCoordinates()+yDifference/100);	

		}
		repaint();
		
	}

	@Override
	public void mouseMoved(MouseEvent e ){
//		MouseWatcher.setJTextField("x=" + e.getX()+ " , Y= " +e.getY());
//		planetList.get(0).setCoordinates(e.getX(), e.getY());
//		repaint();
		
	}
/*
 * need to learn how to zoom in and out inside of a Jpanel or learn how to scale 
 * all the objects and move them apart as you scroll in.
 * 
 */
	@Override
	public void mouseWheelMoved(MouseWheelEvent Event) {
	MouseWatcher.setJTextField("you turned" + Event.getWheelRotation());	
	for(Planet planet : planetList){
		
	}
	repaint();
	}
	
}




}//end of class




