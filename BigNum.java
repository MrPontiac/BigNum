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
  
  public boolean compareTo(BigNum val) {
    if(base == val.base && exponent == val.exponent && arrowNum == val.arrowNum) {
      return true;
    }
    return false;
  }
  
  public String toString() {
    return Double.toString(base) + " " + '\u21d2' + " " + Double.toString(exponent) + " " + '\u21d2' + " " + Double.toString(arrowNum);
  }
  
  public String toString(int num) {
    if(num == 1) {
      return(Double.toString(base) + " " + '\u21d1' + Superscript(Double.toString(arrowNum)) + " " + Double.toString(exponent));
    }
    return toString();
  }
  
  public void addArrows(double num) {
    if(arrowNum == Double.MAX_VALUE) {
      return;
    }
    if(arrowNum + num == Double.POSITIVE_INFINITY) {
      arrowNum = Double.MAX_VALUE;
    } else if(arrowNum + num == Double.NEGATIVE_INFINITY) {
      arrowNum = -Double.MAX_VALUE;
    } else {
      arrowNum += num;
    }
  }
  private String Superscript(String str) { 
    str = str.replaceAll("\\.", "'");
		str = str.replaceAll("1", "¹");
		str = str.replaceAll("2", "²");
		str = str.replaceAll("3", "³");
		str = str.replaceAll("4", "⁴");
		str = str.replaceAll("5", "⁵");
		str = str.replaceAll("6", "⁶");
		str = str.replaceAll("7", "⁷");
		str = str.replaceAll("8", "⁸");
		str = str.replaceAll("9", "⁹");
		str = str.replaceAll("0", "⁰");
    str = str.replaceAll("E", "ᴱ");
		return str;
	}
}