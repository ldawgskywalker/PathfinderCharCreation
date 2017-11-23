import java.util.Scanner;

public class RectDemo {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		double xpos, ypos, width, height;
		
		//user input values for first rectangle
		System.out.print("Please input the x value for the first rectangle: ");
			xpos = kb.nextDouble();
		
		System.out.print("Please input the y value for the first rectangle: ");
			ypos = kb.nextDouble();
		
		System.out.print("Please input the width for the first rectangle: ");
			width = kb.nextDouble();
		
		System.out.print("Please input the height for the first rectangle: ");
			height = kb.nextDouble();
		
		//create first rectangle
		Rectangle a = new Rectangle(xpos,ypos,height,width);
		
		
		//user input values for second rectangle
		System.out.print("Please input the x value for the second rectangle: ");
			xpos = kb.nextDouble();
				
		System.out.print("Please input the y value for the second rectangle: ");
			ypos = kb.nextDouble();
				
		System.out.print("Please input the width for the second rectangle: ");
			width = kb.nextDouble();
				
		System.out.print("Please input the height for the second rectangle: ");
			height = kb.nextDouble();
				
		//create second rectangle
		Rectangle b = new Rectangle(xpos,ypos,height,width);
		
		
		System.out.println("The first rectangle has a "+a);
		System.out.println("The second rectangle has a "+b);
		
		
		
		
		kb.close();
	}
}
