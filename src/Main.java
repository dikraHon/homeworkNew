import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("ddf", "sdf", 201);
        book.enterInformation();
        Book book1 = new Book("ddf", "sdf", 201123123);
        book1.enterInformation();
        System.out.println(book1.equals(book));
        String str = new Scanner(System.in).nextLine().toUpperCase();
        Month.JUNE.isWinter(str);
    }
}