package week1_Optional;

public class SpeedLimitCheck {
    public static void main(String[] args) {
        int speedLimit = 60;
        int carSpeed = 70;
        if(carSpeed>speedLimit){
            System.out.println("Overspeeding! Pay Fine");
        }else {
            System.out.println("You are within the speed limit");
        }
    }
}
