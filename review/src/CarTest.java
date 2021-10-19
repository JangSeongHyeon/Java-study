class Car{
	String color;		//색상
	String gearType;	//변속기 종류- auto(자동), manual(수동)
	int door;			//문의 개수
	
	Car(){}
	Car(String c,String g,int d){
		color=c;
		gearType=g;
		door=d;
	}
}
public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1=new Car();
		c1.color="white";
		c1.gearType="auto";
		c1.door=4;
		
		Car c2=new Car("black","auto",4);
		System.out.println("c1의 컬러는"+c1.color+", 기어타입은"+c1.gearType+", 문의 개수는"+c1.door);
		System.out.println("c2의 컬러는"+c2.color+", 기어타입은"+c2.gearType+", 문의 개수는"+c2.door);

	}

}
