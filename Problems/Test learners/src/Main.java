import java.util.Scanner;
class Main {
    public static void main(String[] args) {
//        System.out.println("what programming language are you learning here?");
//        System.out.println("1. Java");
//        System.out.println("2. Kotlin");
//        System.out.println("3. Scala");
//        System.out.println("4. Python");

        Scanner scanner = new Scanner(System.in);
        int ans = scanner.nextInt();
        switch(ans){
            case 1:
                System.out.println("Yes!");
                break;
            case 2:
                System.out.println("No!");
                break;
            case 3:
                System.out.println("No!");
                break;
            case 4:
                System.out.println("No!");
                break;
            default:
                System.out.println("Unknown number");
                break;
        }
    }
}