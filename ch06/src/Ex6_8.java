class Data3{int x;}

public class Ex6_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data3 d=new Data3();
		d.x=10;
		
		Data3 d2=copy(d);
		
		System.out.println("d.x ="+d.x);
		System.out.println("d2.x ="+d2.x);

	}
	
	
	// static메서드는 객체생성없이 호출 가능
	static Data3 copy(Data3 d) {
		Data3 tmp=new Data3();		// 새로운 객체 tmp를 생성한다
		tmp.x=d.x;
		return tmp;
	}

}
