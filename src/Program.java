import game.GameCanvas;
import game.GameWindow;

/**
 * Created by huynq on 7/4/17.
 */
public class Program {
    public static void main(String[] args) {
//        Student student1 = new Student();
//        Student student2 = new Student();
//        student1.print(); //this ~ student1
//
//        student2.name = "Nguyen Thi B";
//        student2.code = "l0907";
//        student2.print(); // this ~student2/
        GameWindow window = new GameWindow();


        GameCanvas canvas = new GameCanvas();
        window.add(canvas);
        window.setVisible(true);
        canvas.gameLoop();
    }

    // access modifier : public/protected/default/private

}
