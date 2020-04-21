import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();
        int n = 1;
        while(m != 0){
            m = m/n;
            n++;
        }
        System.out.println(--n);


    }
}