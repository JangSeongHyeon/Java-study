class Goodcar{
	String color;		// ����
	String gearType;	//���Ÿ��
	int door;			//���� ����
	
	Goodcar(){
		this("white","auto",4);
	}
	
	Goodcar(Goodcar c){		// ���������� �Ű������� ����
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
		System.out.println("c1�� color="+c1.color+", gearType="+c1.gearType+", door="+c1.door);
		System.out.println("c2�� color="+c2.color+", gearType="+c2.gearType+", door="+c2.door);
		c1.door=100;		//c1�� �ν��ϼ� ���� door���� �����Ѵ�.
		System.out.println("c1�� color="+c1.color+", gearType="+c1.gearType+", door="+c1.door);
		System.out.println("c2�� color="+c2.color+", gearType="+c2.gearType+", door="+c2.door);
		
		

	}

}
