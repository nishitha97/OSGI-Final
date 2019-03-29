package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import lengthpublisher.LengthConvertManager;
import timepublisher.TimeConvertManager;
import weightpublisher.WeightConvertManager;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.Color;

public class UnitConvertor {

	public JFrame frame;
	private JTextField txtInput;
	
	private LengthConvertManager lengthConvertManager;
	private TimeConvertManager timeConvertManager;
	private WeightConvertManager weightConvert;

	
	public UnitConvertor(LengthConvertManager lengthConvertManager,TimeConvertManager timeConvertManager,WeightConvertManager weightConvert){
		
		this.lengthConvertManager=lengthConvertManager;
		this.timeConvertManager=timeConvertManager;
		this.weightConvert=weightConvert;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtInput = new JTextField();
		txtInput.setFont(new Font("Tahoma", Font.PLAIN, 24));
		txtInput.setBounds(35, 92, 146, 40);
		frame.getContentPane().add(txtInput);
		txtInput.setColumns(10);
		
		JLabel lblAnswer = new JLabel("Answer");
		lblAnswer.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblAnswer.setBounds(77, 165, 179, 50);
		frame.getContentPane().add(lblAnswer);
		
		//gram to kilogram
		JButton btnGram = new JButton("Convert to grammes KiloGrams");
		btnGram.setForeground(Color.BLACK);
		btnGram.setBackground(Color.GRAY);
		btnGram.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
//				 double ans =  conversionWeightPublish.convertGramToKilogram(Double.parseDouble(txtInput.getText()));
//				 lblAnswer.setText(String.valueOf(ans) + " KG");
			}
		});
		btnGram.setBounds(493, 83, 165, 59);
		frame.getContentPane().add(btnGram);
		
		//kilogram to gram
		JButton kiloGram = new JButton("Convert to kilograms to Grams");
		kiloGram.setForeground(Color.BLACK);
		kiloGram.setBackground(Color.GRAY);
		kiloGram.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
//				 double ans =  conversionWeightPublish.convertKilogramToGram(Double.parseDouble(txtInput.getText()));
//				 lblAnswer.setText(String.valueOf(ans) + " G");
			}
		});
		kiloGram.setBounds(493, 150, 165, 59);
		frame.getContentPane().add(kiloGram);
		
		//cm to m
		JButton btnMetres = new JButton("Convert cm to m");
		btnMetres.setForeground(Color.BLACK);
		btnMetres.setBackground(Color.GRAY);
		btnMetres.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
//				 double ans =  conversionLenghtPublish.convertCMToM(Double.parseDouble(txtInput.getText()));
//				 lblAnswer.setText(String.valueOf(ans) + " m");
			}
		});
		btnMetres.setBounds(318, 83, 165, 59);
		frame.getContentPane().add(btnMetres);
		
		//m to cm
		JButton centimeters = new JButton("Convert m to cm");
		centimeters.setForeground(Color.BLACK);
		centimeters.setBackground(Color.GRAY);
		centimeters.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
//				 double ans =  conversionLenghtPublish.convertMToCM(Double.parseDouble(txtInput.getText()));
//				 lblAnswer.setText(String.valueOf(ans) + " cm");
			}
		});
		centimeters.setBounds(318,150, 165, 59);
		frame.getContentPane().add(centimeters);
		
		//feet to inches
		JButton inches = new JButton("Convert feet to inches");
		inches.setForeground(Color.BLACK);
		inches.setBackground(Color.GRAY);
		inches.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
//				 double ans =  conversionLenghtPublish.convertFeetToInches(Double.parseDouble(txtInput.getText()));
//				 lblAnswer.setText(String.valueOf(ans) + " inches");
			}
		});
		inches.setBounds(318, 220, 165, 59);
		frame.getContentPane().add(inches);
		
		//inches to feet
		JButton feet = new JButton("Convert inches to feet");
		feet.setForeground(Color.BLACK);
		feet.setBackground(Color.GRAY);
		feet.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
//				 double ans =  conversionLenghtPublish.convertInchesToFeet(Double.parseDouble(txtInput.getText()));
//				 lblAnswer.setText(String.valueOf(ans) + " feet");
			}
		});
		feet.setBounds(318, 290, 165, 59);
		frame.getContentPane().add(feet);
		
		//meters to kilometers
		JButton kilometers = new JButton("Convert meters to kilometers");
		kilometers.setForeground(Color.BLACK);
		kilometers.setBackground(Color.GRAY);
		kilometers.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
//				 double ans =  conversionLenghtPublish.convertMToKM(Double.parseDouble(txtInput.getText()));
//				 lblAnswer.setText(String.valueOf(ans) + " km");
			}
		});
		kilometers.setBounds(318, 360, 165, 59);
		frame.getContentPane().add(kilometers);
		
		//kilometers to meters
		JButton meters = new JButton("Convert kilometers to meters");
		meters.setForeground(Color.BLACK);
		meters.setBackground(Color.GRAY);
		meters.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
//				 double ans =  conversionLenghtPublish.convertKMToM(Double.parseDouble(txtInput.getText()));
//				 lblAnswer.setText(String.valueOf(ans) + " m");
			}
		});
		meters.setBounds(318, 429, 165, 59);
		frame.getContentPane().add(meters);

		//celcius to farenheight
		JButton celcius = new JButton("Convert celcius to farenheight");
		celcius.setForeground(Color.BLACK);
		celcius.setBackground(Color.GRAY);
		celcius.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
//				 double ans =  conversionTemperaturePublish.convertCelciusToFarenheight(Double.parseDouble(txtInput.getText()));
//				 lblAnswer.setText(String.valueOf(ans) + " F");
			}
		});
		celcius.setBounds(668, 83, 165, 59);
		frame.getContentPane().add(celcius);
		
		//farenheight to celcius	
		JButton farenheight = new JButton("Convert farenheight to celcius");
		farenheight.setForeground(Color.BLACK);
		farenheight.setBackground(Color.GRAY);
		farenheight.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
//				 double ans =  conversionTemperaturePublish.convertFarenheightToCelcius(Double.parseDouble(txtInput.getText()));
//				 lblAnswer.setText(String.valueOf(ans) + " C");
			}
		});
		farenheight.setBounds(668, 150, 165, 59);
		frame.getContentPane().add(farenheight);
	}
}
