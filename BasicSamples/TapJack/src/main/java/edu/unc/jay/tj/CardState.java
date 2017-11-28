package edu.unc.jay.tj;

/**
 * Created by Jay on 9/17/2017.
 */

public class CardState {

    private int imageId;
    private int value;


    public CardState(int imageId, int value) {
        this.imageId = imageId;
        this.value = value;
    }

    public int getImageId() {
        return imageId;
    }

    public int getValue() {
        return value;
    }

}
