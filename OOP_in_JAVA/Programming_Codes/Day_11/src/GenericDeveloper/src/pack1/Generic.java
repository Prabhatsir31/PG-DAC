package pack1;

public class Generic<T>
{
	private T first;

	/**
	 * @return the first
	 */
	public T getFirst() {
		return first;
	}

	/**
	 * @param first the first to set
	 */
	public void setFirst(T first) {
		this.first = first;
	}

	@Override
	public String toString() {
		return "Generic [first=" + first + "]";
	}
	
}
