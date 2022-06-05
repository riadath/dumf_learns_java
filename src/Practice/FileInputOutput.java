package Practice;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*input file

1 2 3 4 5

*/

public class FileInputOutput {
	public static void main(String... args) throws IOException {
		BufferedReader fin = new BufferedReader(new FileReader("src/in.txt"));
		BufferedWriter fout = new BufferedWriter(new FileWriter("src/out.txt"));

		String[] input = fin.readLine().split(" ");
		List<Integer> arr = new ArrayList<Integer>();
		for(String str : input){
			arr.add(Integer.parseInt(str));
		}
		for(Integer i : arr){
			System.out.println(i);
		}
		fin.close();
		fout.close();
	}
}