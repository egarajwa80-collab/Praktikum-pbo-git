public class BikeMain21 {
    public static void main(String[] args) {
        Bike mountainBike1 = new Bike();
        Bike mountainBike2 = new Bike();
        RoadBike roadBike1 = new RoadBike();

        mountainBike1.setBrand("Trek");
        mountainBike1.speedAcceleration(10);
        mountainBike1.gearChanges(2);
        mountainBike1.printInfo();

        mountainBike2.setBrand("giant");
        mountainBike2.speedAcceleration(10);
        mountainBike2.gearChanges(2);
        mountainBike2.printInfo();

        roadBike1.setBrand("Specialized");
        roadBike1.speedAcceleration(15);
        roadBike1.gearChanges(3);
        roadBike1.setTireWidth(25);
        roadBike1.printInfo();
    }
}

class Bike {
    private String brand;
    private int speed;
    private int gear;
    private int tireWidth;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void speedAcceleration(int increase) {
        this.speed += increase;
    }

    public void gearChanges(int gear) {
        this.gear = gear;
    }

    public void setTireWidth(int tireWidth) {
        this.tireWidth = tireWidth;
    }

    public void printInfo() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + ", Gear: " + gear + ", Tire Width: " + tireWidth);
    }
}

class RoadBike extends Bike {
    @Override
    public void setTireWidth(int tireWidth) {
        super.setTireWidth(tireWidth);
    }
}