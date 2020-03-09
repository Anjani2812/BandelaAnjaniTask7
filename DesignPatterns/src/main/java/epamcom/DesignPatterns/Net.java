//Proxypattern
package epamcom.DesignPatterns;

public class Net implements Website {
	 public void connectTo(String serverhost) 
	    { 
	        System.out.println("Connecting to "+ serverhost); 
	    } 

}
