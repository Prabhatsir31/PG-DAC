
//		1)create a class "Shape" with 2 attributes, "width" and "height". Make sure one can not access 
//		these attributes directly. provide accessor methods on these attributes and allow them to call 
//		from outside of your class.
		
		class Shape{
			int width, height;

			public int getWidth() {
				return width;
			}

			public void setWidth(int width) {
				this.width = width;
			}

			public int getHeight() {
				return height;
			}

			public void setHeight(int height) {
				this.height = height;
			}
			
		}

public class Ques1{
	public static void main(String args[]) {
		Shape sc = new Shape();
		sc.setWidth(10);
		sc.setHeight(20);
		System.out.println(sc.getHeight() + " " + sc.getWidth());
	}
} 
