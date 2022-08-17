package example;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ProgramFile {
    public static void main(String[] args) {
        File file = new File("D:\\pollis\\Dev\\DEV Superior\\Udemy-JAVA\\17_Trabalhando com arquivos\\in.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
