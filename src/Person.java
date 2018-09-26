
public class Person {
	
	
	private String name;
	private int weightKG;
	private int highCM;
	private String gender;
	
	public Person(String name, int weightKG, int highCM, String gender) {
		super();
		this.name = name;
		this.weightKG = weightKG;
		this.highCM = highCM;
		this.gender = gender;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getWeightKG() {
		return weightKG;
	}


	public void setWeightKG(int weightKG) {
		this.weightKG = weightKG;
	}


	public int getHighCM() {
		return highCM;
	}


	public void setHighCM(int highCM) {
		this.highCM = highCM;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	
	
	
	

}
