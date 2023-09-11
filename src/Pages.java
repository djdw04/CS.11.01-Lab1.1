import java.util.Scanner;
public class Pages {
    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        int bookValue = (100-age);
        System.out.println(age + "-year olds should read at least " + bookValue + " pages before giving up on a book.");

    }
}