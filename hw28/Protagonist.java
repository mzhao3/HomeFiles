/*
  Gerbils- Maggie Zhao, Victor Lin, Susan Lin
  APCS01 pd2
  HW28 -- Ye Olde Role Playing Game...
  2017-11-08 W
 */

public class Protagonist {

    //ATTRIBUTES...
    private String name;
    private int life;
    private int strength;
    private int defense;
    private double attack;

    //CONSTRUCTORS...
    public Protagonist(String input) {
	name = input;
	life = 60;
	strength = 15;
	defense = 20;
	attack = 0.8;
    }

    public boolean isAlive() {
	// the protagonist is alive if it's health is greater than 0.
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

    public int attack(Monster name) {
	int damage = (int) ((strength * attack) - name.getDefense());
	return damage;
    }

    public void specialize () {
	// prepares the Protagonist to perform a special attack
	int oldDefense = defense;
	defense = (int) (defense / 2);
	
        double oldAttack = attack;
	attack = attack * 2;
    }

    public void normalize () {
	// prepares the Protagonist to perform a normal attack
	// ** find a way to take the initial values, not hardcode it back to original ** 
	defense = 20;
	attack = 0.8;
    }

    public static void main (String [] args) {
    }
    
}
