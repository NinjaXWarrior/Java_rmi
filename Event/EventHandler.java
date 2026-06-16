// import java.awt.*;
// import java.awt.event.*;
// public class EventHandler extends Frame{
//   EventHandler(){
//     addMouseListener(new MouseAdapter(){
//       public void mouseClicked(MouseEvent e){
//         System.out.println("Mouse Clicked");
//       }
//     });
//     setSize(300,200);
//     setVisible(true);
//   }
//   public static void main(String[] args){
//     new EventHandler();
//   }
// }

import java.awt.*;
import java.awt.event.*;

public class EventHandler extends Frame {

    EventHandler() {

        setSize(300, 300);
        setLayout(null);
        setVisible(true);

        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {

                Graphics g = getGraphics();

                g.setColor(Color.RED);
                g.fillOval(e.getX(), e.getY(), 30, 30);
            }
        });
    }

    public static void main(String[] args) {
        new EventHandler();
    }
}