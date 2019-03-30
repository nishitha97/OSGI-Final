package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;

import lengthpublisher.LengthConvertManager;
import lengthpublisher.StringConstLength;
import weightpublisher.StringConstWeight;
import weightpublisher.WeightConvertManager;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LengthGUI {

	public JFrame frame;
	private JTextField txtFromValue;
	private JLabel lblToValue;
	private JComboBox<gui.ComboItem> cmbTo;
	private JComboBox<gui.ComboItem> cmbFrom;

	private static LengthConvertManager lengthConvert;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public LengthGUI(LengthConvertManager lengthConvert) {
		this.lengthConvert = lengthConvert;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 783, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		cmbTo = new JComboBox<gui.ComboItem>();
		cmbTo.setBounds(356, 149, 174, 22);
		frame.getContentPane().add(cmbTo);
		
		cmbFrom = new JComboBox<gui.ComboItem>();
		cmbFrom.setBounds(356, 101, 174, 22);
		frame.getContentPane().add(cmbFrom);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				convertButtonPressed();
			}
		});
		btnConvert.setBounds(630, 100, 97, 71);
		frame.getContentPane().add(btnConvert);
		
		txtFromValue = new JTextField();
		txtFromValue.setColumns(10);
		txtFromValue.setBounds(22, 101, 260, 22);
		frame.getContentPane().add(txtFromValue);
		
		lblToValue = new JLabel("Result");
		lblToValue.setBounds(22, 152, 260, 16);
		frame.getContentPane().add(lblToValue);
		
		JLabel lblLengthConversion = new JLabel("LENGTH CONVERSION");
		lblLengthConversion.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblLengthConversion.setBounds(60, 40, 348, 35);
		frame.getContentPane().add(lblLengthConversion);
		
		setValuesToCmboBoxes();
	}
	
	private void convertButtonPressed() {
		
		String toUnit = ((ComboItem)cmbTo.getSelectedItem()).getValue();
		String FromUnit = ((ComboItem)cmbFrom.getSelectedItem()).getValue();
		
		try {
		Double result =  lengthConvert.getResult(FromUnit, toUnit, Double.parseDouble(txtFromValue.getText()));
		lblToValue.setText(result.toString());
		}catch(NumberFormatException e) {
			lblToValue.setText("Please enter a valid number !");
		}
	
		
	}
	
	public void setValuesToCmboBoxes() {
		cmbFrom.addItem(new ComboItem("Centimeter",StringConstLength.centimeter));
		cmbFrom.addItem(new ComboItem("Meter",StringConstLength.meter));
		cmbFrom.addItem(new ComboItem("Miles",StringConstLength.miles));
		cmbFrom.addItem(new ComboItem("Kilometer",StringConstLength.kiloMeter));
		cmbFrom.addItem(new ComboItem("Feet",StringConstLength.feet));
		cmbFrom.addItem(new ComboItem("Inches",StringConstLength.inches));
		
		cmbTo.addItem(new ComboItem("Centimeter",StringConstLength.centimeter));
		cmbTo.addItem(new ComboItem("Meter",StringConstLength.meter));
		cmbTo.addItem(new ComboItem("Miles",StringConstLength.miles));
		cmbTo.addItem(new ComboItem("Kilometer",StringConstLength.kiloMeter));
		cmbTo.addItem(new ComboItem("Feet",StringConstLength.feet));
		cmbTo.addItem(new ComboItem("Inches",StringConstLength.inches));
	}

}
