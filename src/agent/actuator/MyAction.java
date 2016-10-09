package agent.actuator;

public class MyAction {
	private String name;
	
	public MyAction(String name){
		this.name = name;
		//more data
	}
	
	public boolean run(){
		System.out.println("action!");
		return true;
	}
	
	public String getName(){
		return name;
	}
}
