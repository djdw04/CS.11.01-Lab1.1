import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        int dateAge = (age-2);
        System.out.println(age + "-year olds should date somebody who is at least " + dateAge + "-years old.");

    }
}