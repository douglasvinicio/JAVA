package polymorphicinterfacedemo;

public class CompactDisc implements RetailItem {

    private String title;
    private String artist;
    private double retailPrice;

    public CompactDisc(String cdTitle, String cdArtist, double cdPrice) {

        this.title = cdTitle;
        this.artist = cdArtist;
        this.retailPrice = cdPrice;

    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public double getRetailPrice() {
        return this.retailPrice;
    }
}
