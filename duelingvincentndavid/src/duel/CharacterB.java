package duel;

public class CharacterB implements Dueler{
	
	private String name;
	public int hp;
	
	public CharacterB(){
		
	}
	public void taunt() {
		String taunt = ("Fight me");
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
}
