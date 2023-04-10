public class Pocong extends Enemy{
    public Pocong(String name, int hp, int attackDamage) {
        super(name, hp, attackDamage);
    }
    public void jump(){
        System.out.println(getName()+" jump");
    }
    @Override
    public String toString() {
        return "Pocong{" +
                "name='" + getName() + '\'' +
                ", hp=" + getHp() +
                ", attackDamage=" + getAttackDamage() + "}";
    }
}
