import java.util.Arrays;

public class Ex5_5_tmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,4,1,2,3};					// 1���� �迭 
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);		// �迭 arr�� ������������ ����
		System.out.println(Arrays.toString(arr));
		
		int[][] arr2D= {{11,12},{21,22}};		// 2���� �迭
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.deepToString(arr2D));
		
		String[][] str2D= {{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D2= {{"aaa","bbb"},{"AAA","BBB"}};
		
//		System.out.println(str2D==str2D2); 		// �������� �� ��
		System.out.println(Arrays.deepEquals(str2D, str2D2));
		
//		int[] arr2=Arrays.copyOf(arr,arr.length);	// �迭 arr�� �����ؼ� arr2�� ����
		int[] arr2=Arrays.copyOfRange(arr, 2, 4);
	}

}
