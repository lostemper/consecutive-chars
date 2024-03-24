package cloud;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveConsecutiveCharsTest {
  @Test
  public void testRemoveConsecutiveChars() {
    String input1 = "aabcccbbad";
    assertEquals("aabbbad", RemoveConsecutiveChars.removeConsecutiveChars(input1));
    assertEquals("aaad", RemoveConsecutiveChars.removeConsecutiveChars("aabbbad"));
    assertEquals("d", RemoveConsecutiveChars.removeConsecutiveChars("aaad"));

    String input2 = "aabbbbcccbbbad";
    assertEquals("aaad", RemoveConsecutiveChars.removeConsecutiveChars(input2));
    assertEquals("d", RemoveConsecutiveChars.removeConsecutiveChars("aaad"));

    String input3 = "aabbbbcccbbbadd";
    assertEquals("aaadd", RemoveConsecutiveChars.removeConsecutiveChars(input3));
    assertEquals("dd", RemoveConsecutiveChars.removeConsecutiveChars("aaadd"));

    String input4 = "";
    assertEquals("", RemoveConsecutiveChars.removeConsecutiveChars(input4));

    String input5 = "abc";
    assertEquals("abc", RemoveConsecutiveChars.removeConsecutiveChars(input5));

    String input6 = "aaaabb";
    assertEquals("bb", RemoveConsecutiveChars.removeConsecutiveChars(input6));
  }
}
