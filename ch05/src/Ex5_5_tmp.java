import java.util.Arrays;

public class Ex5_5_tmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,4,1,2,3};					// 1차원 배열 
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);		// 배열 arr을 오름차순으로 정렬
		System.out.println(Arrays.toString(arr));
		
		int[][] arr2D= {{11,12},{21,22}};		// 2차원 배열
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.deepToString(arr2D));
		
		String[][] str2D= {{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D2= {{"aaa","bbb"},{"AAA","BBB"}};
		
//		System.out.println(str2D==str2D2); 		// 참조변수 값 비교
		System.out.println(Arrays.deepEquals(str2D, str2D2));
		
//		int[] arr2=Arrays.copyOf(arr,arr.length);	// 배열 arr을 복사해서 arr2를 만듬
		int[] arr2=Arrays.copyOfRange(arr, 2, 4);
	}

}
