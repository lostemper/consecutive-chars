package cloud;



public class ReplaceConsecutiveChars {
  public static String replaceConsecutiveChars(String input) {
    if (input == null || input.isEmpty()) {
      return input;
    }

    StringBuilder result = new StringBuilder();
    char prevChar = input.charAt(0);
    int count = 1;

    for (int i = 1; i < input.length(); i++) {
      char currentChar = input.charAt(i);

      if (currentChar == prevChar) {
        count++;
      } else {
        if (count >= 3) {
          Character  previousLetter  = getPreviousLetter(prevChar);
           if( previousLetter!= null)  {
              result.append(previousLetter);
           }
        } else {
          for (int j = 0; j < count; j++) {
            result.append(prevChar);
          }
        }
        prevChar = currentChar;
        count = 1;
      }
    }

    // 处理最后一个字符
    if (count >= 3) {
      Character  previousLetter  = getPreviousLetter(prevChar);
      if( previousLetter!= null)  {
        result.append(previousLetter);
      }
    } else {
      for (int j = 0; j < count; j++) {
        result.append(prevChar);
      }
    }

    return result.toString();
  }
  public static Character getPreviousLetter(char letter) {
    if (letter == 'a') {
      return null;
    } else {
      return (char) (letter - 1);
    }
  }
}

