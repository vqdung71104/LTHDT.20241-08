import java.awt.BorderLayout;
import javax.swing.*;
//import java.awt.event.ActionEvent;

public class HelpFrame extends BaseFrame {

    public HelpFrame(DataModel model) {
        super(model);
        initUI();
    }

    private void initUI() {
        // Gọi initComponents() từ BaseFrame để thêm các nút vào giao diện
        initComponents();

        // Thiết lập tiêu đề cho HelpFrame
        setTitle("Virus Demonstration - Help");

        // Thêm thanh menu
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu helpMenu = new JMenu("Help");
        menuBar.add(helpMenu);

        // Tạo JTextArea để hiển thị hướng dẫn sử dụng
        JTextArea instructionsArea = new JTextArea();
        instructionsArea.setEditable(false);
        instructionsArea.setText(
            "Basic usage\n" +
            "1. Choose Main button to return to Main\n" +
            "2. Choose Help button to get instruction\n" +
            "3. Choose Exit Application to exit the program\n" +
            "4. Choose View Virus Structure or View Virus Infection Mechanism to view the information of virus.\n" +
            "   You can choose the type of virus you want.\n" +
            "Aim for the app:\n" +
            "Display the structure and infection mechanism of different types of viruses\n"
        );

        // Thêm JTextArea vào phần giữa của frame
        add(new JScrollPane(instructionsArea), BorderLayout.SOUTH);
    }


}
