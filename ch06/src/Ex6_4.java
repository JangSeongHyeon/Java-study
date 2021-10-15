
public class Ex6_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMath mm=new MyMath();
		long result1=mm.add(5L, 3L);
		long result2=mm.substract(5L, 3L);
		long result3=mm.multiply(5L, 3L);
		double result4=mm.divide(5L, 3L);
		mm.printGugudan(2);
		long result5=mm.max(5,3);
		
		System.out.println("max(5L,3L)="+result5);
		System.out.println("add(5L,3L)="+result1);
		System.out.println("substract(5L,3L)="+result2);
		System.out.println("multiply(5L,3L)="+result3);
		System.out.println("divide(5L,3L)="+result4);
		
	}

}

class MyMath{
	void printGugudan(int dan) {
		if(!(2<=dan && dan<=9)) {
			return; 	// �Է¹��� ��(dan)�� 2~9�� �ƴϸ�, �޼��� ��ȿ�ϰ� ���ư���
		}
		for(int i=1;i<=9;i++) {
			System.out.printf("%d * %d = %d%n",dan,i,dan*i);
		}

	}
	long add(long a,long b) {		// ���ϱ� �޼���
		long result=a+b;
		return result;
	}
	
	// �� ���� �޾Ƽ� ���߿� ū ���� ��ȯ�ϴ� �޼���
	long max(long a, long b) {
		if(a>b)
			return a;		// ���ǽ��� ���϶��� ����
		else
			return b;		// ���ǽ��� �����϶��� ����
	}
	
	long substract(long a,long b) {
		return a-b;
	}
	
	long multiply(long a,long b) {
		return a*b;
	}
	
	double divide(double a,double b) {
		return a/b;
	}
	
}


