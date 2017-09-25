package duel;

public class CharacterA implements Dueler{
	private String name;
	private int health;
	private boolean ifLoaded = false;
	
	public CharacterA(){
		
	}
	public void taunt() {
		String taunt = ("stuff");
		System.out.println(taunt);
	}
	public String getName() {
		name = "Vincent";
		return name;
	}
	public void setStartingHP(int hp) {
		System.out.println(hp);
		hp = 100;
		health = hp;
		
	}
	public int getHP() {
		return health;
	}
	
	public boolean determineIfOpponentIsFair(Dueler d, int hp){
		if(d.getHP() != hp) {
			return false;
		}
		return true;
	}
	public int getAction(Object caller) {
		if(ifLoaded == false) {;
			ifLoaded = true;
			return 0;
		}else {
			int randNumber = (int) (Math.floor(Math.random() * 2) + 1);
			
			if (randNumber == 1) {
				ifLoaded = false;
				return 1;
			}else {
				return 2;
			}
		}
	}
	
	public void hit(Object caller) {
		health = health - 10;
	}
	
}
