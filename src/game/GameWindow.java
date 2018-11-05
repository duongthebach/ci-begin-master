package game;
// 1.
import base.KeyEventPress;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
public class GameWindow extends JFrame {
    // static di voi class, no static di vs Intance


     public GameWindow () {
         this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // bat window cu close thi exit han

         this.setSize(Settings.SCREEN_WIDTH, Settings.SCREEN_HEIGHT);
         this.setTitle("Game Touhou");
         this.setResizable(false);// khong cho nguoi dung thay doi kich thuoc cua so
         this.addKeyEvent();
     }
     private void addKeyEvent(){
         this.addKeyListener(new KeyAdapter() {
             @Override
             public void keyPressed(KeyEvent e) { // an nut xuong
                 if(e.getKeyCode()== Settings.UP_BUTTON){ // len tren
                     KeyEventPress.isUpPress = true;
                 }
                 if (e.getKeyCode()== Settings.LEFT_BUTTON){ // sang trai
                     KeyEventPress.isLeftPress =true;
                 }
                 if (e.getKeyCode()== Settings.DOWN_BUTTON){ // xuong duoi
                     KeyEventPress.isDownPress = true;
                 }
                  if (e.getKeyCode()== Settings.RIGHT_BUTTON){ // sang phai
                      KeyEventPress.isRightPress = true;
                 }
                 if (e.getKeyCode()== Settings.FIRE_BUTTUN){    // ban dan
                     KeyEventPress.isFirePress = true;
                 }

             }

             @Override
             public void keyReleased(KeyEvent e) { // nha nut ra
                 if(e.getKeyCode() == Settings.UP_BUTTON){
                     KeyEventPress.isUpPress = false;
                 }
                 if (e.getKeyCode()== Settings.LEFT_BUTTON){
                     KeyEventPress.isLeftPress = false;
                 }
                 if (e.getKeyCode()== Settings.DOWN_BUTTON){
                     KeyEventPress.isDownPress =false;
                 }
                 if (e.getKeyCode()== Settings.RIGHT_BUTTON){
                     KeyEventPress.isRightPress = false;
                 }
                 if (e.getKeyCode()== Settings.FIRE_BUTTUN){
                     KeyEventPress.isFirePress = false;
                 }
             }
         });
     }
}
