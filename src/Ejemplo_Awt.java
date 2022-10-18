import java.awt.*;
import java.awt.event.*;

public class Ejemplo_Awt {
    public static void main(String[] args) {
        mostrar fenetre = new mostrar();

    }
}
     class mostrar{
        Frame miFrame;
        public mostrar(){
            Button btn = new Button("Yousseeeeeffffff");
            miFrame= new Frame("Bonjour Youssef");
            miFrame.setLayout(new FlowLayout());
            miFrame.add(btn );
            miFrame.setSize(550,370);
            miFrame.setVisible(true);
            btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println(miFrame.getTitle());
                }
            });

            miFrame.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    super.windowClosing(e);
                }
            });
        }
    }


