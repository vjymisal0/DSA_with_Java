class exceptionhandling {

  void validate(int age) {
    if (age > 18) System.out.println(
      "You are eligible to Vote!"
    ); else throw new ArithmeticException("You aren't eligible to Vote!");
  }

  public static void main(String args[]) {
    exceptionhandling e1 = new exceptionhandling();
    e1.validate(1);
  }
}
