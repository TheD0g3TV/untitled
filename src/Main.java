import UI.App;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
            App okno = new App();
            okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            okno.setVisible(true);
            okno.setSize(300, 200);
            okno.setLocationRelativeTo(null);
    }
}
