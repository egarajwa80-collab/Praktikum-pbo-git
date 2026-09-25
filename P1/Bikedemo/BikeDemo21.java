public class Bikedemo21 {
    private String brand;
    private int speed;
    private int gear=1;

    private final int [] GEAR_SPEED_LIMITS = {5,10,25,30,40,50};
    public void setBrand (String brandName) {
        brand = brandName;
    }
    public void gearChanges (int gearvalue){
        if (gearvalue < 1 || gearvalue > 6){
            System.out.println("Invalid gear value. Gear must be between 1 and 6");
        }
        else{
            gear = gearvalue;
        }
    }
    public int speedAcceleration(int increment){
        speed += incremet;
        if (speed > GEAR_SPEED_LIMITS[gear - 1]) {
            speed = GEAR_SPEED_LIMITS[gear - 1];
        }
        return speed;
    } 
    public int speedDeceleration(int decrement){
        speed -= decrement;
        if (speed < 0){
            speed = 0;     
        }
        return speed;
    }
    public void println(){
        System.out.println("Brand : "+ brand);
        System.out.println("speed : "+ speed);
        System.out.println("gear :"+ gear);
    }
    
}