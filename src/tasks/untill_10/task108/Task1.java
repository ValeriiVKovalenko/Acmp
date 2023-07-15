package tasks.untill_10.task108;

import java.io.*;

public class Task1 {
    public static void main(String[] args) {
        try(BufferedReader input = new BufferedReader(new FileReader("INPUT.txt"));
            BufferedWriter output = new BufferedWriter(new FileWriter("OUTPUT.txt"))) {

            String inputText = input.readLine();
            String[] split = inputText.split(" ");

            int result = Integer.parseInt(split[0]) + Integer.parseInt(split[1]);
            output.write(String.valueOf(result));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}