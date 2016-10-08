package agent.sensor;

public class MySensor {

	private String mySensor = "Sensoring";
	
	public MySensor(){
		//constructor
	}
	
	public void setSensor(String sensor){
		mySensor = sensor;
	}
	
	public void doSensoring(){
		System.out.println("Agent@host: " + mySensor + " in process...");
		System.out.println("Agent@host: " + mySensor + " is complete.");
	}
}
