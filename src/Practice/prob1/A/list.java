package Practice.prob1.A;

public class list {
	protected int[] a;
	protected String[] b;

	public list(int[] a, String[] b){
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString(){
		StringBuilder str = new StringBuilder();
		for (int j : a) {
			str.append(String.valueOf(j) + " ");
		}
		return String.valueOf(str);
	}
}
