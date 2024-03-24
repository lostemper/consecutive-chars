package cloud;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReplaceConsecutiveCharsTest {
  @Test
  public void testReplaceConsecutiveChars() {
    String  input1 = "aabcccbbad";
    assertEquals("aabbbbad", ReplaceConsecutiveChars.replaceConsecutiveChars(input1));
    assertEquals("aaaad", ReplaceConsecutiveChars.replaceConsecutiveChars("aabbbbad"));
    assertEquals("d", ReplaceConsecutiveChars.replaceConsecutiveChars("aaaad"));

    String  input2 = "aabbbbcccbbbad";
    assertEquals("aaabaad", ReplaceConsecutiveChars.replaceConsecutiveChars(input2));
    assertEquals("baad", ReplaceConsecutiveChars.replaceConsecutiveChars("aaabaad"));

    String  input3 = "";
    assertEquals("", ReplaceConsecutiveChars.replaceConsecutiveChars(input3));

    String  input4 = "abc";
    assertEquals("abc", ReplaceConsecutiveChars.replaceConsecutiveChars(input4));

    String  input5 = "aaaabb";
    assertEquals("bb", ReplaceConsecutiveChars.replaceConsecutiveChars(input5));
  }
}
