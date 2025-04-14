package examples.demo.service;


import examples.demo.model.Receipt;
import examples.demo.repository.ReceiptRepo;
import org.springframework.stereotype.Service;





@Service
public class ReceiptService {

    private ReceiptRepo receiptRepo;
    public ReceiptService(ReceiptRepo receiptRepo) {
        this.receiptRepo = receiptRepo;
    }

    public String processReceipt(Receipt receipt) {
        return receiptRepo.addReceipt(receipt);
    }

    public String getReceiptById(String id) {
        return receiptRepo.findReceityById(id);
    }


}
