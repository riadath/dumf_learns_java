package Practice;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

class InvalidInput extends Exception {
	@Override
	public String toString() {
		return "Invalid Input";
	}
}

class InvalidFileName extends FileNotFoundException {
	@Override
	public String toString() {
		return "Invalid File Name";
	}
}

public class Main {
	public static void readFromFile() throws InvalidInput, InvalidFileName {
		Scanner sc = new Scanner(System.in);
		int n;
		String filePath;
		String[] inputs;
		try {
			if(!sc.hasNextInt()){
				throw new InvalidInput();
			}
			inputs = sc.nextLine().split(" ");
			n = Integer.parseInt(inputs[0]);
			filePath = inputs[1];
		} catch (InvalidInput e) {
			System.out.println("Error >> " + e);
			throw e;
		}

		System.out.println(n + "\n" + filePath);
		if (!Files.exists(Paths.get(filePath))) {
			throw new InvalidFileName();
		}

		try {
			FileOutputStream f_out = new FileOutputStream(filePath);
			Integer t_n = n;
			String input = t_n.toString();
			StringBuilder output = new StringBuilder();
			for (int i = input.length() - 1, j = 1; i >= 0; i--, j++) {
				output.append(input.charAt(i));
				if (j % 3 == 0 && i > 0) output.append(',');
			}
			output.reverse();
			for (int i = 0; i < output.length(); i++) {
				f_out.write(output.charAt(i));
			}
		} catch (IOException e) {
			System.out.println("File not found " + e);
		}
	}

	public static void main(String... args) {
		String top = "ID\tName\tPrice";
		String filePath = "src/out.txt";
		try{
			BufferedWriter fout = new BufferedWriter(new FileWriter(filePath));
			fout.write(top);

			fout.close();
		}catch (IOException e){
			e.printStackTrace();
		}

	}
}