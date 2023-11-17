//extending interface
//interface implements class
interface ABC {
  void display();
}

interface xyz {
  void show();
}

class intraface implements xyz, ABC {

  public void display() {
    System.out.println("hrllo");
  }

  public void show() {
    System.out.println("bollo");
  }

  public static void main(String args[]) {
    intraface i = new intraface();
    i.show();
    i.display();
  }
}
