import java.util.Scanner;

public class Practice53 {

	public static void main(String[] args) {
		String[] sArray = {"�ϳ�", "�ο�", "����"};
		Integer[] iArray = {10, 20, 30};
		
		Scanner input = new Scanner(System.in);
		System.out.print("���ڿ� �迭���� ã�� ���� �ε����� �Է��ϼ���: ");
		int key = input.nextInt();		
		MyPick p1 = new MyPick();				
		System.out.print(key + "�� �ε��� ���� ���� : "); 
		System.out.println(p1.pick(sArray, key));
		System.out.print("���ڿ� �迭���� ã�� ���� �ε����� �Է��ϼ���: ");
		key = input.nextInt();					
		System.out.print(key + "�� �ε��� ���� ���� : "); 
		System.out.println(p1.pick(sArray, key));
		
		System.out.print("���� �迭���� ã�� ���� �ε����� �Է��ϼ���: ");
		key = input.nextInt();		
		MyPick p2 = new MyPick();				
		System.out.print(key + "�� �ε��� ���� ���� : "); 
		System.out.println(p2.pick(iArray, key));
		
		System.out.print("���� �迭���� ã�� ���� �ε����� �Է��ϼ���: ");
		key = input.nextInt();					
		System.out.print(key + "�� �ε��� ���� ���� : "); 
		System.out.println(p2.pick(iArray, key));
		
	}

}
