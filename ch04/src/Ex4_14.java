import java.util.*;

public class Ex4_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0, sum=0;
		System.out.println("���ڸ� �Է��ϼ���.(��:12345)>");
		
		Scanner scanner=new Scanner(System.in);
		String tmp=scanner.nextLine();
		num=Integer.parseInt(tmp);
		
		while(num!=0) {
			// num�� 10���� ���� �������� sum�� ����
			
			//10���� ������ ������ �ϸ� ������ �ڸ��� ���� ��´�.
			sum+=num%10;		
			
			System.out.printf("sum=%3d num=%d%n",sum,num);
			
			num/=10;	// num=num/10;
		}
		System.out.println("�� �ڸ����� ��:"+sum);
	}

}
