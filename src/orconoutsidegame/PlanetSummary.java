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
	private JSlider construction;
	private JSlider security;
	private JSlider agriculture;
	private JSlider trade;
	private JSlider research;
	public PlanetSummary(){
		setLayout(new GridLayout(8,1));
		
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
		construction = new JSlider();
		security = new JSlider();
		agriculture = new JSlider();
		trade = new JSlider();
		research = new JSlider();
		
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

