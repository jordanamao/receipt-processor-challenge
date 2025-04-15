package examples.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import org.antlr.v4.runtime.misc.NotNull;

import java.math.BigDecimal;



@Getter
@Builder
@AllArgsConstructor
public class ReceiptRequestItem {

    @NotNull
    String shortDescription;

    @NotNull
    BigDecimal price;

}
