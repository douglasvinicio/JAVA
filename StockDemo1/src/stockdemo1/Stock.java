package stockdemo1;

public class Stock {

    private String symbol;
    private double sharePrice;

    public Stock(String sym, double price){
        this.symbol = sym;
        this.sharePrice = price;
    }

    public String getSymbol(){
        return symbol;
    }

    public double getSharePrice(){
        return sharePrice;
    }

    public String toString(){
        String str = "Trading symbol: " + symbol
                + "\nShare Price: " + sharePrice ;

        return str;
    }
}
