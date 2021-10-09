//package democons;

class contstruncton001 {
	int number;

	contstruncton001(int a){                         //Constructor
		number=a;
	}
	public  int showresult(){
		int fact=1;
		int i;
		for(i=1;i<=number;i++) {
		fact=fact*i;	
		}
		//System.out.print("Factorial value of  " +number+  " is: "  + fact);
		return fact;
		
	
	}

};



public class democons01 {
	public static void main(String[] args) {
	contstruncton001 MyObj= new contstruncton001(10);   //value pass to constructor
    int result=MyObj.showresult();
    System.out.print("Factorial value of  " +MyObj.number+  " is: "  +result);
    
    }

}
