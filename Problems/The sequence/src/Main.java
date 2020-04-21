import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i =1;
        int count = 0;
        while(true){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
                count++;
                if(count == n){
                    break;
                }
            }
            if(count == n){
                    break;
                }
            i++;
        }
    }
}
