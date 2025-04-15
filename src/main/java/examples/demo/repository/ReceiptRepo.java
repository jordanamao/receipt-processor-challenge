package examples.demo.repository;



import examples.demo.model.Receipt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ReceiptRepo extends JpaRepository<Receipt, Integer> {


}
