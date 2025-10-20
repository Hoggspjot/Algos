package october.day201025.task1;

import java.io.Console;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Console console = System.console();

        String userName = console.readLine();
        char[] passwd = console.readPassword();

        System.out.println(userName);
        System.out.println(Arrays.toString(passwd));
    }
}
