import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		// ���� ����
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);

		// �Էº�
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "��° ���� �Է�>> ");
			arr[i] = sc.nextInt();
		}
		
		//��������
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				//���� ���Ұ� ������ ���Һ��� ũ�ٸ�
				// ���� �ٲپ� �ּ���--> ġȯ
				if(arr[j]>arr[j+1]) {
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}

		// ��º�
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}
