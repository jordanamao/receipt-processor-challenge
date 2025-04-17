package examples.demo.databaseModel;


import jakarta.persistence.*;
import java.util.List;



@Entity
public class ReceiptDatabaseModel {

    @Id
    private String id;


    @Column(name = "retailer")
    private String retailer;

    @Column(name = "purchaseDate")
    private String purchaseDate;

    @Column(name = "purchaseTime")
    private String purchaseTime;

    @Column(name = "total")
    private String total;

    @OneToMany(cascade= CascadeType.ALL)
    @JoinColumn(name = "itemId")
    private List<ItemDatabaseModel> items;




    public List<ItemDatabaseModel> getItems() {
        return items;
    }

    public void setItems(List<ItemDatabaseModel> items) {
        this.items = items;
    }


    public String getRetailer() {
        return retailer;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
