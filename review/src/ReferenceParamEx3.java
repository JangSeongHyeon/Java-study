
public class ReferenceParamEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[] {3,2,1,6,5,4};
		

	}
	
	static void printArr(int[] arr) {		// �迭�� ��� ��Ҹ� ���
		System.out.print("[");
		for(int i:arr) 		// ���� for��
			System.out.println(i+",");
		System.out.println("]");
	}
	
	static void sortArr(int[] arr) {		// �迭�� ������������ ����
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {		//���̰� 5�̸� , 0~3(i=0), 0~2(i=1), 0~1(i=2) 0(i=3)  x(i=4)
				if(arr[j]>arr[j+1]) {
					int tmp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
			}
		}
		
	}

}
