class Data10{int x;}

public class ReferenceParamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data10 d=new Data10();
		d.x=10;
		System.out.println("main() : x="+d.x);
		
		change(d);
		System.out.println("After change(d)");
		System.out.println("main() :x="+d.x);
		

	}
	
	static void change(Data10 d) {
		d.x=1000;
		System.out.println("change() : x="+d.x);
	}

}
