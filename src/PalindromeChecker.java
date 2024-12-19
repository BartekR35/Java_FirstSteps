import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pobranie słowa od użytkownika
        System.out.print("Podaj słowo: ");
        String word = scanner.nextLine();

        // Zamiana liter na małe
        String lowercaseWord = word.toLowerCase();
        System.out.println(lowercaseWord);

        // Odwrócenie słowa
        String reversedWord = new StringBuilder(lowercaseWord).reverse().toString();

        // Sprawdzenie, czy słowo jest palindromem
        if (lowercaseWord.equals(reversedWord)) {
            System.out.println("Słowo \"" + word + "\" jest palindromem.");
        } else {
            System.out.println("Słowo \"" + word + "\" nie jest palindromem.");
        }

        scanner.close();
    }
}
