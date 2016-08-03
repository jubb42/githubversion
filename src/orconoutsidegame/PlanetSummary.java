package orconoutsidegame;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
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
		//setLayout(new GridLayout(6,2));
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		
		jta = new JTextArea(60,60);
		jta.setOpaque(false);
		add(jta);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0;
	    c.gridx = 0;
	    c.gridy = 0;
	   add(jta, c);
	    
	    
			
		/*
		 * In this area we need to code all the elements that we want to see in the planet summary box.
		 * Namely, name, variables food and credits, 5 slider bars for the planet areas of focus,
		 * (construction,security,finance,agriculture,research)
		 * a transport troops button, maybe a graphic of the planet and a way to choose what you are building
		 * with construction
		 */
		//builds all the JSliders
		
		
		//I moved your stuff over to the myJslider.java class so that it would affect all of them.
		
		
		construction = new myJSlider();// min, max, intial
		//construction.disable();   // now movedto .lock() inside myJslider.java
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.9;
		c.ipady = 30;
		c.gridx = 0;
	    c.gridy = 1;
		add(construction, c);
		
		constructionLock = new JButton();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.1;
		c.ipady = 30;
		c.gridx = 1;
	    c.gridy = 1;
		add(constructionLock, c);
		
		
		security = new myJSlider();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.9;
		c.ipady = 30;
		c.gridx = 0;
	    c.gridy = 2;
		add(security, c);
		
		securityLock = new JButton();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.1;
		c.ipady = 30;
		c.gridx = 1;
	    c.gridy = 2;
		add(securityLock, c);
		
		
		agriculture = new myJSlider();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.9;
		c.ipady = 30;
		c.gridx = 0;
	    c.gridy = 3;
		add(agriculture, c);
		
		agricultureLock = new JButton();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.1;
		c.ipady = 30;
		c.gridx = 1;
	    c.gridy = 3;
		add(agricultureLock, c);
		
		trade = new myJSlider();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.9;
		c.ipady = 30;
		c.gridx = 0;
	    c.gridy = 4;
		add(trade, c);
		
		tradeLock = new JButton();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 30;
		c.weightx = 0.1;
		c.gridx = 1;
	    c.gridy = 4;
		add(tradeLock, c);
		
		research = new myJSlider();// min, max, intial
		//construction.disable();   // now movedto .lock() inside myJslider.java
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.9;
		c.ipady = 30;
		c.gridx = 0;
	    c.gridy = 5;
		add(research, c);
		
		researchLock = new JButton();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.1;
		c.ipady = 30;
		c.gridx = 1;
	    c.gridy = 5;
		add(researchLock, c);
		
		
		
		//this just demonstrates my new function which does the disable.
		research.lock();
		
			
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

