
import java.awt.Color;
import java.awt.Graphics;

public class Block {
    private boolean impassable;
    private boolean isIce;
    private boolean isBouncy;
    private boolean isPortal;
    private int width;
    private int height;
    private int x;
    private int y;
    private Color color;
    
    public Block() {
        impassable = true;
        width = 50;
        height = 50;
        x = 0;
        y = 0;
        color = new Color(0x4B4B4B);
    }
    public Block(int width, int height, int x, int y) {
        this.impassable = true;
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
        this.color = new Color(0x4B4B4B);
    }
    public Block(int width, int height, int x, int y, Color color) {
        this.impassable = true;
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
        this.color = color;
    }
    public Block(int width, int height, int x, int y, boolean isIce, boolean isBouncy) {
        this.impassable = false;
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
        if (isIce) {
        	this.color = new Color(0x6DBAE3);
        } else if (isBouncy) {
        	this.color = new Color(0x3BF57C);
        }
        this.isBouncy = isBouncy;
        this.isIce = isIce;
        this.isPortal = false;
    }
    
    /* smooth portals would be cooler but imma kms if i am bothered to figure out the number of things i would have to change
     * 
     * dual rendering two seperate rects to represent each half of the player
     * dual rendering two seperate aimballs in case it goes in
     * 
     * public Block(int width, int height, int x, int y, boolean isPortal, ) {
        this.impassable = false;
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
        this.color = new Color(0x6DBAE3);
        this.isIce = isIce;
        this.isBouncy = isBouncy;
    } */ 
    
    public void drawBlock(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
    
    // getter methods
    public int getBlockWidth() {
        return width;
    }
    
    public int getBlockHeight() {
        return height;
    }
    
    public int getBlockX() {
        return x;
    }
    
    public int getBlockY() {
        return y;
    }
    
    public boolean isIce() {
    	return isIce;
    }
    
    public boolean isBouncy() {
    	return isBouncy;
    }
    
    public boolean isImpassable() {
        return impassable;
    }
}
