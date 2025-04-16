package examples.demo.DatabaseModel;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.*;

import java.util.List;



@Entity
@Setter
@Getter
public class ReceiptDatabaseModel {

    @Id
    private long id;


    private String retailer;
    private String purchaseDate;
    private String purchaseTime;
    private String total;

    @ManyToMany(cascade= CascadeType.ALL)
    private List<ItemDatabaseModel> items;

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



