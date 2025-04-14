package examples.demo.model;


import lombok.*;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Item {

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



