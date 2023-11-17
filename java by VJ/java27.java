//write a java program to display below star pattern
/*
       *
      * *
     * * *
    * * * *
   * * * * *
 */
class java27 {

  public static void main(String args[]) {
    for (int i = 1; i <= 5; i++) {
      for (int k = 4; k >= i; k--) {
        System.out.println(" ");
        for (int j = 1; j <= i; j++) {
          System.out.println("*");
        }
        System.out.println();
      }
    }
  }
}
