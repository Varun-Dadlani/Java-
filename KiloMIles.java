class Distance {
    int miles;

     Distance(int miles) {
        this.miles = miles;
    }

     void travelTime() {
        System.out.println("Time to travel in miles at 60 mph: " + (miles / 60));
    }
}

class DistanceMKS extends Distance {

    DistanceMKS(int kilometers) {
        super(kilometers);
    }

    @Override
     void travelTime() {
        System.out.println("Time to travel in kilometers at 100 km/h: " + (miles / 100));
    }
}

public class KiloMIles {
    public static void main(String[] args) {
        Distance d = new Distance(300);
        d.travelTime();

        DistanceMKS dMKS = new DistanceMKS(300);
        dMKS.travelTime();
    }
}
