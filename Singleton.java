
public class Singleton {
	
	private static Singleton obj=null;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if (obj==null) {
			obj=new Singleton();
			System.out.println("initializing");
		}
		
		return obj;
		
		
	}
	public static void main(String[] args) {
		
		Singleton x = Singleton.getInstance(); 
		  
        // instantiating Singleton class with variable y 
        Singleton y = Singleton.getInstance(); 
  
        Singleton z = Singleton.getInstance();
        
        System.out.println(x.hashCode()); 
        System.out.println(y.hashCode()); 
        System.out.println(z.hashCode());
  
		

	}

}
