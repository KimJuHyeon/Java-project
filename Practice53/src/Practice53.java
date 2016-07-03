import java.util.Scanner;

public class Practice53 {

	public static void main(String[] args) {
		String[] sArray = {"하나", "두울", "세엣"};
		Integer[] iArray = {10, 20, 30};
		
		Scanner input = new Scanner(System.in);
		System.out.print("문자열 배열에서 찾고 싶은 인덱스를 입력하세요: ");
		int key = input.nextInt();		
		MyPick p1 = new MyPick();				
		System.out.print(key + "번 인덱스 저장 내용 : "); 
		System.out.println(p1.pick(sArray, key));
		System.out.print("문자열 배열에서 찾고 싶은 인덱스를 입력하세요: ");
		key = input.nextInt();					
		System.out.print(key + "번 인덱스 저장 내용 : "); 
		System.out.println(p1.pick(sArray, key));
		
		System.out.print("정수 배열에서 찾고 싶은 인덱스를 입력하세요: ");
		key = input.nextInt();		
		MyPick p2 = new MyPick();				
		System.out.print(key + "번 인덱스 저장 내용 : "); 
		System.out.println(p2.pick(iArray, key));
		
		System.out.print("정수 배열에서 찾고 싶은 인덱스를 입력하세요: ");
		key = input.nextInt();					
		System.out.print(key + "번 인덱스 저장 내용 : "); 
		System.out.println(p2.pick(iArray, key));
		
	}

}
