package restAPIProject7;

public class methodoverriding {
//method overriding

    System.out.println("human is eating");

	   }
	
	class Boy extends methodoverriding{
	   //Overriding method
	   public void eat(){
	      System.out.println("Boy is eating");
	   }
	   public static void main( String args[]) {
	      Boy obj = new Boy();
	      //This will call the child class version of eat()
	      obj.eat();
	   }
	}
	


