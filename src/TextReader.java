
import java.util.Scanner;

public class TextReader {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TextStats stats = new TextStats();

        System.out.println("Skriv rader (skriv 'stop' för att avsluta):");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("stop")) {
                break;
            }
            stats.addLine(input);
        }

        System.out.println("Antal rader: " + stats.getRowCount());
        System.out.println("Antal tecken: " + stats.getCharCount());

    }
}
