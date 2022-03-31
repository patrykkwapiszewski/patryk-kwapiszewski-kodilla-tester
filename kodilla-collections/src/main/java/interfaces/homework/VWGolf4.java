package interfaces.homework;

public class VWGolf4 implements Car{
    private int speed;

    public VWGolf4(int  speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 69;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 3;
    }
}
