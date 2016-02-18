package edu.towson.cis.cosc442.project1.monopoly;

public class CardCell extends Cell {
    public CardCell(int type, String name) {
        setName(name);
        this.type = type;
    }
    
    public Boolean playAction(String msg) {
    	return true;
    }
    
    public int getType() {
        return type;
    }
}
