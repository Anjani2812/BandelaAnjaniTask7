//prototype
package epamcom.DesignPatterns;
import java.util.HashMap; 
import java.util.Map; 


	abstract class Plants implements Cloneable 
	{ 
	      
	    protected String PlantName; 
	       
	    abstract void addPlant(); 
	       
	    public Object clone() 
	    { 
	        Object clone = null; 
	        try 
	        { 
	            clone = super.clone(); 
	        }  
	        catch (CloneNotSupportedException e)  
	        { 
	            e.printStackTrace(); 
	        } 
	        return clone; 
	    } 
	} 
	  
	class Breed extends Plants 
	{ 
	    public Breed()  
	    { 
	        this.PlantName = "Jasmine"; 
	    } 
	   
	    @Override
	    void addPlant()  
	    { 
	        System.out.println("Jasmine is added"); 
	    } 
	      
	} 
	  
	class Flower extends Plants{ 
	   
	    public Flower() 
	    { 
	        this.PlantName = "Lotus"; 
	    } 
	   
	    @Override
	    void addPlant()  
	    { 
	        System.out.println("Lotus is added"); 
	    } 
	} 
	   
	class Florist { 
	   
	    private static Map<String, Plants> plantMap = new HashMap<String, Plants>();  
	       
	    static 
	    { 
	        plantMap.put("Jasmine", new Breed()); 
	        plantMap.put("Lotus", new Flower()); 
	    } 
	       
	    public static Plants getPlant(String PlantName) 
	    { 
	        return (Plants) plantMap.get(PlantName).clone(); 
	    } 
	} 
	  
	  
	// Driver class 
	class Prototype 
	{ 
	    public static void main (String[] args) 
	    { 
	        Florist.getPlant("Jasmine").addPlant(); 
	        Florist.getPlant("Lotus").addPlant(); 
	        Florist.getPlant("Jasmine").addPlant(); 
	        Florist.getPlant("Lotus").addPlant(); 
	    } 
	} 


