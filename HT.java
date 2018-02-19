import java.util.Scanner;

public class HT {
public void BP (){

//System.out.println("Enter your Systolic Blood pressure ");
	System.out.println("အပေါ်သွေးကဘယ်လောက်လဲ ");

Scanner systolicbp = new Scanner(System.in);
int sbp = systolicbp.nextInt();
//System.out.println("Enter your Diastolic Blood pressure ");
System.out.println("အောက်သွေးလေးကောပြောပါဦး ");

Scanner diasotlicbp = new Scanner(System.in);
int dbp = diasotlicbp.nextInt();
while (sbp>dbp){

if ( sbp==120 && dbp==80 ) {
//System.out.println("normal blood pressure");
System.out.println("အင်း. ပုံမှန် သွေးပေါင်ချိန်ထဲမှာပါပဲ ");

break;}
else if ( 200<= sbp || 110<=dbp)
//{System.out.println("EMERGENCY ! GO TO HOSPITAL! NOW! ");
{System.out.println("အရေးပေါ်ဗျို့... ဆေးရုံကိုသာမြန်မြန်ပြေးတော့ ");

break
;}
else if ( (160<=sbp && 199>=sbp) || (100<=dbp))
{System.out.println("You have stage II Hypertension");
break
;}
else if ( (140<=sbp && sbp<=159) || 90<=dbp && 99>=dbp)
{System.out.println("You have stage I Hypertension");
break
;}
else if ( 120<sbp && sbp<=139 || 80<dbp && 89>=dbp
)
{
// System.out.println("you have prehypertension");
	System.out.println("ခင်ဗျား သွေးတိုးဖြစ်ခါနီးပြီ ။ ဂရုစိုက်ဗျ ");
// System.out.println("You need to see your doctor for futher treatment");
System.out.println("ဆရာဝန် သွားပြတာ တော့ ကောင်းလိမ့်မယ်  ");
break;
}
else if ( (90<=sbp && 119>=sbp) || (60<=dbp && 79>=dbp))
// { System.out.println("Your blood pressure is slightly low .. Take some rest. ");
{ System.out.println(" ခင်ဗျား သွေးပေါင် နည်းနည်းကျနေတယ်။ ခဏအနားယူလိုက်ဦး  ");

break
;}
else if ( (90>sbp && 70<=sbp) || (61>=dbp && 10<=dbp))
// {System.out.println("Hypotension.. ");
{System.out.println(" သွေးပေါင်ကျနေတယ် ");

break
;}


else if ((70>sbp ) || (0<= dbp && 30>=dbp))
// {System.out.println("You are in shock");
{System.out.println("ခင်ဗျား ရှော့ဖြစ်နေပြီ.. အသက်အန္တရာယ်ရှိတယ် ");

break;}


else
{ System.out.println("You are in SHOCK");
break
;
}
} 
if (sbp<=dbp){System.out.println(
		//"Systolic Blood Pressure must be greater than Diastolic Blood Pressure \n"+ "Plz Measure it again !"
				"အပေါ်သွေးက အောက်သွေးထက် အမြဲ များရမယ်လေ၊ \nခင်ဗျားတိုင်းတာမှားနေပြီထင်တယ်၊\n ပြန်တိုင်းပါဦး  "
);
}
}}