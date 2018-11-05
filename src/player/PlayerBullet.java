package player;

import base.GameObject;
import base.renderer.SingleImageRenderer;
import tklibs.SpriteUtils;

import java.awt.image.BufferedImage;

public class PlayerBullet extends GameObject {
    public PlayerBullet(){
        super();
        BufferedImage image = SpriteUtils.loadImage("assets/images/players/explosions/0.png");
        this.renderer = new SingleImageRenderer(image);
    }


    @Override
    public void run() {
        this.position.addThis(0,-10);

    }
}
