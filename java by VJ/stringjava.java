class stringjava {

  public static void main(String args[]) {
    /*char name[] = new char[4];
    name[0] = 'J';
    name[1] = 'a';
    name[2] = 'v';
    name[3] = 'a';
    System.out.println(name[0]);
    System.out.println(name[1]);
    System.out.println(name[2]);
    System.out.println(name[3]);*/
    String s = "Vijay";
    String s1 = " Vijay";
    System.out.println("Length of String: " + s.length());
    System.out.println("To Lower Case: " + s.toLowerCase());
    System.out.println("To Upper Case: " + s.toUpperCase());
    System.out.println("Character Present At 2d Index: " + s.charAt(2));
    System.out.println("Concatenation: " + s.concat("Academy"));
    System.out.println("Index of Y Character: " + s.indexOf('Y'));
    System.out.println("Equals Method: " + s.equals("VijaY"));
    System.out.println("Compare To Method: " + s.compareTo(s1));
    /* String v = "Samart";
    String t = "Tushar";
    System.out.println(v.compareTo(t));*/
  }
}
