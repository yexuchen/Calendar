package Calender;

import java.util.ArrayList;
import java.util.Scanner;

public class util {
	
	 Scanner s = new Scanner(System.in);
	 Time t=new Time();
	 
	 
	 void begin(){
		String dateString="";
		System.out.println("\r\n--------------------------------");
		System.out.println("请输入你当前要查找的日期");
		System.out.print("年份");
		dateString=dateString+s.next();
		System.out.print("月份");
		int month=s.nextInt();
		dateString=month>10?dateString+month:dateString+"0"+month;
		System.out.print("日期");
		dateString=dateString+s.next();
		
		MyDate date=t.getDate(dateString);
		ArrayList<MyDate> dateList=t.getMonth(date.getYear(),date.getMonth());
		int beginWeek=dateList.get(0).getWeek();
		System.out.println("============"+date.getMonth()+"月日历============");
		print(beginWeek,date.getDay(),dateList.size());
		exit();
	 }
	
	 void isNowDate(){
		 	
			MyDate date=t.getDate("Now");
			ArrayList<MyDate> dateList=t.getMonth(date.getYear(),date.getMonth());
			int beginWeek=dateList.get(0).getWeek();
			System.out.println("老铁欢迎使用");
			System.out.println("现在是"+date.getYear()+"年"+date.getMonth()+"月"+date.getDay()+"日"
								+"星期"+(date.getWeek()-1));
			System.out.println("======================="+date.getMonth()+"月日历=======================");
			print(beginWeek,date.getDay(),dateList.size());

			begin();
		
	}
	
	 void  exit(){
		System.out.println("\r\n继续？是输入1;否输入0");
		if(!s.next().equals("0"))
			isNowDate();
	}
	 
	 
	 void print(int beginWeek,int attentionDay,int size){
		 String week="";
		 for(int i=0;i<7;i++){
			 switch (i) {
			case 0:
				week="星期日";
				break;
			case 1:
				week="星期一";
				break;
			case 2:
				week="星期二";
				break;
			case 3:
				week="星期三";
				break;
			case 4:
				week="星期四";
				break;
			case 5:
				week="星期五";
				break;
			case 6:
				week="星期六";
				break;
			default:
				break;
			}
			 System.out.print(" ");
			 System.out.print(week+"|");
		 }
		 
		 
		 int day=1;
		 System.out.println();
		 for(int i=0;i<size;i++){
			 if(i<beginWeek)
				 System.out.print("        ");
			 if(day>=10){
				 if(day == attentionDay)
					 System.out.print(day+"*     ");
				 else 
					 System.out.print(day+"      ");
			 }
			 else{
				 if(day == attentionDay)
					 System.out.print(" "+day+"*     ");
				 else 
					 System.out.print(" "+day+"      ");
			 }
			 if((day+1)%7==0)
				 System.out.println();
			 day++;
		 }
		 day=1;
	 }

}
