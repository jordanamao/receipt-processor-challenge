package examples.demo.service;


import examples.demo.databaseModel.ReceiptDatabaseModel;



public interface ReceiptService {

    String processReceipt(ReceiptDatabaseModel receipt);

    String getReceiptById(String id);


}
