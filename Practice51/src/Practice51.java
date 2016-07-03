import java.util.Scanner;

public class Practice51 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("MyBox에 저장할 내용을 입력하세요: ");
		String s1 = input.next();
		MyBox b1 = new MyBox("모름");
		b1.setD(s1);
		System.out.println("MyBox에 저장된 내용: " + b1.getD());
		
		System.out.print("MyBox에 저장할 내용을 입력하세요: ");
		String s2 = input.next();
		b1.setD(s2);
		System.out.println("MyBox에 저장된 내용: " + b1.getD());
		
		System.out.print("MyBox에 저장할 내용을 입력하세요: ");
		Integer i1 = input.nextInt();
		MyBox b2 = new MyBox(0);
		b2.setD(i1);
		System.out.print("MyBox에 저장할 내용을 입력하세요: ");
		Integer i2 = input.nextInt();
		MyBox b3 = new MyBox(0);
		b3.setD(i2);
		System.out.println(b2.getD() + " + " + b3.getD() + " = " + (i1 + i2));
		
	}

}
