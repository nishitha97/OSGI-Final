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
import timepublisher.TimeConvertManager;
import weightpublisher.WeightConvertManager;
import gui.UnitConvertor;

public class Activator implements BundleActivator {
	
	
	ServiceReference lengthserviceReference;
	ServiceReference timeserviceReference;
	ServiceReference weightserviceReference;
	

	public void start(BundleContext bundleContext) throws Exception {
		try {
			System.out.println("Start Subsciber start");
			
			lengthserviceReference = bundleContext.getServiceReference(LengthConvertManager.class.getName());
			LengthConvertManager lenghtConvert = (LengthConvertManager) bundleContext.getService(lengthserviceReference);
			
			timeserviceReference = bundleContext.getServiceReference(TimeConvertManager.class.getName());
			TimeConvertManager timeConvert  = (TimeConvertManager) bundleContext.getService(timeserviceReference);
			
			weightserviceReference = bundleContext.getServiceReference(WeightConvertManager.class.getName());
			WeightConvertManager weightConvert  = (WeightConvertManager) bundleContext.getService(weightserviceReference);
			
			//System.out.println("sssssssssssssssssssssssssssssssssssss"+lengthServiceReference);
			//System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaa"+weightServiceReference);
			//System.out.println(tempServiceReference);
			
			UnitConvertor window = new UnitConvertor(lenghtConvert,timeConvert,weightConvert);
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
		bundleContext.ungetService(timeserviceReference);
		bundleContext.ungetService(weightserviceReference);

	}


}
