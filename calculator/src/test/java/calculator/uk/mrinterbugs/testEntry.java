package calculator.uk.mrinterbugs;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class testEntry {
  // private Entry entry; //Automatically adds this class using eclipse.

  /*
   * Used to create all the return methods. No longer able to pass as it is superseeded by the
   * setters.
   * 
   * @Test void makeReturnMethods() { entry = new Entry(); assertEquals(entry.getNumber(), 1.0, "");
   * assertEquals(entry.getOther(), "+", ""); assertEquals(entry.getStr(), "3 * 4 - 2", ""); }
   */

  @Test
  void makeSetters() {
    assertEquals(new Entry("3 * 4 - 2").getStr(), "3 * 4 - 2", "");
    Float number = (float) 1.0;
    assertEquals(new Entry(number).getNumber(), 1.0, "");
    assertEquals(new Entry(Symbol.PLUS).getOther(), "+", "");
  }

}
