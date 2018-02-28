import java.util.Scanner;

public class ReadDataFromUser {

    public static int readNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static String readStringFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();

    }
}
