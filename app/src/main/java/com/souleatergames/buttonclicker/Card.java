package com.souleatergames.buttonclicker;

public class Card {
    private boolean selected;
    private int rank;
    private int suit;
    private static String[] suits = {"banana", "cat", "philosoraptor", "cursor"};
    private static String[] ranks = {"0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "a", "b", "c", "d", "e", "f"};

    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
        this.selected = false;
    }

    public int getRank() {
        return rank + 1;
    }

    public int getSuit() {
        return suit;
    }

    public boolean getSelected() {
        return selected;
    }

    public void setSelected(Boolean b) {
        selected = b;
    }
}
