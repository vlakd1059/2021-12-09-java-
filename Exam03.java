import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		// 버블 정렬
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);

		// 입력부
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "번째 원소 입력>> ");
			arr[i] = sc.nextInt();
		}
		
		//버블정렬
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				//현재 원소가 인접한 원소보다 크다면
				// 값을 바꾸어 주세요--> 치환
				if(arr[j]>arr[j+1]) {
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}

		// 출력부
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}
