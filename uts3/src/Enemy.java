public class Enemy {
    private String name;
    private int hp;
    private int attackDamage;

    public Enemy(String name, int hp, int attackDamage) {
        this.name = name;
        this.hp = hp;
        this.attackDamage = attackDamage;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public String attack(){
        return getName()+" attack";
    }
}
