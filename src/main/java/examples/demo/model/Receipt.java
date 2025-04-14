package examples.demo.model;


import java.util.List;

public class Receipt {


    private String id;
    private  String retailer;
    private  String purchaseDate;
    private  String purchaseTime;
    private String total;
    private List<Item> items;

    public Receipt(String id, String retailer, String purchaseDate, String purchaseTime, String total, List<Item> items) {


        this.id = id;
        this.retailer = retailer;
        this.purchaseDate = purchaseDate;
        this.purchaseTime = purchaseTime;
        this.total = total;
        this.items = items;
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

    public String getPurchaseTime() {
        return purchaseTime;
    }

    public void setPurchaseTime(String purchaseTime) {
        this.purchaseTime = purchaseTime;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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



