import java.util.*;

public class FlowEx11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("당신의 주민번호를 입력하세요.(011231-1111222)>");
		
		Scanner scanner=new Scanner(System.in);
		String regNo=scanner.nextLine();
		char gender=regNo.charAt(7);		// 입력받은 번호의 8번째 문자를 gender에 저장
		
		switch(gender) {
		case '1': case '3':
			switch(gender) {
			case '1':
				System.out.println("당신은 2000년 이전에 출생한 남자입니다.");
				break;
			case '3':
				System.out.println("당신은 2000년 이후에 출생한 남자입니다.");
			}
			break;		// 이 break문을 빼먹지 않도록 주의
		}

	}

}
