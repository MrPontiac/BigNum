class BigNum {
  private double base;
  private double exponent;
  private double arrowNum;
  
  public BigNum() {
    base = 0;
    exponent = 0;
    arrowNum = 0;
  }
  
  public BigNum(double nBase) {
    base = nBase;
    exponent = 0;
    arrowNum = 0;
  }
  
  public BigNum(double nBase, double nExponent) {
    base = nBase;
    exponent = nExponent;
    arrowNum = 0;
  }
  
  public BigNum(double nBase, double nExponent, double nArrowNum) {
    base = nBase;
    exponent = nExponent;
    arrowNum = nArrowNum;
  }
  
  public String toString() {
    return base + '\u2192' + exponent + '\u2192' + arrowNum;
  }
}