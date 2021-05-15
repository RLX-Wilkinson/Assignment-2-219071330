package za.ac.cput;

import org.junit.jupiter.api.Test;

import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    Car mercedes = new Car("Mercedes","Black") ;
    Car ferrari = new Car("Ferrari","Yellow") ;
    Car alfa = new Car("Alfa","White");
    Car bmw = new Car("BMW","Blue");
    Car lamborghini = new Car("Lamborghini","Yellow");
    Car toyota = new Car("Toyota","Grey");
    Car porche = new Car("Porche","White") ;
    Car maserati = new Car("Maserati","Red");


    Car lexus = new Car("Lexus","Burgundy");
    Car bugatti = new Car("Bugatti", "Blue");
    Car honda = new Car( "Honda", "Silver");

    @Test
    void collectTest(){

        Collection<Car> collectCar = new LinkedList<>();
        //Adding
        collectCar.add(lexus);
        collectCar.add(bugatti);
        collectCar.add(honda);

        System.out.println("Array After Added");
        for (Car c1 : collectCar) {
            System.out.printf("%s\n",c1);
        }

        assertEquals(3, collectCar.size());


        //Removing
        collectCar.remove(bugatti);

        System.out.println("\n"+"ArrayList After Removal");
        for (Car c1 : collectCar) {
            System.out.printf("%s\n",c1);
        }

        assertEquals(2, collectCar.size());

        //Finding
        if (collectCar.contains(honda)) {

            System.out.println("\n" + " Car was Found");
        } else {
            System.out.println("Car was not Not Found");

        }
        assertEquals(true,collectCar.contains(honda));
    }

    @Test
    void listTest() {

        List<Car> carList = new ArrayList<Car>();
        //Adding

        
        carList.add(mercedes);
        carList.add(ferrari);
        carList.add(alfa);
        carList.add(bmw);
        carList.add(lamborghini);
        carList.add(toyota);
        carList.add(porche);
        carList.add(maserati);

        System.out.println("Array After Added");
        for (Car c : carList) {
            System.out.printf("%s\n",c);
        }

        assertEquals(8, carList.size());


        //Removing
        carList.remove(2);

        System.out.println("\n"+"ArrayList After Removal");
        for (Car c : carList) {
            System.out.printf("%s\n",c);
        }

        assertEquals(7, carList.size());

        //Finding
        if (carList.contains(ferrari)) {

            System.out.println("\n" + " Car was Found");
        } else {
            System.out.println("Car was not Not Found");

        }
        assertEquals(true,carList.contains(ferrari));
    }

public boolean add(Car e){

   return true;
}

}
