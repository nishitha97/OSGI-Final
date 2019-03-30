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
import temperaturepublisher.TemperatureConvertManager;
import timepublisher.TimeConvertManager;
import weightpublisher.WeightConvertManager;
import gui.MainMenu;


public class Activator implements BundleActivator {

	ServiceReference lengthserviceReference;
	ServiceReference timeserviceReference;
	ServiceReference weightserviceReference;
	ServiceReference temperatureserviceReference;

	public void start(BundleContext bundleContext) throws Exception {
		try {
			System.out.println("Start Subsciber start");

			lengthserviceReference = bundleContext.getServiceReference(LengthConvertManager.class.getName());
			LengthConvertManager lenghtConvert = (LengthConvertManager) bundleContext.getService(lengthserviceReference);

			timeserviceReference = bundleContext.getServiceReference(TimeConvertManager.class.getName());
			TimeConvertManager timeConvert = (TimeConvertManager) bundleContext.getService(timeserviceReference);

			weightserviceReference = bundleContext.getServiceReference(WeightConvertManager.class.getName());
			WeightConvertManager weightConvert = (WeightConvertManager) bundleContext.getService(weightserviceReference);

			temperatureserviceReference = bundleContext.getServiceReference(TemperatureConvertManager.class.getName());
			TemperatureConvertManager temperatureConvert = (TemperatureConvertManager) bundleContext.getService(temperatureserviceReference);
		
			MainMenu mainWindow = new MainMenu(lenghtConvert, timeConvert, weightConvert, temperatureConvert);
			mainWindow.frame.setVisible(true);

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
		bundleContext.ungetService(temperatureserviceReference);

	}

}
