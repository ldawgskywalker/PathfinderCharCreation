
public class Rectangle {
	private double xpos;
	private double ypos;
	private double height;
	private double width;
	
	public Rectangle(double x, double y, double h, double w) {
		xpos 	= x;
		ypos 	= y;
		height 	= h;
		width 	= w;
	}

	public double getXpos() {
		return xpos;
	}

	public void setXpos(double xpos) {
		this.xpos = xpos;
	}

	public double getYpos() {
		return ypos;
	}

	public void setYpos(double ypos) {
		this.ypos = ypos;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	public boolean contains(Rectangle B) {
		return false;
	}
	public boolean touching(Rectangle B) {
		
		return false;
	}
	public String toString() {
		return "height of: "+this.getHeight()+"\nA width of: "+this.getWidth()+"\nx-position: "+this.getXpos()+"\ny-position: "+this.getYpos();
	}

}
