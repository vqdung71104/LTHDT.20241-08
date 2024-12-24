import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VirusAnimation extends JPanel implements ActionListener {
    private Timer timer;

    // Virus
    private int virusX = 50;
    private int virusY = 200;
    // Host cell
    private final int hostX = 400;
    private final int hostY = 200;

    private String virusName;
    private String stage1Message;
    private String stage2Message;
    private String stage3Message;

    private int stage = 0; // Infection stage
    private int progress = 0; // Infection progress

    private JTextArea logArea; // Log panel for infection stages
    private JFrame parentFrame; // Reference to the main frame for resetting

    public VirusAnimation(JFrame parentFrame, String virusName, String stage1Message,
            String stage2Message, String stage3Message) {
        this.parentFrame = parentFrame;
        this.virusName = virusName;
        this.stage3Message = stage3Message;
        this.stage1Message = stage1Message;
        this.stage2Message = stage2Message;

        // Timer for animation
        timer = new Timer(50, this); 
        timer.start();

        // Log Panel Area
        logArea = new JTextArea();
        logArea.setEditable(false);
        logArea.setLineWrap(true);
        logArea.setWrapStyleWord(true);
        logArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
        logArea.setBorder(BorderFactory.createTitledBorder("Infection Log"));
        logArea.append("Simulation started for: " + virusName + "\n");

        setLayout(new BorderLayout());
        JButton backButton = new JButton("Back to Main Menu");
        backButton.addActionListener(e -> resetSimulation());
        add(backButton, BorderLayout.NORTH);
    }

    private void resetSimulation() {
        // Stop the current timer
        timer.stop();

        // Clear main frame and reopen virus selection
        parentFrame.getContentPane().removeAll();
        parentFrame.revalidate();
        parentFrame.repaint();

        if (parentFrame instanceof BaseFrame) {
            ((BaseFrame) parentFrame).showMainFrame();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Background
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());

        // Host cell
        g.setColor(stage == 3 ? Color.RED : Color.GREEN); // Host cell turn red when reach stage 3
        g.fillOval(hostX, hostY, 200, 200);
        g.setColor(Color.BLACK);
        g.drawString("Host Cell", hostX + 20, hostY + 50);

        // Virus
        if (virusName.contains("Enveloped")) {
            g.setColor(Color.RED);
            g.fillOval(virusX, virusY, 50, 50);
            g.setColor(Color.PINK);
            for (int i = 0; i < 360; i += 45) {
                int gx = (int) (virusX + 25 + 30 * Math.cos(Math.toRadians(i)));
                int gy = (int) (virusY + 25 + 30 * Math.sin(Math.toRadians(i)));
                g.drawLine(virusX + 25, virusY + 25, gx, gy);
            }
        } else { // Non-enveloped Virus
            g.setColor(Color.BLUE);
            int[] xPoints = { virusX + 25, virusX + 45, virusX + 25, virusX + 5 };
            int[] yPoints = { virusY + 5, virusY + 25, virusY + 45, virusY + 25 };
            g.fillPolygon(xPoints, yPoints, 4);
        }

        // Progress bar 
        g.setColor(Color.GRAY);
        g.fillRect(50, 350, 500, 20);
        g.setColor(Color.BLUE);
        g.fillRect(50, 350, progress * 5, 20);
        g.setColor(Color.BLACK);
        g.drawRect(50, 350, 500, 20);
        g.drawString("Infection Progress: " + progress + "%", 250, 345);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Animation and infection logic
        if (virusX < hostX - 50) {
            virusX += 8; // Virus movement speed in X direction
        } else if (progress < 100) {
            progress++;
            if (progress == 25 && stage == 0) {
                stage = 1;
                logArea.append("Stage 1: " + stage1Message + "\n");
            }
            if (progress == 50 && stage == 1) {
                stage = 2;
                logArea.append("Stage 2: " + stage2Message + "\n");
            }
            if (progress == 100 && stage == 2) {
                stage = 3;
                logArea.append("Stage 3: Host cell infected by " + virusName + ".\n");
                logArea.append(stage3Message + "\n");
            }
        }

        repaint();
    }

    public static void launchVirusSelection(JFrame frame) {
        // Virus options
        String[] options = {
                "HIV (Enveloped Virus)",
                "Coronavirus (Enveloped Virus)",
                "Hepatitis B (Enveloped Virus)",
                "Polio (Non-enveloped Virus)",
                "Rotavirus (Non-enveloped Virus)",
                "Rhinovirus (Non-enveloped Virus)",
        };

        // Virus selection log
        String selectedVirus = (String) JOptionPane.showInputDialog(
                null, "Choose a Virus to Simulate:", "Virus Selection",
                JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (selectedVirus == null || selectedVirus.equals("Cancel")) {
            if (frame instanceof BaseFrame) {
                ((BaseFrame) frame).showMainFrame();
            }            
            return;
        }

        // Infection stage-specific messages
        String stage1Message = "";
        String stage2Message = "";
        String stage3Message = "";

        switch (selectedVirus) {
            case "HIV (Enveloped Virus)":
                stage1Message = "HIV glycoproteins attach to CD4 receptors on T-cells.";
                stage2Message = "HIV injects RNA into the host cell.";
                stage3Message = "HIV weakens the immune system.";
                break;
            case "Coronavirus (Enveloped Virus)":
                stage1Message = "Coronavirus glycoproteins bind to ACE2 receptors in respiratory cells.";
                stage2Message = "Coronavirus injects RNA into the host cell.";
                stage3Message = "Coronavirus causes respiratory inflammation.";
                break;
            case "Hepatitis B (Enveloped Virus)":
                stage1Message = "Hepatitis B glycoproteins bind to hepatocyte receptors.";
                stage2Message = "Hepatitis B injects DNA into the liver cell.";
                stage3Message = "Hepatitis B causes chronic liver infection.";
                break;
            case "Polio (Non-enveloped Virus)":
                stage1Message = "Polio dissolves its capsid to release RNA.";
                stage2Message = "Polio RNA enters the host cell.";
                stage3Message = "Polio causes paralysi.";
                break;
            case "Rotavirus (Non-enveloped Virus)":
                stage1Message = "Rotavirus dissolves its capsid to release RNA.";
                stage2Message = "Rotavirus RNA enters the host cell.";
                stage3Message = "Rotavirus causes diarrhea.";
                break;
            case "Rhinovirus (Non-enveloped Virus)":
                stage1Message = "Rhinovirus dissolves its capsid to release RNA.";
                stage2Message = "Rhinovirus RNA enters the host cell.";
                stage3Message = "Rhinovirus causes cold.";
                break;
        }

        // Initialize the simulation
        VirusAnimation simulation = new VirusAnimation(
                frame, selectedVirus, stage1Message, stage2Message, stage3Message);

        // Split panel for Virus Stimulation and Infection Log
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        splitPane.setLeftComponent(simulation);
        splitPane.setRightComponent(new JScrollPane(simulation.logArea));
        splitPane.setDividerLocation(600);

        frame.getContentPane().removeAll();
        frame.add(splitPane);
        frame.revalidate();
        frame.repaint();
    }
    
}
