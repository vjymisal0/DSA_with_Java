interface vijay {
  int a = 10;

  abstract void get_data();
}

interface misal{
  int b = 20;
//   int c = a + b;

 abstract void compute();
}
class itsvijay implements misal,vijay{
    void get_data() {
        System.out.println("Don't enter any number: ");
      }
    
      void compute() {
        System.out.println("Addition: ");
      }
}
class heyvijay extends itsvijay {

  

  public static void main(String args[]) {
    itsvijay h1 = new itsvijay();
    h1.get_data();
    h1.compute();
  }
}
