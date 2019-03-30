package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import weightpublisher.StringConstWeight;
import weightpublisher.WeightConvertManager;

import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WeightGUI {

	public JFrame frame;
	private JTextField txtFromValue;
	private JLabel lblToValue;
	private static JComboBox<ComboItem> cmbFrom = new JComboBox<ComboItem>();
	private static JComboBox<ComboItem> cmbTo = new JComboBox<ComboItem>();
	private static WeightConvertManager weightConvert;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 * @param weightConvert 
	 */
	public WeightGUI(WeightConvertManager weightConvert) {
		initialize();
		this.weightConvert = weightConvert;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WEIGHT CONVERSION");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblNewLabel.setBounds(50, 25, 348, 35);
		frame.getContentPane().add(lblNewLabel);
		
		txtFromValue = new JTextField();
		txtFromValue.setBounds(12, 86, 116, 22);
		frame.getContentPane().add(txtFromValue);
		txtFromValue.setColumns(10);
		

		cmbFrom.setBounds(140, 86, 145, 22);
		frame.getContentPane().add(cmbFrom);
		
		lblToValue = new JLabel("New label");
		lblToValue.setBounds(31, 137, 56, 16);
		frame.getContentPane().add(lblToValue);
		
		
		cmbTo.setBounds(140, 134, 145, 22);
		frame.getContentPane().add(cmbTo);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				convertButtonPressed();
			}
		});
		btnConvert.setBounds(301, 85, 97, 71);
		frame.getContentPane().add(btnConvert);
		setValuesToCmboBoxes();
		
	}
	
	public void convertButtonPressed() {
		
		String toUnit = ((ComboItem)cmbTo.getSelectedItem()).getValue();
		String FromUnit = ((ComboItem)cmbFrom.getSelectedItem()).getValue();
		
		Double result =  weightConvert.getResult(FromUnit, toUnit, Double.parseDouble(txtFromValue.getText()));
		lblToValue.setText(result.toString());
	
	}
	
	public void setValuesToCmboBoxes() {
		cmbFrom.addItem(new ComboItem("Kilo Gram",StringConstWeight.kilogram));
		cmbFrom.addItem(new ComboItem("Gram",StringConstWeight.gram));
		cmbFrom.addItem(new ComboItem("Mili Gram",StringConstWeight.miligram));
		cmbFrom.addItem(new ComboItem("Metric Ton",StringConstWeight.metricTon));
		cmbFrom.addItem(new ComboItem("Deci Gram",StringConstWeight.decigram));
		cmbFrom.addItem(new ComboItem("Ounce",StringConstWeight.ounce));
		cmbFrom.addItem(new ComboItem("Pound",StringConstWeight.pound));
		
		cmbTo.addItem(new ComboItem("Kilo Gram",StringConstWeight.kilogram));
		cmbTo.addItem(new ComboItem("Gram",StringConstWeight.gram));
		cmbTo.addItem(new ComboItem("Mili Gram",StringConstWeight.miligram));
		cmbTo.addItem(new ComboItem("Metric Ton",StringConstWeight.metricTon));
		cmbTo.addItem(new ComboItem("Deci Gram",StringConstWeight.decigram));
		cmbTo.addItem(new ComboItem("Ounce",StringConstWeight.ounce));
		cmbTo.addItem(new ComboItem("Pound",StringConstWeight.pound));
	
	}

}
class ComboItem
{
    private String key;
    private String value;

    public ComboItem(String key, String value)
    {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString()
    {
        return key;
    }

    public String getKey()
    {
        return key;
    }

    public String getValue()
    {
        return value;
    }
}
