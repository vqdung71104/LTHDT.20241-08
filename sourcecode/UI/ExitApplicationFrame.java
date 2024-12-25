import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExitApplicationFrame extends JFrame {

    private DataModel model;

    public ExitApplicationFrame(DataModel model) {
        this.model = model;
        initUI();
    }

    private void initUI() {
        setTitle("Exit Application");
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        JButton exitButton = new JButton("Exit");
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showExitConfirmation();
            }
        });

        panel.add(exitButton);
        add(panel);
    }

    private void showExitConfirmation() {
        int result = JOptionPane.showConfirmDialog(this, "Are you sure you want to exit?", "Confirm Exit", JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) {
            // Thoát khỏi chương trình
            System.exit(0);
        } else {
            // Quay trở lại trang trước
            HomeFrame homeFrame = new HomeFrame(getDataModel());
            homeFrame.setVisible(true);
            dispose();
        }
    }

    public DataModel getDataModel() {
      return model;
  }

    
}
