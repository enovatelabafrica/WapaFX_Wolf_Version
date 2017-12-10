package ng.com.androidlife.bellokanoex;

/**
 * Created by aminu on 11/25/17.
 */

public class Blog {

    private String buy;
    private String sell;
    private String image;

    public  Blog(){


    }

    public Blog(String buy, String sell, String image) {
        this.buy = buy;
        this.sell = sell;
        this.image = image;
    }

    public String getBuy() {
        return buy;
    }

    public void setBuy(String buy) {
        this.buy = buy;
    }

    public String getSell() {
        return sell;
    }

    public void setSell(String sell) {
        this.sell = sell;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }


}
