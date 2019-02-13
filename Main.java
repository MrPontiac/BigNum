class Main {
  public static void main(String[] args) {
    BigNum num = new BigNum(1e7, 1e34, -9e307);
    System.out.println("BigNum formatted as normal is: " + num);
    System.out.println("BigNum formatted as kunth up arrow is: " + num.toString(1));
    num.addArrows(-1e308);
    System.out.println("BigNum is now: " + num);
    BigNum num1 = new BigNum(1e7);
    BigNum num2 = new BigNum(1e7, 1e5, 1e282);
    BigNum num3 = new BigNum(1e7, 0 ,0);
    System.out.println("BigNum 1 is " + (num1.compareTo(num2) ? "Equal to" : "Smaller than") + " num2 but num1 is " + (num1.compareTo(num3) ? "Equal to" : "Smaller than") + " num3");
  }
}