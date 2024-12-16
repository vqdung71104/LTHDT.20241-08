import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class NonEnvelopedFrame extends BaseFrame implements ActionListener {
    protected Virus virus; // Virus hiện tại
    private JTextArea detailsTextArea;

    public NonEnvelopedFrame(DataModel model) {
        super(model);
        this.virus = model.getVirus(); // Lấy thông tin virus từ DataModel
        initVirusFrame();
    }

    private void initVirusFrame() {
        // Gọi lại initComponents từ BaseFrame để thêm các nút cơ bản
        super.initComponents(); 

        // Thiết lập tiêu đề và các thông số cơ bản
        setTitle(virus.getName() + " Details");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

        // Panel chứa các nút
        JPanel buttonPanel = new JPanel();
        JButton viewStructureButton = new JButton("View Structure");
        viewStructureButton.addActionListener(this);
        JButton viewInfectionMechanismButton = new JButton("View Infection Mechanism");
        viewInfectionMechanismButton.addActionListener(this);

        buttonPanel.add(viewStructureButton);
        buttonPanel.add(viewInfectionMechanismButton);

        // Thêm panel nút vào phần trên (North)
        add(buttonPanel, BorderLayout.NORTH);

        // Text area để hiển thị chi tiết
        detailsTextArea = new JTextArea();
        detailsTextArea.setEditable(false); // Không cho người dùng chỉnh sửa
        detailsTextArea.setLineWrap(true); // Tự động xuống dòng
        detailsTextArea.setWrapStyleWord(true); // Chia từ hợp lý

        // Đưa detailsTextArea vào JScrollPane để thêm thanh cuộn
        JScrollPane scrollPane = new JScrollPane(detailsTextArea);
        add(scrollPane, BorderLayout.CENTER); // Thêm vào phần giữa giao diện
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        SwingUtilities.invokeLater(() -> {
            switch (command) {
                case "View Structure":
                    displayStructureDetails();
                    break;
                case "View Infection Mechanism":
                    displayInfectionMechanismDetails();
                    break;
                default:
                    // Nếu không thuộc hành vi riêng của EnvelopedFrame, chuyển về xử lý của BaseFrame
                    super.actionPerformed(e);
                    break;
            }
        });
    }

    protected void displayStructureDetails() {
        //thêm thông tin mới
        detailsTextArea.setText("");      
        detailsTextArea.append("Details: " + virus.getDetails() + "\n");
        detailsTextArea.append("Capsid: " + virus.getCapsid() + "\n");
        detailsTextArea.append("Causing Diseases: " + virus.getCausingDiseases() + "\n");
    }

    protected void displayInfectionMechanismDetails() {
        //thêm thông tin mới
        detailsTextArea.setText("");
        detailsTextArea.append("Name: " + virus.getName() + "\n");
        detailsTextArea.append("Spreading Method: " + virus.getSpreadingMethod() + "\n");
        detailsTextArea.append("Infection Mechanism: " + virus.getInfectionMechanism() + "\n");
        detailsTextArea.append("Infection Video Path: " + virus.getInfectionVideoPath() + "\n");
    }
}
