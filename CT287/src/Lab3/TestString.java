package Lab3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the regular languages: ");
        String patternString = scanner.nextLine();

        System.out.print("Enter the string to check: ");
        String inputString = scanner.nextLine();

        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(inputString);

        while (matcher.find()) {
            System.out.println("*Foundmatch: " + matcher.group());
        }
    }
}