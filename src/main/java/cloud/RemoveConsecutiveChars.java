package cloud;


public class RemoveConsecutiveChars  {
  public static String removeConsecutiveChars(String input) {
    StringBuilder result = new StringBuilder();
    int count = 1;

    for (int i = 0; i < input.length(); i++) {
      char currentChar = input.charAt(i);

      if (i < input.length() - 1 && currentChar == input.charAt(i + 1)) {
        count++;
      } else {
        if (count < 3) {
          for (int j = 0; j < count; j++) {
            result.append(currentChar);
          }
        }
        count = 1;
      }
    }

    return result.toString();
  }
}
