package examples.demo.requestToObjectMapper;

import examples.demo.businessModel.Item;
import examples.demo.businessModel.Receipt;
import examples.demo.databaseModel.ItemDatabaseModel;
import examples.demo.databaseModel.ReceiptDatabaseModel;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-04-16T22:52:28-0500",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 17.0.14 (Microsoft)"
)
public class MapReceiptDTOReceiptDatabaseModelMapperImpl implements MapReceiptDTOReceiptDatabaseModelMapper {

    private final MapItemDTOItemDatabaseModelMapper mapItemDTOItemDatabaseModelMapper = MapItemDTOItemDatabaseModelMapper.INSTANCE;

    @Override
    public ReceiptDatabaseModel toReceiptDatabaseModel(Receipt receipt) {
        if ( receipt == null ) {
            return null;
        }

        ReceiptDatabaseModel receiptDatabaseModel = new ReceiptDatabaseModel();

        receiptDatabaseModel.setItems( itemListToItemDatabaseModelList( receipt.getItems() ) );
        receiptDatabaseModel.setRetailer( receipt.getRetailer() );
        receiptDatabaseModel.setPurchaseTime( receipt.getPurchaseTime() );
        receiptDatabaseModel.setPurchaseDate( receipt.getPurchaseDate() );
        receiptDatabaseModel.setTotal( receipt.getTotal() );
        receiptDatabaseModel.setId( receipt.getId() );

        return receiptDatabaseModel;
    }

    @Override
    public Receipt toReceiptDTO(ReceiptDatabaseModel receiptDatabaseModel) {
        if ( receiptDatabaseModel == null ) {
            return null;
        }

        Receipt receipt = new Receipt();

        receipt.setId( receiptDatabaseModel.getId() );
        receipt.setPurchaseDate( receiptDatabaseModel.getPurchaseDate() );
        receipt.setTotal( receiptDatabaseModel.getTotal() );
        receipt.setRetailer( receiptDatabaseModel.getRetailer() );
        receipt.setPurchaseTime( receiptDatabaseModel.getPurchaseTime() );
        if ( receipt.getItems() != null ) {
            List<Item> list = itemDatabaseModelListToItemList( receiptDatabaseModel.getItems() );
            if ( list != null ) {
                receipt.getItems().addAll( list );
            }
        }

        return receipt;
    }

    protected List<ItemDatabaseModel> itemListToItemDatabaseModelList(List<Item> list) {
        if ( list == null ) {
            return null;
        }

        List<ItemDatabaseModel> list1 = new ArrayList<ItemDatabaseModel>( list.size() );
        for ( Item item : list ) {
            list1.add( mapItemDTOItemDatabaseModelMapper.toItemDatabaseModel( item ) );
        }

        return list1;
    }

    protected Item itemDatabaseModelToItem(ItemDatabaseModel itemDatabaseModel) {
        if ( itemDatabaseModel == null ) {
            return null;
        }

        Item item = new Item();

        item.setShortDescription( itemDatabaseModel.getShortDescription() );
        item.setPrice( itemDatabaseModel.getPrice() );

        return item;
    }

    protected List<Item> itemDatabaseModelListToItemList(List<ItemDatabaseModel> list) {
        if ( list == null ) {
            return null;
        }

        List<Item> list1 = new ArrayList<Item>( list.size() );
        for ( ItemDatabaseModel itemDatabaseModel : list ) {
            list1.add( itemDatabaseModelToItem( itemDatabaseModel ) );
        }

        return list1;
    }
}
