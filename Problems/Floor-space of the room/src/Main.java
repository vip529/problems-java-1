
import java.util.Scanner;
import java.lang.Math;
class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String size = scanner.next();
      switch(size){
          case "rectangle":
              double a = scanner.nextInt();
              double b = scanner.nextInt();
              System.out.println(a*b);
              break;
          case "triangle":
              double m = scanner.nextInt();
              double n = scanner.nextInt();
              double p = scanner.nextInt();
              double s = (m+n+p)/2;
              double ar_t = Math.sqrt(s*(s-m)*(s-n)*(s-p));
              System.out.println(ar_t);
              break;
          case "circle":
              double r = scanner.nextInt();
              System.out.println(3.14*r*r);
              break;
          default:
              break;
      }
    }
}