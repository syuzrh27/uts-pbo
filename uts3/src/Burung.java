public class Burung extends Enemy{
    public Burung(String name, int hp, int attackDamage) {
        super(name, hp, attackDamage);
    }
    public void walk(){
        System.out.println(getName()+" walk");
    }
    public void fly(){
        System.out.println(getName()+" fly");
    }
    @Override
    public String toString() {
        return "Burung{" +
                "name='" + getName() + '\'' +
                ", hp=" + getHp() +
                ", attackDamage=" + getAttackDamage() + "}";
    }
}
