package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import lengthpublisher.LengthConvertManager;
import temperaturepublisher.TemperatureConvertManager;
import timepublisher.TimeConvertManager;
import weightpublisher.WeightConvertManager;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenu {

	public JFrame frame;
	
	private LengthConvertManager lengthConvertManager;
	private TimeConvertManager timeConvertManager;
	private WeightConvertManager weightConvert;
	private TemperatureConvertManager temperatureConvert;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 * @param temperatureConvert 
	 * @param weightConvert 
	 * @param timeConvert 
	 * @param lenghtConvert 
	 */
	public MainMenu(LengthConvertManager lenghtConvert, TimeConvertManager timeConvert, WeightConvertManager weightConvert, TemperatureConvertManager temperatureConvert) {
		initialize();
		this.lengthConvertManager = lengthConvertManager;
		this.timeConvertManager = timeConvertManager;
		this.weightConvert = weightConvert;
		this.temperatureConvert = temperatureConvert;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 827, 367);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("UNIT CONVERTOR");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 33));
		lblNewLabel.setBounds(260, 26, 379, 48);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnWeight = new JButton("WEIGHT");
		btnWeight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				WeightGUI weight = new WeightGUI(weightConvert);
				weight.frame.setVisible(true);
			}
		});
		btnWeight.setBounds(48, 124, 193, 48);
		frame.getContentPane().add(btnWeight);
		
		JButton btnTime = new JButton("Time");
		btnTime.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TimeGui time = new TimeGui(timeConvertManager);
				time.frame.setVisible(true);
			}
		});
		btnTime.setBounds(48, 202, 193, 48);
		frame.getContentPane().add(btnTime);
		
		JButton btnLength = new JButton("Length");
		btnLength.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LengthGUI length = new LengthGUI(lengthConvertManager);
				length.frame.setVisible(true);
			}
		});
		btnLength.setBounds(315, 124, 193, 48);
		frame.getContentPane().add(btnLength);
		
		JButton button_2 = new JButton("New button");
		button_2.setBounds(315, 202, 193, 48);
		frame.getContentPane().add(button_2);
	}

}
