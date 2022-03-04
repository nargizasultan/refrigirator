package com.company;

import com.company.products.*;

import java.time.LocalDate;
import java.util.Random;

public class Store {
    Product[] products = new Product[20];

    public void doInspection() {
        Random random = new Random();
        System.out.println("------------------------  Inspection result  ----------------------------");
        System.out.println("Product    | Produced On   | Storage place |  life days   | Fresh       ");
        System.out.println("-----------+---------------+---------------+--------------+------------+");


        for (int i = 0; i < 20; i++) {
            int ran = random.nextInt(1, 6);
            if (ran == 1) {
                products[i] = new Milk("Milk", 60);
                method(i);
            } else if (ran == 2) {
                products[i] = new Corn("Corn", 150);
                method(i);
            } else if (ran == 3) {
                products[i] = new Fish("Fish", 20);
                method(i);
            } else if (ran == 4) {
                products[i] = new Stew("Stew", 180);
                method(i);
            } else if (ran == 5) {
                products[i] = new Salt("Salt", (int) Double.POSITIVE_INFINITY);
                method(i);
            }
        }

    }

    private void method(int a) {
        Random random = new Random();
        products[a].setProducedOn(LocalDate.now().minusDays(random.nextInt(200)));
        products[a].place();
        products[a].isFreshProduct();
        System.out.print(products[a].getName());
        System.out.print("          "+products[a].getProducedOn());
        if(products[a].getPlaceOfProduct().equals(PlaceOfProduct.ICEBOX)){
            System.out.print("       "+products[a].getPlaceOfProduct()+"  ");
        }else {
            System.out.print("       "+products[a].getPlaceOfProduct());
        }

        if (products[a].getLifeDays() == 2147483647) {
            System.out.print("           "+"INF");
        } else {
            if (products[a].getLifeDays()==20||products[a].getLifeDays()==60){
                System.out.print("           "+products[a].getLifeDays()+" ");
            }else {
                System.out.print("           "+products[a].getLifeDays());
            }

        }
        System.out.print("          "+products[a].isFresh()+System.lineSeparator());





    }


}
