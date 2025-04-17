package examples.demo.requestToObjectMapper;

import examples.demo.domain.ReceiptRequest;
import examples.demo.businessModel.Receipt;
import org.mapstruct.Mapper;

@Mapper(uses = MapItemDTORequestItemMapper.class)
public interface MapReceiptDTORequestReceiptMapper {


//    @Mapping(source = "id", target = "id")
//    @Mapping(source = "retailer", target = "retailer")
//    @Mapping(source = "purchaseDate", target = "purchaseDate")
//    @Mapping(source = "purchaseTime", target = "purchaseTime")
//    @Mapping(source = "total", target = "total")
//    @Mapping(source = "items", target = "items")
    Receipt toReceiptDTO(ReceiptRequest receiptRequest);


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



