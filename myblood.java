import java.util.Scanner;


public class myblood {

	String childblood ;
	
	public String myblood(String c, String f, String m){
		
		
		
		String x = null;
		System.out.printf("Child is %s,Father is %s,Mother is %s.\n", c,f,m);
		
	if ((c.equalsIgnoreCase("A") ||c.equalsIgnoreCase("B") ||c.equalsIgnoreCase("O") ||c.equalsIgnoreCase("AB")) &&
			(f.equalsIgnoreCase("A") ||f.equalsIgnoreCase("B") ||f.equalsIgnoreCase("O") ||f.equalsIgnoreCase("AB"))&&
			(m.equalsIgnoreCase("A") ||m.equalsIgnoreCase("B") ||m.equalsIgnoreCase("O") ||m.equalsIgnoreCase("AB"))
		)
	{
		
		if (
			//Mother is A
			(c.equalsIgnoreCase("B") && m.equalsIgnoreCase("A") && (f.equalsIgnoreCase("B") ||f.equalsIgnoreCase("AB") ))
				||
			(c.equalsIgnoreCase("A") && m.equalsIgnoreCase("A") && (f.equalsIgnoreCase("A") ||f.equalsIgnoreCase("AB")||f.equalsIgnoreCase("B")||f.equalsIgnoreCase("O") ))
				
				||
			(c.equalsIgnoreCase("AB") && m.equalsIgnoreCase("A") && (f.equalsIgnoreCase("AB")||f.equalsIgnoreCase("B") ))
				||
			(c.equalsIgnoreCase("O") && m.equalsIgnoreCase("A") && (f.equalsIgnoreCase("A")||f.equalsIgnoreCase("B")||f.equalsIgnoreCase("O") ))
				||
				
				
			//Mother is B
			(c.equalsIgnoreCase("A") && m.equalsIgnoreCase("B") && (f.equalsIgnoreCase("A") ||f.equalsIgnoreCase("AB") ))
				||
			(c.equalsIgnoreCase("B") && m.equalsIgnoreCase("B") && (f.equalsIgnoreCase("A") ||f.equalsIgnoreCase("AB")||f.equalsIgnoreCase("B")||f.equalsIgnoreCase("O") ))
				
				||
			(c.equalsIgnoreCase("AB") && m.equalsIgnoreCase("B") && (f.equalsIgnoreCase("AB")||f.equalsIgnoreCase("A") ))
				||
			(c.equalsIgnoreCase("O") && m.equalsIgnoreCase("B") && (f.equalsIgnoreCase("A")||f.equalsIgnoreCase("B")||f.equalsIgnoreCase("O") ))
				||
				
				
			//Mother is AB
			(c.equalsIgnoreCase("A") && m.equalsIgnoreCase("AB") && (f.equalsIgnoreCase("A") ||f.equalsIgnoreCase("AB")||f.equalsIgnoreCase("B")||f.equalsIgnoreCase("O") ))
				||
			(c.equalsIgnoreCase("B") && m.equalsIgnoreCase("AB") && (f.equalsIgnoreCase("A") ||f.equalsIgnoreCase("AB")||f.equalsIgnoreCase("B")||f.equalsIgnoreCase("O") ))
				
				||
			(c.equalsIgnoreCase("AB") && m.equalsIgnoreCase("AB") && (f.equalsIgnoreCase("AB")||f.equalsIgnoreCase("A")||f.equalsIgnoreCase("B") ))
				
			
				||
				
				
			//Mother is O
			(c.equalsIgnoreCase("A") && m.equalsIgnoreCase("O") && (f.equalsIgnoreCase("A") ||f.equalsIgnoreCase("AB") ))
				||
			(c.equalsIgnoreCase("B") && m.equalsIgnoreCase("O") && (f.equalsIgnoreCase("B") ||f.equalsIgnoreCase("AB") ))
				
			
			
				||
			(c.equalsIgnoreCase("O") && m.equalsIgnoreCase("O") && (f.equalsIgnoreCase("A")||f.equalsIgnoreCase("B")||f.equalsIgnoreCase("O") ))
				
				){
			
			System.out.println("You are their child.");
					
		}
		
		
		else if(
			(c.equalsIgnoreCase("O") && m.equalsIgnoreCase("AB") && (f.equalsIgnoreCase("A")||f.equalsIgnoreCase("B")||f.equalsIgnoreCase("O") ))
				||
			(c.equalsIgnoreCase("AB") && m.equalsIgnoreCase("O") && (f.equalsIgnoreCase("AB")||f.equalsIgnoreCase("A")||f.equalsIgnoreCase("B") ))
				){
			
			System.out.println("I am sorry to say. You can't be their child");
		}
			
		
		
		else {
			
			System.out.println(" I am sorry to say, He is not your father ");
		};
	}
	
	else{
		
		System.out.println("Sorry . Plz input A , B , O or AB only.");
		
	}
	
	
	
		
		
	return x;
		
		
	}
}
