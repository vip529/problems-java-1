import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String str1 = str.substring(a, b+1);
        System.out.println(str1);
    }
}