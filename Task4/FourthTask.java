package Task4;

import java.io.*;

public class FourthTask {
    public static void main(String[] args) {
        File txtFile = new File("E:\\intid\\adv-hw3\\src\\Task4\\newfile.txt");
        File classFile = new File("E:\\intid\\adv-hw3\\src\\Task4\\newclass.class");

        try {
            classFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(FileWriter fw = new FileWriter(txtFile)) {
            fw.write("You were the chosen one! It was said that you would destroy the Sith, not join them. " +
                    "\nYou were to bring balance to the Force, not leave it in darkness.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader(txtFile));
            String temp;
            while ((temp = br.readLine()) != null){
                System.out.println(temp);
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
