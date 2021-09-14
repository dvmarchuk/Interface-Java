package Lesson3;

public enum Season {
    SPRING(false), SUMMER(false), FALL(false), WINTER(true);

    private boolean snow;

    public boolean isSnow() {
        return snow;
    }

    public void setSnow(boolean snow) {
        this.snow = snow;
    }

    Season(boolean snow){
        this.snow = snow;
    }
}
