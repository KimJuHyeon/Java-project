import java.util.Scanner;

public class Practice51 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("MyBox�� ������ ������ �Է��ϼ���: ");
		String s1 = input.next();
		MyBox b1 = new MyBox("��");
		b1.setD(s1);
		System.out.println("MyBox�� ����� ����: " + b1.getD());
		
		System.out.print("MyBox�� ������ ������ �Է��ϼ���: ");
		String s2 = input.next();
		b1.setD(s2);
		System.out.println("MyBox�� ����� ����: " + b1.getD());
		
		System.out.print("MyBox�� ������ ������ �Է��ϼ���: ");
		Integer i1 = input.nextInt();
		MyBox b2 = new MyBox(0);
		b2.setD(i1);
		System.out.print("MyBox�� ������ ������ �Է��ϼ���: ");
		Integer i2 = input.nextInt();
		MyBox b3 = new MyBox(0);
		b3.setD(i2);
		System.out.println(b2.getD() + " + " + b3.getD() + " = " + (i1 + i2));
		
	}

}
