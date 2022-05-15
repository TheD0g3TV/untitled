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
    JLabel mainTitle = new JLabel();
    JButton buttonStart = new JButton();
    JButton buttonExit = new JButton();
    CardLayout crd = new CardLayout();
    Container cPane;
    public App() throws IOException { //settings of window
        super("BLACKJACK!!!");
        this.getContentPane().setBackground(Color.black);
        this.setLocationRelativeTo(null);
        this.setIconImage(ImageIO.read(new File("pics/icon.png")));
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setUndecorated(true);
        this.setLayout(crd);
        this.validate();

        //title screen
        title();

        cPane = getContentPane();
        crd = new CardLayout();

        //rest of setting for window (these must be in the end)
        this.setVisible(true);
        this.validate();
        this.pack();
    }

    public void title() throws IOException{
        //buttons
        mainTitle.add(buttonSetup(buttonStart,"Start","pics/start.png",500,300,180,50));
        mainTitle.add(buttonSetup(buttonExit,"Exit","pics/exit.png",1650,55,180,50));

        mainTitle.setOpaque(true);
        mainTitle.setVisible(true);
        mainTitle.setIcon(new ImageIcon(ImageIO.read(new File("pics/bg.jpg"))));
        mainTitle.setBounds(0,0,1920,1080);
        this.setContentPane(mainTitle);

        //text

        mainTitle.setText("Welcome to BLACKJACK");
        mainTitle.setHorizontalTextPosition(JLabel.CENTER);
        mainTitle.setVerticalTextPosition(JLabel.TOP);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==buttonStart) {
            buttonStart.setVisible(false);
        }
        if(e.getSource()==buttonExit){
            System.exit(0);
        }
    }

    public JButton buttonSetup(JButton but, String name, String filename, int x, int y, int width, int height){
        but.setVisible(true);
        but.validate();
        but.setText(name);
        but.addActionListener(this);
        but.setFocusable(false);
        but.setIcon(new ImageIcon(filename));
        but.setBounds(x,y,width,height);
        but.setBackground(Color.white);
        but.setForeground(Color.black);
        but.setFont(new Font("Arial", Font.BOLD, 30));
        but.setBorder(BorderFactory.createLineBorder(Color.black,3));
        return but;
    }
}
