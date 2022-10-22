package Cars;

public abstract class Car {

    double carPrice;
    String color;
    Car(int carPrice,String color){

        this.carPrice=carPrice;
        this.color=color;
    }

 double calculateSalePrice(){
     System.out.println(carPrice);
     return carPrice;

}
}
class Test{

    public static void main(String[] args) {
        Sedan s=new Sedan(10000,"Black",25);
        s.calculateSalePrice();
        Truck t=new Truck(50000,"Purple",3000);
        t.calculateSalePrice();

    }
}