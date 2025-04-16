package examples.demo.service.ObjectToDataObjectMapper;

import examples.demo.DatabaseModel.ItemDatabaseModel;
import examples.demo.model.Item;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-04-16T00:30:46-0500",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 17.0.14 (Microsoft)"
)
public class MapItemDTOItemDatabaseModelMapperImpl implements MapItemDTOItemDatabaseModelMapper {

    @Override
    public ItemDatabaseModel toItemDatabaseModel(Item item) {
        if ( item == null ) {
            return null;
        }

        ItemDatabaseModel itemDatabaseModel = new ItemDatabaseModel();

        return itemDatabaseModel;
    }
}
