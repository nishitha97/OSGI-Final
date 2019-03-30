package temperaturepublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import temperaturepublisher.TemperatureConvertManager;

public class Activator implements BundleActivator {

	ServiceRegistration serviceRegistration;

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		
		System.out.println("Temperature Convert Manager start");
		
		serviceRegistration = bundleContext.registerService(TemperatureConvertManager.class.getName(), TemperatureConvertManager.getInstance(),null);
		
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		serviceRegistration.unregister();
		System.out.println("Temperature Convert Manager stop");
		
	}

}


