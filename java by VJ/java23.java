//break-continue keywords in JAVA

class java23 {

  public static void main(String args[]) {
    int i;
    for (i = 1; i <= 8; i++) {
      if (i == 4 || i == 6) {
        //break;
        continue;
      } else System.out.println(+i);
    }
  }
}
