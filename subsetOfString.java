public class subsetOfString {
  public static void subset(String str, String ans, int i) {
    if (str.length() == i) {
      if (ans.length() == 0) {
        System.out.println("null");
      } else {
        System.out.println(ans);
      }
      return;
    }

    subset(str, ans + str.charAt(i), i + 1);
    subset(str, ans, i + 1);
  }

  public static void main(String args[]) {
    String ans = "";
    String str = "abc";
    int i = 0;
    subset(str, ans, i);
  }
}
