
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

public class DiveLog {

    private Dive dive;

    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;

    private JPanel diveNumberPanel;
    private JLabel diveNumberLabel;
    private JTextField diveNumberField;

    private JPanel locationPanel;
    private JLabel locationLabel;
    private JTextField locationField;

    private JPanel maxDepthPanel;
    private JLabel maxDepthLabel;
    private JTextField maxDepthField;

    private JPanel divePlannerTypePanel;
    private JLabel divePlannerTypeLabel;
    private JComboBox divePlannerTypeComboBox;

    private JPanel visibilityPanel;
    private JLabel visibilityLabel;
    private JTextField visibilityField;

    private JPanel tempPanel;
    private JLabel tempLabel;
    private JTextField tempField;

    private JPanel weightPanel;
    private JLabel weightLabel;
    private JTextField weightField;

    private JPanel startPressurePanel;
    private JLabel startPressureLabel;
    private JTextField startPressureField;

    private JPanel endPressurePanel;
    private JLabel endPressureLabel;
    private JTextField endPressureField;

    private JPanel timeInPanel;
    private JLabel timeInLabel;
    private JTextField timeInField;

    private JPanel timeOutPanel;
    private JLabel timeOutLabel;
    private JTextField timeOutField;

    private JPanel commentsPanel;
    private JLabel commentsLabel;
    private JTextField commentsField;


    public DiveLog(){
        prepareGUI();
    }
    public static void main(String[] args){
        DiveLog  diveLog = new DiveLog();
        diveLog.fieldSetup();
    }
    private void prepareGUI(){
        mainFrame = new JFrame("Dive Log Examples");
        mainFrame.setSize(600,800);
        mainFrame.setLayout(new GridLayout(10, 2)); //TODO: fuck the grid layout

        headerLabel = new JLabel("",JLabel.CENTER );
        statusLabel = new JLabel("",JLabel.CENTER);
        diveNumberLabel = new JLabel("Dive Number: ", JLabel.LEFT);
        locationLabel = new JLabel("Location: ", JLabel.LEFT);
        maxDepthLabel = new JLabel("Max Depth: ", JLabel.LEFT);
        divePlannerTypeLabel = new JLabel("Dive Planner Type: ", JLabel.LEFT);
        visibilityLabel = new JLabel("Visibility: ", JLabel.LEFT);
        tempLabel = new JLabel("Temperature: ", JLabel.LEFT);
        weightLabel = new JLabel("Weight: ", JLabel.LEFT);
        startPressureLabel = new JLabel("Starting Pressure: ", JLabel.LEFT);
        endPressureLabel = new JLabel("Final Pressure: ", JLabel.LEFT);
        timeInLabel = new JLabel("Time In: ", JLabel.LEFT);
        timeOutLabel = new JLabel("Time Out: ", JLabel.LEFT);
        commentsLabel = new JLabel("Comments: ", JLabel.LEFT);
        statusLabel.setSize(350,100);

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());
        //controlPanel.setBorder(BorderFactory.createLineBorder(Color.black));


        diveNumberPanel = new JPanel();
        diveNumberPanel.setLayout(new FlowLayout());
        //diveNumberPanel.setBorder(BorderFactory.createLineBorder(Color.black));

        locationPanel = new JPanel();
        locationPanel.setLayout(new FlowLayout());
        //locationPanel.setBorder(BorderFactory.createLineBorder(Color.black));

        maxDepthPanel = new JPanel();
        maxDepthPanel.setLayout(new FlowLayout());
        //maxDepthPanel.setBorder(BorderFactory.createLineBorder(Color.black));

        divePlannerTypePanel = new JPanel();
        divePlannerTypePanel.setLayout(new FlowLayout());
        //divePlannerTypePanel.setBorder(BorderFactory.createLineBorder(Color.black));

        visibilityPanel = new JPanel();
        visibilityPanel.setLayout(new FlowLayout());
        //visibilityPanel.setBorder(BorderFactory.createLineBorder(Color.cyan));

        tempPanel = new JPanel();
        tempPanel.setLayout(new FlowLayout());
        //tempPanel.setBorder(BorderFactory.createLineBorder(Color.red));

        weightPanel = new JPanel();
        weightPanel.setLayout(new FlowLayout());
        //weightPanel.setBorder(BorderFactory.createLineBorder(Color.green));

        startPressurePanel = new JPanel();
        startPressurePanel.setLayout(new FlowLayout());
        //startPressurePanel.setBorder(BorderFactory.createLineBorder(Color.green));

        endPressurePanel = new JPanel();
        endPressurePanel.setLayout(new FlowLayout());
        //endPressurePanel.setBorder(BorderFactory.createLineBorder(Color.green));

        timeInPanel = new JPanel();
        timeInPanel.setLayout(new FlowLayout());
        //timeInPanel.setBorder(BorderFactory.createLineBorder(Color.CYAN));

        timeOutPanel = new JPanel();
        timeOutPanel.setLayout(new FlowLayout());
        //timeOutPanel.setBorder(BorderFactory.createLineBorder(Color.CYAN));

        commentsPanel = new JPanel();
        commentsPanel.setLayout(new FlowLayout());
        //commentsPanel.setBorder(BorderFactory.createLineBorder(Color.black));

        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(diveNumberPanel);
        mainFrame.add(locationPanel);
        mainFrame.add(maxDepthPanel);
        mainFrame.add(divePlannerTypePanel);
        mainFrame.add(visibilityPanel);
        mainFrame.add(tempPanel);
        mainFrame.add(weightPanel);
        mainFrame.add(startPressurePanel);
        mainFrame.add(endPressurePanel);
        mainFrame.add(timeInPanel);
        mainFrame.add(timeOutPanel);
        mainFrame.add(commentsPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }

    private void fieldSetup(){
        headerLabel.setText("Listener in action: KeyListener");
        diveNumberField  = new JTextField(4);
        diveNumberField.addKeyListener(new CustomKeyListener());

        locationField = new JTextField(10);
        locationField.addKeyListener(new CustomKeyListener());

        maxDepthField = new JTextField(4);
        maxDepthField.addKeyListener(new CustomKeyListener());


        final DefaultComboBoxModel types = new DefaultComboBoxModel();
        types.addElement("Computer");
        types.addElement("RDP");


        divePlannerTypeComboBox = new JComboBox(types);
        divePlannerTypeComboBox.setSelectedIndex(0);

        visibilityField = new JTextField(4);
        visibilityField.addKeyListener(new CustomKeyListener());

        tempField = new JTextField(3);
        tempField.addKeyListener(new CustomKeyListener());

        weightField = new JTextField(3);
        weightField.addKeyListener(new CustomKeyListener());

        startPressureField = new JTextField(6);
        startPressureField.addKeyListener(new CustomKeyListener());

        endPressureField = new JTextField(6);
        endPressureField.addKeyListener(new CustomKeyListener());

        timeInField = new JTextField(8);
        timeInField.addKeyListener(new CustomKeyListener());

        timeOutField = new JTextField(8);
        timeOutField.addKeyListener(new CustomKeyListener());

        commentsField = new JTextField(30);
        commentsField.addKeyListener(new CustomKeyListener());

        JButton okButton = new JButton("OK");
        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                statusLabel.setText("Entered text: " + diveNumberField.getText());
            }
        });
        diveNumberPanel.add(diveNumberLabel);
        diveNumberPanel.add(diveNumberField);
        locationPanel.add(locationLabel);
        locationPanel.add(locationField);
        maxDepthPanel.add(maxDepthLabel);
        maxDepthPanel.add(maxDepthField);
        divePlannerTypePanel.add(divePlannerTypeLabel);
        divePlannerTypePanel.add(divePlannerTypeComboBox);
        visibilityPanel.add(visibilityLabel);
        visibilityPanel.add(visibilityField);
        tempPanel.add(tempLabel);
        tempPanel.add(tempField);
        weightPanel.add(weightLabel);
        weightPanel.add(weightField);
        startPressurePanel.add(startPressureLabel);
        startPressurePanel.add(startPressureField);
        endPressurePanel.add(endPressureLabel);
        endPressurePanel.add(endPressureField);
        timeInPanel.add(timeInLabel);
        timeInPanel.add(timeInField);
        timeOutPanel.add(timeOutLabel);
        timeOutPanel.add(timeOutField);
        commentsPanel.add(commentsLabel);
        commentsPanel.add(commentsField);
        //diveNumberPanel.add(okButton);
        mainFrame.setVisible(true);
    }


    class CustomKeyListener implements KeyListener{
        public void keyTyped(KeyEvent e) {
        }
        public void keyPressed(KeyEvent e) {
            if(e.getKeyCode() == KeyEvent.VK_ENTER){
                statusLabel.setText("Entered text: " + diveNumberField.getText());
            }
        }
        public void keyReleased(KeyEvent e) {
        }
    }
}