public class Person{
	private String name;
	private int number;
	
	//setters
	public void setName(String name){
		this.name = name;
	}
	
	//getters
	public void setNumber(int number){
		this.number = number;
	}
	
	public int getNumber(){
		
		return this.number;
	}
	
	public String getName(){
		return this.name;
	}
	
	public Person(String name, int number){
		
		this.name = name;
		this.number = number;
	}
	
	@Override
	public String toString(){
		return "My name was " + this.name + " and my number was " + this.number;
	}
	
}