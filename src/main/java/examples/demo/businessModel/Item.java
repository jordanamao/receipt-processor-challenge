package examples.demo.businessModel;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;


@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {


    @JsonProperty("shortDescription")
    private String shortDescription;

    @JsonProperty("price")
    private String price;

    public String getShortDescription() {
        return shortDescription;
    }
    public void setShortDescription(String shortDescription) {}
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {}
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



