
public class Ex6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv4 t1=new Tv4();
		Tv4 t2=new Tv4();
		
		System.out.println("t1의 channel값은"+t1.channel+"입니다.");
		System.out.println("t2의 channel값은"+t2.channel+"입니다.");
		
		t1.channel=7;		// channel의 값을 7로한다.
		System.out.println("t1의 channel값을 7로 변경하였습니다.");
		
		t2=t1;		// 참조변수 t1의 값을 t2에 저장
		System.out.println("t1의 channel1 값은"+t1.channel+"입니다.");
		System.out.println("t2의 channel2 값은"+t2.channel+"입니다.");

	}

}
