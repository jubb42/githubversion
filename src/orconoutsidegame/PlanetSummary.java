package orconoutsidegame;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
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
	
	private JLabel constructionLabel;
	private JLabel securityLabel;
	private JLabel agricultureLabel;
	private JLabel tradeLabel;
	private JLabel researchLabel;
	
	private final ImageIcon iconLock = new ImageIcon(getClass().getResource("LockTest1.png"));
	
	
	public PlanetSummary(){
		
		//J Decreased this from 8 to 7 to make all the data fit on the screen.
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
			
		
		
		
		jta = new JTextArea(60,60);
		jta.setOpaque(false);
		c.gridx = 0;
		c.gridy = 0;
		
		add(jta,c);
		
		/*
		 * In this area we need to code all the elements that we want to see in the planet summary box.
		 * Namely, name, variables food and credits, 5 slider bars for the planet areas of focus,
		 * (construction,security,finance,agriculture,research)
		 * a transport troops button, maybe a graphic of the planet and a way to choose what you are building
		 * with construction
		 */
		//builds all the JSliders
		
		constructionLabel = new JLabel("CONSTRUCTION");
		constructionLabel.setFont(new Font("Serif", Font.BOLD, 20));
		constructionLabel.setForeground(Color.WHITE);
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 1;
		add(constructionLabel,c);
		
		construction = new myJSlider();// min, max, intial
		construction.setOpaque(false);
		construction.setForeground(Color.WHITE);
//		construction.disable();   // can be used in conjunction with the lock button
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 2;
		add(construction,c);
		
		
		
		constructionLock = new JButton(iconLock);
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 2;
		add(constructionLock,c);
				
		securityLabel = new JLabel("SECURITY");
		securityLabel.setFont(new Font("Serif", Font.BOLD, 20));
		securityLabel.setForeground(Color.WHITE);
		c.gridx = 0;
		c.gridy = 3;
		add(securityLabel,c);
			
		security = new myJSlider();
		security.setOpaque(false);
		security.setForeground(Color.WHITE);
		c.fill = GridBagConstraints.BOTH;
		c.weightx = 100.0;
		c.gridx = 0;
		c.gridy = 4;
		add(security,c);
		
		securityLock = new JButton(iconLock);
		c.fill = GridBagConstraints.BOTH;
		c.weightx = 0.0;
		c.gridx = 1;
		c.gridy = 4;
		add(securityLock,c);
		
		
		agricultureLabel = new JLabel("AGRICULTURE");
		agricultureLabel.setFont(new Font("Serif", Font.BOLD, 20));
		agricultureLabel.setForeground(Color.WHITE);
		c.gridx = 0;
		c.gridy = 5;
		add(agricultureLabel,c);
				
		agriculture = new myJSlider();
		agriculture.setOpaque(false);
		agriculture.setForeground(Color.WHITE);
		c.fill = GridBagConstraints.BOTH;
		c.weightx = 0;
		c.gridx = 0;
		c.gridy = 6;
		add(agriculture,c);
		
		agricultureLock = new JButton(iconLock);
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 6;
		add(agricultureLock,c);
		
		
		
		tradeLabel = new JLabel("TRADE");
		tradeLabel.setFont(new Font("Serif", Font.BOLD, 20));
		tradeLabel.setForeground(Color.WHITE);
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 7;
		add(tradeLabel,c);
		
		trade = new myJSlider();
		trade.setOpaque(false);
		trade.setForeground(Color.WHITE);
		c.fill = GridBagConstraints.BOTH;
		c.weightx = 0;
		c.gridx = 0;
		c.gridy =8;
		add(trade,c);
		
		tradeLock = new JButton(iconLock);
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 8;
		add(tradeLock,c);
		
		researchLabel = new JLabel("RESEARCH");
		researchLabel.setFont(new Font("Serif", Font.BOLD, 20));
		researchLabel.setForeground(Color.WHITE);
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 9;
		add(researchLabel,c);
		
		research = new myJSlider();
		research.setOpaque(false);
		research.setForeground(Color.WHITE);
		c.fill = GridBagConstraints.BOTH;
		c.weightx = 0;
		c.gridx = 0;
		c.gridy = 10;
		add(research,c);
		
		researchLock = new JButton(iconLock);
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 10;
		add(researchLock,c);
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

