import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int num_b = scanner.nextInt();
        int i = 0;
        while(scanner.hasNext()){
            int b_h = scanner.nextInt();
            i++;
            if(b_h <= h){
             System.out.println("Will crash on bridge "+i);
             break;
            }
        }
        if(i == num_b){
            System.out.println("Will not crash");
        }
    }
}