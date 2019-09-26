package se.mandrean.rulesjvmrelocateddeps;

import static org.apache.commons.io.IOCase.INSENSITIVE;
import static org.apache.commons.io.IOCase.SENSITIVE;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RulesJvmRelocatedDepsTest {

  @Test
  public void testCommonsIo() {
    // IOCase
    String str = "This is a String";

    assertFalse("Doesn't end with string (case-sensitive)", SENSITIVE.checkEndsWith(str, "string"));
    assertTrue("Ends with string (case-insensitive)", INSENSITIVE.checkEndsWith(str, "string"));
    assertTrue("Ends with String (case-sensitive)", INSENSITIVE.checkEndsWith(str, "String"));
  }
}
