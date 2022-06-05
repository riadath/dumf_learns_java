package Practice.prob1.B;
import Practice.prob1.A.*;

import java.util.Arrays;

public class name_list extends list implements manage_list {
	public name_list(String[] b) {
		super(null,b);
	}

	@Override
	public String toString(){
		StringBuilder str = new StringBuilder();
		for (String j : b) {
			str.append(String.valueOf(j) + " ");
		}
		return String.valueOf(str);
	}

	@Override
	public void sort() {
		Arrays.sort(b);
		System.out.println(toString());
	}
}
