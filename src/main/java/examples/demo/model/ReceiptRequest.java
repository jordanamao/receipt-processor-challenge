package examples.demo.model;

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
    private String retailer;

    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String purchaseDate;


    @NotNull
    @DateTimeFormat(pattern = "HH:mm")
    private String purchaseTime;

    @NotNull
    private String total;


    private List<Item> items;

}
