package examples.demo.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import org.antlr.v4.runtime.misc.NotNull;

import java.math.BigDecimal;



@Builder
@Data
@AllArgsConstructor
public class ReceiptRequestItem {

    @NotNull
    @JsonProperty("shortDescription")
    String shortDescription;

    @NotNull
    @JsonProperty("price")
    BigDecimal price;

}
