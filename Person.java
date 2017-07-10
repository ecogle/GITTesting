public class Person{
	private String name;
	private int number;
	
	//setters
	public void setNames(String name){
		this.name = name;
	}
	
	//getters
	public void setNumbers(int number){
		this.number = number;
	}
	
	public int getNumbers(){
		
		return this.number;
	}
	
	public String getNames(){
		return this.name;
	}
	
	public Persons(String name, int number){
		
		this.name = name;
		this.number = number;
	}
	
	@Override
	public String toStrings(){
		return "My name was " + this.name + " and my number was " + this.number;
	}
	
}