package za.ac.cput;

import org.junit.jupiter.api.Test;
/*
Author: Tauriq-Allie Wilkinson(219071330)
FileName: CarTest.java
DueDate: 16 May 2021
 */
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    
    
    //Used for Collection Test
    Car lexus = new Car("Lexus","Burgundy");
    Car bugatti = new Car("Bugatti", "Blue");
    Car honda = new Car( "Honda", "Silver");


    //Used for Map, Set and List Test
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

        Collection<Car> carCollect = new LinkedList<>();

        //Add
        /*
            Adding the elements directly into the collection interface
         */
        carCollect.add(lexus);
        carCollect.add(bugatti);
        carCollect.add(honda);

        System.out.println("Array After Added");
        for (Car c1 : carCollect) {
            System.out.printf("%s\n",c1);
        }

        //Testcase for Add
        assertEquals(3, carCollect.size());

        //Remove
        /*
            Removing an element from the collection interface
        */
        carCollect.remove(bugatti);

        System.out.println("\n"+"ArrayList After Removal");
        for (Car c1 : carCollect) {
            System.out.printf("%s\n",c1);
        }

        //Testcase for Remove
        assertEquals(2, carCollect.size());

        //Find
        /*
            Finding out if the collection interface contains the element
         */
        System.out.println("\n" + "Was it Found?"+ "\n"+carCollect.contains(ferrari));

        //Testcase for Find
        assertEquals(true,carCollect.contains(honda));
    }




    @Test
    void listTest() {

        List<Car> carList = new ArrayList<Car>();

        //Add
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

        System.out.println("ArrayList After Added");
        for (Car c : carList) {
            System.out.printf("%s\n",c);
        }
        //Testcase for Add
        assertEquals(9, carList.size());

        //Remove
        /*
            Removing the duplicate element from the list
        */
        carList.remove(2);

        System.out.println("\n"+"ArrayList After Removal");
        for (Car c : carList) {
            System.out.printf("%s\n",c);
        }

        //Testcase for Remove
        assertEquals(8, carList.size());

        //Find
        /*
            Searches if the element if in the list
         */
        System.out.println("\n" + "Was it Found?"+ "\n"+carList.contains(ferrari));

        assertEquals(true,carList.contains(ferrari));
    }





    @Test
    void setTest(){
     Set<Car> carSet = new HashSet<>();

        //Add
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

        System.out.println("Sets After Added");
        for (Car c1 : carSet) {
            System.out.printf("%s\n",c1);
        }

        //Testcase for add
        assertEquals(8, carSet.size());


        //Remove
        /*
           Removing one of the duplicate elements to show that the
           set count will not change
        */
        carSet.remove(2);

        System.out.println("\n"+"Sets After Removal");
        for (Car c : carSet) {
            System.out.printf("%s\n",c);
        }

        //Testcase for Remove
        assertEquals(8, carSet.size());

        //Find
        /*
          Searches if the set is in the set interface
        */

        System.out.println("\n" +"Was it found?"+ "\n"+carSet.contains(alfa));

        //Testcase for Find
        assertEquals(true,carSet.contains(alfa));
    }



    @Test
    void mapTest(){
        Map<Car, Integer> carMap = new HashMap<>();

        //Add
        /*
            Adding Car and Integer as the number of that particular element
        */

        carMap.put(ferrari,22);
        carMap.put(alfa,15);
        carMap.put(toyota,100);
        carMap.put(lamborghini,30);
        carMap.put(porche,45);
        carMap.put(mercedes,89);
        carMap.put(bmw,90);
        carMap.put(maserati,60);

        System.out.println("\n"+"Map After Adding");
        for (Map.Entry<Car, Integer> me : carMap.entrySet()) {
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }

        //Testcase for Add
        assertEquals(8,carMap.size());

        //Remove
        /*
            Removing Map entry which includes the key and value. If the key is removed so is the value
        */
        carMap.remove(bmw);

        System.out.println("\n"+"Map After Removing");
        for (Map.Entry<Car, Integer> me : carMap.entrySet()) {
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }

        //Testcase for Remove
        assertEquals(7,carMap.size());

        //Find
        System.out.println("\n"+ "Is Value Found?" + "\n" + carMap.containsValue(89));

        //Testcase for Find
        assertEquals(true,carMap.containsValue(89));
    }

}
