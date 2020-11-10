package calculator.uk.mrinterbugs;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class testType {
  private Type type; //Automatically adds this class using eclipse.

  @Test
  void createEnumClass() {
    Type type;
  }

  @Test
  void createEnums() {
    assertEquals("NUMBER", Type.NUMBER.name(), "Automaticlly adds this enum using eclipse.");
    assertEquals("INVALID", Type.INVALID.name(), "Automaticlly adds this enum using eclipse.");
    assertEquals("STRING", Type.STRING.name(), "Automaticlly adds this enum using eclipse.");
    assertEquals("SYMBOL", Type.SYMBOL.name(), "Automaticlly adds this enum using eclipse.");
  }

}
