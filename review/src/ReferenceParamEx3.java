
public class ReferenceParamEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[] {3,2,1,6,5,4};
		

	}
	
	static void printArr(int[] arr) {		// 배열의 모든 요소를 출력
		System.out.print("[");
		for(int i:arr) 		// 향상된 for문
			System.out.println(i+",");
		System.out.println("]");
	}
	
	static void sortArr(int[] arr) {		// 배열을 오름차순으로 정렬
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {		//길이가 5이면 , 0~3(i=0), 0~2(i=1), 0~1(i=2) 0(i=3)  x(i=4)
				if(arr[j]>arr[j+1]) {
					int tmp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
			}
		}
		
	}

}
