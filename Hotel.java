import java.util.ArrayList;
import java.util.Scanner;

public class Hotel {

	ArrayList <Guest> guests; 
	ArrayList <Rooms> room;
	
	Guest gobj = new Guest();
	int totalrooms=1;

	public Hotel() 
	{
		guests = new ArrayList <Guest>();
		room =  new ArrayList <Rooms>();
	}
	
	public void addroom()
	{
		room.add(new Rooms (totalrooms) );
		totalrooms++;
	}
	
	public void searchguest( int roomnum1 )
	{	
		int i=0;
		while(i<guests.size())
		{
			if(guests.get(i).roomnum==roomnum1)
			{
				
				System.out.println("Yes the Guest " + guests.get(i).gname + " is staying at the hotel") ;
			}
			i++ ;
		}
	}
	
	public void getavailableroom()
	{
		int o=0;
		while(o<room.size() )
		{
			if( room.get(o).roomavailable ==true  )
			{
				System.out.println( "Room Number " +room.get(o).roomnum + " is available.\n" );
			}
			o++;
		}
	}

	public void bookroom(String name)
	{
		
		Guest obj= new Guest();
		obj.gname=name;
		
		int getnumber=0;
		int o=0;
		while(o<room.size())
		{
			if( room.get(o).roomavailable ==true)
			{
				getnumber=room.get(o).roomnum;
				break;
			}
			o++;
			
		}	
		
	}
	
	public static void main(String[] args) 
	{
		
		Hotel hobj = new Hotel();
		
	
Scanner scanobj = new Scanner(System.in);  // Creating a Scanner object once
			int maininput =0;
			int caseinput=0;

	    do {
	    	System.out.println("Choose from the Options given below\n"
				     + "1.Add new rooms\n"
					 + "2.Get available rooms\n"
					 + "3.Search Guests\n"
					 + "4.Book room\n"
					 + "5.Exit\n");
	    	
	    	maininput = scanobj.nextInt();  // Read main user input
	    
	    	switch(maininput)
	    	{
	    	
	    	case 1:	//ADD ROOM
	    		
	    		hobj.addroom();
	    		System.out.println("New room added");
	    		break;
	    		
	    	case 2 : // get available room
	    		hobj.getavailableroom();
	  
	    	break;
	    	
	    	case 3 : // search Guests
	    		System.out.println("Enter room number ");
    			int roomn = scanobj.nextInt();
	    		hobj.searchguest(roomn);
	  
	    	break;
	    	
	    	case 4 : // Book room
	    		System.out.println("Enter your name ");
    			String name = scanobj.nextLine();
	    		hobj.bookroom(name);
	  
	    	break;
	    		
	    	default:
	    		System.out.println("Enter Correct Input ");
	    		break;
	    	}
	    }while( maininput !=5);	
	}
}
