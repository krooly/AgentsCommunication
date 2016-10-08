package agent.sensor;

/**
 * @author krooly
 */

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
		//sensoring();
		//
		System.out.println("Agent@host: " + mySensor + " is complete.");
	}
	
	/* NOOOOOOOO
	public ResultSensoring result(Sensoring sensoring){
		return sensoring.getResult();
	}
	 */
}
