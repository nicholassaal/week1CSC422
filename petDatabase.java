package petDatabase;


import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;


public class petDatabase {
	
	static ArrayList<String> petData = new ArrayList<String>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
    
		
		int chosenNumber=0;
		
		  //Title
	     System.out.println("Pet Database Program \n");
	    //creating the scanner object
	     Scanner myObj = new Scanner(System.in);
	    
	       
	    while (chosenNumber != 7) {
                //Calling method to display menu options    
                displayMenu();
	       
                //Taking users input to choose an option
                chosenNumber = myObj.nextInt();
	  
	    
                //Switch statement for handling users request from the main menu
                switch (chosenNumber) {
                  case 1:
                          viewAllPets();
                          System.out.print("Your Choice: "+ chosenNumber +"\n");
                    break;

                  case 2:
                      addPets();
                     System.out.print("Your Choice: "+ chosenNumber +"\n");
                    break; 

                  case 3:
                      updatePet();
                     System.out.print("Your Choice: "+ chosenNumber +"\n");
                    break;

                  case 4:
                      removePet();
                      System.out.print("Your Choice: "+ chosenNumber +"\n");
                    break;

                  case 5:
                      searchName();
                     System.out.print("Your Choice: "+ chosenNumber +"\n");
                     break;

                  case 6:
                      searchAge();
                     System.out.print("Your Choice: "+ chosenNumber +"\n");
                     break;

                  case 7:
                     System.out.println("your Choice: "+ chosenNumber);
                     System.out.println("Goodbye!");
                     break;
                    }//end of switch

                //creating array list 
	
	    
	

	      
	         }//end of while loop
	  
	  
	}//end of main
	 //method for adding pets
    static void addPets (){
        
    
            Scanner input = new Scanner(System.in);
           
            boolean check = true;
        do {
    	   System.out.print("add pet (name, age): ");
                   String strPetData = input.nextLine();
                   if(strPetData.equals("done")){
                       check = false;
                   }
                   else{
                        petData.add(strPetData); 
                   }   
        }
        while(check);	
        
    }
   
	
	//Method for displaying the option menu
	        static void displayMenu() {
	            System.out.println("What would you like to do?");
	            System.out.println("1) View all pets");
	            System.out.println("2) Add more pets");
	            System.out.println("3) Update an existing pet");
	            System.out.println("4) Remove an existing pet");
	            System.out.println("5) Search pets by name");
	            System.out.println("6) Search pets by age");
	            System.out.println("7) Exit program");
	  }
	        //method for viewing all pets
	        static void viewAllPets(){
	        System.out.printf("+--------------------------------------+ \n");
	        System.out.printf("+--ID----------NAME------------AGE-----+ \n");
	        System.out.printf("+--------------------------------------+ \n");
	        System.out.print(petData + "\n");
	        System.out.printf("+--------------------------------------+ \n");
	        }
	       
	        
	        
	        
	       
	        //method for updating pet
	        static void updatePet(){
	        	Scanner input = new Scanner(System.in);
	        	
	       	 	//inputs for updating information in the array list
	       	 	System.out.print("Enter the pet ID you can to \n");
	        	int idChosen = input.nextInt();
	        	
	        	 System.out.print("Enter new name and new age: \n");
	        	 String nameChange = input.nextLine();
	        	 nameChange = input.nextLine();
	        
	       
	        petData.set(idChosen,nameChange);
	        System.out.print(petData);
	        
	         }
	       
	        //method for removing pet
	        static void removePet(){
	        	Scanner input = new Scanner(System.in);
	        	//input for removing pets from the array list
	        	System.out.print("Enter the pet ID to remove: \n");
	        	int removedPet = input.nextInt();
	        	
	        	petData.remove(removedPet);
	        	System.out.print(petData);
	        	
	         }
	        
	        //method for searching pets name
	        static void searchName(){
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter a name to search: \n");
        	 String nameSearch = input.nextLine();
	        //creating a new array list for showing the selected name in the list
        	 	ArrayList<String> nameArray = (ArrayList<String>) petData.stream().filter(it -> it.contains(nameSearch)).collect(Collectors.toList());

	        	System.out.println(nameArray);
	             
	         }
	        
	        //method for searching pets age
	        static void searchAge(){
	        	 Scanner input = new Scanner(System.in);
	 	        System.out.print("Enter a age to search: \n");
	         	 String ageSearch = input.nextLine();
	             //creating a new array list for showing the selected name in the list
	         	 	ArrayList<String> ageArray = (ArrayList<String>) petData.stream().filter(it -> it.contains(ageSearch)).collect(Collectors.toList());

	 	        	System.out.println(ageArray);
	         }
	    
	       
	}//end of program

