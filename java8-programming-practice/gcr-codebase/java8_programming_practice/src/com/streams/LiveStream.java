package com.streams;

import java.util.ArrayList;
import java.util.List;

//stock class

class Stock {
    String symbol;
    double price;
    
    
}

public class LiveStream {
    public static void main(String[] args) {

        List<Stock> liveStockFeed = new ArrayList<>();

        // Simulating live stock prices
        Stock s1 = new Stock();
        s1.symbol = "AAPL";
        s1.price = 195.25;

        Stock s2 = new Stock();
        s2.symbol = "GOOGL";
        s2.price = 2850.75;

        Stock s3 = new Stock();
        s3.symbol = "AMZN";
        s3.price = 3450.10;

        Stock s4 = new Stock();
        s4.symbol = "TSLA";
        s4.price = 720.40;

        liveStockFeed.add(s1);
        liveStockFeed.add(s2);
        liveStockFeed.add(s3);
        liveStockFeed.add(s4);

        // Task: Display all stock prices using forEach()
        liveStockFeed.forEach((c)->{System.out.println(c.symbol+" "+c.price);});
        
    }

}
