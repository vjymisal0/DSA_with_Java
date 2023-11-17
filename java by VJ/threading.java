/*extending thread class*/
class thread1 extends Thread {

  public void run() {
    for (int i = 1; i <= 5; i++) {
      System.out.println("Ffrom thread : 1=  " + i);
    }
  }
}

class thread2 extends Thread {

  public void run() {
    for (int j = 1; j <= 5; j++) {
      System.out.println("From thread : 2=  " + j);
    }
  }
}

class threading {

  public static void main(String args[]) {
    thread1 t1 = new thread1();
    thread2 t2 = new thread2();
    t1.start();
    t2.start();
  }
}
