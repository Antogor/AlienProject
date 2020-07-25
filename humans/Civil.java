package humans;

import java.util.List;

public class Civil extends Human {

	List<String> studies;
	public Civil(int life, int atack, int armour, List<String> s) {
		super(life, atack, armour);
		studies = s;
	}

//	public boolean fixEverything(String tool) {
//		return studies.contains(tool) ? true:false;
//	}
	
	//iHaveAGun method
}
