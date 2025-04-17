package examples.demo.requestToObjectMapper;

import examples.demo.domain.ReceiptRequestItem;
import examples.demo.businessModel.Item;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-04-16T13:19:51-0500",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 17.0.14 (Microsoft)"
)
public class MapItemDTORequestItemMapperImpl implements MapItemDTORequestItemMapper {

    @Override
    public Item toItemDTO(ReceiptRequestItem receiptRequestItem) {
        if ( receiptRequestItem == null ) {
            return null;
        }

        Item item = new Item();

        return item;
    }
}
