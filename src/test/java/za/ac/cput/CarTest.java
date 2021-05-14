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



}
