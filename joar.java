import java.sql.SQLOutput;
import java.util.Scanner;

public class joar {

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv något");
        String string = scanner.nextLine();

        for (int i = 0; i < 5; i++) {
            System.out.println(string);
            Thread.sleep(200);
        }

    }
}
