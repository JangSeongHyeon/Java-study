
public class Ex4_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int i=0;
		
		while(true) {		// ���� �ݺ��� for(;;){}
			if(sum>100)
				break;		// �ڽ��� ���� �ϳ��� �ݺ����� �����.
			++i;
			sum+=i;
		}	// end of while
		
		System.out.println("i="+i);
		System.out.println("sum="+sum);
	}

}
