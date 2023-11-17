import java.applet.*;
import java.awt.*;

public class colordemo extends Applet {

  public void init() {
    setBackground(Color.red);
    setForeground(Color.blue);
  }

  public void paint(Graphics g) {
    g.drawString("Welcome to Java Applet", 300, 150);
  }
}
/*<applet code="ColorDemo.class" width=500 height=500>
  </applet>*/
