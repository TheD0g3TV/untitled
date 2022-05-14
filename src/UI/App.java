package UI;

import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;


public class App extends JFrame implements ActionListener{
    JPanel mainPanel;
    JButton buttonExit = new JButton();
    JButton buttonStart = new JButton();
    JLabel main = new JLabel();

    public App() throws IOException { //počáteční "podmínky" okna
        super("BLACKJACK!!!");
        this.getContentPane().setBackground(Color.black);
        this.setLocationRelativeTo(null);
        this.setIconImage(ImageIO.read(new File("pics/icon.png")));
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setUndecorated(true);
        this.setVisible(true);
        this.setLayout(null);
        this.validate();

        main.setOpaque(true);
        main.setVisible(true);
        main.setIcon(new ImageIcon(ImageIO.read(new File("pics/bg.jpg"))));
        main.setBounds(0,0,1920,1080);
        this.setContentPane(main);

        menu();

    }

    public void menu(){
        buttonSetup(buttonStart,"Start","pics/start.png",500,300,180,50);
        main.add(buttonStart);
        buttonSetup(buttonExit,"Exit","pics/exit.png",1650,55,180,50);
        main.add(buttonExit);

    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==buttonStart) {
            buttonStart.setVisible(false);
        }
        if(e.getSource()==buttonExit){
            System.exit(0);
        }
    }

    public void buttonSetup(JButton but, String name, String filename, int x, int y, int width, int height){
        but.setVisible(true);
        but.validate();
        but.setText(name);
        but.addActionListener(this);
        but.setFocusable(false);
        but.setIcon(new ImageIcon(filename));
        but.setBounds(x,y,width,height);
        but.setBackground(Color.lightGray);
        but.setForeground(Color.black);
        but.setFont(new Font("Arial", Font.BOLD, 30));
        but.setBorder(BorderFactory.createLineBorder(Color.green,3));
    }
}
