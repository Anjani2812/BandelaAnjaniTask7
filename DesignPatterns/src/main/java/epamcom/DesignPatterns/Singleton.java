//Singleton
package epamcom.DesignPatterns;

public class Singleton {
	private static Singleton singleton_instance = null;
	public String s;
	private Singleton() {
		s = "implementing desgin patterns";
		
	}
	public static Singleton getInstance () {
		if(singleton_instance == null)
			singleton_instance = new Singleton();
		return singleton_instance;
	}

 
	   public static void main(String[] args) {
		  Singleton k = Singleton.getInstance();
		  k.s = (k.s).toUpperCase();
		  System.out.println(k.s);
		  k.s = (k.s).toLowerCase();
		  System.out.println(k.s);
	   }
}
	   

