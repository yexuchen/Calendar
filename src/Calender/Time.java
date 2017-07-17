package Calender;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Time {
	//获取当前时间
	public static String getNowTime()
	{
		String date="";
		System.out.println(" ");
		try {
		    SimpleDateFormat   formatter=new   SimpleDateFormat   ("yyyy-MM-dd HH:mm");       
		    Date curDate=new Date(System.currentTimeMillis());//获取当前时间       
		    date=formatter.format(curDate); 
		} catch (Exception e) {
			// TODO: handle exception
		}
		return date;
	}
	
	//获取指定月份的日期信息
	public MyDate getDate(String dateCode){
		 Calendar calender=Calendar.getInstance();
		 if(!"Now".equals(dateCode)){
			try {
				 SimpleDateFormat dateform=new SimpleDateFormat("yyyyMMdd");
				 Date dateString =dateform.parse(dateCode);
				 calender.setTime(dateString);
			} catch (ParseException e) {
				e.printStackTrace();
			} 
		 }
		 int year=calender.get(Calendar.YEAR);
		 int month=calender.get(Calendar.MONTH)+1;
		 int day=calender.get(Calendar.DAY_OF_MONTH);
		 int week=calender.get(Calendar.DAY_OF_WEEK);
		 return new MyDate(year, month, day, week);	 
	 }
	
	
	//获取指定月份的具体信息
	 public ArrayList<MyDate> getMonth(int year,int month){
		 String dateCode="";
		 dateCode=month>10?year+""+month:year+"0"+month;
		 Calendar calender=Calendar.getInstance();
		 ArrayList<MyDate> dateList=new ArrayList<MyDate>();
		 int day=1;
		 int temp=1;
		 while(day!=32&&temp==1){
				try {
					 SimpleDateFormat dateform=new SimpleDateFormat("yyyyMMdd");
					 Date dateString=dateform.parse(dateCode+day);
					 calender.setTime(dateString);
					 int Month=calender.get(Calendar.MONTH)+1;
				     if(Month!=month)
				    	 break;
				     
				     int week=calender.get(Calendar.DAY_OF_WEEK)-1;
				     if(week<0)
				    	 week=0;
				     
				     MyDate date=new MyDate(year, Month, day, week);
					 dateList.add(date);
					 day++;
				} catch (ParseException e) {
					e.printStackTrace();
				} 
		 }

		 return dateList;
	 }
	
	
}
