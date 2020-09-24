//Lesson Demo
import java.util.Scanner;
import java.lang.Math;
public class SubstringsV2 {
	public static void parta(){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the number of mintues: ");
		int minutes=scan.nextInt();
		if(minutes>0&&minutes<1440){
			int hour=minutes/60;
			minutes=minutes%60;
			System.out.print("You entered: ");
			if(hour==1){
				System.out.print("1 hour ");
			}else if(hour>1){
				System.out.print(hour+" hours ");
			}
			
			if(minutes==1){
				System.out.print("1 minute ");
			}else if(minutes>1){
				System.out.print(minutes+" minutes ");
			}
		}else{
			System.out.println("Number out ouf range");
		}
		scan.close();
	}
	public static void partb(){
		Scanner scan=new Scanner(System.in);
		System.out.print("first string: ");
		String string1=scan.nextLine();
		System.out.print("second string: ");
		String string2=scan.nextLine();
		System.out.print("thrid string: ");
		String string3=scan.nextLine();
		String min;
		String max;
		String inbetween;
		if(string1.compareTo(string2)<0){
			max=string1;
			min=string2;
		}else{
			max=string2;
			min=string1;
		}
		if(max.compareTo(string3)<0){
			if(string3.compareTo(min)<0){
				inbetween=string3;
			}else{
				inbetween=min;
				min=string3;
			}
		}else{
			inbetween=max;
			max=string3;
		}
		
		System.out.println("You entered "+max+", "+inbetween+", "+min);
		scan.close();	
	}
	public static void partc(){
		Scanner scan=new Scanner(System.in);
		System.out.print("temperature: ");
		int temp=scan.nextInt();
		String unit=scan.nextLine();
		if(unit.toLowerCase().contains("f")){
			temp=(int) Math.round((temp-32)*5.0/9.0);
		}
		if(temp<=0){
			System.out.println("at "+temp+"C, ice");
		}else if(temp>0&&temp<100){
			System.out.println("at "+temp+"C, water");
		}else{
			System.out.println("at "+temp+"C, steam");
		}
		
		scan.close();
	}

	public static void partd(){
		Scanner scan=new Scanner(System.in);
		System.out.print("household size: ");
		int size=scan.nextInt();
		System.out.print("total household income: ");
		int income=scan.nextInt();
		if(size==1&&income<88200){
			System.out.println("A "+size+"-person household with income of "+income+" is eligible for rental relief");
		}else if(size==2&&income<100800){
			System.out.println("A "+size+"-person household with income of "+income+" is eligible for rental relief");
		}else if(size==3&&income<113400){
			System.out.println("A "+size+"-person household with income of "+income+" is eligible for rental relief");
		}else if(size==4&&income<125900){
			System.out.println("A "+size+"-person household with income of "+income+" is eligible for rental relief");
		}else if(size==5&&income<136000){
			System.out.println("A "+size+"-person household with income of "+income+" is eligible for rental relief");
		}else if(size==6&&income<146100){
			System.out.println("A "+size+"-person household with income of "+income+" is eligible for rental relief");
		}else if(size==7&&income<156200){
			System.out.println("A "+size+"-person household with income of "+income+" is eligible for rental relief");
		}else if(size==8&&income<166200){
			System.out.println("A "+size+"-person household with income of "+income+" is eligible for rental relief");
		}else if(size==9&&income<176300){
			System.out.println("A "+size+"-person household with income of "+income+" is eligible for rental relief");
		}else if(size>=10&&income<186400){
			System.out.println("A "+size+"-person household with income of "+income+" is eligible for rental relief");
		}else {
			System.out.println("A "+size+"-person household with income of "+income+" is not eligible for rental relief");
			
		}
		scan.close();
	}
	public static void switchvsif(){
		Scanner scan=new Scanner(System.in);
		int input=scan.nextInt();
		scan.close();
		if(input==1){
			System.out.println("one");	
		}else if(input==2){
			System.out.println("two");	
		}else if(input==3){
			System.out.println("three");	
		}else if(input==4){
			System.out.println("four");	
		}else if(input==5){
			System.out.println("five");	
		}else if(input==6){
			System.out.println("six");	
		}else if(input==7){
			System.out.println("seven");	
		}else if(input==8){
			System.out.println("eight");	
		}else if(input==9){
			System.out.println("nine");	
		}else if(input==10){
			System.out.println("ten");	
		}else {
			System.out.println("Number not supported");
		}
		switch(input){
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;
		case 5:
			System.out.println("five");
			break;
		case 6:
			System.out.println("six");
			break;
		case 7:
			System.out.println("seven");
			break;
		case 8:
			System.out.println("eight");
			break;
		case 9:
			System.out.println("nine");
			break;
		case 10:
			System.out.println("ten");
			break;
		default:
				System.out.println("Number not supported");
		}	
	}
	enum Days {MONDAY,TUESDAY,WENDSDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int input=scan.nextInt();
		
		Days day=Days.valueOf("MONDAY");
		
		System.out.println(day);
		switch(input){
		case 1:
			day=Days.MONDAY;
			break;
		case 2:
			day=Days.TUESDAY;
			break;
		case 3:
			day=Days.WENDSDAY;
			break;
		case 4:
			day=Days.THURSDAY;
			break;
		case 5:
			day=Days.FRIDAY;
			break;
		case 6:
			day=Days.SATURDAY;
			break;
		case 7:
			day=Days.SUNDAY;
			break;
		}
		//1== monday
		//2== tuesday
		//3== wendsday
		//etc
		System.out.println(input);
		System.out.println(day);
		//if(input==1){//Is day 1 monday? or is day 1 Sunday?
		if(day==Days.MONDAY){
			System.out.println("Its a monday, uhg");
		}
		switch(day){
		case MONDAY:
			System.out.println("Its a monday, uhg");
			break;
		case TUESDAY:
			System.out.println("Its A Tuesday, you have lab");
			break;
		case WENDSDAY:
			System.out.println("It is a wendsday, office hours");
			break;
		case THURSDAY:
			System.out.println("Its a Thrusday, you have lab");
			break;
		case FRIDAY:
			System.out.println("Its Friday, assignment due at noon");
			break;
		case SATURDAY:
			System.out.println("Its Saturday, sleep");
			break;
		case SUNDAY:
			System.out.println("Its Sunday, class tomorrow");
			break;
		}
		String line=scan.nextLine();
		int index=line.indexOf("ss");
		index=line.indexOf("ss",index+1);
		System.out.println(index);
		scan.close();
	}

}
