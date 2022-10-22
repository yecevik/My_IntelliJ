package Cars;

public class Truck extends Car {

    int weight;

    Truck(int carPrice, String color, int weight) {
        super(carPrice, color);
        this.weight = weight;


    }

    double calculateSalePrice() {
        if (weight > 2000) {
            System.out.println(carPrice = (carPrice * .90));
        }else {
            System.out.println(carPrice = (carPrice * .80));
        }
            return carPrice;

    }
}