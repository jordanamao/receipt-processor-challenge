package examples.demo.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import lombok.*;

import java.util.List;


@Data
@AllArgsConstructor
public class Receipt {

    //@Setter
    @JsonProperty("id")
    //@Setter(AccessLevel.PUBLIC)
    private String id;

    @JsonProperty("retailer")
    //@Setter(AccessLevel.PUBLIC)
    private String retailer;

    @JsonProperty("purchaseDate")
    //@Setter(AccessLevel.PUBLIC)
    private String purchaseDate;

    @JsonProperty("purchaseTime")
    //@Setter(AccessLevel.PUBLIC)
    private String purchaseTime;

    @JsonProperty("total")
    //@Setter(AccessLevel.PUBLIC)
    private String total;

    @JsonProperty("items")
    //@Setter(AccessLevel.PUBLIC)
    private List<Item> items;

    public Receipt() {

    }




    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public List<Item> getItems() {
        return items;
    }

    public String getRetailer() {
        return retailer;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public void setRetailer(String retailer) {
        this.retailer = retailer;
    }

    public String getPurchaseTime() {
        return purchaseTime;
    }

    public void setPurchaseTime(String purchaseTime) {
        this.purchaseTime = purchaseTime;
    }
}


//{
//        "retailer": "Walgreens",
//        "purchaseDate": "2022-01-02",
//        "purchaseTime": "08:13",
//        "total": "2.65",
//        "items": [
//        {"shortDescription": "Pepsi - 12-oz", "price": "1.25"},
//        {"shortDescription": "Dasani", "price": "1.40"}
//        ]
//        }



//{
//        "retailer": "Target",
//        "purchaseDate": "2022-01-02",
//        "purchaseTime": "13:13",
//        "total": "1.25",
//        "items": [
//        {"shortDescription": "Pepsi - 12-oz", "price": "1.25"}
//        ]
//        }



