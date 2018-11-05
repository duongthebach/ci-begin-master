package base;

import base.renderer.Renderer;

import java.awt.*;
import java.awt.image.BufferedImage;

public class GameObject {
    //int x; // toa do trong game
    public Vector2D position;
    //int y ; //toa do trong game
    public Renderer renderer;
    public GameObject(){
         this.position = new Vector2D();
    }
    public void run(){

//        if(this.x < 300){
//            this.x ++;
//         }
    }
    //ham hien thi
    public void render(Graphics g){
        if(this.renderer != null) {
            this.renderer.render(g, this);
        }
    }

}
