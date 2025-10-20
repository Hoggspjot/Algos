package october.day201025.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter("file.txt");

        System.out.println("Введи текст. Для выхода - exit");

        String line;

        while (!(line = scanner.nextLine()).equals("exit")) {
            pw.println(line);
        }
        pw.close();


        Scanner scannerRead = new Scanner(new File("file.txt"));
        if (scannerRead.hasNextLine()) {
            System.out.println(scannerRead.nextLine());
        } else {
            System.out.println("файл пуст");
        }
        scannerRead.close();
    }
}
