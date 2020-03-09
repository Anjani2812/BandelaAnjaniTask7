//Proxypattern
package epamcom.DesignPatterns;

public class Client {
	 public static void main (String[] args) 
	    { 
	        Website internet = new Proxy(); 
	        try
	        { 
	            internet.connectTo("Welcome epam.org"); 
	            internet.connectTo("xyz.com"); 
	        } 
	        catch (Exception e) 
	        { 
	            System.out.println(e.getMessage()); 
	        } 
	    } 
	} 


