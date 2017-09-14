package duel;

public class CharacterB implements Dueler{
	
	private String name;
	public int hp;
	
	public CharacterB(){
		
	}
	public void taunt() {
		String taunt = ("Fight");
		System.out.println(taunt);
	}
	public String getName() {
		return name;
	}
	
	public void setStartingHP(int hp) {
		
		
	}
	
	public int getHP(){
	
		return hp;
		
	}
	

}
