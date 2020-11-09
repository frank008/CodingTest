package autodrive;
/**
 * Autonomous car driving interface
 */
public interface Car {
    void move(String command);
    int getPositionX();
    int getPositionY();
    String getOrientation();
}
