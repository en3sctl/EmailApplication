package OOP_Lab_Tasks.OOP_LAB_9and10_TASKS_Books_Temperature.CountDown.Temperature;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame jFrame = new JFrame("Temperature");

            JList<String> jList = new JList<>();

            jList.setModel(new MyListModel(-70,60));
            jList.setCellRenderer(new MyListCellRenderer());

            jFrame.add(new JScrollPane(jList));
            jFrame.setSize(300,500);
            jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jFrame.setLocationRelativeTo(null);
            jFrame.setVisible(true);
        });
    }
}
