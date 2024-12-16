import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class HepatitisBVirusFrame extends EnvelopedFrame {
    public HepatitisBVirusFrame(DataModel model) {
        super(model); // Gọi constructor lớp cha
        // Thêm thành phần đặc thù cho CoronaVirus nếu cần
        initHepatitisBVirusComponents();
    }

    private void initHepatitisBVirusComponents() {
        JButton specialButton = new JButton("Return to Main");
        specialButton.addActionListener(e -> showMainFrame());
    
        JPanel customPanel = new JPanel();
        customPanel.add(specialButton);
    
        // Đặt các thành phần này vào BorderLayout.SOUTH hoặc một vị trí khác
        add(customPanel, BorderLayout.SOUTH);
    }
    
}
