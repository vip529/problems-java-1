import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = str1.replaceAll("\\s", "");
        String str4 = str2.replaceAll("\\s", "");
        System.out.println(str3.equals(str4));

    }
}