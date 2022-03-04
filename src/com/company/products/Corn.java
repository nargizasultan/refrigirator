package com.company.products;

import java.time.LocalDate;
import java.util.Random;

public class Corn extends Product{
    Random random=new Random();
    public Corn() {
    }

    public Corn(String name, int lifeDays) {
        super(name, lifeDays);
    }


}
