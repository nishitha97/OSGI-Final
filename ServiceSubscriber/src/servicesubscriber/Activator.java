package servicesubscriber;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import lengthpublisher.LengthConvertManager;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import conversionlengthpublisher.ConversionLengthPublish;
import conversiontemperaturepublisher.ConversionTemperaturePublish;
import conversionweightpublisher.ConversionWeightPublish;
import gui.UnitConvertor;

public class Activator implements BundleActivator {
	
	
	ServiceReference lengthserviceReference;
	

	public void start(BundleContext bundleContext) throws Exception {
		try {
			System.out.println("Start Subsciber start");
			
			lengthserviceReference = bundleContext.getServiceReference(LengthConvertManager.class.getName());
			LengthConvertManager lenghtConvert = (LengthConvertManager) bundleContext.getService(lengthserviceReference);
			
			//System.out.println("sssssssssssssssssssssssssssssssssssss"+lengthServiceReference);
			//System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaa"+weightServiceReference);
			//System.out.println(tempServiceReference);
			
			UnitConvertor window = new UnitConvertor(lenghtConvert);
		    window.frame.setVisible(true);
			
			//UnitConvertor window = new UnitConvertor(conversionweightpublish);
			//window.frame.setVisible(true);
			
		} catch (Exception e) {

		}

	}




	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	
	


	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Good Bye !!!");
		bundleContext.ungetService(lengthserviceReference);

	}


}
