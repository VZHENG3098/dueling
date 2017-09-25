package duel;

public class CharacterB implements Dueler{
	
	private String name;
	public int hp;
	private boolean ifLoaded = false;
	
	public CharacterB(){
		
	}
	public void taunt() {
		String taunt = ("you are trash!!!");
		System.out.println(taunt);
	}
	public String getName() {
		name = "David";
		return name;
	}
	
	public void setStartingHP(int hp) {
		System.out.println(hp);
		
	}
	
	public int getHP(){
		return hp;
	}
	
	

	public boolean determineIfOpponentIsFair(Dueler d, int hp){
		
		if(d.getHP()!=hp)
		{
			return false;
		}
		else
		{
			return true;
		}
		
	}
	
	
	public int getAction(Object caller) {
		if(ifLoaded == false) {;
			ifLoaded = true;
			return 0;
		}else {
			return 1;
		}
	}
	
	public void hit(Object caller){
			hp=hp-10;
		
	}
	
	
}
