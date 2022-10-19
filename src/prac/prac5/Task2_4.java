package prac.prac5;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Task2_4 extends JFrame{
    public String backgroundImagePath;
    String animationImagesPath = "D:/учеба/java/prac/src/ru/mirea/prac5/frames/";
    public int method = 0;
    public Task2_4(){
        super("Some shapes");
        setLocationRelativeTo(null);
        setSize(1000,800);
        setBackground(Color.LIGHT_GRAY);
        setLocation(300, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        Button button = new Button("Start animation");
        button.setSize(200, 200);
        button.setLocation(0, 0);
        button.addActionListener(
                event -> {
                    method = 1;
                    setTitle("Animation");
                    setSize(1001, 800);
                    setSize(999, 800);
                }
        );
        add(button);
    }

    void setBackgroundImagePath(String path) {
        this.backgroundImagePath = path;
    }

    void setAnimationImagesPath(String path) {
        this.animationImagesPath = path;
    }

    public void paint(Graphics g2) {
        Graphics2D g = (Graphics2D) g2;
        Image img = Toolkit.getDefaultToolkit().getImage(this.backgroundImagePath);
        g.drawImage(img, 0 , 0, 1000, 800 ,this);

        switch (this.method) {
            case 0:
                randomShapesPaint(20, g);
                break;
            case 1:
                animate(this.animationImagesPath, g);
                break;
            default:
                break;
        }
    }

    void randomShapesPaint(int shapes, Graphics2D g) {
        for (int i = 0; i < shapes; i++) {
            int choice = (int) (Math.random() * 7);

            switch (choice) {

                case 1:
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.fillOval(
                            (int) (Math.random() * 1000),
                            (int) (Math.random() * 800),
                            (int) (Math.random() * 100),
                            (int) (Math.random() * 100)
                    );
                    break;

                case 2:
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.fillRect(
                            (int) (Math.random() * 1000),
                            (int) (Math.random() * 800),
                            (int) (Math.random() * 100),
                            (int) (Math.random() * 100)
                    );
                    break;

                case 3:
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.drawLine(
                            (int) (Math.random() * 1000),
                            (int) (Math.random() * 800),
                            (int) (Math.random() * 1000),
                            (int) (Math.random() * 800)
                    );
                    break;

                case 4:
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.drawArc(
                            (int) (Math.random() * 1000),
                            (int) (Math.random() * 800),
                            (int) (Math.random() * 1000),
                            (int) (Math.random() * 800),
                            (int) (Math.random() * 260),
                            (int) (Math.random() * 260)
                    );
                    break;

                case 5:
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.fillRoundRect(
                            (int) (Math.random() * 1000),
                            (int) (Math.random() * 800),
                            (int) (Math.random() * 100),
                            (int) (Math.random() * 100),
                            (int) (Math.random() * 100),
                            (int) (Math.random() * 100)
                    );
                    break;

                case 6:
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.fillOval(
                            (int) (Math.random() * 1000),
                            (int) (Math.random() * 800),
                            100, 100
                    );
                    break;

                default:
                    break;
            }
        }
    }

    void animate(String framesPath, Graphics2D g) {
        File directory = new File(framesPath);
        for (File file : directory.listFiles()) {
            Image frame = Toolkit.getDefaultToolkit().getImage(file.getPath());
            g.drawImage(frame, 0 , 0, 1000 ,1000, this);
        }
    }

    public static void main(String[] args) {
        Task2_4 app =new Task2_4();
        if(args.length == 1) {
            app.setBackgroundImagePath(args[0]);
        }
        else if (args.length == 2) {
            app.setBackgroundImagePath(args[0]);
            app.setAnimationImagesPath(args[1]);
        }
        else {
            System.out.println("Background image path is empty");
        }
    }
}
