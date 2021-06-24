package javaCodes;

public class GitDemo {

	public static void calculateForme(int num1 , int num2, String calculate) {
		int firstNumber = num1;
		int secondNumber = num2;
		//int total=0;
		//String calculate = "calculate";
		switch(calculate) {
		case  "+" :
		System.out.println(firstNumber+secondNumber);
	    break;
		case "-" :
			System.out.println(firstNumber-secondNumber);
			break;
		case "*" :
			System.out.println(firstNumber*secondNumber);
			break;
		case "/" :
			System.out.println(firstNumber/secondNumber);
			
			
		}
	
	}
	
	
	public static void main(String[] args) {
	calculateForme(40,30 ,"+");	
	System.out.println("All working good!");

	}

}
