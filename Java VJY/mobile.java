import java.util.*;

interface Loader {
  void loadOS();
}

class Device {

  String vendername;
  int ramsize;
  int osversion;

  void get_device_details() {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter Vender Name: ");
    vendername = s.next();
    System.out.println("Enter RAM Size: ");
    ramsize = s.nextInt();
    System.out.println("Enter OS Version: ");
    osversion = s.nextInt();
  }
}

class mobile extends Device implements Loader {

  public void loadOS() {
    System.out.println("RAM Size: " + ramsize);
    System.out.println("Vender Name: " + vendername);
    System.out.println("OS Version: " + osversion);
  }

  public static void main(String args[]) {
    mobile m1 = new mobile();
    m1.get_device_details();
    m1.loadOS();
  }
}
