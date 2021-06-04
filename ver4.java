/* 
Author- nila
methods coder - 4th task 
 date:- 2021-06-02
 this code is for the user to enter the meeting details and gtting the  
 meeting details sorted out based on date and time 
 */
 //header files for array list and collection classes 
import java.util.ArrayList;
import java.util.Collections; 
import java.util.*;
public class MyProgram
{
    public static void main(String[] args)
    { // caling the function 
       MeetingDetails(); 
    }
        // creating method
       public static void MeetingDetails()
        { 
    
        // creating arrayy lists to store the data 
        //arraylist to store the date
        ArrayList<String> date= new ArrayList<String>();
        //arraylist to store the meeting information
        ArrayList<String>meetingdetail=new ArrayList<String >();
        //array list to store the location/room of the meeting 
        ArrayList<String>location=new ArrayList<String>();
        // creating a for loop to ask the user and storing the details of where 
        // and when the meeting is 
         for( int i=0;i<3; i++)
         {
              Scanner period= new Scanner (System.in);
             System.out.println("Enter title of the meeting: ");
             String title= period.nextLine();
             meetingdetail.add(title);
             System.out.println("Enter room number/location:");
             String where=  period.nextLine();
             location.add(where);
             System.out.println("Enter the date snd time in format:YYYY-MM-DD:hrs:min");
             String date1= period.nextLine();
             date.add(date1); 
             }
             // cloning an date array to get it's index of the 
             // orginal date before sorting them in order to retrive the 
             // meeting details. 
             ArrayList<String> datecopy=new ArrayList<String>(date);
             System.out.println("meeting details");
             // sorting the date and time of the meeting 
            Collections.sort(date);
            //displaying the date and time after sorting 
            System.out.println("********************************");
            System.out.println("the meeting details are:");
            System.out.println("********************************");
            // creating a forloop to display the meeting details 
           // ( title, date,time,location).
            for ( int v=0;v<3;v++)
            {
                
                
                String datecompare=date.get(v);
                System.out.println( "date is:"+date.get(v));
                int index=0;
                // since we sort the date , the details according to the date won't 
                // match , so for this problem , the code sorts the time and gives 
                //It's meeting details sorted as well according to the timings where they 
                // match.
                for(String item:datecopy)
                {
                    if(datecompare.equals(item))
                    {
                    index=datecopy.indexOf(item);
                        }
                    }
                    System.out.println("meeting title is :"+meetingdetail.get(index));
                    System.out.println("room number is:"+location.get(index));
        }
    }
} 