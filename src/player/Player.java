package player;

import base.renderer.AnimationRenderer;
import base.renderer.SingleImageRenderer;
import game.GameCanvas;
import base.GameObject;
import base.KeyEventPress;
import tklibs.SpriteUtils;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Player<fire> extends GameObject {
    public Player(){
        super();
//        BufferedImage image = SpriteUtils.loadImage("assets/images/players/straight/0.png");
//        this.renderer = new SingleImageRenderer(image);
        this.createRenderer();
        this.position.set(200, 300);
    }

    private void createRenderer() {
        //ArrayList<BufferImage> images
        ArrayList<BufferedImage> images = new ArrayList<>();
        images.add(SpriteUtils.loadImage("assets/images/players/straight/0.png"));
        images.add(SpriteUtils.loadImage("assets/images/players/straight/1.png"));
        images.add(SpriteUtils.loadImage("assets/images/players/straight/2.png"));
        images.add(SpriteUtils.loadImage("assets/images/players/straight/3.png"));
        images.add(SpriteUtils.loadImage("assets/images/players/straight/4.png"));
        images.add(SpriteUtils.loadImage("assets/images/players/straight/5.png"));
        images.add(SpriteUtils.loadImage("assets/images/players/straight/6.png"));
        // AnimationRenderer(images)
        this.renderer = new AnimationRenderer(images);
    }


    @Override
    public void run() {
         if(KeyEventPress.isUpPress){
             this.position.addSubtractThis(0,5); // dang di len thi y giam
         }
        if(KeyEventPress.isDownPress){
            this.position.addThis(0,5); // dang di xuong thi y tang
        }
        if(KeyEventPress.isRightPress){
            this.position.addThis(5,0); // sang phai
        }
        if(KeyEventPress.isLeftPress){
            this.position.addSubtractThis(5,0); // sang trai
        }
        if(KeyEventPress.isFirePress){
            this.fire();
        }

    }
    int count = 0;
     private  void fire(){

         if(count > 20){
             PlayerBullet bullet = new PlayerBullet();
             bullet.position.set(this.position.x, this.position.y);
             GameCanvas.bullets.add(bullet);
             count = 0;}
         else{
             count ++;
         }

     }

}
