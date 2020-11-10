package calculator.uk.mrinterbugs;

/**
 * This class is used to store numerical values, symbols and strings.
 * 
 * @author Student
 *
 */
public class Entry {

  private float number;
  private Symbol other;
  private String str;
  private Type type;

  /**
   * This constructor is used to create an entry of type float.
   * 
   * @param f The float that is to be stored.
   */
  public Entry(float f) {
    this.number = f;
    this.type = Type.NUMBER;
  }

  /**
   * This constructor is used to create an entry of type symbol.
   * 
   * @param symbol The symbol that is to be stored.
   */
  public Entry(Symbol symbol) {
    this.type = Type.SYMBOL;
    this.other = symbol;
  }

  /**
   * This constructor is used to create an entry of type string.
   * 
   * @param str The string that is to be stored.
   */
  public Entry(String str) {
    this.type = Type.STRING;
    this.str = str;
  }

  /**
   * Method used to check what type something is.
   * 
   * @return One of 4 possible enums from the Type class.
   */
  public final Type getType() {
    return this.type;
  }

  /**
   * Used to return the number stored in the entry.
   * 
   * @return The int stored.
   */
  public float getNumber() {
    return this.number;
  }

  /**
   * Returns the string currently stored in the entry.
   * 
   * @return The stored symbol.
   */
  public String getOther() {
    return this.other.getSymbol();
  }

  /**
   * Returns the string currently stored in the entry.
   * 
   * @return The stored string.
   */
  public String getStr() {
    return this.str;
  }

}
