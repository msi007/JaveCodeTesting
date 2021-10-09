package democons;

class consExample {
	int number;
	
	consExample(int a){                  //Constructor
		number=a;
	}
}

public class demcons {

	public static void main(String[] args) {
	
		consExample Obj=new consExample(6);       //value pass to constructor
		long fact=1;
		int i;
		for (i=1; i<=Obj.number;i++) {
			fact=fact*i;
		}
		
	System.out.print("Factorula value of  " +Obj.number+  " is: "  + fact);
	}
	

}
