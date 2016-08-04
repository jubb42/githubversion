package orconoutsidegame;

import java.awt.Color;

import javax.swing.BoundedRangeModel;
import javax.swing.JSlider;

public class myJSlider extends JSlider {

	
	public myJSlider() {
		// TODO Auto-generated constructor stub
		super(0,100,20);
		super.setMajorTickSpacing(10);
		//construction.setMinorTickSpacing(1);
		super.setPaintTicks(true);
		super.setPaintLabels(true);
		super.setOpaque(false);
		super.setForeground(Color.GREEN);
	
		
	}

	public myJSlider(int orientation) {
		super(orientation);
		// TODO Auto-generated constructor stub
	}

	public myJSlider(BoundedRangeModel brm) {
		super(brm);
		// TODO Auto-generated constructor stub
	}

	public myJSlider(int min, int max) {
		super(min, max);
		// TODO Auto-generated constructor stub
	}

	public myJSlider(int min, int max, int value) {
		super(min, max, value);
		// TODO Auto-generated constructor stub
	}

	public myJSlider(int orientation, int min, int max, int value) {
		super(orientation, min, max, value);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public void lock(){
		super.disable();
	
	}
}
