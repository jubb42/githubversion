package orconoutsidegame;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class PlanetSummary extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3369821680103545767L;
	public static JTextArea jta;
	private Planet currentPlanet;
	
	//J created a Custom class called myJslider for our sliders so they can ge more easily customized.
	private myJSlider construction;
	private myJSlider security;
	private myJSlider agriculture;
	private myJSlider trade;
	private myJSlider research;
	
	private JButton constructionLock;
	private JButton securityLock;
	private JButton agricultureLock;
	private JButton tradeLock;
	private JButton researchLock;
	
	
	public PlanetSummary(){
		//J Decreased this from 8 to 7 to make all the data fit on the screen.
		setLayout(new GridLayout(6,2));
	
		
		jta = new JTextArea(60,60);
		jta.setOpaque(false);
		add(jta);
		
		/*
		 * In this area we need to code all the elements that we want to see in the planet summary box.
		 * Namely, name, variables food and credits, 5 slider bars for the planet areas of focus,
		 * (construction,security,finance,agriculture,research)
		 * a transport troops button, maybe a graphic of the planet and a way to choose what you are building
		 * with construction
		 */
		//builds all the JSliders
		construction = new myJSlider();// min, max, intial
		construction.setOpaque(false);
		construction.setForeground(Color.GREEN);
//		construction.disable();   // can be used in conjunction with the lock button
		add(construction);
		
			
		security = new myJSlider();
		security.setOpaque(false);
		add(security);
		
		agriculture = new myJSlider();
		agriculture.setOpaque(false);
		add(agriculture);
		
		trade = new myJSlider();
		trade.setOpaque(false);
		add(trade);
		
		research = new myJSlider();
		research.setOpaque(false);
		add(research);
	}

	
/*
 * room for a bunch of getter and setter features
 * 
 * 
 * 
 */
public static void setJTA(String s){
	jta.setText(s);
}



/*
 * 
 * Handlers for controlling all the buttons, sliders and such
 *  
 * 
 */










}

