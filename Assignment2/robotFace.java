
import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class robotFace extends GraphicsProgram {	
	
	/** Width of the head */
	private static final int HEAD_WIDTH = 180;
	
	/** Height of the head */
	private static final int HEAD_HEIGHT = 280;
	
	/** Width of the mouth */
	private static final int MOUTH_WIDTH = 130;
	
	/** Height of the mouth */
	private static final int MOUTH_HEIGHT = 40;
	
	/** Radius of eye */
	private static final int EYE_RADIUS = 40;
	
	public void run() {
		//declare vars
		double x = getWidth()  / 2;
		double y = getHeight() / 2;
		//create the robot face 
		createHead(x - HEAD_WIDTH/2,  y - HEAD_HEIGHT/2);
		createMouth(x - MOUTH_WIDTH/2,  (y - MOUTH_HEIGHT/2) + HEAD_HEIGHT/4);
		createEye((x - EYE_RADIUS/2) - HEAD_WIDTH/4,  (y - EYE_RADIUS/2) - HEAD_HEIGHT/4);
		createEye((x - EYE_RADIUS/2) + HEAD_WIDTH/4,  (y - EYE_RADIUS/2) - HEAD_HEIGHT/4);
		
	}
	
	private void createHead(double x, double y) {
		//create the head
		GRect head = new GRect (x,y, HEAD_WIDTH,HEAD_HEIGHT);
		head.setFilled(true);		
		head.setFillColor(Color.GRAY);
		add(head);
	}
	
	private void createMouth(double x, double y) {
		//create the mouth
		GRect mouth = new GRect (x,y, MOUTH_WIDTH,MOUTH_HEIGHT);
		mouth.setFilled(true);		
		mouth.setFillColor(Color.WHITE);
		mouth.setColor(Color.WHITE);
		add(mouth);
	}
	
	private void createEye(double x, double y) {
		//create eye
		GOval eye = new GOval (x,y, EYE_RADIUS,EYE_RADIUS);
		eye.setFilled(true);
		eye.setFillColor(Color.YELLOW);
		eye.setColor(Color.YELLOW);
		add(eye);
	}
	
}

