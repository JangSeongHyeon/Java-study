
class MeberCall {
	int iv=10;
	static int cv=20;
	static int cv2=new MeberCall().iv;		// ��ó�� ��ü�� �����ؾ� ��밡��
	
	static void staticMethod() {
		System.out.println(cv);
//		System.out.println(iv);		����. Ŭ���� �޼��忡�� �ν��Ͻ� ���� ���Ұ�
//		MemberCall c=new MemberCall();
//		System.out.println(c.iv);
	}
	
	void instanceMethod() {
		System.out.println(cv);
		System.out.println(iv);		// �ν��Ͻ� �޼��忡���� �ν��Ͻ� ������ �ٷ� ��밡��
	}
	
	static void staticMethod2() {
		staticMethod();
//		instanceMethod();		//����. Ŭ���� �޼��忡���� �ν��Ͻ� �޼��带 ȣ�� �� �� ����
//		MemberCall c=new MemberCall();
//		c.instanceMethod1();		// �ν��Ͻ��� ������ �Ŀ��� ȣ�� ����
		
	}
	
	void instanceMethod2() {
		staticMethod();			// �ν��Ͻ� �޼��忡���� �ν��Ͻ��޼���, Ŭ�����޼��� �Ѵ� �ٷ� ȣ�Ⱑ��
		instanceMethod();
	}
}
