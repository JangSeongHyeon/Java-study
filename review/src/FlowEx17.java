import java.util.*;

public class FlowEx17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*�� ����� ���� ���� �Է��ϼ���.>");
		Scanner scanner=new Scanner(System.in);
		int lineNum=scanner.nextInt();
		
		for(int i=1;i<=lineNum;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
