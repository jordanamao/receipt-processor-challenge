package examples.demo.service;


import examples.demo.domain.ReceiptRequest;


public interface ReceiptService {

    String processReceipt(ReceiptRequest receipt);

    String getReceiptById(String id);


}
