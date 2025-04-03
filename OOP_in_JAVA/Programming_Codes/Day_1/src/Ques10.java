
public class Ques10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	     * 
//	    * * 
//	   * * * 
//	  * * * * 
//	 * * * * * 
		
		int rows = 5;
		for(int i=0; i<=rows; i++) {
			for(int j=rows; j>i; j--) {
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
