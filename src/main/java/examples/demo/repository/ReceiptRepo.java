package examples.demo.repository;


import examples.demo.model.Receipt;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


@Repository
public class ReceiptRepo {

    private List<Receipt> receiptList = new ArrayList<>();  //store in arrayList


    String id;
    String points;



    public static String generateRandomCode() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 18; i++) {
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }

    public String addReceipt(Receipt receipt){

        id = generateRandomCode();
        receipt.setId(id);
        receiptList.add(receipt);
        return id;
    }

    public String findReceityById(String id){
        for(Receipt receipt : receiptList){
            if(receipt.getId().equals(id)){
               return points = receipt.toString();

            }
        }

        return null;
    }
}
