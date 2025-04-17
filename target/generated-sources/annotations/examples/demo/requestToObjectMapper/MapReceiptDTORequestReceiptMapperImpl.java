package examples.demo.requestToObjectMapper;

import examples.demo.businessModel.Receipt;
import examples.demo.domain.ReceiptRequest;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-04-16T20:59:57-0500",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 17.0.14 (Microsoft)"
)
public class MapReceiptDTORequestReceiptMapperImpl implements MapReceiptDTORequestReceiptMapper {

    @Override
    public Receipt toReceiptDTO(ReceiptRequest receiptRequest) {
        if ( receiptRequest == null ) {
            return null;
        }

        Receipt receipt = new Receipt();

        return receipt;
    }
}
