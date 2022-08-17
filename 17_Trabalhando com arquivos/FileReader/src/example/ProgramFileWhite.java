package example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ProgramFileWhite {
    public static void main(String[] args) {
        String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };
        String path = "D:\\pollis\\Dev\\DEV Superior\\Udemy-JAVA\\17_Trabalhando com arquivos\\out.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
        //este 'true' não recria o arquivo e não destroe o q já havia escrito
        // try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
