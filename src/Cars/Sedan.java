package Cars;

public class Sedan extends Car {

    int length;

    Sedan(int carPrice, String color, int length) {
        super(carPrice, color);
        this.length = length;
    }

    double calculateSalePrice() {
        if (length > 20) {
            System.out.println(carPrice = (carPrice * .95));
        } else {
            System.out.println(carPrice = (carPrice * .90));
        }
        return carPrice;
    }
}