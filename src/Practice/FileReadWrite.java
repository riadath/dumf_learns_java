package Practice;
import java.io.*;
import java.util.*;

public class FileReadWrite {

    public static void readWriteFile(){
        try{
            FileReader in_file = new FileReader("src/Practice/in.txt");
            FileWriter out_file = new FileWriter("src/Practice/out.txt");
            StringBuilder input = new StringBuilder("");
            int i;
            ArrayList<String> input_lines = new ArrayList<String>();

            while((i = in_file.read()) != -1){
                if((char)i == '\n'){
                    input_lines.add(input.toString());
                    input = new StringBuilder("");
                }
                else {
                    input.append((char) i);
                }
            }

            input_lines.add(input.toString());

            Collections.reverse(input_lines);

            for(String temp : input_lines){
                out_file.write(temp + "\n");
                System.out.println(temp);
            }
            in_file.close();
            out_file.close();


        }
        catch (FileNotFoundException e){
            System.out.println(e);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        readWriteFile();
    }

}