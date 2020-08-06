package stockcompare;

class Stock {
    private String symbol;     //Trading symbol of stock
    private double sharePrice; //Current price per share

    public Stock(String sym, double price) {
        this.symbol = sym;
        this.sharePrice = price;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getSharePrice() {
        return sharePrice;
    }

    public String toString() {
        String str = "Trading symbol: " + symbol
                + "\nShare Price: " + sharePrice;

        return str;
    }
    
    public boolean equals(Stock object2){
        
        /* Determine wether this object's symbol and sharePrice fields
        are equal to object2 symbol and sharePrice fields */
        
        boolean status;
        
        if (symbol.equals(object2.symbol) && sharePrice == object2.sharePrice) {
            status = true; // Yes, the objects are equal
        } else {
            status = false; //No, the objects are not equal
        }
        //Return the value in status
        return status;
    }
}
