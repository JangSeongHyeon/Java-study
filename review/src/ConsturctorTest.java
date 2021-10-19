class Data1{
	int value;
}

class Data3{
	int value;
	Data3(int x){		// 매개 변수가 있는 생성자
		value=x;
	}
}
public class ConsturctorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data1 d1=new Data1();
//		Data3 d3=new Data3();		컴파일 에러 발생!!
		Data3 d3=new Data3(19);

	}

}
