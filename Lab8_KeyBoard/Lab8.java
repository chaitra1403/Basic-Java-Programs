import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/*<applet code="Lab8" width="400" height="400"></applet>*/
public class Lab8 extends Applet implements KeyListener
	{
	int x=20,y=30;
	String msg="   KeyboardEvents  ";

	public void init()
		{
		addKeyListener(this);
		setBackground(Color.magenta);
		setForeground(Color.cyan);
		}

	public void keyPressed(KeyEvent e)
		{
		showStatus("Key is pressed");
		int key=e.getKeyCode();
		switch(key)
			{
			case KeyEvent.VK_UP:
					msg+="up arrow";
					showStatus("Move to up");
					break;

			case KeyEvent.VK_DOWN:
                                        msg+="down arrow";
                                        showStatus("Move to down");
                                        break;

			case KeyEvent.VK_LEFT:
                                        msg+="left arrow";
                                        showStatus("Move to left");
                                        break;


			case KeyEvent.VK_RIGHT:
                                        msg+="right arrow";
                                        showStatus("Move to right");
                                        break;


			case KeyEvent.VK_ENTER:
                                        msg+="ENTER";
                                        showStatus("Enter key Pressed");
                                        break;

			case KeyEvent.VK_ALT:
                                        msg+="alt";
                                        showStatus("ALT key Pressed");
                                        break;

			case KeyEvent.VK_SPACE:
                                        msg+="space";
                                        showStatus("space key Pressed");
                                        break;
			}
			repaint();
		}

	public void keyReleased(KeyEvent e)
		{
		showStatus("Key is released");
		}

	public void keyTyped(KeyEvent e)
		{
		msg+=e.getKeyChar();
		repaint();
		}

	public void paint(Graphics g)
		{
		g.drawString(msg,x,y);
		}
	}

