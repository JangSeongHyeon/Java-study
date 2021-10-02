import java.util.*;

public class FlowEx17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*을 출력할 라인 수를 입력하세요.>");
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
