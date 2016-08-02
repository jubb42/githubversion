package orconoutsidegame;

import java.awt.Color;
import java.awt.Point;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class Planet extends JPanel{

private int maxPopulation;
private int currentPopulation;
private int localFood;
private int localCredit;
private String planetName;
private Point coordinates; // use to show the location of the planet
private String starMapImageName; // use to reference the name of the image
private BufferedImage starMapImage; // used to store the image seen on star map
private BufferedImage scaledStarMapImage;
private double imageScaler =0.0; //used to scale the images
private Color planetColor;



//null Constructor 
public Planet(){
	planetName = "SOL";
	coordinates	= new Point(1,1);
	planetColor = new Color(255,255,255);
	
}

public String toString(){
	String temp =("Planet Name: " + planetName
			+"\nmaxPopulation: " + maxPopulation 
			+ "\ncurrentPopulation: " + currentPopulation
			+ "\nLocal Credits: " + localCredit
			+ "\nLocal Food: " + localFood
			+ "\nCoordinates: " + coordinates
			+ "\nlocalFood: " + localFood);
	
		
	return (temp);
}

public BufferedImage getScaledBufferedImage(){
	scaledStarMapImage = new BufferedImage(starMapImage.getWidth(), starMapImage.getHeight(), starMapImage.getType());
	return scaledStarMapImage;
}

public BufferedImage getStarMapImage(){
		
	return starMapImage;
	}
public void setStarMapImage(BufferedImage starMapImage){
	
	this.starMapImage=starMapImage;
}
public String getPlanetName(){
return planetName;
}
public void setPlanetName(String name){
this.planetName = name;
}
public int getXCoordinates(){
	return coordinates.x;
}
public void setCoordinates(int x, int y){
	coordinates.setLocation(x, y);
}
public int getYCoordinates(){
	return coordinates.y;
}	
public void setPlanetColor(int r, int b, int g){
	planetColor = new Color(r,b,g);
}
public Color getPlanetColor(){
	return planetColor;
}





}