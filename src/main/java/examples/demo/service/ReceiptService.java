package examples.demo.service;


import examples.demo.model.Receipt;



public interface ReceiptService {

    String processReceipt(Receipt receipt);

    String getReceiptById(String id);


}
