
public class Main {

	public static void main(String[] args) throws Exception{
		Class c = Class.forName("Student20150980");
		WinCheck ck = (Wincheck) c.newInstance();
		new GUI("����", ck);
	}
}