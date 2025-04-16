package examples.demo.service.ObjectToDataObjectMapper;

import examples.demo.DatabaseModel.ReceiptDatabaseModel;
import examples.demo.model.Receipt;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-04-16T00:30:51-0500",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 17.0.14 (Microsoft)"
)
public class MapReceiptDTOReceiptDatabaseModelMapperImpl implements MapReceiptDTOReceiptDatabaseModelMapper {

    @Override
    public ReceiptDatabaseModel toReceiptDatabaseModel(Receipt receipt) {
        if ( receipt == null ) {
            return null;
        }

        ReceiptDatabaseModel receiptDatabaseModel = new ReceiptDatabaseModel();

        return receiptDatabaseModel;
    }

    @Override
    public Receipt toReceiptDTO(ReceiptDatabaseModel receiptDatabaseModel) {
        if ( receiptDatabaseModel == null ) {
            return null;
        }

        Receipt receipt = new Receipt();

        return receipt;
    }
}
