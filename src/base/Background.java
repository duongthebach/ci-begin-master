package base;

import base.renderer.SingleImageRenderer;
import game.Settings;
import tklibs.SpriteUtils;

import java.awt.image.BufferedImage;

public class Background extends GameObject {
    public Background(){
        super();
        BufferedImage image = SpriteUtils.loadImage("assets/images/background/0.png");
        this.renderer =  new SingleImageRenderer(image);
        this.position.set(0 , Settings.SCREEN_HEIGHT - image.getHeight());
    }

    @Override
    public void run() {

        if(this.position.y<0){
            this.position.addThis(0,10);
        }
//        else {
//            this.position.y = -Settings.SCREEN_HEIGHT - image.getHeight();
//        }
    }
}
