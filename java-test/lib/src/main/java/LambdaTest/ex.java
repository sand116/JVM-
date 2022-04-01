package LambdaTest;

class Calculator {
	 Calculator() {};

	  public int calc(int a, int b) {
	    return a + b;
	  };
}


public class ex{
	  public static void main(String[] args) {
	    Calculator cal = new Calculator();

	    System.out.println(cal.calc(2,3)); 
	  }
	}
