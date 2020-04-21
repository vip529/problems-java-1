import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int res = (a%10)*100 + ((a%100)/10)*10 + (a/100);
        System.out.println(res);
    }
}