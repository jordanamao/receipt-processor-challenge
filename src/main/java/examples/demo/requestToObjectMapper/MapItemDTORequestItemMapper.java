package examples.demo.requestToObjectMapper;

import examples.demo.domain.ReceiptRequestItem;
import examples.demo.model.Item;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper
public interface MapItemDTORequestItemMapper {

    MapItemDTORequestItemMapper INSTANCE = Mappers.getMapper(MapItemDTORequestItemMapper.class);

//    @Mapping(source = "shortDescription", target = "shortDescription")
//    @Mapping(source = "price", target = "price")
    Item toItemDTO (ReceiptRequestItem receiptRequestItem);

}
