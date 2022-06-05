package Practice.prob1.A;

import java.util.Arrays;

public class num_list extends list implements manage_list{
	public num_list(int[] a){
		super(a,null);
	}

	@Override
	public void sort() {
		Arrays.sort(a);
		System.out.println(toString());
	}
}
