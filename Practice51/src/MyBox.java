
public class MyBox<T> {
	private T data;
	public MyBox (T data) { this.data = data; }
	void setD(T data) { this.data = data; }
	T getD() { return data; }
}
