package Practice.prob1.C;
import Practice.prob1.A.*;
import Practice.prob1.B.*;
public class test {
	public static void main(String... args){
		int[] a = {5,4,3,2,1};
		String[] b = {"apple","cardio","beetle"};
		num_list num = new num_list(a);

		name_list name = new name_list(b);

		num.sort();
		name.sort();
	}
}
