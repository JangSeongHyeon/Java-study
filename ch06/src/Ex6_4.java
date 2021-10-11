
public class Ex6_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMath mm=new MyMath();
		long result1=mm.add(5L, 3L);
		long result2=mm.substract(5L, 3L);
		long result3=mm.multiply(5L, 3L);
		double result4=mm.divide(5L, 3L);
		long result5=mm.max(5,3);
		
		System.out.println("max(5L,3L)="+result5);
		System.out.println("add(5L,3L)="+result1);
		System.out.println("substract(5L,3L)="+result2);
		System.out.println("multiply(5L,3L)="+result3);
		System.out.println("divide(5L,3L)="+result4);
		
	}

}

class MyMath{
	long add(long a,long b) {		// 더하기 메서드
		long result=a+b;
		return result;
	}
	
	// 두 값을 받아서 둘중에 큰 값을 반환하는 메서드
	long max(long a, long b) {
		long result=0;
		
		return a>b?a:b;
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


