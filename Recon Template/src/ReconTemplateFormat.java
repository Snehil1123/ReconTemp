import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import java.awt.Color;  
import java.awt.Graphics;  
import java.awt.event.FocusEvent;  
import java.awt.event.FocusListener;  
import javax.swing.plaf.basic.BasicTextFieldUI;  
import javax.swing.text.JTextComponent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.Timer;
import javax.swing.JCheckBox;
import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JProgressBar;
import javax.swing.Box;


public class ReconTemplateFormat extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JLabel lblMatch;
	private JLabel lblScoutName;
	private JLabel lblTeleop;
	private JLabel lblReconTemplate;
	private JLabel lblTimes_1;
	private JLabel lblTimes_2;
	private JButton btnStartMatch;
	private JButton btnNewMatch;
	private JLabel label;
	private JLabel label_1;
	private JLabel lblTimeRemaining;
	private JLabel lblMatchSection;
	private JLabel lblAutomode;
	private JCheckBox chckbxCrossBaseline;
	private JCheckBox chckbxScoreInSwitch;
	private JCheckBox chckbxNewCheckBox;
	private JLabel label_2;
	private JLabel lblSwitch;
	private JLabel lblScale;
	private JLabel lblOppSwitch;
	private JLabel lblEndgame;
	private JCheckBox chckbxParkonPlatform;
	private JCheckBox chckbxClimbed;
	private JCheckBox chckbxAssistWithClimb;
	private JButton btnFullStats;
	private JLabel lblPenalty;
	private JTextField textField_4;
	private JLabel lblComments;
	private JTextField textField_5;
	private JLabel lblNewLabel;
	private JLabel lblPressTo;
	private JLabel label_3;
	private JButton btnDone;
	private JMenuBar menuBar;
	private JMenu mnSampleMenu;
	private JMenuItem mntmSampleMenuItem;
	private Box horizontalBox;
	private JProgressBar progressBar;
	
//	ReconTemplateFormat rf; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReconTemplateFormat frame = new ReconTemplateFormat();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ReconTemplateFormat() {
//		rf = new ReconTemplateFormat();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1141, 620);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnSampleMenu = new JMenu("Sample Menu");
		menuBar.add(mnSampleMenu);
		
		mntmSampleMenuItem = new JMenuItem("Sample Menu Item");
		mnSampleMenu.add(mntmSampleMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{30, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		lblReconTemplate = new JLabel("POWER UP Recon Template");
		GridBagConstraints gbc_lblReconTemplate = new GridBagConstraints();
		gbc_lblReconTemplate.gridwidth = 3;
		gbc_lblReconTemplate.insets = new Insets(0, 0, 5, 5);
		gbc_lblReconTemplate.gridx = 2;
		gbc_lblReconTemplate.gridy = 0;
		contentPane.add(lblReconTemplate, gbc_lblReconTemplate);
		
		label_1 = new JLabel("");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 5;
		gbc_label_1.gridy = 1;
		contentPane.add(label_1, gbc_label_1);
		
		lblTimeRemaining = new JLabel("Time Remaining");
		GridBagConstraints gbc_lblTimeRemaining = new GridBagConstraints();
		gbc_lblTimeRemaining.insets = new Insets(0, 0, 5, 5);
		gbc_lblTimeRemaining.gridx = 6;
		gbc_lblTimeRemaining.gridy = 1;
		contentPane.add(lblTimeRemaining, gbc_lblTimeRemaining);
		
//		JProgressBar progressBar = new JProgressBar (0, task.getLengthofTask()); 
		
		btnStartMatch = new JButton("Start Match");
		btnStartMatch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GridBagConstraints gbc_btnStartMatch = new GridBagConstraints();
		gbc_btnStartMatch.gridwidth = 2;
		gbc_btnStartMatch.insets = new Insets(0, 0, 5, 5);
		gbc_btnStartMatch.gridx = 0;
		gbc_btnStartMatch.gridy = 2;
		contentPane.add(btnStartMatch, gbc_btnStartMatch);
		
		progressBar = new JProgressBar();
		GridBagConstraints gbc_progressBar = new GridBagConstraints();
		gbc_progressBar.insets = new Insets(0, 0, 5, 5);
		gbc_progressBar.gridx = 6;
		gbc_progressBar.gridy = 2;
		contentPane.add(progressBar, gbc_progressBar);
		
		horizontalBox = Box.createHorizontalBox();
		GridBagConstraints gbc_horizontalBox = new GridBagConstraints();
		gbc_horizontalBox.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalBox.gridx = 4;
		gbc_horizontalBox.gridy = 3;
		contentPane.add(horizontalBox, gbc_horizontalBox);
		
		label_2 = new JLabel("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.gridwidth = 8;
		gbc_label_2.insets = new Insets(0, 0, 5, 0);
		gbc_label_2.gridx = 0;
		gbc_label_2.gridy = 4;
		contentPane.add(label_2, gbc_label_2);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 5;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		
		lblAutomode = new JLabel("Automode");
		GridBagConstraints gbc_lblAutomode = new GridBagConstraints();
		gbc_lblAutomode.insets = new Insets(0, 0, 5, 5);
		gbc_lblAutomode.gridx = 2;
		gbc_lblAutomode.gridy = 5;
		contentPane.add(lblAutomode, gbc_lblAutomode);
		
		lblTeleop = new JLabel("Teleop");
		GridBagConstraints gbc_lblTeleop = new GridBagConstraints();
		gbc_lblTeleop.insets = new Insets(0, 0, 5, 5);
		gbc_lblTeleop.gridx = 4;
		gbc_lblTeleop.gridy = 5;
		contentPane.add(lblTeleop, gbc_lblTeleop);
		
		lblEndgame = new JLabel("Endgame");
		GridBagConstraints gbc_lblEndgame = new GridBagConstraints();
		gbc_lblEndgame.insets = new Insets(0, 0, 5, 5);
		gbc_lblEndgame.gridx = 5;
		gbc_lblEndgame.gridy = 5;
		contentPane.add(lblEndgame, gbc_lblEndgame);
		
		lblMatchSection = new JLabel("Match Section");
		GridBagConstraints gbc_lblMatchSection = new GridBagConstraints();
		gbc_lblMatchSection.insets = new Insets(0, 0, 5, 5);
		gbc_lblMatchSection.gridx = 5;
		gbc_lblMatchSection.gridy = 1;
		contentPane.add(lblMatchSection, gbc_lblMatchSection);
		
		lblPenalty = new JLabel("Penalty");
		GridBagConstraints gbc_lblPenalty = new GridBagConstraints();
		gbc_lblPenalty.insets = new Insets(0, 0, 5, 5);
		gbc_lblPenalty.gridx = 6;
		gbc_lblPenalty.gridy = 5;
		contentPane.add(lblPenalty, gbc_lblPenalty);
		
		lblScoutName = new JLabel("Scout Name");
		GridBagConstraints gbc_lblScoutName = new GridBagConstraints();
		gbc_lblScoutName.insets = new Insets(0, 0, 5, 5);
		gbc_lblScoutName.gridx = 0;
		gbc_lblScoutName.gridy = 6;
		contentPane.add(lblScoutName, gbc_lblScoutName);
		
		chckbxCrossBaseline = new JCheckBox("Cross Baseline");
		GridBagConstraints gbc_chckbxCrossBaseline = new GridBagConstraints();
		gbc_chckbxCrossBaseline.anchor = GridBagConstraints.WEST;
		gbc_chckbxCrossBaseline.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxCrossBaseline.gridx = 2;
		gbc_chckbxCrossBaseline.gridy = 6;
		contentPane.add(chckbxCrossBaseline, gbc_chckbxCrossBaseline);
		
		lblSwitch = new JLabel("Switch:");
		GridBagConstraints gbc_lblSwitch = new GridBagConstraints();
		gbc_lblSwitch.anchor = GridBagConstraints.EAST;
		gbc_lblSwitch.insets = new Insets(0, 0, 5, 5);
		gbc_lblSwitch.gridx = 3;
		gbc_lblSwitch.gridy = 6;
		contentPane.add(lblSwitch, gbc_lblSwitch);
		
		label = new JLabel("Press 1 to score");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 4;
		gbc_label.gridy = 6;
		contentPane.add(label, gbc_label);
		
		chckbxParkonPlatform = new JCheckBox("Parked on Platform");
		GridBagConstraints gbc_chckbxParkonPlatform = new GridBagConstraints();
		gbc_chckbxParkonPlatform.anchor = GridBagConstraints.WEST;
		gbc_chckbxParkonPlatform.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxParkonPlatform.gridx = 5;
		gbc_chckbxParkonPlatform.gridy = 6;
		contentPane.add(chckbxParkonPlatform, gbc_chckbxParkonPlatform);
		
		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 6;
		gbc_textField_4.gridy = 6;
		contentPane.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		chckbxScoreInSwitch = new JCheckBox("Score in Switch");
		GridBagConstraints gbc_chckbxScoreInSwitch = new GridBagConstraints();
		gbc_chckbxScoreInSwitch.anchor = GridBagConstraints.WEST;
		gbc_chckbxScoreInSwitch.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxScoreInSwitch.gridx = 2;
		gbc_chckbxScoreInSwitch.gridy = 7;
		contentPane.add(chckbxScoreInSwitch, gbc_chckbxScoreInSwitch);
		
		lblScale = new JLabel("Scale:");
		GridBagConstraints gbc_lblScale = new GridBagConstraints();
		gbc_lblScale.anchor = GridBagConstraints.EAST;
		gbc_lblScale.insets = new Insets(0, 0, 5, 5);
		gbc_lblScale.gridx = 3;
		gbc_lblScale.gridy = 7;
		contentPane.add(lblScale, gbc_lblScale);
		
		lblTimes_1 = new JLabel("Press 2 to score");
		GridBagConstraints gbc_lblTimes_1 = new GridBagConstraints();
		gbc_lblTimes_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblTimes_1.gridx = 4;
		gbc_lblTimes_1.gridy = 7;
		contentPane.add(lblTimes_1, gbc_lblTimes_1);
		
		chckbxClimbed = new JCheckBox("Climbed");
		GridBagConstraints gbc_chckbxClimbed = new GridBagConstraints();
		gbc_chckbxClimbed.anchor = GridBagConstraints.WEST;
		gbc_chckbxClimbed.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxClimbed.gridx = 5;
		gbc_chckbxClimbed.gridy = 7;
		contentPane.add(chckbxClimbed, gbc_chckbxClimbed);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 0;
		gbc_textField_2.gridy = 8;
		contentPane.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		chckbxNewCheckBox = new JCheckBox("Score in Scale");
		GridBagConstraints gbc_chckbxNewCheckBox = new GridBagConstraints();
		gbc_chckbxNewCheckBox.anchor = GridBagConstraints.WEST;
		gbc_chckbxNewCheckBox.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox.gridx = 2;
		gbc_chckbxNewCheckBox.gridy = 8;
		contentPane.add(chckbxNewCheckBox, gbc_chckbxNewCheckBox);
		
		lblOppSwitch = new JLabel("Opp. Switch:");
		GridBagConstraints gbc_lblOppSwitch = new GridBagConstraints();
		gbc_lblOppSwitch.anchor = GridBagConstraints.EAST;
		gbc_lblOppSwitch.insets = new Insets(0, 0, 5, 5);
		gbc_lblOppSwitch.gridx = 3;
		gbc_lblOppSwitch.gridy = 8;
		contentPane.add(lblOppSwitch, gbc_lblOppSwitch);
		
		lblTimes_2 = new JLabel("Press 3 to score");
		GridBagConstraints gbc_lblTimes_2 = new GridBagConstraints();
		gbc_lblTimes_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblTimes_2.gridx = 4;
		gbc_lblTimes_2.gridy = 8;
		contentPane.add(lblTimes_2, gbc_lblTimes_2);
		
		chckbxAssistWithClimb = new JCheckBox("Assist with climb");
		GridBagConstraints gbc_chckbxAssistWithClimb = new GridBagConstraints();
		gbc_chckbxAssistWithClimb.anchor = GridBagConstraints.WEST;
		gbc_chckbxAssistWithClimb.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxAssistWithClimb.gridx = 5;
		gbc_chckbxAssistWithClimb.gridy = 8;
		contentPane.add(chckbxAssistWithClimb, gbc_chckbxAssistWithClimb);
		
		lblMatch = new JLabel("Match #");
		GridBagConstraints gbc_lblMatch = new GridBagConstraints();
		gbc_lblMatch.insets = new Insets(0, 0, 5, 5);
		gbc_lblMatch.gridx = 0;
		gbc_lblMatch.gridy = 9;
		contentPane.add(lblMatch, gbc_lblMatch);
		
		lblNewLabel = new JLabel("Vault/Exchange:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 3;
		gbc_lblNewLabel.gridy = 9;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		lblPressTo = new JLabel("Press 4 to score");
		GridBagConstraints gbc_lblPressTo = new GridBagConstraints();
		gbc_lblPressTo.insets = new Insets(0, 0, 5, 5);
		gbc_lblPressTo.gridx = 4;
		gbc_lblPressTo.gridy = 9;
		contentPane.add(lblPressTo, gbc_lblPressTo);
		
		lblComments = new JLabel("Comments");
		GridBagConstraints gbc_lblComments = new GridBagConstraints();
		gbc_lblComments.insets = new Insets(0, 0, 5, 5);
		gbc_lblComments.gridx = 0;
		gbc_lblComments.gridy = 11;
		contentPane.add(lblComments, gbc_lblComments);
		
		btnNewMatch = new JButton("New Match");
		btnNewMatch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				ReconTemplateFormat rf = new ReconTemplateFormat ();
			}
		});
		
		textField_5 = new JTextField();
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.gridwidth = 7;
		gbc_textField_5.insets = new Insets(0, 0, 5, 0);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 1;
		gbc_textField_5.gridy = 11;
		contentPane.add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);
		
		label_3 = new JLabel("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.gridwidth = 7;
		gbc_label_3.insets = new Insets(0, 0, 5, 5);
		gbc_label_3.gridx = 0;
		gbc_label_3.gridy = 12;
		contentPane.add(label_3, gbc_label_3);
		
		btnDone = new JButton("Done");
		btnDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		GridBagConstraints gbc_btnDone = new GridBagConstraints();
		gbc_btnDone.insets = new Insets(0, 0, 5, 0);
		gbc_btnDone.gridx = 7;
		gbc_btnDone.gridy = 13;
		contentPane.add(btnDone, gbc_btnDone);
		
		GridBagConstraints gbc_btnNewMatch = new GridBagConstraints();
		gbc_btnNewMatch.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewMatch.gridx = 4;
		gbc_btnNewMatch.gridy = 15;
		contentPane.add(btnNewMatch, gbc_btnNewMatch);
		
		btnFullStats = new JButton("Full Stats");
		GridBagConstraints gbc_btnFullStats = new GridBagConstraints();
		gbc_btnFullStats.insets = new Insets(0, 0, 0, 5);
		gbc_btnFullStats.gridx = 6;
		gbc_btnFullStats.gridy = 15;
		contentPane.add(btnFullStats, gbc_btnFullStats);
	}
	
/*	public void actionPerformed(ActionEvent e) {
		String name = e.getActionCommand();
		
		if (name.equals("Done")) {
			System.exit(0);
		}
		
	} */

}
