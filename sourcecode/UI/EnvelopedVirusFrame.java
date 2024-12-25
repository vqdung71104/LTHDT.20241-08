import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class EnvelopedVirusFrame extends BaseFrame {
    public EnvelopedVirusFrame(DataModel model) {
        super(model);
        initEnveloped();
    }

    public void initEnveloped() {
        // Gọi initComponents() từ BaseFrame để thêm các nút chính
        super.initComponents();

        // Thiết lập tiêu đề
        setTitle("Virus Demonstration - Enveloped Virus");

        // Tạo JPanel để chứa các nút liên quan đến các loại virus Enveloped
        JPanel virusPanel = new JPanel();

        // Nút cho Corona Virus
        JButton coronaVirusButton = new JButton("Corona Virus");
        coronaVirusButton.addActionListener(e -> {
            getDataModel().setVirus(new CoronaVirus()); // Cập nhật DataModel
            showCoronaVirusFrame(); // Chuyển đến CoronaVirusFrame
        });

        // Nút cho HIV Virus
        JButton hivVirusButton = new JButton("HIV Virus");
        hivVirusButton.addActionListener(e -> {
            getDataModel().setVirus(new HIVVirus()); // Cập nhật DataModel
            showHIVVirusFrame(); // Chuyển đến HIVVirusFrame
        });

        // Nút cho Hepatitis B Virus
        JButton hepatitisBVirusButton = new JButton("Hepatitis B Virus");
        hepatitisBVirusButton.addActionListener(e -> {
            getDataModel().setVirus(new HepatitisBVirus()); // Cập nhật DataModel
            showHepatitisBVirusFrame(); // Chuyển đến HepatitisBVirusFrame
        });

        // Thêm các nút vào panel
        virusPanel.add(coronaVirusButton);
        virusPanel.add(hivVirusButton);
        virusPanel.add(hepatitisBVirusButton);

        // Đặt panel này vào phần dưới (South) của giao diện
        add(virusPanel, BorderLayout.SOUTH);
    }

    private void showCoronaVirusFrame() {
        CoronaVirusFrame coronaVirusFrame = new CoronaVirusFrame(getDataModel());
        coronaVirusFrame.setVisible(true); // Hiển thị frame mới
        this.dispose(); // Đóng frame hiện tại
    }

    private void showHIVVirusFrame() {
        HIVVirusFrame hivVirusFrame = new HIVVirusFrame(getDataModel());
        hivVirusFrame.setVisible(true); // Hiển thị frame mới
        this.dispose(); // Đóng frame hiện tại
    }

    private void showHepatitisBVirusFrame() {
        HepatitisBVirusFrame hepatitisBVirusFrame = new HepatitisBVirusFrame(getDataModel());
        hepatitisBVirusFrame.setVisible(true); // Hiển thị frame mới
        this.dispose(); // Đóng frame hiện tại
    }
}
