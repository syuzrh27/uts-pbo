public class Main {
    public static void main(String[] args) {
        Zombie zom = new Zombie("zombie",100,20);
        Pocong poc = new Pocong("pocong",100,30);
        Burung bird = new Burung("burung",100,10);
        System.out.println(zom);
        zom.walk();
        System.out.println(zom.attack());
        System.out.println();
        System.out.println(poc);
        poc.jump();
        System.out.println(poc.attack());
        System.out.println();
        System.out.println(bird);
        bird.walk();
        bird.fly();
        System.out.println(bird.attack());
    }
}