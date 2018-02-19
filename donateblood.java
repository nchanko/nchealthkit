import java.util.Scanner;


public class donateblood extends myblood{

	
	String y;
	

	
	
	public String  donormatchmyb(String yb,String rb,String db){
		
			
		boolean ybApd=(yb.equalsIgnoreCase("A+"))  && (db.equalsIgnoreCase("A+")||db.equalsIgnoreCase("O+")|| db.equalsIgnoreCase("A-")||db.equalsIgnoreCase("O-"));
		boolean ybBpd=(yb.equalsIgnoreCase("B+"))  && ( db.equalsIgnoreCase("B+")||db.equalsIgnoreCase("B-")||db.equalsIgnoreCase("O+")||db.contains("O-"));
		boolean ybOpd=(yb.equalsIgnoreCase("O+")) && (db.equalsIgnoreCase("O+")|| db.equalsIgnoreCase("O-"));
		boolean ybABpd=(yb.equalsIgnoreCase("AB+")) && (db.equalsIgnoreCase("A+")|| db.equalsIgnoreCase("A-")|| db.equalsIgnoreCase("B+")|| db.equalsIgnoreCase("B-")||
				db.equalsIgnoreCase("O+")|| db.equalsIgnoreCase("O-")||db.equalsIgnoreCase("AB+")||db.equalsIgnoreCase("AB-"));
		boolean ybAmd= (yb.equalsIgnoreCase("A-"))  &&( db.equalsIgnoreCase("A-")|| db.equalsIgnoreCase("O-"));
		boolean ybBmd=(yb.equalsIgnoreCase("B-"))  && (db.equalsIgnoreCase("B-") ||db.equalsIgnoreCase("O-"));
		boolean ybOmd=(yb.equalsIgnoreCase("O-")) && (db.equalsIgnoreCase("O-"));
		boolean ybABmd=(yb.equalsIgnoreCase("AB-")) && (db.equalsIgnoreCase("AB-")||db.contains("A-")||db.equalsIgnoreCase("B-")||db.equalsIgnoreCase("O-"));
	
		boolean	ybApr =(yb.equalsIgnoreCase("A+"))  && (rb.equalsIgnoreCase("A+") ||rb.equalsIgnoreCase("AB+"));
		boolean	ybOpr =(yb.equalsIgnoreCase("O+")) && (rb.equalsIgnoreCase("A+") ||rb.equalsIgnoreCase("AB+") ||rb.equalsIgnoreCase("B+") ||rb.equalsIgnoreCase("O+"));
		boolean	ybBpr =(yb.equalsIgnoreCase("B+")) && (rb.equalsIgnoreCase("B+") ||rb.equalsIgnoreCase("AB+"));
		boolean	ybABpr =(yb.equalsIgnoreCase("AB+")) && (rb.equalsIgnoreCase("AB+"));
		boolean	ybAmr =	(yb.equalsIgnoreCase("A-"))  && (rb.equalsIgnoreCase("A+") ||rb.equalsIgnoreCase("A-") ||rb.equalsIgnoreCase("AB+") ||rb.equalsIgnoreCase("AB-"));
		boolean	ybOmr =	(yb.equalsIgnoreCase("O-"))  && (rb.equalsIgnoreCase("A+")|| rb.equalsIgnoreCase("A-")|| rb.equalsIgnoreCase("B+") || rb.equalsIgnoreCase("B-")||
		rb.equalsIgnoreCase("O+")|| rb.equalsIgnoreCase("O-")||rb.equalsIgnoreCase("AB+")|| rb.equalsIgnoreCase("AB-"));
		boolean	ybBmr =	(yb.equalsIgnoreCase("B-")) && (rb.equalsIgnoreCase("B+") ||rb.equalsIgnoreCase("B-") ||rb.equalsIgnoreCase("AB+") ||rb.equalsIgnoreCase("AB-"));
		boolean	ybABmr =(yb.equalsIgnoreCase("AB-")) && (rb.equalsIgnoreCase("AB+")||rb.equalsIgnoreCase("AB-"));
		
		
		
		boolean bloodlist = (yb.equalsIgnoreCase("A+")|| yb.equalsIgnoreCase("B+")|| yb.equalsIgnoreCase("AB+")|| yb.equalsIgnoreCase("O+")||
		yb.equalsIgnoreCase("A-")|| yb.equalsIgnoreCase("B-")|| yb.equalsIgnoreCase("AB-")|| yb.equalsIgnoreCase("O-")) &&
		(db.equalsIgnoreCase("A+")|| db.equalsIgnoreCase("B+")|| db.equalsIgnoreCase("AB+")|| db.equalsIgnoreCase("O+")||
		db.equalsIgnoreCase("A-")|| db.equalsIgnoreCase("B-")|| db.equalsIgnoreCase("AB-")|| db.equalsIgnoreCase("O-")||db.equalsIgnoreCase("+")||
		db.equalsIgnoreCase("A")||db.equalsIgnoreCase("B")||db.equalsIgnoreCase("AB"))&&
		(rb.equalsIgnoreCase("A+")|| rb.equalsIgnoreCase("B+")|| rb.equalsIgnoreCase("AB+")|| rb.equalsIgnoreCase("O+")||
		rb.equalsIgnoreCase("A-")|| rb.equalsIgnoreCase("B-")|| rb.equalsIgnoreCase("AB-")|| rb.equalsIgnoreCase("O-")||rb.equalsIgnoreCase("-")||
		rb.equalsIgnoreCase("A")||rb.equalsIgnoreCase("B")||rb.equalsIgnoreCase("AB")); 
		
		
		
		String okd = "your blood and donor blood is compatible";
		String okr ="your blood and receipent blood is compatible";
		
		
		if (bloodlist){
		
		
		
		if (ybApd){
			System.out.println(okd);
		}
		else if (ybOpd){
			System.out.println(okd);
		}
		
		else if (ybBpd){
			System.out.println(okd);
		}
		
		else if (ybABpd){
			System.out.println(okd);
		}
		
		else if (ybAmd){
			System.out.println(okd);
		}
		
		else if (ybBmd){
			System.out.println(okd);
		}
		else if (ybOmd){
			System.out.println(okd);
		}
		else if (ybABmd){
			System.out.println(okd);
		}
		
		else {
			
			System.out.println("Your blood and donor blood is incompatible");
			
		}
		
		if (ybApr){
			System.out.println(okr);
		}
		else if (ybOpr){
			System.out.println(okr);
		}
		
		else if (ybBpr){
			System.out.println(okr);
		}
		
		else if (ybABpr){
			System.out.println(okr);
		}
		
		else if (ybAmr){
			System.out.println(okr);
		}
		
		else if (ybBmr){
			System.out.println(okr);
		}
		else if (ybOmr){
			System.out.println(okr);
		}
		else if (ybABmr){
			System.out.println(okr);
		}
		
		else {
			
			System.out.println("Your blood and receipent blood is incompatible");
			
		}
		}
		
		
		else {System.out.println (" Enter correct blood type. Plz Use A+, B+,AB+,O+ orA-, B-,AB-,O- value "); 
		} 
			
	return y;
	}}	

