package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;

import temperaturepublisher.StringConstTemperature;
import temperaturepublisher.TemperatureConvertManager;
import weightpublisher.StringConstWeight;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class TempGUI {

	public JFrame frame;
	private JTextField txtFromVal;
	private JComboBox<gui.ComboItem> cmbFrom;
	private JComboBox<gui.ComboItem> cmbTo;
	private TemperatureConvertManager temp;
	private JButton btnConvert;
	private JLabel lblToVal;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 */
	public TempGUI(TemperatureConvertManager temp) {
		this.temp = temp;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 484, 303);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		cmbFrom = new JComboBox<gui.ComboItem>();
		cmbFrom.setBounds(162, 111, 145, 22);
		frame.getContentPane().add(cmbFrom);
		
		btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				convertButtonPressed();
			}
		
		});
		btnConvert.setBounds(323, 110, 97, 71);
		frame.getContentPane().add(btnConvert);
		
		cmbTo = new JComboBox<gui.ComboItem>();
		cmbTo.setBounds(162, 159, 145, 22);
		frame.getContentPane().add(cmbTo);
		
		txtFromVal = new JTextField();
		txtFromVal.setColumns(10);
		txtFromVal.setBounds(34, 111, 116, 22);
		frame.getContentPane().add(txtFromVal);
		
		lblToVal = new JLabel("New label");
		lblToVal.setBounds(53, 162, 56, 16);
		frame.getContentPane().add(lblToVal);
		
		JLabel lblTempratureConversion = new JLabel("TEMPERATURE CONVERSION");
		lblTempratureConversion.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblTempratureConversion.setBounds(49, 39, 382, 35);
		frame.getContentPane().add(lblTempratureConversion);
		setValuesToCmboBoxes();
	}
	
	private void convertButtonPressed() {
		String toUnit = ((ComboItem)cmbTo.getSelectedItem()).getValue();
		String FromUnit = ((ComboItem)cmbFrom.getSelectedItem()).getValue();
		
		Double result =  temp.getResult(FromUnit, toUnit, Double.parseDouble(txtFromVal.getText()));
		double s = roundTwoDecimals(result);
		lblToVal.setText(Double.toString(s));
		
	}
	public void setValuesToCmboBoxes() {
		cmbFrom.addItem(new ComboItem("Celcius",StringConstTemperature.celcius));
		cmbFrom.addItem(new ComboItem("Fahrenheit",StringConstTemperature.fahrenheit));
		cmbFrom.addItem(new ComboItem("Kelvin",StringConstTemperature.kelvin));
		
		cmbTo.addItem(new ComboItem("Celcius",StringConstTemperature.celcius));
		cmbTo.addItem(new ComboItem("Fahrenheit",StringConstTemperature.fahrenheit));
		cmbTo.addItem(new ComboItem("Kelvin",StringConstTemperature.kelvin));		
		
	}
	double roundTwoDecimals(double d) { 
	      DecimalFormat twoDForm = new DecimalFormat("#.####"); 
	      return Double.valueOf(twoDForm.format(d));
	} 

}
