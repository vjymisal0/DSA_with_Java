//stringBuffer class in java
class strbfr {

  public static void main(String args[]) {
    StringBuffer str = new StringBuffer("VIJAY");
    System.out.println("Length of String: " + str.length());
    for (int i = 0; i < str.length(); i++) {
      System.out.println("Character At Position: " + i + " = " + str.charAt(i));
    }
    str.setCharAt(2, 'j');
    System.out.println("Modified String: " + str);
    str.append(" Misal");
    System.out.println("Appended String: " + str);
    String v = "MISAL";
    String m = "Vijay";
    System.out.println("Comparison: " + v.compareTo(m));
    String x[] = new String[3];
    x[0] = "Help";
    x[1] = "           There Someone ";
    x[2] = "Tapa Tap";
   x[1]=x[1].trim();
    System.out.println(x[0] + x[1] + x[2]);
    System.out.println("Size of Trimmed String: "+x[1].length()+" : "+x[1]);
  }
}
