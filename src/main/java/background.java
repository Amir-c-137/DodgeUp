import processing.core.PApplet;

public class background {
    public static PApplet bgc = Main.pApplet;
    public Main dodge = new Main();

    public static void setBackGround() {
        bgc.background(200);

//ground
        bgc.fill(255 , 238 , 204);
        bgc.noStroke();
        bgc.rect(200, 530, 400, 60);
    }

    public static void setScore() {
        bgc.textSize(23);
        bgc.fill(255,0,0);
        bgc.text("score : " + bgc.frameCount / 10, 45, 20);
    }

    public static void setLife() {
        bgc.textSize(22);
        bgc.fill(0,0,153);
        bgc.text("Life : " + 5 / 3, 350, 20);
    }

    public static void Damage(){
        bgc.fill(255 , 0 , 0);
        bgc.noStroke();
        bgc.rect(200, 530, 400, 60);
    }

}
