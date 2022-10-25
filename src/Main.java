import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj swoje imię: ");
        String name = sc.nextLine();

        System.out.print("Podaj swoje nazwisko: ");
        String last_name = sc.nextLine();

        System.out.print("Podaj swoje miasto zamieszkania: ");
        String city = sc.nextLine();

        System.out.print("Podaj swój wiek: ");
        int age = sc.nextInt();

        System.out.print("Podaj swój stan cywilny: ");
        String married = sc.next();

        System.out.println("Witaj " + name + " " + last_name + ", " + age + " lat, z miasta " + city + ", " + married);
    }
}