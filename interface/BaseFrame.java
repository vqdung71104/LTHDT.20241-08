import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public abstract class BaseFrame extends JFrame implements ActionListener {
    private DataModel model;

    public BaseFrame(DataModel model) {
        this.model = model;
        initComponents();
    }

    public DataModel getDataModel() {
        return model;
    }

    public void initComponents() {
        setTitle("Virus Demonstration");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        JButton homeButton = new JButton("Main");
        homeButton.addActionListener(this);
        JButton helpButton = new JButton("Help");
        helpButton.addActionListener(this);
        JButton envelopedVirusButton = new JButton("Enveloped Virus");
        envelopedVirusButton.addActionListener(this);
        JButton nonEnvelopedVirusButton = new JButton("Non Enveloped Virus");
        nonEnvelopedVirusButton.addActionListener(this);
        JButton virusSimulationButton = new JButton("Virus Simulation");
        virusSimulationButton.addActionListener(this);
        JButton exitButton = new JButton("Exit Application");
        exitButton.addActionListener(this);

        panel.add(homeButton);
        panel.add(helpButton);
        panel.add(envelopedVirusButton);
        panel.add(nonEnvelopedVirusButton);
        panel.add(virusSimulationButton);
        panel.add(exitButton);
        add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command) {
            case "Main":
                showMainFrame();
                break;
            case "Help":
                showHelpFrame();
                break;
            case "Exit Application":
                exitApplication();
                break;
            case "Enveloped Virus":
                envelopedVirusFrame();
                break;
            case "Non Enveloped Virus":
                nonEnvelopedVirusFrame();
                break;
            case "Virus Simulation":
                showVirusSimulation();
                break;
        }
    }

    public void showMainFrame() {
        HomeFrame homeFrame = new HomeFrame(getDataModel());
        homeFrame.setVisible(true);
        this.dispose();
    }

    public void showHelpFrame() {
        HelpFrame helpFrame = new HelpFrame(getDataModel());
        helpFrame.setVisible(true);
        this.dispose();
    }

    public void exitApplication() {
        System.exit(0);
    }

    public void envelopedVirusFrame() {
        EnvelopedVirusFrame envelopedVirusFrame = new EnvelopedVirusFrame(getDataModel());
        envelopedVirusFrame.setVisible(true);
        this.dispose();
    }

    public void nonEnvelopedVirusFrame() {
        NonEnvelopedVirusFrame nonEnvelopedVirusFrame = new NonEnvelopedVirusFrame(getDataModel());
        nonEnvelopedVirusFrame.setVisible(true);
        this.dispose();
    }

    public void showVirusSimulation() {
        getContentPane().removeAll();
        VirusAnimation.launchVirusSelection(this);
    }

    public void showVirusSimulationPanel(VirusAnimation simulation) {

        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        splitPane.setLeftComponent(simulation);
        splitPane.setDividerLocation(600);

        getContentPane().removeAll();
        add(splitPane);
        revalidate();
        repaint();
    }
}
