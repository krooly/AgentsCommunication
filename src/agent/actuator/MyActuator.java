package agent.actuator;

public class MyActuator {
	
	private String myAction = "My action";
	
	public MyActuator(){
		//constructor
	}
	
	public void setAction(String action){
		myAction = action;
	}
	
	public void doAction(){
		System.out.println(myAction + " in process...");
		System.out.println(myAction + " is complete.");
	}
}
