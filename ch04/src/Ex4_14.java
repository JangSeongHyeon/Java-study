import java.util.*;

public class Ex4_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0, sum=0;
		System.out.println("숫자를 입력하세요.(예:12345)>");
		
		Scanner scanner=new Scanner(System.in);
		String tmp=scanner.nextLine();
		num=Integer.parseInt(tmp);
		
		while(num!=0) {
			// num을 10으로 나눈 나머지를 sum에 더함
			
			//10으로 나머지 연산을 하면 마지막 자리의 값을 얻는다.
			sum+=num%10;		
			
			System.out.printf("sum=%3d num=%d%n",sum,num);
			
			num/=10;	// num=num/10;
		}
		System.out.println("각 자리수의 합:"+sum);
	}

}
