package base.renderer;

import base.GameObject;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class AnimationRenderer extends Renderer {
    ArrayList<BufferedImage>  images;
    int currentImageIndex;
    public AnimationRenderer(ArrayList<BufferedImage> images){
        this.images = images;
        this.currentImageIndex = 0;
    }
    int count = 0;
    @Override
    public void render(Graphics g, GameObject master) {
        //index = 0
          g.drawImage(this.images.get(currentImageIndex),(int)master.position.x,(int)master.position.y, null);
          // draw.image[0]
        if(count>=10) {
            this.currentImageIndex++;
            // index = 1
            if (this.currentImageIndex >= this.images.size()) { // size( do dai cua anh)
                this.currentImageIndex = 0;
            }
            count = 0;
        }else{
            count++;
        }
    }
}
