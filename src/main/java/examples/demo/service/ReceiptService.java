package examples.demo.service;


import examples.demo.model.Receipt;
import examples.demo.model.ReceiptRequest;


public interface ReceiptService {

    String processReceipt(ReceiptRequest receipt);

    String getReceiptById(String id);


}
