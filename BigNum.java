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
  
  public boolean isEqualTo(BigNum val) {
    if(base == val.base && exponent == val.exponent && arrowNum == val.arrowNum) {
      return true;
    }
    return false;
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
  
  public void addBase(double num) {
    if(base == Double.MAX_VALUE) {
      return;
    }
    if(base + num == Double.POSITIVE_INFINITY) {
      base = Double.MAX_VALUE;
    } else if(base + num == Double.NEGATIVE_INFINITY) {
      base = -Double.MAX_VALUE;
    } else {
      base += num;
    }
  }
  
  public void addExponent(double num) {
    if(exponent == Double.MAX_VALUE) {
      return;
    }
    if(exponent + num == Double.POSITIVE_INFINITY) {
      exponent = Double.MAX_VALUE;
    } else if(exponent + num == Double.NEGATIVE_INFINITY) {
      exponent = -Double.MAX_VALUE;
    } else {
      exponent += num;
    }
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
  
  public static BigNum valueOf(String num) {
    if(num.contains("⇒")) {
      String[] nums = num.split("⇒");
      BigNum temp = new BigNum(Double.parseDouble(nums[0]), Double.parseDouble(nums[1]), Double.parseDouble(nums[2]));
      return temp;
    } else if (num.contains("⇑")) {
      if(num.contains("¹") || num.contains("²") || num.contains("³") || num.contains("⁴") || num.contains("⁵") || num.contains("⁶") || num.contains("⁷") || num.contains("⁸") || num.contains("⁹") || num.contains("⁰")) {
        String[] nums = num.split(" |⇑");
        BigNum temp = new BigNum(Double.parseDouble(nums[0]), Double.parseDouble(UnSuperscript(nums[2])), Double.parseDouble(nums[3]));
        return temp;
      } else {
        String[] nums = num.split(" |⇑");
        System.out.println("Obtained " + nums[0] + " " + nums[2] + " " + nums[3]);
        BigNum temp = new BigNum(Double.parseDouble(nums[0]), Double.parseDouble(nums[2]), Double.parseDouble(nums[3]));
        return temp;
      }
    } else {
      return new BigNum();
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
  private static String UnSuperscript(String str) {
    str = str.replaceAll("'", ".");
    str = str.replaceAll("¹", "1");
    str = str.replaceAll("²", "2");
    str = str.replaceAll("³", "3");
    str = str.replaceAll("⁴", "4");
    str = str.replaceAll("⁵", "5");
    str = str.replaceAll("⁶", "6");
    str = str.replaceAll("⁷", "7");
    str = str.replaceAll("⁸", "8");
    str = str.replaceAll("⁹", "9");
    str = str.replaceAll("⁰", "0");
    str = str.replaceAll("ᴱ", "E");
    str = str.replaceAll("ᵉ", "e");
    return str;
  }
}
