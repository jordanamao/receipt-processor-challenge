package examples.demo.requestToObjectMapper;

import examples.demo.databaseModel.ItemDatabaseModel;
import examples.demo.model.Item;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-04-16T12:07:15-0500",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 17.0.14 (Microsoft)"
)
public class MapItemDTOItemDatabaseModelMapperImpl implements MapItemDTOItemDatabaseModelMapper {

    @Override
    public ItemDatabaseModel toItemDatabaseModel(Item item) {
        if ( item == null ) {
            return null;
        }

        ItemDatabaseModel itemDatabaseModel = new ItemDatabaseModel();

        itemDatabaseModel.setShortDescription( item.getShortDescription() );
        itemDatabaseModel.setPrice( item.getPrice() );

        return itemDatabaseModel;
    }
}
