
public class MyPick<T> {
	public T pick(T[] s, int index) {
		if(index >= s.length) {
			System.out.print("�ε����� ������ ������ϴ� >> ");
			return null;
		}
		return s[index];
	}
}
