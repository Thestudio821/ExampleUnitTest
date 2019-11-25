package jp.ac.uryukyu.ie.e195720;

public class LivingThing {
    String name;
    int hitPoint;
    int attack;
    int experience;
    boolean dead;

    LivingThing(String name, int maximumHP, int attack, int experience) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        this.experience = experience;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }
    boolean getDead() {
        return !dead;
    }
    void setDead(boolean dead){
        this.dead = dead;
    }
    String getName() {
        return name;
    }
    public void setName(String opponent) {
        this.name = opponent;
    }
    int getHitPoint() {
        return hitPoint;
    }
    void setHitPoint(int HP) {
        this.hitPoint = HP;
    }
    public int getAttack(){
        return this.attack;
    }
    public void setAttack(int A){
        this.attack = A;
    }
    public int getExperience(){
        return experience;
    }
    public void setExperience(int exp){
        this.experience = exp;
    }
    public void attack(LivingThing opponent) {
        int damage = (int) (Math.random() * attack);
        if (hitPoint > 0) {
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }


    public void wounded(int damage) {
        String name = getName();
        int experience = getExperience();
        hitPoint -= damage;
        if (hitPoint < 0) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
            System.out.printf("%eの経験値を得た。", experience );
        }
    }
}