package Task2;

import java.io.*;

public class SecondTask {
    public static void main(String[] args) throws IOException {

        File file = new File("E:\\intid\\adv-hw3\\src\\File.txt");

        FileWriter fw = new FileWriter(file);

        fw.write("This is the weapon of a Jedi Knight.");
        fw.write("\nNot as clumsy or random as a blaster; an elegant weapon for a more civilized age.");
        fw.flush();
        fw.close();

        BufferedReader br = new BufferedReader(new FileReader(file));

        String temp;
        while ((temp = br.readLine()) != null){
            System.out.println(temp);
        }
            br.close();
    }
}
