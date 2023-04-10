public class Zombie extends Enemy{
    public Zombie(String name, int hp, int attackDamage) {
        super(name, hp, attackDamage);
    }
    public void walk(){
        System.out.println(getName()+" walk");
    }

    @Override
    public String toString() {
        return "Zombie{"+
        "name='" + getName() + '\'' +
                ", hp=" +getHp() +
                ", attackDamage=" + getAttackDamage() +"}";
    }
}
