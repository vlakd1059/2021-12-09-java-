import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		// ��������
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);

		// �Էº�
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "��° ���� �Է�>> ");
			arr[i] = sc.nextInt();
		}

		// ��������(��������)
		for (int i = 0; i < arr.length - 1; i++) {
			// maxnum --> ���ذ�
			int maxNum = arr[i];
			int maxNumIndex = i; // ���ذ��� �ε���
			for (int j = i + 1; j < arr.length; j++) {
				// ������ ���ذ����� ũ��, ���� �迭����
				// ���� ū���� ã�Ƽ� �ٲپ� �ֱ�.
				if (maxNum < arr[j]) {
					maxNumIndex = j;
					maxNum = arr[j];
				}
			}
			// ���� ū���� ġȯ
			int temp = arr[i];
			arr[i] = arr[maxNumIndex];
			arr[maxNumIndex] = temp;
		}

		// ��º�
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
