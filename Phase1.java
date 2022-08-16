package Phase1_Project;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Phase1 {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
      displayProjectDetails();
      int choice =-1;
      Scanner sc=new Scanner(System.in);
      do 
      {
    	  System.out.println("Enter your choice from main option");
    	  choice = sc.nextInt();
    	  switch(choice)
    	  {
    	case 1:getAllfiles();
  		break;
    	case 2:System.out.println("chose option to perform create file,deletefiles and searchfiles");
    	int option=sc.nextInt();
    	if(option==1)
    	{
    		createfile();
    	}
    	else if(option==2)
    	{
    		deletefiles();
    	}
    	else if(option==3)
    	{
    		searchfiles();
    	}
    	else
    	{
    		System.out.println("Operation Complete wrong choice");
    	}
    	//case 2:createfile();	
  		break;
  		case 3:System.exit(0);
  		break;
  	    default:System.out.println("invalid option");
  	    break;

    	  }
    	  
      }while(choice!=0);
      
	}

	private static void searchfiles() throws IOException {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the name of file you want to search");
		String search=obj.nextLine();
		File f=new File("C:\\Users\\Satyam Shubham\\eclipse-workspace\\File Handling\\src\\Phase1_Project\\" +search);
		 if( f.exists())
		 {
			System.out.println("File is available"); 
		 }
		 else 
			 System.out.println("File is not available");
	 }

		
		
		
	

	private static void deletefiles() throws IOException {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the name of file you want to delete");
		String delete=obj.nextLine();
		 File f=new File("C:\\Users\\Satyam Shubham\\eclipse-workspace\\File Handling\\src\\Phase1_Project\\" +delete);
		 if(f.delete()) 
		 {
			System.out.println("File deleted successfully"); 
		 }
		 else
		 {
			 System.out.println("Delete not successfull");
		 }
		
		
	}

	private static void createfile() throws IOException {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the name of file");
	    String p=obj.nextLine();
	    File f=new File("C:\\Users\\Satyam Shubham\\eclipse-workspace\\File Handling\\src\\Phase1_Project\\" +p);
	    try {

		      // create a new file with name specified
		      // by the file object
		      boolean value = f.createNewFile();
		      if (value) {
		        System.out.println("New Java File is created.");
		      }
		      else {
		        System.out.println("The file already exists.");
		      }
		    }
		    catch(Exception e) {
		      e.getStackTrace();
		    }
		  }
		
	

	private static void getAllfiles() throws IOException {
		// TODO Auto-generated method stub
		File f=new File("C:\\Users\\Satyam Shubham\\eclipse-workspace\\File Handling\\src\\Phase1_Project");
		String[] listofFiles= f.list();
		for(String file : listofFiles) {
			
			System.out.println(file);
		}
		
	}

	
public static void displayProjectDetails()
{
	System.out.println("Welcome to handling file in a new way");
	System.out.println("Developer name:- Satyam Shubham");
	System.out.println("Please chose from below operation to execute operation you want");
	System.out.println("Option1:-Displaying all the files");
	System.out.println("Option2:-chose option to perform create file,deletefiles and searchfiles");
	System.out.println("Option3:-Exit the system");
	
	
}
	
	
}
