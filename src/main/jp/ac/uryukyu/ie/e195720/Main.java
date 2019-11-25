package jp.ac.uryukyu.ie.e195720;

/**
 * Created by tnal on 2016/11/13.
 * Correction by e195720 on 2019/11/25
 */
public class Main {
    public static void main(String[] args){
        Hero hero = new Hero("勇者", 10, 5, 0);
        Enemy enemy = new Enemy("スライム", 6, 3, 1);

        System.out.printf("%s vs. %s\n", hero.getName(), enemy.getName());

        int turn = 0;
        while( hero.getDead() && enemy.getDead()){
            turn++;
            System.out.printf("%dターン目開始！\n", turn);
            hero.attack(enemy);
            enemy.attack(hero);
        }
        System.out.println("戦闘終了");
    }
}