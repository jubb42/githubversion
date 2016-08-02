package orconoutsidegame;

import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JSlider;
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
	
	public PlanetSummary(){
		//J Decreased this from 8 to 7 to make all the data fit on the screen.
		setLayout(new GridLayout(7,1));
		
		jta = new JTextArea(60,60);
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
		security = new myJSlider();
		agriculture = new myJSlider();
		trade = new myJSlider();
		research = new myJSlider();
		
		add(construction);
		add(security);
		add(agriculture);
		add(trade);
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

