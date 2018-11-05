package game;

import base.Background;
import base.GameObject;
import enemy.Enemy;
import enemy.EnemyBullet;
import player.Player;
import player.PlayerBullet;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GameCanvas extends JPanel {
    public GameObject background;
    public GameObject player;
    public static ArrayList<PlayerBullet> bullets;
    static ArrayList<Enemy> enemies;
    public static  ArrayList<EnemyBullet> enemyBullets;
     public GameCanvas(){
         this.background = new Background();

         this.player = new Player();
//         player.image = SpriteUtils.loadImage("assets/images/players/straight/0.png");
         GameCanvas.bullets = new ArrayList<>();
         GameCanvas.enemies = new ArrayList<>();
         GameCanvas.enemyBullets = new ArrayList<>();

         Enemy enemy = new Enemy();
         GameCanvas.enemies.add(enemy);

     }

    @Override
    protected void paintComponent(Graphics g) { // 1 canvas ~ 1 but ve
         this.background.render(g);
         this.player.render(g);
         for (PlayerBullet bullet: bullets) {
               bullet.render(g);
        }
        for(Enemy enemy:enemies){
            enemy.render(g);
        }
        for(EnemyBullet enemyBullet:enemyBullets){
            enemyBullet.render(g);
        }
    }
    public void gameLoop(){
         int delay = 1000/60;
         long lastRun = 0;
         while (true){
             long currentTime = System.currentTimeMillis();// lay thoi gian hien tai m/s
             if(currentTime - lastRun >delay){
             this.runAll();
             this.renderAll();
             lastRun = currentTime;}
         }
    }

    public void renderAll() {
     this.repaint();
    }

    public void runAll() {
         this.background.run();
         this.player.run();
         for(PlayerBullet bullet : bullets){
             bullet.run();
         }
         for(Enemy enemy:enemies){
             enemy.run();
         }
         for(EnemyBullet enemyBullet:enemyBullets){
             enemyBullet.run();
         }
    }

}
