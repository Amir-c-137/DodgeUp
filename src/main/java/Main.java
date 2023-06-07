import processing.core.PApplet;

public class Main extends PApplet {
    public static PApplet pApplet;
    private final int width = 400;
    private final int height = 600;
    public Human human = new Human();
    public Block block = new Block(0, 0, 0, 0, 0);
    public int life = 15; //is actually 5
    public int score = 0;
    public boolean gameOver = false;

    public void setup() {
        pApplet = this;
        human.humanBody();
        block.makeBlocks();
    }

    public void draw() {
        if (!gameOver) {
            background.setBackGround();
            float humanX = human.getHeadXPos();
            float humanY1 = human.getHeadYPos() + human.getHeadHeight() / 2;
            float humanY2 = human.getHeadYPos() - human.getHeadHeight() / 2;
            human.humanFPS();
            block.showBlocks();

//        damage check...
            for (Block b : Block.blocks) {
                float blockL = b.getBlockX() - b.getWidth() / 2;
                float blockR = b.getBlockX() + b.getWidth() / 2;
                float blockT = b.getBlockY() + b.getHeight() / 2;
                float blockB = b.getBlockY() - b.getHeight() / 2;
                if (humanX + 10 >= blockL && humanX - 10 <= blockR && humanY1 < blockT && humanY2 > blockB) {
                    life--;
                    background.Damage(); // make ground red
                    if (life <= 1) {
                        score = frameCount / 10;
                        gameOver = true;
                        gameOver(score);
                    }
                }
            }
//        moving block in each frame
            for (Block tempBlock : Block.blocks) {
                tempBlock.setBlockY(tempBlock.getBlockY() + 3);
            }
            background.setScore();
            textSize(22);
            fill(0,0,153);
            text("Life : " + life / 3, 350, 20);
        }
    }

    public void settings() {
        size(width, height);
    }

    public void mouseClicked() {
        if (gameOver) {
            exit();
        }
    }

    public void gameOver(int score) {
        background(0);
        textSize(40);
        fill(38,230,0);
        text("your score is : " + score, 200, 200);
        fill(255,0,0);
        text("Exit", 200, 400);
    }


    public static void main(String[] args) {

        PApplet.main("Main", args);
    }
}