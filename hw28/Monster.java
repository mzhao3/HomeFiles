/*                                                                             
  Gerbils- Maggie Zhao, Victor Lin, Susan Lin                                  
  APCS01 pd2                                                                   
  HW28 -- Ye Olde Role Playing Game...                                        
  2017-11-08 W                                                                 
 */


public class Monster {

    // ATTRIBUTES... 
    private int life;
    private int strength;
    private int defense;
    private double attack;
    private String name;

    // CONSTRUCTORS
    public Monster() {
	life = 150;
	defense = 20;
	attack = 1;
	strength = (int) (Math.random() * 45) + 20;	
	name = "Ye Olde Monster";
    }

    // MUTATORS... 
    public boolean isAlive() {
	// the monster is alive if its health is greater than 0.
	return (life > 0);
    }
    
    public int getDefense() {
	return defense;
    }
    
    public String getName() {
	return name;
    }

    
    public int lowerHP(int decrease) {
	life = life - decrease;
	return life;
    }
    public int attack(Protagonist name) {
	int damage = (int)((strength * attack) - name.getDefense());
	return damage;
    }
    
    public static void main (String [] args) {
    }
    
}
