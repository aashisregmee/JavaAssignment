import java.awt.*;
import java.applet.Applet;

/* <applet code = NepalFlag width = 300 height = 300> </applet>  */

public class NepalFlag extends Applet 
{
	int x[] = {50,400,150,400,50};
	int y[] = {50,300,300,600,600};

	public void paint(Graphics g){
		g.setColor(Color.red);
		g.fillPolygon(x,y,5);
		g.setColor(Color.blue);
		g.drawPolygon(x,y,5);
		g.setColor(Color.white);
		g.fillOval(100,425,100,100);
		g.fillOval(100,150,100,100);
		g.setColor(Color.red);
		g.fillOval(100,135,100,100);
	

		showStatus("National flag of nepal");
	}
}