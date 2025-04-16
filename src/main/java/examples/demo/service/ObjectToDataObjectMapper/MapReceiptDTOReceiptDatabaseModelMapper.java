package examples.demo.service.ObjectToDataObjectMapper;


import examples.demo.DatabaseModel.ReceiptDatabaseModel;
import examples.demo.model.Receipt;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;

@Mapper(uses = MapItemDTOItemDatabaseModelMapper.class)
public interface MapReceiptDTOReceiptDatabaseModelMapper {

    public MapReceiptDTOReceiptDatabaseModelMapper INSTANCE = Mappers.getMapper(MapReceiptDTOReceiptDatabaseModelMapper.class);


    @Mapping(source = "receipt.id", target = "id",  qualifiedByName = "stringToInt")
    @Named("stringToInt")
    default Integer stringToInt(String id) {
        return Integer.parseInt(id);
    }

//
//    @Mapping(source = "receipt.retailer", target = "retailer")
//    @Mapping(source = "receipt.purchaseDate", target = "purchaseDate")
//    @Mapping(source = "receipt.purchaseTime", target = "purchaseTimer")
//    @Mapping(source = "receipt.total", target = "total")
//    @Mapping(source = "receipt.items", target = "items")
    ReceiptDatabaseModel toReceiptDatabaseModel(Receipt receipt);





    @Mapping(source = "receiptDatabaseModel.id", target = "id",  qualifiedByName = "intToString")
    @Named("intToString")
    default String intToString(int id) {
        return String.valueOf(id);
    }


//    @Mapping(source = "receiptDatabaseModel.retailer", target = "retailer")
//    @Mapping(source = "receiptDatabaseModel.purchaseDate", target = "purchaseDate")
//    @Mapping(source = "receiptDatabaseModel.purchaseTime", target = "purchaseTime")
//    @Mapping(source = "receiptDatabaseModel.total", target = "total")
//    @Mapping(source = "receiptDatabaseModel.items", target = "items")

    Receipt toReceiptDTO (ReceiptDatabaseModel receiptDatabaseModel);


}
