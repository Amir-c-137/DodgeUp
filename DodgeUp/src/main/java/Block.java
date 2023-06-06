import java.util.ArrayList;
import processing.core.PApplet;

public class Block implements makeBlock, showBlock {
    public static ArrayList<Block> blocks = new ArrayList<>();
    private final int width = 75;
    private final int height = 30;
    public float speedY = -50;
    private float BlockX;
    private float BlockY;
    private int colorR;
    private int colorG;
    private int colorB;

    public Block(float blockX, float blockY, int colorR, int colorG, int colorB) {
        this.BlockX = blockX;
        this.BlockY = blockY;
        this.colorR = colorR;
        this.colorG = colorG;
        this.colorB = colorB;
    }

    public void makeBlocks() {
        for (int i = 0; i < 100; i++) {
            blocks.add(new Block(Main.pApplet.random(10, 500), speedY,
                    (int) Main.pApplet.random(0, 255),
                    (int) Main.pApplet.random(0, 255),
                    (int) Main.pApplet.random(0, 255)));
            speedY -= 50;
        }
    }

    public void showBlocks() {
        for (Block tempBlock : blocks) {
            Main.pApplet.fill(tempBlock.colorR, tempBlock.colorG, tempBlock.colorB);
            Main.pApplet.rect(tempBlock.BlockX, tempBlock.BlockY, width, height, 10);
            Main.pApplet.fill(0);
            Main.pApplet.textAlign(Main.pApplet.CENTER);
            Main.pApplet.text("NIT", tempBlock.BlockX , tempBlock.BlockY + 7);
        }
    }

    public void moveBlock() {
        for (Block block : blocks) {
            block.setBlockY(getBlockY() + 10);
        }
    }

    public float getBlockY() {
        return BlockY;
    }

    public void setBlockY(float blockY) {
        BlockY = blockY;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public float getBlockX() {
        return BlockX;
    }

    public void setBlockX(float blockX) {
        BlockX = blockX;
    }
}