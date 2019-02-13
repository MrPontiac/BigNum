class Main {
  public static void main(String[] args) {
    BigNum num = new BigNum(1e7, 1e34, 1e92);
    System.out.println("BigNum formatted as normal is: " + num);
    System.out.println("BigNum formatted as kunth up arrow is: " + num.toString(1));
    num.addArrows(-5e91); num.addBase(-5e6); num.addExponent(-5e33);
    System.out.println("BigNum is now: " + num);
    BigNum num1 = new BigNum(1e7);
    BigNum num2 = new BigNum(1e7, 1e5, 1e282);
    BigNum num3 = new BigNum(1e7, 0 ,0);
    System.out.println("BigNum 1 is " + (num1.isEqualTo(num2) ? "Equal to" : "Smaller than") + " num2 but num1 is " + (num1.isEqualTo(num3) ? "Equal to" : "Smaller than") + " num3");
    System.out.println("The og num is " + (num.isEqualTo(num3) ? "Equal to" : "Smaller or Greater than") + " num3");
  }
}