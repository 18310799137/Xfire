package com.zgh.xfire.client;
import java.net.MalformedURLException;
import org.codehaus.xfire.XFireFactory;
import org.codehaus.xfire.client.XFireProxyFactory;
import org.codehaus.xfire.service.Service;
import org.codehaus.xfire.service.binding.ObjectServiceFactory;
public class XfireClient {
	public static void main(String[] args) {
		 Service service = new ObjectServiceFactory().create(IWSHello.class);  
		       XFireProxyFactory factory = new XFireProxyFactory(XFireFactory  
		               .newInstance().getXFire());  
		       String url = "http://localhost:8080/Xfire/services/WSHello";  
		       IWSHello helloService = null;
			try {
				helloService = (IWSHello) factory.create(service,url);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}  
		       System.out.println(helloService.showHello("风清扬"));  

	}
}
