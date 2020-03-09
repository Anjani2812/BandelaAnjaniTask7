//Proxypattern
package epamcom.DesignPatterns;
import java.util.ArrayList; 
import java.util.List; 

	
	  
	  
	public class Proxy implements Website 
	{ 
	    private Website internet = new Net(); 
	    private static List<String> NoaccessSites; 
	      
	    static
	    { 
	       NoaccessSites = new ArrayList<String>(); 
	        NoaccessSites.add("qrb.com"); 
	      NoaccessSites.add("lll.com"); 
	        NoaccessSites.add("hkl.com"); 
	        NoaccessSites.add("utv.com"); 
	    } 
	      
	    public void connectTo(String serverhost) throws Exception 
	    { 
	        if(NoaccessSites.contains(serverhost.toLowerCase())) 
	        { 
	            throw new Exception("Access Denied"); 
	        } 
	          
	        internet.connectTo(serverhost); 
	    } 
	  
	} 


