import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        String str = scanner.next();
        String str1 = str.replace('a','b');
        System.out.println(str1);
    }
}