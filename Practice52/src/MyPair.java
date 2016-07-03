
public class MyPair<T> {
	private T data, data2;
	public MyPair (T data, T data2) { 
		this.data = data;
		this.data2 = data2;
	}
	void setD(T data) { this.data = data; }
	T getD() { return data; }
	public String toString() {
		String s = "";
		s += "(" + data + ", " + data2 + ")";
		return s;
	}
}
