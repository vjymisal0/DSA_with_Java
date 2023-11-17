import java.util.concurrent.DelayQueue;

class even extends Thread {

  public void run() {
    for (int i = 1; i <= 10; i++) {
      if (i % 2 == 0) {try {
        sleep(1000);
    } catch (Exception e) {
        System.out.println(e);
        //TODO: handle exception
    }
        System.out.println("From  Even  Thread: "  + i);
      }
    }
  }
}

class odd extends Thread {

  public void run() {
    for (int j = 1; j <= 10; j++) {
      if (j % 2 != 0) {
          try {
              sleep(1000);
          } catch (Exception e) {
              System.out.println(e);
              //TODO: handle exception
          }
        System.out.println("From Odd Thread: " + j);
      }
    }
  }
}

class even_odd_threading {

  public static void main(String args[]) {
    odd o1 = new odd();
    even e1 = new even();
    o1.run();
    e1.run();
  }
}
