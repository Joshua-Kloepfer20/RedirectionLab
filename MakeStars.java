import java.util.*;
public class MakeStars {
  public static void main(String[]args) {
    Scanner n = new Scanner(System.in);
    while (n.hasNextLine()) {
      Scanner s = new Scanner(n.nextLine());
      while (s.hasNext()) {
        String x = s.next();
        for (int i = 0; i < x.length(); i++) {
          System.out.print("*");
        }
        System.out.print(" ");
      }
      System.out.print("\n");
    }
  }
}
