
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
        isIce = false;
        isBouncy = false;
        isPortal = false;
    }
    public Block(int width, int height, int x, int y, boolean isIce, boolean isPortal, boolean isBouncy) {
        this.impassable = true;
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
        this.isIce = isIce;
        this.isBouncy = isBouncy;
        this.isPortal = isPortal;
        if (this.isIce) {
        	this.color = new Color(0x00004B);
        } else {
        	this.color = new Color(0x4B4B4B);
        }
    }
    public Block(int width, int height, int x, int y, Color color, boolean imp) {
        this.impassable = imp;
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
        this.color = color;
    }
    public Block(int width, int height, int x, int y, Color color, boolean isIce, boolean isBouncy, boolean isPortal) {
        this.impassable = false;
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
        this.color = color;
        this.isIce = isIce;
        this.isPortal = isPortal;
        this.isBouncy = isBouncy;
    }
    
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
    
    public boolean getIce() {
    	return isIce;
    }
    
    public boolean getBouncy() { 
    	return isBouncy;
    }
    
    public boolean getPortal() {
    	return isPortal;
    }
    
    public boolean isImpassable() {
        return impassable;
    }
}
