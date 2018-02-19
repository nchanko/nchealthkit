import java.util.*;

public class HR {

	public void HR (){
		
		System.out.println("Let's get to the Heart Rate.\n Are you male or female? Type m or f");
Scanner Sex = new Scanner (System.in);
String sex =Sex.nextLine();


System.out.println("How old are you ?");
Scanner Age = new Scanner(System.in);
int age = Age.nextInt();


if (sex.equalsIgnoreCase("f")){
	
	int mxHR = 226- age;
	int tgHRl = (int)(mxHR*(50.0f/100.0f));
	int tgHRu = (int)(mxHR*(85.0f/100.0f));
	System.out.println("Maximum heart rate for you is "+mxHR);
	System.out.println("Your target heart rate should be between" +tgHRl+"and"+tgHRu);
	}
else if (sex.equalsIgnoreCase("m"))
	{	int mxHR = 220-age;
		int tgHRl = (int)(mxHR*(50.0f/100.0f));
		int tgHRu = (int)(mxHR*(85.0f/100.0f));
		System.out.println("Maximum heart rate for you is "+ mxHR);
		System.out.println("Your target heart rate should be between " +tgHRl+" and "+tgHRu);	
	}

else { System.out.println("Plz type your correct gender ");

};

	}
	
	public void currentHR(){

System.out.println("What is ur current Heart rate ?");
Scanner RestingHR= new Scanner (System.in);
int rhr = RestingHR.nextInt();

if (rhr>=60 && rhr<=100){
	
	System.out.println("Sounds good ! \n Your heartrate is within normal");
}
else if (rhr <60 ){
	
	System.out.println("Your heart rate is very slow. \n .You have bradycardia unless you are an athelete.");

}
else if (rhr >100){
	System.out.println("Your heart rate is very fast. \n .You have tachycardia.\n get some rest.");
	

}

else{
	System.out.println("Try again.  your input is not right.");
}

	};
}
