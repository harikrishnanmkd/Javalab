import java.awt.*;
import java.applet.*;
import java.awt.event.*;
 
public class applet2 extends Applet implements MouseListener
{
    int x,y;
    public void init()
    {
        addMouseListener( this);
// the applet becomes capable of receiving and responding to mouse-related actions such as mouse clicks, mouse movements, and mouse drags.
// the keyword this refers to the current instance of the applet class where the code is written.
    }
    public void paint(Graphics g)
    {
 
        // g.drawRect(150, 150, 150, 200); //House
        g.setColor(Color.BLUE);
        g.fillRect(200, 200, 50, 150);
        g.drawRect(200, 200, 50, 150); // Door
        g.drawRect(150, 150, 150, 200); //House
        g.drawArc(150,100,150,100,0,180);
 
        if(x>200 && x<300 && y>200 && y<300)
        {
            g.setColor(Color.red);
            g.fillRect(200, 200, 50, 150);
        }
    }
    public void mouseClicked(MouseEvent e)
    {
 
    }
    public void mouseEntered(MouseEvent e)
    {
 
    }
 
    @Override
    public void mouseExited(MouseEvent e) {
 
    }
 
    public void mousePressed(MouseEvent e)
    {
        x=e.getX();
        y=e.getY();
        repaint();
 
    }
    public void mouseReleased(MouseEvent e)
    {
 
    }
 
}

/*
<applet code="applet2.class" width=300 height=300>
</applet>
*/

