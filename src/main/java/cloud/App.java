package cloud;

/**
 * App
 */
public class App {

  public static void main(String[] args) {
    System.out.println("---------removeConsecutiveChars-----------");
    String input = "aabcccbbad";
    System.out.println("input = aabcccbbad");
    processAndPrint(RemoveConsecutiveChars::removeConsecutiveChars, input);
    System.out.println("---------replaceConsecutiveChars-----------");
    input = "abcccbad";
    System.out.println("input = abcccbad");
    processAndPrint(ReplaceConsecutiveChars::replaceConsecutiveChars, input);

  }

  public static void processAndPrint(CharsFunc charsFun,String input) {
    while (!input.isEmpty()) {
      String result = charsFun.func(input);
      if (result.equals(input)) {
        break;
      } else {
        System.out.println("-> " + result);
      }
      input = result;
    }
  }
}
