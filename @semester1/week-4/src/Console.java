import java.io.Reader;
import java.util.Scanner;

public class Console {
    public static void log(String m){
        System.out.println(m);
    }

    public static int promt(String m){
        Scanner scanner = new Scanner(System.in);
        System.out.println(m);
        return scanner.nextInt();
    }
}
