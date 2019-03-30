package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;

import timepublisher.StringConstTime;
import timepublisher.TimeConvertManager;
import weightpublisher.StringConstWeight;

import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TimeGui {

	public JFrame frame;
	private TimeConvertManager time;
	private JTextField txtFromValue;
	private JButton btnConvert;
	private JLabel lblToValue;
	private JComboBox<gui.ComboItem> cmbTo;
	private JComboBox<gui.ComboItem> cmbFrom;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public TimeGui(TimeConvertManager time) {
		this.time = time;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 811, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		 cmbFrom = new JComboBox<gui.ComboItem>();
		cmbFrom.setBounds(428, 100, 145, 22);
		frame.getContentPane().add(cmbFrom);
		
		btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				convertButtonPressed();
			}
		});
		btnConvert.setBounds(589, 99, 97, 71);
		frame.getContentPane().add(btnConvert);
		
		cmbTo = new JComboBox<gui.ComboItem>();
		cmbTo.setBounds(428, 148, 145, 22);
		frame.getContentPane().add(cmbTo);
		
		txtFromValue = new JTextField();
		txtFromValue.setColumns(10);
		txtFromValue.setBounds(12, 103, 246, 22);
		frame.getContentPane().add(txtFromValue);
		
		lblToValue = new JLabel("New label");
		lblToValue.setBounds(12, 154, 300, 22);
		frame.getContentPane().add(lblToValue);
		
		JLabel lblImeConversion = new JLabel("TIME CONVERSION");
		lblImeConversion.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblImeConversion.setBounds(82, 42, 289, 35);
		frame.getContentPane().add(lblImeConversion);
		
		setValuesToCmboBoxes();
	}
	
	public void convertButtonPressed() {
		
		String toUnit = ((ComboItem)cmbTo.getSelectedItem()).getValue();
		String FromUnit = ((ComboItem)cmbFrom.getSelectedItem()).getValue();
		
		Double result =  time.getResult(FromUnit, toUnit, Double.parseDouble(txtFromValue.getText()));
		lblToValue.setText(result.toString());
	
	}
	
	public void setValuesToCmboBoxes() {
		cmbFrom.addItem(new ComboItem("Day",StringConstTime.day));
		cmbFrom.addItem(new ComboItem("Hour",StringConstTime.hour));
		cmbFrom.addItem(new ComboItem("MiliSecond",StringConstTime.millisecond));
		cmbFrom.addItem(new ComboItem("Minute",StringConstTime.minute));
		cmbFrom.addItem(new ComboItem("Month",StringConstTime.month));
		cmbFrom.addItem(new ComboItem("Second",StringConstTime.second));
		cmbFrom.addItem(new ComboItem("Year",StringConstTime.year));
		
		cmbTo.addItem(new ComboItem("Day",StringConstTime.day));
		cmbTo.addItem(new ComboItem("Hour",StringConstTime.hour));
		cmbTo.addItem(new ComboItem("MiliSecond",StringConstTime.millisecond));
		cmbTo.addItem(new ComboItem("Minute",StringConstTime.minute));
		cmbTo.addItem(new ComboItem("Month",StringConstTime.month));
		cmbTo.addItem(new ComboItem("Second",StringConstTime.second));
		cmbTo.addItem(new ComboItem("Year",StringConstTime.year));
		
	}

}
