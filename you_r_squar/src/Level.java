

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class Level {
    // A helper inner class to tie a Block to its position
    private ArrayList<Dust> dusts;
    private ArrayList<Block> blocks;
    private double windStrength;
    
    public Level(double wind) {
        dusts = new ArrayList<>();
        blocks = new ArrayList<>();
        windStrength = wind;
    }
    
    // draw everything in the level.. blocks and dust
    public void drawLevel(Graphics g, boolean drawBlocks) {
    	if (drawBlocks) {
	    	for (int i=0; i<blocks.size(); i++) {
	    		blocks.get(i).drawBlock(g);
	    	}
    	}
    	for (int i=0; i<dusts.size(); i++) {
    		dusts.get(i).drawDust(g);
    	}
    }
    //getter methods
    public int getListSize() {
    	return dusts.size();
    }
    
    public ArrayList<Block> getBlocks() {
        return blocks;
    }
    
    public ArrayList<Dust> getDusts() {
        return dusts;
    }
    
    public double getWind() {
    	return windStrength;
    }
    
    public void addDust(Dust d) {
    	dusts.add(d);
    }
    
    public void addBlock(Block b) {
    	blocks.add(b);
    }
}