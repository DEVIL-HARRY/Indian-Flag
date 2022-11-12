package Projects;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.FileInputStream;

class FlagPanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.decode("#FF8F1C"));
        g.drawRect(10, 10, 400, 70);
        g.fillRect(10, 10, 400, 70);

        g.setColor(Color.WHITE);
        g.drawRect(10, 80, 400, 70);
        g.fillRect(10, 80, 400, 70);

        g.setColor(Color.decode("#509E2F"));
        g.drawRect(10, 150, 400, 70);
        g.fillRect(10, 150, 400, 70);

        g.setColor(Color.BLACK);
        g.drawRect(10, 10, 10, 540);
        g.fillRect(10, 10, 10, 540);

        try {

            Image img = ImageIO.read(new FileInputStream("src/Projects/img/Ashoka_Chakra.png"));
            g.drawImage(img, 170, 77, 75, 76, null); // 76,75 for Image Height Width

            g.setFont(new Font("Lato", Font.BOLD, 30));
            g.setColor(Color.BLUE);
            g.drawString("Happy Independence Day..", 25, 400);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Myframe extends JFrame {

    private FlagPanel panel = new FlagPanel();

    public Myframe() throws HeadlessException {
        setTitle("Happy Independence day.. ");
        setSize(440, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(panel);
        setVisible(true);

    }
}

public class Project_4_Indian_Flag extends JPanel {

    public static void main(String[] args) {
        new Myframe();
    }
}
