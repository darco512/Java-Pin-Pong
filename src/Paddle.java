import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Paddle extends Rectangle{
	
	int id;
	int yVelocity;
	int speed = 10;
	
	
	
	Paddle(int x, int y, int PADDLE_WIDHT, int PADDLE_HIGHT, int id){
		super(x,y,PADDLE_WIDHT,PADDLE_HIGHT);
		this.id=id;
		
	}
	public void keyPressed(KeyEvent e) {
		switch(id) {
		case 1:
			if(e.getKeyCode()== KeyEvent.VK_W) {
				setYDerection(-speed);
				move();
				System.out.println("KEY PRESSED");
			}
			if(e.getKeyCode()== KeyEvent.VK_S) {
				setYDerection(speed);
				move();	
				System.out.println("KEY Released");
			}
			break;
		case 2:
			if(e.getKeyCode()== KeyEvent.VK_UP) {
				setYDerection(-speed);
				move();
				System.out.println("KEY PRESSED");
			}
			if(e.getKeyCode()== KeyEvent.VK_DOWN) {
				setYDerection(speed);
				move();
				System.out.println("KEY Released");
			}
			break;
		}
	}
	public void keyReleased(KeyEvent e){
		switch(id) {
		case 1:
			if(e.getKeyCode()== KeyEvent.VK_W) {
				setYDerection(0);
				move();
				System.out.println("KEY RELEASED");
			}
			if(e.getKeyCode()== KeyEvent.VK_S) {
				setYDerection(0);
				move();	
				System.out.println("KEY RELEASED");
			}
			break;
		case 2:
			if(e.getKeyCode()== KeyEvent.VK_UP) {
				setYDerection(0);
				move();
				System.out.println("KEY RELEASED");
			}
			if(e.getKeyCode()== KeyEvent.VK_DOWN) {
				setYDerection(0);
				move();
				System.out.println("KEY RELEASED");
			}
			break;
		}
	}
    public void setYDerection(int yDirection) {
    	yVelocity = yDirection;
    }
    public void move() {
    	y= y + yVelocity;
    }
    public void draw(Graphics g) {
    	if(id==1)
    		g.setColor(Color.blue);
    	else
    		g.setColor(Color.red);
    	g.fillRect(x, y, width, height);
    }

}
