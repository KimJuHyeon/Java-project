
public class MyPick<T> {
	public T pick(T[] s, int index) {
		if(index >= s.length) {
			System.out.print("ÀÎµ¦½º°¡ ¹üÀ§¸¦ ¹þ¾î³µ½À´Ï´Ù >> ");
			return null;
		}
		return s[index];
	}
}
