package agent.sensor;

public class MySensoring {
	
	private String name;
	
	public MySensoring(String name){
		this.name = name;
		//more data
	}
	
	public String getName(){
		return name;
	}
	
	public boolean run(){
		System.out.println("sensoring!");
		return true;
	}
}
