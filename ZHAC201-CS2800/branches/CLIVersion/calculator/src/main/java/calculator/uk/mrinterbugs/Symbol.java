package calculator.uk.mrinterbugs;

/**
 * This enum contains a list of the non-number tokens possible in an expression.
 * 
 * @author Student
 *
 */
public enum Symbol {

  PLUS("+"), MINUS("-"), LEFT_BRACKET("("), RIGHT_BRACKET(")"), TIMES("*"), DIVIDE("/"), POWER(
      "^"), INVALID("!");

  /**
   * A private constructor used for creating the enums which can be seen above.
   * 
   * @param symbol Takes a string input for the symbol that each enum represents.
   */
  Symbol(String symbol) {
    this.symbol = symbol;
  }

  private final String symbol;

  /**
   * Used to return the symbol that relates to each of the enums.
   * 
   * @return A String version of the symbol.
   */
  public String getSymbol() {
    return this.symbol;
  }

}
