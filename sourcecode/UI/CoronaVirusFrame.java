import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class CoronaVirusFrame extends EnvelopedFrame {
    public CoronaVirusFrame(DataModel model) {
        super(model); // Gọi constructor lớp cha
        // Thêm thành phần đặc thù cho CoronaVirus nếu cần
        initCoronaVirusComponents();
    }

    private void initCoronaVirusComponents() {
        JButton specialButton = new JButton("Return to Main");
        specialButton.addActionListener(e -> showMainFrame());
    
        JPanel customPanel = new JPanel();
        customPanel.add(specialButton);
    
        // Đặt các thành phần này vào BorderLayout.SOUTH hoặc một vị trí khác
        add(customPanel, BorderLayout.SOUTH);
    }
    
}



