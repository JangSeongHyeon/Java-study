class Goodcar{
	String color;		// 색상
	String gearType;	//기어타입
	int door;			//문의 개수
	
	Goodcar(){
		this("white","auto",4);
	}
	
	Goodcar(Goodcar c){		// 참조변수를 매개변수로 설정
		color=c.color;
		gearType=c.gearType;
		door=c.door;
	}
	
	Goodcar(String color,String gearType,int door){
		this.color=color;
		this.gearType=gearType;
		this.door=door;
	}
}
public class CarTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goodcar c1=new Goodcar();
		Goodcar c2=new Goodcar(c1);
		System.out.println("c1의 color="+c1.color+", gearType="+c1.gearType+", door="+c1.door);
		System.out.println("c2의 color="+c2.color+", gearType="+c2.gearType+", door="+c2.door);
		c1.door=100;		//c1의 인스턴수 변수 door값을 변경한다.
		System.out.println("c1의 color="+c1.color+", gearType="+c1.gearType+", door="+c1.door);
		System.out.println("c2의 color="+c2.color+", gearType="+c2.gearType+", door="+c2.door);
		
		

	}

}
