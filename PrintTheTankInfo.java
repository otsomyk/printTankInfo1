package printTheTankInfo;

public class PrintTheTankInfo {

	public static void main(String[] args) {
	    TheTank t1 = new TheTank();
		t1.name = "Tank";
		t1.color = "Green";
		t1.crew = 3;
		t1.maxSpeed = 70;
		
		printTankInfo(t1);
	}
		
		private static void printTankInfo (TheTank t){
			System.out.println("Tank name: " +  t.name +  ", Tank color: " + t.color + ", Tank crew: " + t.crew + 
					", tank max speed: " + t.maxSpeed + "km/h");				
		}
		
	}


