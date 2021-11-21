// Adrianne Perrodin
// 04-18-2021
public class Monkey extends RescueAnimal {
	
	// attributes
	// TODO change variable type
	 	private String name;
	    private String animalType;
	    private String gender;
	    private String age;
	    private String weight;
	    private String acquisitionDate;
	    private String acquisitionCountry;
		private String trainingStatus;
	    private boolean reserved;
		private String inServiceCountry;
		private String tailLength;
		private String height;
		private String bodyLength;
		private String species;
		

	// Constructors
		
	public Monkey () {
		name = "";
		animalType = "";
		gender = "";
		age = "";
		weight = "";
		acquisitionDate = "";
		acquisitionCountry = "";
		trainingStatus = "";
		inServiceCountry = "";
		tailLength = "";
		height = "";
		bodyLength = "";
		species = "";
							   
	}
    public Monkey(String name, String animalType, String gender, String age, String weight, String acquisitionDate, 
    		String acquisitonCountry, String trainingStatus, boolean reserved, String inServiceCountry, 
    		String TailLength, String height, String bodyLength, String species) {
        setTailLength(tailLength);
        setAnimalType(animalType);
        setHeight(height);
        setBodyLength(bodyLength);
        setSpecies(species);
        setName(name);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
    }


	
	// accessors
	public String getName() {
		return name;
	}


	public String getAnimalType() {
		return animalType;
	}


	public String getGender() {
		return gender;
	}


	public String getAge() {
		return age;
	}


	public String getWeight() {
		return weight;
	}


	public String getAcquisitionDate() {
		return acquisitionDate;
	}


	public String getAcquisitionCountry() {
		return acquisitionCountry;
	}


	public String getTrainingStatus() {
		return trainingStatus;
	}


	public boolean isReserved() {
		return reserved;
	}


	public String getInServiceCountry() {
		return inServiceCountry;
	}


	public String getTailLength() {
		return tailLength;
	}


	public String getHeight() {
		return height;
	}


	public String getBodyLength() {
		return bodyLength;
	}


	public String getSpecies() {
		return species;
	}

	// mutators
	public void setName(String name) {
		this.name = name;
	}


	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public void setWeight(String weight) {
		this.weight = weight;
	}


	public void setAcquisitionDate(String acquisitionDate) {
		this.acquisitionDate = acquisitionDate;
	}


	public void setAcquisitionCountry(String acquisitionCountry) {
		this.acquisitionCountry = acquisitionCountry;
	}


	public void setTrainingStatus(String trainingStatus) {
		this.trainingStatus = trainingStatus;
	}


	public void setReserved(boolean reserved) {
		this.reserved = reserved;
	}


	public void setInServiceCountry(String inServiceCountry) {
		this.inServiceCountry = inServiceCountry;
	}


	public void setTailLength(String tailLength) {
		this.tailLength = tailLength;
	}


	public void setHeight(String height) {
		this.height = height;
	}


	public void setBodyLength(String bodyLength) {
		this.bodyLength = bodyLength;
	}


	public void setSpecies(String species) {
		this.species = species;
	}
}
	
	