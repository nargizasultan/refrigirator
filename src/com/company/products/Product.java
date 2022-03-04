package com.company.products;

import com.company.PlaceOfProduct;

import java.time.LocalDate;
import java.util.Random;

public abstract class Product {
    private String name;
    private int lifeDays;
    private boolean isFresh;
    private PlaceOfProduct placeOfProduct;
    private LocalDate producedOn = LocalDate.now();


    private static Random random = new Random();

    public Product() {
    }

    public Product(String name, int lifeDays) {
        this.name = name;
        this.lifeDays = lifeDays;
    }

    public void isFreshProduct() {
        if (this.placeOfProduct.equals(PlaceOfProduct.ICEBOX)) {
            if (this.producedOn.plusDays(this.lifeDays).isAfter(LocalDate.now())) {
                this.isFresh = true;
            } else {
                this.isFresh = false;
            }
        } else {
            if (this.name.equals("Milk")) {
                if (this.producedOn.plusDays(this.lifeDays / 2).isAfter(LocalDate.now())) {
                    this.isFresh = true;
                } else {
                    this.isFresh = false;
                }
            } else if (this.name.equals("Fish")) {
                if (this.producedOn.plusDays(this.lifeDays / 6).isAfter(LocalDate.now())) {
                    this.isFresh = true;
                } else {
                    this.isFresh = false;
                }
            } else  {
                if (this.producedOn.plusDays(this.lifeDays).isAfter(LocalDate.now())) {
                    this.isFresh = true;
                } else {
                    this.isFresh = false;
                }
            }

        }

    }
    public void place() {
        if (random.nextInt(2) == 1) {
            this.placeOfProduct = PlaceOfProduct.ICEBOX;
        } else {
            this.placeOfProduct = PlaceOfProduct.SHOWCASE;
        }
    }


    public String getName() {
        return name;
    }


    public int getLifeDays() {
        return lifeDays;
    }


    public LocalDate getProducedOn() {
        return producedOn;
    }

    public void setProducedOn(LocalDate producedOn) {
        this.producedOn = producedOn;
    }

    public boolean isFresh() {
        return isFresh;
    }


    public PlaceOfProduct getPlaceOfProduct() {
        return placeOfProduct;
    }






}
