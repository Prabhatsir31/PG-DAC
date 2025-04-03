// 3) Define a class "Emp" with private static member "int cnt".
// How will u make sure that outsiders can read the value of cnt ?

class Emp{
	private static int cnt=0;
	
	public Emp() {
		cnt++;
	}
	
	public static int getCount() {
		return cnt;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e1 = new Emp();
		Emp e2 = new Emp();
		Emp e3 = new Emp();
		
		System.out.println("Number of Employee " + getCount());
	}
}
