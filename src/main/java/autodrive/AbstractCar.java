package autodrive;

public abstract class AbstractCar implements Car{
    public abstract void move(String command);
    public abstract int getPositionX();
    public abstract int getPositionY();
    public abstract String getOrientation();
}
