package jp.ac.uryukyu.ie.e195720;

public class Hero extends LivingThing {
    Hero(String name, int maximumHP, int attack){
        super(name, maximumHP, attack);
    }

    public void wounded(int damage){
        String name = getName();
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", name);
        }
    }
}
