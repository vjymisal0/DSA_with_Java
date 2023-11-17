//write a java program to display below star pattern
/*
 *
 * *
 * * *
 * * * *
 * * * * *
 */
class java26 {

  public static void main(String args[]) {
    for (int j = 1; j < 5; j++) {
      for (int i = 1; i <= j; i++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
