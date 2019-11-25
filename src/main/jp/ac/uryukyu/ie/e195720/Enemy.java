package jp.ac.uryukyu.ie.e195720;


public class Enemy extends LivingThing{
    Enemy(String name, int maximumHP, int attack){
        super(name, maximumHP, attack);
    }
    public void wounded(int damage){
        String name = getName();
        int hitPoint = getHitPoint();
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }

}