import java.awt.Frame;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

class ShapesDrawing extends Frame
{
	public ShapesDrawing()
	{
		setSize(400,400);
		setVisible(true);
	}
	public void paint(Graphics g)
	{
		
		int [] x= {80,80,160};
		int [] y= {80,160,160};
		Polygon polygon1 = new Polygon(x,y,3);
		g.setColor(Color.RED);
		g.fillPolygon(polygon1);

		
		 int [] x1 = {10,20,40};
        int [] y1= {100,20,100};
		Polygon polygon2 = new Polygon(x1,y1,3);
		g.setColor(Color.BLUE);
		g.drawPolygon(polygon2);

		
		int upperTriangleX[] = {210,360,210}; 
		int upperTriangleY[] = {40,160,160};
		Polygon upperTriangle = new Polygon(upperTriangleX,upperTriangleY,3);
		g.drawPolygon(upperTriangle);
		g.setColor(Color.RED);
		g.fillPolygon(upperTriangle);

		int lowerTriangleX[] = {210,390,210};
		int lowerTriangleY[] = {160,340,340};
		Polygon lowerTriangle = new Polygon(lowerTriangleX,lowerTriangleY,3);
		g.setColor(Color.RED);
		g.fillPolygon(lowerTriangle);

		// For standing rod
		int rodX[] = {207,210,210,207};
		int rodY[] = {40,40,500,478};
		Polygon rod = new Polygon(rodX,rodY,4);
		g.setColor(Color.BLACK);
		g.fillPolygon(rod);

		// For borders 
		int borderX[] = {210,210,360,210,390,210,210,396,216,366}; // 3 units
		int borderY[] = {40,50,160,160,340,340,343,343,163,163};
		Polygon border = new Polygon(borderX,borderY,10);
		g.setColor(Color.BLUE);
		g.fillPolygon(border);

		// For moon		
		g.setColor(Color.WHITE);
		g.fillOval(240,100,30,30);
		g.setColor(Color.RED);
		g.fillOval(240,91,30,30);

		// For star
		int starX[] = {240,250,255,260,270,265,270,260,255,250,240,245};
		int starY[] = {260,260,250,260,260,270,280,280,290,280,280,270}; 
		Polygon star = new Polygon(starX,starY,12);
		g.setColor(Color.WHITE);
		g.fillPolygon(star);
	}
	public static void main(String[] args)
	{
		new ShapesDrawing();
	}
}