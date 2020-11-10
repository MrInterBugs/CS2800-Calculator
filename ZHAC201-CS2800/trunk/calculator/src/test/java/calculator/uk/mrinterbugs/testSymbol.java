package calculator.uk.mrinterbugs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testSymbol {

  @Test
  void createEnumClass() {
    Symbol symbol; //Automatically adds this class using eclipse.
  }

  @Test
  void createEnums() {
    assertEquals("PLUS", Symbol.PLUS.name(), "Automaticlly adds this enum using eclipse.");
    assertEquals("MINUS", Symbol.MINUS.name(), "Automaticlly adds this enum using eclipse.");
    assertEquals("LEFT_BRACKET", Symbol.LEFT_BRACKET.name(), "Automaticlly adds this enum using eclipse.");
    assertEquals("RIGHT_BRACKET", Symbol.RIGHT_BRACKET.name(), "Automaticlly adds this enum using eclipse.");
    assertEquals("TIMES", Symbol.TIMES.name(), "Automaticlly adds this enum using eclipse.");
    assertEquals("DIVIDE", Symbol.DIVIDE.name(), "Automaticlly adds this enum using eclipse.");
    assertEquals("INVAILD", Symbol.INVAILD.name(), "Automaticlly adds this enum using eclipse.");
  }

  @Test
  void createGetSymbol() {
    assertEquals(null, Symbol.PLUS.getSymbol(), "Creates a return method.");
  }

  @Test
  void setGetSymbol() {
    assertEquals("+", Symbol.PLUS.getSymbol(), "Adds the correct symbol to each return method.");
    assertEquals("-", Symbol.MINUS.getSymbol(), "Adds the correct symbol to each return method.");
    assertEquals("(", Symbol.LEFT_BRACKET.getSymbol(), "Adds the correct symbol to each return method.");
    assertEquals(")", Symbol.RIGHT_BRACKET.getSymbol(), "Adds the correct symbol to each return method.");
    assertEquals("*", Symbol.TIMES.getSymbol(), "Adds the correct symbol to each return method.");
    assertEquals("/", Symbol.DIVIDE.getSymbol(), "Adds the correct symbol to each return method.");
    assertEquals("!", Symbol.INVAILD.getSymbol(), "Adds the correct symbol to each return method.");

  }
}
