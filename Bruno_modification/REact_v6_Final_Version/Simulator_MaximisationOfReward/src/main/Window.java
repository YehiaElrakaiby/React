package main;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ScrollPaneConstants;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import java.awt.Component;

public class Window {

	private static JFrame frame;
	public static JCanvas jc;
	public static JCanvas panelPicture;
	private JTextPane rewardText;
	private JTextPane reqName;
	private JTextPane total;
	private JTextPane reqRew;
	private JTextPane reqDescr;
	private JTextPane Status;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window window = new Window();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1200, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("Find next action");
		btnNewButton.setBounds(0, 0, 1194, 21);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ModelCheckMaximisationOfReward.leftClickAction(e,jc,panelPicture, rewardText,reqName,reqRew,total,Status, reqDescr);
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnNewButton);
		
		jc = new JCanvas();
		jc.setBackground(Color.WHITE);
		Dimension dim = new Dimension(600, 3000);
		jc.setPreferredSize(dim);
		
		//Scrollbar
		JScrollPane scroller = new JScrollPane(jc);
		scroller.setBounds(0, 23, 580, 549);
		frame.getContentPane().add(scroller);
		
		ModelCheckMaximisationOfReward.drawInitialState(jc);
		
		panelPicture = new JCanvas();
		panelPicture.setBounds(582, 23, 596, 549);
		panelPicture.setForeground(Color.WHITE);
		panelPicture.setBackground(Color.WHITE);
		ImageIcon image = new ImageIcon(new ImageIcon("/Users/forensics/Desktop/restaurant.png").getImage().getScaledInstance(600, 350, Image.SCALE_DEFAULT));
		panelPicture.setLayout(null);
		JLabel label = new JLabel();
		label.setBounds(-2, 5, 600, 350);
		label.setIcon(image);
		panelPicture.add(label);
		frame.getContentPane().add(panelPicture);
		
		rewardText = new JTextPane();
		rewardText.setBounds(37, 354, 553, 16);
		rewardText.setForeground(Color.BLACK);
		rewardText.setEditable(false);
		rewardText.setBackground(Color.WHITE);
		rewardText.setText("Current Reward : 0");
		panelPicture.add(rewardText);
		
		reqName = new JTextPane();
		reqName.setBounds(37, 377, 553, 16);
		reqName.setText("Name :");
		reqName.setEditable(false);
		panelPicture.add(reqName);
		
		total = new JTextPane();
		total.setText("Total :");
		total.setBounds(37, 439, 554, 16);
		panelPicture.add(total);
		
		
		reqRew = new JTextPane();
		reqRew.setText("Reward :");
		reqRew.setBounds(37, 460, 553, 16);
		panelPicture.add(reqRew);
		
		reqDescr = new JTextPane();
		reqDescr.setText("Description : ");
		reqDescr.setBounds(37, 399, 553, 16);
		panelPicture.add(reqDescr);
		
		Status = new JTextPane();
		Status.setText("Status :");
		Status.setBounds(37, 421, 553, 16);
		panelPicture.add(Status);

		ModelCheckMaximisationOfReward.drawInitialPoint(panelPicture,reqName);
		}
}
