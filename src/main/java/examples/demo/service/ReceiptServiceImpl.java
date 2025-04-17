package examples.demo.service;


import examples.demo.databaseModel.ItemDatabaseModel;
import examples.demo.databaseModel.ReceiptDatabaseModel;
import examples.demo.repository.ReceiptRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class ReceiptServiceImpl implements ReceiptService{

    @Autowired
    private ReceiptRepo receiptRepo;


//    @Autowired
//    private MapReceiptDTOReceiptDatabaseModelMapper mapReceiptToReceiptDatabaseModelMapper;


    //private List<Receipt> receiptList = new ArrayList<>();  //store in arrayList



    @Override
    public String processReceipt(ReceiptDatabaseModel receipt) {

        String id = UUID.randomUUID().toString();
        receipt.setId(id);

        ReceiptDatabaseModel newReceipt = new ReceiptDatabaseModel();
        newReceipt.setId(receipt.getId());
        newReceipt.setRetailer(receipt.getRetailer());
        newReceipt.setPurchaseTime(receipt.getPurchaseTime());
        newReceipt.setPurchaseDate(receipt.getPurchaseDate());
        newReceipt.setItems(receipt.getItems());
        newReceipt.setTotal(receipt.getTotal());


//                .id(receipt.getId())
//                .retailer((receipt.getRetailer()))
//                .purchaseTime(receipt.getPurchaseTime())
//                .purchaseDate(receipt.getPurchaseDate())
//                .total(receipt.getTotal())
//                .items(receipt.getItems())
//                .build();

        //receiptList.add(newReceipt);

        //receiptRepo.save(mapReceiptToReceiptDatabaseModelMapper.toReceiptDatabaseModel(newReceipt));
        receiptRepo.save(newReceipt);
        return id;

    }


    public int alphNumericCount(String str){
        int count = 0;

        if (str != null) {

            for (char c : str.toCharArray()) {
                if (Character.isDigit(c) || Character.isLetter(c)) {
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


    public int calculateItemDescriptionTrimLength(List<ItemDatabaseModel> items){

        int totalPoints = 0;

        for (ItemDatabaseModel item : items) {

            if(item.getShortDescription().trim().length() % 3 == 0) {
                int points = (int)(Math.ceil(Double.parseDouble(item.getPrice()) * 0.2));
                totalPoints += points;
            }
        }

        return totalPoints;

    }



    public boolean isPurchaseDayOdd(String str){

        String dateFormat = "yyyy-MM-dd";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateFormat);
        LocalDate localDate = LocalDate.parse(str, formatter);
        int day = localDate.getDayOfMonth();
        return day % 2 != 0;

    }


    public boolean  isBetweenPurchaseTime(String purchaseTime){

        LocalTime start = LocalTime.parse( "14:00");
        LocalTime stop = LocalTime.parse( "16:00");
        LocalTime target = LocalTime.parse(purchaseTime);
        return target.isAfter(start) && target.isBefore(stop);

    }




    public String calculatePoints(ReceiptDatabaseModel receipt){

        int alphaNumericCount = alphNumericCount(receipt.getRetailer());
        int fiftyPoints =  isRoundDollarAmount(receipt.getTotal()) ? 50 : 0;
        int totalMultipleOfQuater = isTotalMultipleOfQuater(receipt.getTotal()) ? 25 : 0;
        int fivePointsForTwoPairs = (int)(Math.floor(receipt.getItems().size()/2)) * 5;
        int trimLengthMultipleThreePoints = calculateItemDescriptionTrimLength(receipt.getItems());
        int sixPointsForOddPurchaseDays = isPurchaseDayOdd(receipt.getPurchaseDate()) ? 6 : 0;
        int tenPointsForInBetweenPurchaseTime = isBetweenPurchaseTime(receipt.getPurchaseTime()) ? 10 : 0;


        int totalPoints = alphaNumericCount + fiftyPoints +totalMultipleOfQuater + fivePointsForTwoPairs
                + trimLengthMultipleThreePoints + sixPointsForOddPurchaseDays + tenPointsForInBetweenPurchaseTime;

        return String.valueOf(totalPoints);

    }


    @Override
    public String getReceiptById(String id) {


        ReceiptDatabaseModel receiptDatabaseModel = receiptRepo.findById(id).orElseThrow(() -> new IllegalStateException("Receipt with ID " + id + " does not exist"));
        //Receipt receipt = mapReceiptToReceiptDatabaseModelMapper.toReceiptDTO(receiptDatabaseModel);
        //return  calculatePoints(receipt);

        return calculatePoints(receiptDatabaseModel);

//        for(Receipt receipt : receiptList){
//            if(receipt.getId().equals(id)){
//                return points = calculatePoints(receipt);
//            }
//        }

    }
}
