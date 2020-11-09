package autodrive;

/**
 Mainly  implement the function of simulating auto driving
 * Implement a driverless Car based on the provided interface
 * that would be capable of moving forward into different directions
 * and turning clockwise in a car park
 * The car park would be rectangular in shape with configurable dimensions
 * The Car should remember its position and orientation
 *  An exception will be thrown when the car moves outside the car park boundaries
 */
public class AutoCar extends  AbstractCar{
    //Width of car park
    int parkWidth = 4;
    //Length of car park
    int parkLength = 4;
    //defalut position of X
    int positionX = 1;
    //defalut position of Y
    int positionY = 1;
    //defalut direction of autonomous driving
    String orientation = "NORTH";
    //Directs Array
    String [] directArray =new String[] {"EAST","SOUTH","WEST","NORTH"};

    public void move(String command){
       if(command.equals("forward")){
           goForward();
       }
        if(command.equals("back")){
            goBack();
        }
       if(command.equals("turnClockwise")){
           turnClockwise();
       }
       if(command.equals("turnAnticlockwise")){
           turnAnticlockwise();
       }
    }
    public void  goForward(){
        if(this.orientation.equalsIgnoreCase("NORTH")){
            if(this.positionY>parkWidth){
                throw new IndexOutOfBoundsException();
            }else {
                this.positionY = this.positionY+1;
            }
        }
        if(this.orientation.equalsIgnoreCase("EAST"))
         {
            if(this.positionX>parkLength){
                throw new IndexOutOfBoundsException();
            }else {
                this.positionX = this.positionX+1;
            }
        }
        if(this.orientation.equalsIgnoreCase("SOUTH")){
            if(this.positionY<=1){
                throw new IndexOutOfBoundsException();
            }else {
                this.positionY = this.positionY-1;
            }
        }
        if(this.orientation.equalsIgnoreCase("WEST")){
            if(this.positionX<=1){
                throw new IndexOutOfBoundsException();
            }else {
                this.positionX = this.positionX-1;
            }
        }
    }
    public void  goBack(){
        if(this.orientation.equalsIgnoreCase("SOUTH")){
            if(this.positionY>parkWidth){
                throw new IndexOutOfBoundsException();
            }else {
                this.positionY = this.positionY+1;
            }
        }
        if(this.orientation.equalsIgnoreCase("WEST"))
        {
            if(this.positionX>parkLength){
                throw new IndexOutOfBoundsException();
            }else {
                this.positionX = this.positionX+1;
            }
        }
        if(this.orientation.equalsIgnoreCase("NORTH")){
            if(this.positionY<=1){
                throw new IndexOutOfBoundsException();
            }else {
                this.positionY = this.positionY-1;
            }
        }
        if(this.orientation.equalsIgnoreCase("EAST")){
            if(this.positionX<=1){
                throw new IndexOutOfBoundsException();
            }else {
                this.positionX = this.positionX-1;
            }
        }
    }
    public  void  turnClockwise (){
        for (int i=0;i<directArray.length;i++) {
            if(this.orientation.equalsIgnoreCase(directArray[i])){
                if((i+1)<directArray.length){
                    this.orientation=directArray[i+1];
                }else {
                    this.orientation=directArray[0];
                }
                break;
            }
        }
    }
    public  void  turnAnticlockwise (){
        for (int i=0;i<directArray.length;i++) {
            if(this.orientation.equalsIgnoreCase(directArray[i])){
                if((i-1)>=0){
                    this.orientation=directArray[i-1];
                }else {
                    this.orientation=directArray[directArray.length-1];
                }
                break;
            }
        }
    }
    public int getPositionX() {
        return  this.positionX;
    }
    public int getPositionY() {
        return this.positionY;
    }
    public String getOrientation() {
        return this.orientation;
    }
}
