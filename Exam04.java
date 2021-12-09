import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		// 선택정렬
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);

		// 입력부
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "번째 원소 입력>> ");
			arr[i] = sc.nextInt();
		}

		// 선택정렬(내림차순)
		for (int i = 0; i < arr.length - 1; i++) {
			// maxnum --> 기준값
			int maxNum = arr[i];
			int maxNumIndex = i; // 기준값의 인덱스
			for (int j = i + 1; j < arr.length; j++) {
				// 현재의 기준값보다 크고, 남은 배열에서
				// 제일 큰값을 찾아서 바꾸어 주기.
				if (maxNum < arr[j]) {
					maxNumIndex = j;
					maxNum = arr[j];
				}
			}
			// 가장 큰값과 치환
			int temp = arr[i];
			arr[i] = arr[maxNumIndex];
			arr[maxNumIndex] = temp;
		}

		// 출력부
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
