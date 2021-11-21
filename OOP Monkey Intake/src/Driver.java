	//Adrianne Perrodin
	//04-18-2021


import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
	

	
	// ArrayList for dogs
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
   
    // ArrayList for monkeys
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    
    // main
    public static void main(String[] args) {
    	
    	// Created Scanner Object
    	Scanner scanner = new Scanner(System.in);
    	
    	// initial lists
        initializeDogList();
        initializeMonkeyList();
        

        
        // menu
     	displayMenu();
     	String menuChoice = scanner.nextLine();
     	

        // while loop that displays the menu
        while(!menuChoice.equalsIgnoreCase("q")) {       
	        try {	
	        	switch(menuChoice) {
		        	case "1":
		        		intakeNewDog(scanner);
		        		break;
		        	case "2":
		        		intakeNewMonkey(scanner);
		        		break;
		        	case "3":
		        		reserveAnimal();
		        		break;
		        	case "4":
		        		printAnimals("dog");
		        		break;
		        	case "5":
		        		printAnimals("monkey");
		        		break;
		        	case "6":
		        		printAnimals("available");
		        		break;
		        	case "q" :
		        		break;
		        	default:
		        		throw new Exception("Invalid Entry. Please Try Again.");
	        	}
	        }
	        catch (Exception e) {
	        	System.out.println(e.getMessage());
	        }
	        
	        displayMenu();
	        menuChoice = scanner.nextLine();
	        
        }
        scanner.close();
        
        return;
        
    }
    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "korea", "intake", false, "korea");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "united States", "Phase I", false, "united states");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "canada", "in service", true, "canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    public static void initializeMonkeyList() {
    	Monkey monkey1 = new Monkey("Pie", "monkey", "female", "4", "44", "07-17-1988", "Korea", "in service", false, "korea", "6.7", "1.5", "4.6", "crazy");
    	
    	monkeyList.add(monkey1);
    }


    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog(Scanner scanner) {
    	Dog dogObject = new Dog();
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }
        // get user input
        System.out.println("What is the breed?");
        String breed = scanner.nextLine();
        System.out.println("What is the gender?");
        String gender = scanner.nextLine();
        System.out.println("What is the age?");
        String age = scanner.nextLine();
        System.out.println("What is the weight?");
        String weight = scanner.nextLine();
        System.out.println("What is the acquisition date?");
        String acquisitionDate = scanner.nextLine();
        System.out.println("What is the acquisition country?");
        String acquisitionCountry = scanner.nextLine();
        System.out.println("What is the training status?");
        String trainingStatus = scanner.nextLine();
        boolean reserved = false;
        System.out.println("What is the service country?");
        String inServiceCountry = scanner.nextLine();
        
        // send input to setters
        dogObject.setName(name);
        dogObject.setBreed(breed);;
        dogObject.setGender(gender);
        dogObject.setAge(age);
        dogObject.setWeight(weight);
        dogObject.setAcquisitionDate(acquisitionDate);
        dogObject.setAcquisitionLocation(acquisitionCountry);
        dogObject.setTrainingStatus(trainingStatus);
        dogObject.setReserved(reserved);
        dogObject.setInServiceCountry(inServiceCountry);
        
        // add new monkey to array list
        dogList.add(dogObject);        
        
        } 
      
        // Complete intakeNewMonkey
		// Instantiate and add the new monkey to the appropriate list
        // For the project submission you must also  validate the input
		// to make sure the monkey doesn't already exist and the species type is allowed
    
       public static void intakeNewMonkey(Scanner scanner) {
  
          Monkey monkeyObject = new Monkey();
          
          System.out.println("What is the Monkeys's Name?");
          String name = scanner.nextLine();
          
          // validation check if monkey exist already
          for(Monkey monkey: monkeyList) {
              if(monkey.getName().equalsIgnoreCase(name)) {
                  System.out.println("\n\nThis monkey is already in our system\n\n");
                  return; //returns to menu
              }
          }
          // get user input
          System.out.println("What is the species?");
          
          // check for species type
          String species = scanner.nextLine();
          species = species.toLowerCase();
          	if (species != "capuchin" || species != "geunon" || species != "macaque" || species != "marmoset" 
          			|| species != "squirrel monkey" || species != "tamarin") {
          		System.out.println("Species not allowed");
          		return;
          	}
          System.out.println("What is the gender?");
          String gender = scanner.nextLine();
          System.out.println("What is the age?");
          String age = scanner.nextLine();
          System.out.println("What is the animal type?");
          String animalType = scanner.nextLine();
          System.out.println("What is the weight?");
          String weight = scanner.nextLine();
          System.out.println("What is the acquisition date?");
          String acquisitionDate = scanner.nextLine();
          System.out.println("What is the acquisition country?");
          String acquisitionCountry = scanner.nextLine();
          System.out.println("What is the training status?");
          String trainingStatus = scanner.nextLine();
          boolean reserved = false;
          System.out.println("What is the service country?");
          String inServiceCountry = scanner.nextLine();
          System.out.println("What is tail length");
          String tailLength = scanner.nextLine();
          System.out.println("What is the  height?");
          String height = scanner.nextLine();
          System.out.println("What is the body length?");
          String bodyLength = scanner.nextLine();

          
          // send input to setters
          monkeyObject.setTailLength(tailLength);
          monkeyObject.setAnimalType(animalType);
          monkeyObject.setHeight(height);
          monkeyObject.setBodyLength(bodyLength);
          monkeyObject.setSpecies(species);
          monkeyObject.setName(name);
          monkeyObject.setGender(gender);
          monkeyObject.setAge(age);
          monkeyObject.setWeight(weight);
          monkeyObject.setAcquisitionDate(acquisitionDate);
          monkeyObject.setAcquisitionLocation(acquisitionCountry);
          monkeyObject.setTrainingStatus(trainingStatus);
          monkeyObject.setReserved(reserved);
          monkeyObject.setInServiceCountry(inServiceCountry);
          
          // add new monkey to array list
          monkeyList.add(monkeyObject);        
          
          } 
          
       

       // reserves animal
        public static void reserveAnimal() {
        	Scanner scnr = new Scanner(System.in);
     
        	System.out.println("Input animal type.");
            String reserveType = scnr.nextLine();
         
            reserveType = reserveType.toLowerCase();
       
            System.out.println("Input animal country.");
            String reserveCountry = scnr.nextLine();
            
            reserveCountry = reserveCountry.toLowerCase();
            
            
            
            // check to see if animal is available and reserve if available
     
            for (Dog dog : dogList) {
            	if (dog.getInServiceCountry().equalsIgnoreCase(reserveCountry) && (!dog.getReserved()) && reserveType.equalsIgnoreCase("dog")) {
            		System.out.println(dog.getName() + " is available and has been reserved.");
            		dog.setReserved(true);
            		break;
            	} 
            	if ((dog.getReserved()) && reserveType.equalsIgnoreCase("dog") || !dog.getInServiceCountry().equalsIgnoreCase(reserveCountry)) {
            		System.out.println("Sorry, nothing available");
            		break;
            	}
            }
        

            for (Monkey monkey : monkeyList) {
            	if (monkey.getInServiceCountry().equalsIgnoreCase(reserveCountry) && (!monkey.getReserved()) && reserveType.equalsIgnoreCase("monkey")) {
            		System.out.println(monkey.getName() + " is available and has been reserved.");
            		monkey.setReserved(true);
            		break;
            	} 
            	if ((monkey.getReserved()) && reserveType.equalsIgnoreCase("monkey") || !monkey.getInServiceCountry().equalsIgnoreCase(reserveCountry)) {
            		System.out.println("Sorry, nothing available");
            		break;
            	}
            }
        
           return;
            }
        	

        // Print lists
        public static void printAnimals(String listType) {
        	
        	// monkey list not implemented 
        	if (listType == "monkey") {
        		System.out.println("not implemented");
        	}
        	
            // dog - prints the list of dogs
        	if (listType == "dog") {
            	System.out.println("All dogs: ");
            	System.out.println("-----------------------------------------");
            	for (Dog dog : dogList) {
            		System.out.println("Name: " + dog.getName());
            		System.out.println("Breed: " + dog.getBreed());
            		System.out.println("Gender: " + dog.getGender());
            		System.out.println("Age: " + dog.getAge());
            		System.out.println("Weight: " + dog.getWeight());
            		System.out.println("AcquistionDate: " + dog.getAcquisitionDate());
            		System.out.println("Status: " + dog.getTrainingStatus());
            		System.out.println("Acquisition location: " + dog.getAcquisitionLocation());
            		System.out.println("Reserved: " + dog.getReserved());
            		System.out.println("");
            	}
            	
            	// prints unreserved animals
            } else if (listType == "available") {
            	System.out.println("All Unreserved Dogs: ");
            	System.out.println("-----------------------------------------");
            	for (Dog dog : dogList) {
            		if (!dog.getReserved()) {
            			System.out.println("Name: " + dog.getName());
                		System.out.println("Status: " + dog.getTrainingStatus());
                		System.out.println("Acquisition location: " + dog.getAcquisitionLocation());
                		System.out.println("Reserved: " + dog.getReserved());
                		System.out.println("");
            		}
            	}
            	System.out.println("All Unreserved Monkeys: ");
            	System.out.println("-----------------------------------------");
            	for (Monkey monkey : monkeyList) {
            		if (!monkey.getReserved()) {
                		System.out.println("Name: " + monkey.getName());
                		System.out.println("Status: " + monkey.getTrainingStatus());
                		System.out.println("Acquisition location: " + monkey.getAcquisitionLocation());
                		System.out.println("Reserved: " + monkey.getReserved());
                		System.out.println("");
            		}
            	}
            }
        }
}