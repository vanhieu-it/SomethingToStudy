package com.hido.somethingtostudy.JavaAndJava.P03_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Stock implements Comparable<Stock> {
    String name;
    double price;

    public Stock(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Stock stock) {
        return this.name.compareTo(stock.name);
    }

    @Override
    public String toString() {
        return "Stock{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

public class DemoSort {
    private ArrayList<Stock> stocks = new ArrayList<>();

    public DemoSort() {
        stocks.add(new Stock("ABC", 49.4));
        stocks.add(new Stock("FOD", 22.1));
        stocks.add(new Stock("BMW", 71.5));
        stocks.add(new Stock("CEF", 14.3));
        stocks.add(new Stock("TEA", 39.2));
    }

    public void sort() {
        System.out.println("==============\nSort by name A to Z");
        Collections.sort(stocks);
        System.out.println(stocks);

        System.out.println("==============\nSort by price from Small to Big");
        Comparator<Stock> stockPriceComparator = Comparator.comparing(Stock::getPrice);
        Collections.sort(stocks, stockPriceComparator);
        System.out.println(stocks);

        System.out.println("==============\nSort by price from Big to Small");
        Collections.sort(stocks, stockPriceComparator.reversed());
        System.out.println(stocks);
    }
}
