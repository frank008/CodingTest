package autodrive;

import org.junit.Test;

public class Autotest {
    /**
     * Given the Car is in position X = 1 and Y = 1 and facing North, when the Car turns clockwise,
     * then the Car is still in the same position but is now facing East
     */
    @Test
    public void  test(){
        AutoCar autoCar = new AutoCar();
        autoCar.orientation="North";
        autoCar.positionX=1;
        autoCar.positionY=1;
        autoCar.move("turnClockwise");
        System.out.println("Position: X="+autoCar.positionX+"  Y="+autoCar.positionY+" Orientation: "+autoCar.getOrientation());
    }
    /**
     * Given the Car is in position X = 1 and Y = 1 and facing North,
     * when the Car moves forward, then the Car is still facing North but is now in position X = 1 and Y = 2
     */
    @Test
    public void  testNorthForward(){
        AutoCar autoCar = new AutoCar();
        autoCar.orientation="North";
        autoCar.positionX=1;
        autoCar.positionY=1;
        autoCar.move("forward");
        System.out.println("Position: X="+autoCar.positionX+"  Y="+autoCar.positionY+" Orientation: "+autoCar.getOrientation());
    }
    /**
     * Given the Car is in position X = 1 and Y = 1 and facing East, when the Car moves forward,
     * then the Car is still facing East but is now in position X = 2 and Y = 1
     */
    @Test
    public void  testEastForward(){
        AutoCar autoCar = new AutoCar();
        autoCar.orientation="East";
        autoCar.positionX=1;
        autoCar.positionY=1;
        autoCar.move("forward");
        System.out.println("Position: X="+autoCar.positionX+"  Y="+autoCar.positionY+" Orientation: "+autoCar.getOrientation());
    }
    /**
     * Given the Car is in position X = 1 and Y = 1 and facing West, when the Car moves forward, then an exception is thrown
     */
    @Test
    public void  testException(){
        AutoCar autoCar = new AutoCar();
        autoCar.orientation="West";
        autoCar.positionX=1;
        autoCar.positionY=1;
        autoCar.move("forward");
        System.out.println("Position: X="+autoCar.positionX+"  Y="+autoCar.positionY+" Orientation: "+autoCar.getOrientation());
    }
    /**
     * Given the Car is in position X = 1 and Y = 1 and facing East, when the Car moves forward twice,
     * then the Car is still facing East but is now in position X = 3 and Y = 1
     * ?
     */
    @Test
    public void  testTwiceEast(){
        AutoCar autoCar = new AutoCar();
        autoCar.orientation="East";
        autoCar.positionX=1;
        autoCar.positionY=1;
        autoCar.move("forward");
        autoCar.move("forward");
        System.out.println("Position: X="+autoCar.positionX+"  Y="+autoCar.positionY+" Orientation: "+autoCar.getOrientation());
    }
}
