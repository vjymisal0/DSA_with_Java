//commandline arguments in java
class java4 {

  public static void main(String args[]) {
    /*int a, b, c;
    a = Integer.parseInt(args[0]);
    b = Integer.parseInt(args[1]);
    c = a + b;
    System.out.println("Integer Addition: "+c);
    */
    /*
    float a,b,c;
    a=Float.parseFloat(args[0]);
    b=Float.parseFloat(args[1]);
    c=a+b;
    System.out.println("Floating Addition: "+c);
    */
    String fname, mname, lname;
    fname = args[1];
    mname = args[2];
    lname = args[0];
    System.out.println(
      "First Name: " + fname + " Mid Name: " + mname + " last Name: " + lname
    );
  }
}
