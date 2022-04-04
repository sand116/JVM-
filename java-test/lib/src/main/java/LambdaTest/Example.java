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
		  
		// �Ϲ����� ��ü ���� ���
	    Calculator cal = new Calculator();
	    System.out.println(cal.calc(2,3));
	    
	    //�������̽��� �߻� �޼ҵ� ������ ���ÿ� �������̵��Ͽ�,�������̽��� ���������� ��ü�� ������ �� �ִ�
	    //�̸� �͸� ���� ��ü��� �ϸ� ����� �Ǵ� �������̽��� Ÿ��Ÿ���̶�� �Ѵ�. 
	    Calculator2 cal2 = new Calculator2() {
	        @Override
			public int calc(int a, int b) {
	          return a + b;
	        }
	     };
	     System.out.println(cal2.calc(2,3));
	     //���� �⺻������ �͸�����ü ����, �̶� ���ٽ��� Ÿ�� Ÿ���̵� �������̽��� 2�� �̻��� �߻�޼ҵ带 ������ �ȵȴ�
	     Calculator2 cal3 = (int a, int b) ->{return a-b;};
	     
	     System.out.println(cal3.calc(2,3));
	     
	     //�Ű����� Ÿ�� ����, ������ �� ���� ��� {}, return ����
	     Calculator2 cal4 = (a,b)->a*b;
	     System.out.println(cal4.calc(2,3));
	  }
}
