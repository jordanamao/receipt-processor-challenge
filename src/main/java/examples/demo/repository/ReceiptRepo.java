package examples.demo.repository;


import examples.demo.model.Item;
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

        Receipt newReceipt = Receipt.builder()
                .id(receipt.getId())
                .retailer((receipt.getRetailer()))
                .purchaseTime(receipt.getPurchaseTime())
                .purchaseDate(receipt.getPurchaseDate())
                .total(receipt.getTotal())
                .items(receipt.getItems())
                        .build();

        receiptList.add(newReceipt);
        return id;
    }

    public int alphNumericCount(String str){
        int count = 0;

        if (str != null) {

            for (char c : str.toCharArray()) {
                if (Character.isDigit(c)) {
                    count++;
                }
            }
        }
        return count;
    }

    public Boolean isRoundDollarAmount(String str) {


        if (str == null || str.isEmpty()) {
            return false;
        }

        // Remove currency symbols, commas, and spaces
        String cleanAmount = str.replaceAll("[$,\\s]", "");

        // Check if it's a valid number format
        try {
            double value = Double.parseDouble(cleanAmount);
            // Check if it has no fractional part
            return value % 1 == 0;

        } catch (NumberFormatException e) {
            return false; // Not a valid number
        }
    }


    public Boolean isTotalMultipleOfQuater(String str){

        if (str == null || str.isEmpty()) {
            return false;
        }

        Double doubleAmount =Double.parseDouble(str.replaceAll("[$,\\s]", ""));

        return (doubleAmount * 4) % 1 == 0;
    }



    public String calculatePoints(Receipt receipt){

        int alphaNumericCount = alphNumericCount(receipt.getRetailer());
        int fiftyPoints =  isRoundDollarAmount(receipt.getTotal()) ? 50 : 0;
        int totalMultipleOfQuater = isTotalMultipleOfQuater(receipt.getTotal()) ? 25 : 0;
        int fivePointsForTwoPairs = (int)(Math.floor(receipt.getItems().size()/2));

        int totalPoints = alphaNumericCount + fiftyPoints +totalMultipleOfQuater +fivePointsForTwoPairs;

        return String.valueOf(totalPoints);

    }

    public String findReceityById(String id){
        for(Receipt receipt : receiptList){
            if(receipt.getId().equals(id)){
               return points = calculatePoints(receipt);

            }
        }
        return null;
    }


}
