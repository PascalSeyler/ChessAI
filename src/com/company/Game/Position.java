package com.company.Game;

public class Position {
    private String x;
    private  String y;

    public Position(String pos) throws IllegalArgumentException{
        if(!isValid(pos)){
            throw new IllegalArgumentException("No Valid Position");
        }
        this.x = "" + pos.charAt(0);
        this.y = "" + pos.charAt(1);
    }

    private boolean isValid(String pos){
        if ( pos.length() != 2){
            return false;
        }
        char x = pos.charAt(0);
        char y = pos.charAt(1);
        if (x < 'a' || x > 'h' ||
                y < '1' || y > '8'){
            return false;
        }
        return true;
    }
}
