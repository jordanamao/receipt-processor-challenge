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

