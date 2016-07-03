
public class Practice52 {

	public static void main(String[] args) {		
		MyPair<String> fruit = new MyPair<String>("»ç°ú", "¹è");
		MyPair<Integer> num = new MyPair<Integer>(100, 20);
		
		String s1 = fruit.toString();
		String s2 = num.toString();
		
		System.out.println(s1);
		System.out.println(s2);		
	}

}
