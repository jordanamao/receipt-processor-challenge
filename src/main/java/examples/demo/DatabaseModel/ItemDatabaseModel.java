package examples.demo.DatabaseModel;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class ItemDatabaseModel {

    @Id
    private Long id;

    private String shortDescription;
    private String price;
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



