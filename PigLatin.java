import java.util.*;
public class PigLatin {
  public static void main(String[]args) {
    Scanner n = new Scanner(System.in);
    while (n.hasNextLine()) {
      Scanner x = new Scanner(n.nextLine());
      while (x.hasNext()) {
        String s = x.next();
        System.out.print(pigLatinBest(s) + " ");
      }
      System.out.print("\n");
    }
  }
  public static String pigLatinSimple(String s) {
    ArrayList<String> letters = new ArrayList<>(Arrays.asList("a", "e", "i", "o", "u"));
    if (letters.contains(s.toLowerCase()) || letters.contains(s.substring(0, 1).toLowerCase())) {
      return s + "hay".toLowerCase();
    }
    else if (s.length() != 0) {
      return (s.substring(1, s.length()) + s.charAt(0) + "ay").toLowerCase();
    }
    return s + "ay";
  }
  public static String pigLatin(String s) {
    ArrayList<String> digraphs = new ArrayList<>(Arrays.asList("bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"));
    if (s.length() != 1 && digraphs.contains(s.substring(0, 2).toLowerCase())) {
      return (s.substring(2, s.length()) + s.substring(0, 2) + "ay").toLowerCase();
    }
    return pigLatinSimple(s);
  }
  public static String pigLatinBest(String s) {
    if (!Character.isLetter(s.charAt(0))) {
      return s;
    }
    else if (!Character.isLetter(s.charAt(s.length()-1))) {
      return pigLatin(s.substring(0, s.length() - 1)) + s.charAt(s.length() - 1);
    }
    else {
      return pigLatin(s);
    }
  }
}
