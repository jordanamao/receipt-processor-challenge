package examples.demo.model;


import jakarta.persistence.Entity;
import lombok.*;

import java.util.List;



@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Receipt {

    private String id;
    private String retailer;
    private String purchaseDate;
    private String purchaseTime;
    private String total;
    private List<Item> items;

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



