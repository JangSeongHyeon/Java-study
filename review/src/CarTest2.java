class Newcar{
	String color;		//����
	String gearType;	//���ӱ����� - auto(�ڵ�), manual(����)
	int door;			//���� ����
	
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
		
		System.out.println("c1�� color="+c1.color+", gearType="+c1.gearType+", door="+c1.door);
		System.out.println("c2�� color="+c2.color+", gearType="+c2.gearType+", door="+c2.door);
		

	}

}
