
public class Ques11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 * * * * 
//	      * * * 
//	       * * 
//	        *
		int rows = 4;
		for(int i=rows; i>=1; i--) {
			for(int j=1; j<=rows-i; j++) {
				System.out.print(" ");
			}
			//Print Stars
			for(int k= 1; k<=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
