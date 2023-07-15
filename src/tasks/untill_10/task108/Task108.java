package tasks.untill_10.task108;

import java.io.*;

public class Task108 {
    public static void main(String[] args) {
        try (BufferedReader input = new BufferedReader(new FileReader("INPUT.txt"));
             BufferedWriter output = new BufferedWriter(new FileWriter("OUTPUT.txt"))) {

            int result = Integer.parseInt(input.readLine());
            output.write(String.valueOf(result));

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
