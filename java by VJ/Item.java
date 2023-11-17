//copy constructor
class Item {

  int x;

  Item() {
    x = 100;
  }

  Item(Item m) {
    x = m.x;
  }

  void display() {
    System.out.println("Value of X: " + x);
  }

  public static void main(String args[]) {
    Item i1 = new Item();
    Item i2 = new Item(i1);
    i1.display();
    i2.display();
  }
}
