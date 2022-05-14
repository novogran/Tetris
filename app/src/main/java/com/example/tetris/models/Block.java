package com.example.tetris.models;

import android.graphics.Color;
import android.graphics.Point;

public class Block {
    private int shapeIndex;
    private int frameNumber;
    private BlockColor color;
    private Point position;

    private Block(int shapeIndex, BlockColor blockColor){
        this.frameNumber = 0;
        this.shapeIndex = shapeIndex;
        //</span> this.color = blockColor;
       // this.position = new Point(FieldConstants.COLUMN_COUNT.getValue()/2, 0);
    }
    public enum BlockColor{
        PINK(Color.rgb(255, 105,180), (byte) 2),
        GREEN(Color.rgb(0, 128,0), (byte) 3),
        ORANGE(Color.rgb(255, 140,0), (byte) 4),
        YELLOW(Color.rgb(255, 255,0), (byte) 5),
        CYAN(Color.rgb(0, 255,255), (byte) 6);
        BlockColor(int rgbValue, byte value){
            this.rgbValue = rgbValue;
            this.value = value;
        }

        private final int rgbValue;
        private final byte value;

    }


}
