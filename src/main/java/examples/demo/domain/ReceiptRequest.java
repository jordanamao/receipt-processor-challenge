package examples.demo.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import examples.demo.model.Item;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.List;


@Getter
@Setter
@Builder
@AllArgsConstructor
public class ReceiptRequest {

    private String id;

    @NotNull
    @JsonProperty("retailer")
    private String retailer;

    @NotNull
    @JsonProperty("purchaseDate")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String purchaseDate;


    @NotNull
    @JsonProperty("purchaseTime")
    @DateTimeFormat(pattern = "HH:mm")
    private String purchaseTime;

    @NotNull
    @JsonProperty("total")
    private String total;


    private List<Item> items;

}
