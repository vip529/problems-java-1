import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = a + 2 - (a + 2) % 2;
        System.out.println(b);
    }
}