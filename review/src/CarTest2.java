class Newcar{
	String color;		//색상
	String gearType;	//변속기종류 - auto(자동), manual(수동)
	int door;			//문의 개수
	
	Newcar(){
		this("whilte","auto",4);
	}
	
	Newcar(String color){
		this(color,"auto",4);
	}
	
	Newcar(String color,String gearType,int door){
		this.color=color;
		this.gearType=gearType;
		this.door=door;
	}
}
public class CarTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Newcar c1=new Newcar();
		Newcar c2=new Newcar("blue");
		
		System.out.println("c1의 color="+c1.color+", gearType="+c1.gearType+", door="+c1.door);
		System.out.println("c2의 color="+c2.color+", gearType="+c2.gearType+", door="+c2.door);
		

	}

}
