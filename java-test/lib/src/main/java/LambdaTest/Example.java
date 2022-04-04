package LambdaTest;

class Calculator {
	 Calculator() {};

	  public int calc(int a, int b) {
	    return a + b;
	  };
}


interface Calculator2 {
	  int calc(int a, int b);
	}

public class Example{
	  public static void printCalculator(int a, int b, Calculator2 exp) {
		  System.out.println(exp.calc(a,b));
	  }
	  public static void main(String[] args) {
		printCalculator(3, 4, (x,y)-> x*y);
		  
		// 일반적인 객체 생성 방식
	    Calculator cal = new Calculator();
	    System.out.println(cal.calc(2,3));
	    
	    //인터페이스의 추상 메소드 생성과 동시에 오버라이드하여,인터페이스를 바탕으로한 객체를 생성할 수 있다
	    //이를 익명 구현 객체라고 하며 기반이 되는 인터페이스를 타겟타입이라고 한다. 
	    Calculator2 cal2 = new Calculator2() {
	        @Override
			public int calc(int a, int b) {
	          return a + b;
	        }
	     };
	     System.out.println(cal2.calc(2,3));
	     //람다 기본식으로 익명구현객체 생성, 이때 람다식의 타겟 타입이될 인터페이스는 2개 이상의 추상메소드를 가지면 안된다
	     Calculator2 cal3 = (int a, int b) ->{return a-b;};
	     
	     System.out.println(cal3.calc(2,3));
	     
	     //매개변수 타입 생략, 로직이 한 줄인 경우 {}, return 생략
	     Calculator2 cal4 = (a,b)->a*b;
	     System.out.println(cal4.calc(2,3));
	  }
}
