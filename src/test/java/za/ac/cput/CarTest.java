package za.ac.cput;

import org.junit.jupiter.api.Test;

import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    //Used for Collection Test
    Car lexus = new Car("Lexus","Burgundy");
    Car bugatti = new Car("Bugatti", "Blue");
    Car honda = new Car( "Honda", "Silver");


    //Used for Set and List Test
    Car mercedes = new Car("Mercedes","Black") ;
    Car ferrari = new Car("Ferrari","Yellow") ;
    Car alfa = new Car("Alfa","White");
    Car bmw = new Car("BMW","Blue");
    Car lamborghini = new Car("Lamborghini","Yellow");
    Car toyota = new Car("Toyota","Grey");
    Car porche = new Car("Porche","White") ;
    Car maserati = new Car("Maserati","Red");



    @Test
    void collectTest(){

        Collection<Car> collectCar = new LinkedList<>();
        //Adding
        /*
            Adding the elements directly into the collection interface
         */
        collectCar.add(lexus);
        collectCar.add(bugatti);
        collectCar.add(honda);

        System.out.println("Array After Added");
        for (Car c1 : collectCar) {
            System.out.printf("%s\n",c1);
        }

        assertEquals(3, collectCar.size());


        //Removing
        /*
            Removing an element from the collection interface
        */
        collectCar.remove(bugatti);

        System.out.println("\n"+"ArrayList After Removal");
        for (Car c1 : collectCar) {
            System.out.printf("%s\n",c1);
        }

        assertEquals(2, collectCar.size());

        //Finding
        /*
            Finding out if the collection interface contains the element
         */
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
        /*
            Duplicate Ferrari added to show Removal
        */
        
        carList.add(mercedes);
        carList.add(ferrari);
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

        assertEquals(9, carList.size());


        //Removing
        /*
            Removing the duplicate element from the list
        */
        carList.remove(2);

        System.out.println("\n"+"ArrayList After Removal");
        for (Car c : carList) {
            System.out.printf("%s\n",c);
        }

        assertEquals(8, carList.size());

        //Finding
        /*
            Searches if the element if in the list
         */
        if (carList.contains(ferrari)) {

            System.out.println("\n" + " Car was Found");
        } else {
            System.out.println("Car was not Not Found");

        }
        assertEquals(true,carList.contains(ferrari));
    }

    @Test
    void setTest(){
     Set<Car> carSet = new HashSet<>();

     //Adding
     /*
       Duplicate Ferrari and Toyota added to show that even with 10 entries
       there are only 8 sets of cars.
     */

        carSet.add(mercedes);
        carSet.add(ferrari);
        carSet.add(toyota);
        carSet.add(ferrari);
        carSet.add(alfa);
        carSet.add(maserati);
        carSet.add(lamborghini);
        carSet.add(bmw);
        carSet.add(toyota);
        carSet.add(porche);

        System.out.println("Array After Added");
        for (Car c1 : carSet) {
            System.out.printf("%s\n",c1);
        }
        assertEquals(8, carSet.size());


     //Removing
     /*
        Removing one of the duplicate elements to show that the
        set count will not change
     */
        carSet.remove(2);

        System.out.println("\n"+"ArrayList After Removal");
        for (Car c : carSet) {
            System.out.printf("%s\n",c);
        }
        assertEquals(8, carSet.size());

        //Finding
        /*
          Searches if the set is in the set interface
        */

        if (carSet.contains(alfa)) {

            System.out.println("\n" + " Collection contains set");
        } else {
            System.out.println("Collection contains set");

        }
        assertEquals(true,carSet.contains(alfa));
    }


}
