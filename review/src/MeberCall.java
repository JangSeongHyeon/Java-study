
class MeberCall {
	int iv=10;
	static int cv=20;
	static int cv2=new MeberCall().iv;		// 이처럼 객체를 생성해야 사용가능
	
	static void staticMethod() {
		System.out.println(cv);
//		System.out.println(iv);		에러. 클래스 메서드에서 인스턴스 변수 사용불가
//		MemberCall c=new MemberCall();
//		System.out.println(c.iv);
	}
	
	void instanceMethod() {
		System.out.println(cv);
		System.out.println(iv);		// 인스턴스 메서드에서는 인스턴스 변수를 바로 사용가능
	}
	
	static void staticMethod2() {
		staticMethod();
//		instanceMethod();		//에러. 클래스 메서드에서는 인스턴스 메서드를 호출 할 수 없음
//		MemberCall c=new MemberCall();
//		c.instanceMethod1();		// 인스턴스를 생성한 후에야 호출 가능
		
	}
	
	void instanceMethod2() {
		staticMethod();			// 인스턴스 메서드에서는 인스턴스메서드, 클래스메서드 둘다 바로 호출가능
		instanceMethod();
	}
}
