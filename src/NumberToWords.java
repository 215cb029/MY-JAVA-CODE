import java.util.Scanner;

public class NumberToWords {

    private static final String[] units = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    private static final String[] teens = {"ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] tens = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public static String convertToWords(int number) {
        if (number == 0) {
            return "Zero";
        }
        return convertToWordsHelper(number);
    }

    private static String convertToWordsHelper(int number) {
        if (number < 10) {
            return units[number];
        } else if (number < 20) {
            return teens[number - 10];
        } else if (number < 100) {
            return tens[number / 10] + " " + convertToWordsHelper(number % 10);
        } else if (number < 1000) {
            return units[number / 100] + " Hundred " + convertToWordsHelper(number % 100);
        } else if (number < 1000000) {
            return convertToWordsHelper(number / 1000) + " Thousand " + convertToWordsHelper(number % 1000);
        } else {
            return convertToWordsHelper(number / 1000000) + " Million " + convertToWordsHelper(number % 1000000);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number < 0 || number > 999999999) {
            System.out.println("Number out of range. Please enter a number between 0 and 999,999,999.");
        } else {
            String words = convertToWords(number);
            System.out.println("In words: " + words);
        }

    }
}




