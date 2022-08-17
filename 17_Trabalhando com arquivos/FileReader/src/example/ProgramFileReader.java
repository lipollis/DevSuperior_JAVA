package example;

import java.io.BufferedReader;
import java.io.IOException;

public class ProgramFileReader {

    public static void main(String[] args) {
        String path = "D:\\pollis\\Dev\\DEV Superior\\Udemy-JAVA\\17_Trabalhando com arquivos\\in.txt";
        BufferedReader br = null;
        ProgramFileReader fr = null;
        try {
            fr = new ProgramFileReader(path);
            br = new BufferedReader(fr);
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (br != null)
                    br.close();
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
