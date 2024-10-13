package ar.edu.ubp.das.appref;

public class PreviousPosition {
    private int prevX;
    private int prevY;

    public int getPrevX() {
        return prevX;
    }
    public void setPrevX(int prevX) {
        this.prevX = prevX;
    }
    public int getPrevY() {
        return prevY;
    }
    public void setPrevY(int prevY) {
        this.prevY = prevY;
    }

    public PreviousPosition(int prevX, int prevY) {
        this.prevX = prevX;
        this.prevY = prevY;
    }
}
