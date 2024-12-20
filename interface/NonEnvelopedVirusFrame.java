import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class NonEnvelopedVirusFrame extends BaseFrame {
    public NonEnvelopedVirusFrame(DataModel model) {
        super(model);
        initEnveloped();
    }

    public void initEnveloped() {
        // Gọi initComponents() từ BaseFrame để thêm các nút chính
        super.initComponents();

        // Thiết lập tiêu đề
        setTitle("Virus Demonstration - Nonenveloped Virus");

        // Tạo JPanel để chứa các nút liên quan đến các loại virus Enveloped
        JPanel virusPanel = new JPanel();

        // Nút cho Polio Virus
        JButton polioVirusButton = new JButton("Polio Virus");
        polioVirusButton.addActionListener(e -> {
            getDataModel().setVirus(new PolioVirus()); // Cập nhật DataModel
            showPolioVirusFrame(); // Chuyển đến CoronaVirusFrame
        });

        // Nút cho Rhino Virus
        JButton rhinoVirusButton = new JButton("Rhino Virus");
        rhinoVirusButton.addActionListener(e -> {
            getDataModel().setVirus(new RhinoVirus()); // Cập nhật DataModel
            showRhinoVirusFrame(); // Chuyển đến HIVVirusFrame
        });

        // Nút cho Rota Virus
        JButton rotaVirusButton = new JButton("Rota Virus");
        rotaVirusButton.addActionListener(e -> {
            getDataModel().setVirus(new RotaVirus()); // Cập nhật DataModel
            showRotaVirusFrame(); // Chuyển đến HepatitisBVirusFrame
        });

        // Thêm các nút vào panel
        virusPanel.add(polioVirusButton);
        virusPanel.add(rhinoVirusButton);
        virusPanel.add(rotaVirusButton);

        // Đặt panel này vào phần dưới (South) của giao diện
        add(virusPanel, BorderLayout.SOUTH);
    }

    private void showPolioVirusFrame() {
        PolioVirusFrame polioVirusFrame = new PolioVirusFrame(getDataModel());
        polioVirusFrame.setVisible(true); // Hiển thị frame mới
        this.dispose(); // Đóng frame hiện tại
    }

    private void showRhinoVirusFrame() {
        RhinoVirusFrame rhinoVirusFrame = new RhinoVirusFrame(getDataModel());
        rhinoVirusFrame.setVisible(true); // Hiển thị frame mới
        this.dispose(); // Đóng frame hiện tại
    }

    private void showRotaVirusFrame() {
        RotaVirusFrame rotaVirusFrame = new RotaVirusFrame(getDataModel());
        rotaVirusFrame.setVisible(true); // Hiển thị frame mới
        this.dispose(); // Đóng frame hiện tại
    }
}
