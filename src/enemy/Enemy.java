package enemy;

import base.GameObject;
import base.renderer.SingleImageRenderer;
import game.GameCanvas;
import game.Settings;
import tklibs.SpriteUtils;

import java.awt.image.BufferedImage;


public class Enemy extends GameObject {
    public Enemy(){
        super(); //ke thua ham tao ben GameObject
        BufferedImage image = SpriteUtils.loadImage("assets/images/enemies/level0/blue/0.png");
        this.renderer =  new SingleImageRenderer(image);
        this.position.set(50, 50);// set vi tri
    }

    @Override
    public void run() {
        super.run();
        if(this.position.y <300){
            this.position.addThis(1, 0);
        }

//        if (this.position.x > Settings.SCREEN_WIDTH - this.image.getWidth())
//        {
//            this.position.addSubtractThis(1,0);
//        }
        this.fire();
    }

    int count = 0;

    private void fire() {
        if (count >= 20) {
            EnemyBullet bullet = new EnemyBullet();
            bullet.position.set(this.position.x, this.position.y);

            GameCanvas.enemyBullets.add(bullet);
            count = 0;
        }
        else{
            count++;
        }
    }

}
