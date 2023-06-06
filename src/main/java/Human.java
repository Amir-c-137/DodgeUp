public class Human {
    private final int width = 400;
    private final int height = 600;
    private int bodyColor;
    private int headColor;
    private float bodyWidth;
    private float bodyHeight;
    private float headWidth;
    private float headHeight;
    private float xPos;
    private float yPos;

    private float headXPos;
    private float headYPos;

    public void humanBody() {
        // Creating character
        bodyColor = Main.pApplet.color(102, 204, 255); // Change body color to blue
        headColor = Main.pApplet.color(255 , 250 , 181);
        bodyWidth = 20;
        bodyHeight = 30;
        headWidth = 20;
        headHeight = 20;
        xPos = width / 2;
        yPos = height / 2;
        headXPos = xPos;
        headYPos = 477;
    }

    public void humanFPS() {
        // Update position based on mouse cursor
        xPos = Main.pApplet.mouseX;
        yPos = Main.pApplet.mouseY;
        //        head position
        headXPos = xPos;
        // Draw body
        Main.pApplet.stroke(0);
        Main.pApplet.fill(bodyColor);
        Main.pApplet.rectMode(Main.pApplet.CENTER);
        Main.pApplet.rect(xPos, 500, bodyWidth, bodyHeight);
        // Draw head
        Main.pApplet.fill(headColor);
        Main.pApplet.ellipse(headXPos, 477, headWidth, headHeight);
        // Draw legs
        Main.pApplet.strokeWeight(4);
        Main.pApplet.line(xPos - bodyWidth / 4, 515, xPos - bodyWidth / 4, 530);
        Main.pApplet.line(xPos + bodyWidth / 4, 515, xPos + bodyWidth / 4, 530);
        // Draw "ME" on the shirt
        Main.pApplet.fill(255 , 0 , 0);
        Main.pApplet.textAlign(Main.pApplet.CENTER, Main.pApplet.CENTER);
        Main.pApplet.text("ME", xPos, 500);
    }
    public float getXPos() {
        return xPos;
    }

    public float getYPos() {
        return yPos;
    }

    public float getBodyWidth() {
        return bodyWidth;
    }

    public float getBodyHeight() {
        return bodyHeight;
    }

    public float getHeadWidth() {
        return headWidth;
    }

    public void setHeadWidth(float headWidth) {
        this.headWidth = headWidth;
    }

    public float getHeadHeight() {
        return headHeight;
    }

    public void setHeadHeight(float headHeight) {
        this.headHeight = headHeight;
    }

    public float getHeadXPos() {
        return headXPos;
    }

    public void setHeadXPos(float headXPos) {
        this.headXPos = headXPos;
    }

    public float getHeadYPos() {
        return headYPos;
    }

    public void setHeadYPos(float headYPos) {
        this.headYPos = headYPos;
    }
}
