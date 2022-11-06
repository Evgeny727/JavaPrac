package prac.prac15;

import javax.swing.*;
import java.awt.event.*;

public class Task3 extends JFrame {
    private static final long serialVersionUID = 1L;
    private  final  String[][]  menuFile = {{"Файл"     ,  "Ф",  "", ""}, {"Открыть"  ,  "О", "O", ""}, {"Сохранить",  "С", "S", ""}};
    private  final  String[][]  menuEdit = {{"Редактирование" , "Р",  "", ""}, {"Вырезать"  , "В", "X", "images/cut.png"}, {"Копировать", "К", "C", "images/copy.png"}};
    private JMenu createMenuItems(final String[][] items) {

        JMenu menu = new JMenu(items[0][0]);
        menu.setMnemonic(items[0][1].charAt(0));
        for (int i = 1; i < items.length; i++) {
            JMenuItem item = new JMenuItem(items[i][0]);
            item.setMnemonic(items[i][1].charAt(0));
            item.setAccelerator(KeyStroke.getKeyStroke(items[i][2].charAt(0), KeyEvent.CTRL_MASK));
            if (items[i][3].length() > 0) {
                item.setIcon(new ImageIcon(items[i][3]));
            }
            menu.add(item);
        }
        return menu;
    }
    private JMenu createSubmenus() {
        JMenu text = new JMenu("Текст");
        JMenu style = new JMenu("Стиль");
        JMenuItem bold = new JMenuItem("Жирный");
        JMenuItem italic = new JMenuItem("Курсив");
        JMenu font = new JMenu("Шрифт");
        JMenuItem arial = new JMenuItem("Arial");
        JMenuItem times = new JMenuItem("Times");
        font.add(arial); font.add(times);
        style.add(bold);
        style.add(italic);
        style.addSeparator();
        style.add(font);
        text.add(style);
        return text;
    }
    public Task3() {
        super("Hello Swing");
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(createMenuItems(menuFile));
        menuBar.add(createMenuItems(menuEdit));
        menuBar.add(createSubmenus());
        menuBar.add(Box.createHorizontalGlue());
        setJMenuBar(menuBar);
        setSize(500, 200);
        JPanel panel = new JPanel();
        JTextField textArea = new JTextField("Поле для записи",30);
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        panel.add(button1);
        panel.add(button2);
        panel.add(textArea);
        this.getContentPane().add(panel);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Task3();
    }
}