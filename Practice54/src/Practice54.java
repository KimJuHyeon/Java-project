import java.util.Scanner;

public class Practice54 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		 
		System.out.print("8개의 숫자를 입력하세요: "); 
		Integer nums1 = input.nextInt();		
		System.out.println("당신이 입력한 번호는 다음과 같습니다: ");
		prettyPrint(splitNumbers(nums1));
		
		System.out.print("8개의 숫자를 입력하세요: ");
		String nums2 = input.next();
		System.out.println("당신이 입력한 번호는 다음과 같습니다: ");
		prettyPrint(splitNumbers(nums2));

	}
	public static String[] splitNumbers(String s) {
		String[] sArray = new String[4];
		for(int i = 0; i < sArray.length; i++) {
			sArray[i] = s.substring(2, 4);
		}
		return sArray;
	}
	public static Integer[] splitNumbers(Integer i) {
		Integer[] iArray = new Integer[4];
		
		iArray[0] = (i / 10000000) + (i % 10000000)/1000000;
		iArray[1] = (((i % 10000000)%1000000)/100000) +  (((i % 10000000)%1000000)%100000)/10000;
		iArray[2] = (((((i % 10000000)%1000000)%100000)%10000) / 1000) +(((((i % 10000000)%1000000)%100000)%10000) % 1000)/100;
		iArray[3] = ((((((i % 10000000)%1000000)%100000)%10000) % 1000)%100)/10 + (((((((i % 10000000)%1000000)%100000)%10000) % 1000)%100)%10)/1;
		return iArray;
	}
	public static void prettyPrint(String[] sArray) {
		System.out.println(sArray[0] + "-" + sArray[1] + "-" + sArray[2] + "-" + sArray[3]);
	}
	public static void prettyPrint(Integer[] iArray) {
		System.out.println(iArray[0] + "-" + iArray[1] + "-" + iArray[2] + "-" + iArray[3]);
	}

}
