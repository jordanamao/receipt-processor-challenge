package examples.demo.repository;



import examples.demo.DatabaseModel.ReceiptDatabaseModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ReceiptRepo extends JpaRepository<ReceiptDatabaseModel, Integer> {


}
