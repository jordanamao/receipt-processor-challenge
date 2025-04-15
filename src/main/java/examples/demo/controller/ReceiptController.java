package examples.demo.controller;


import examples.demo.model.Receipt;
import examples.demo.service.ReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class ReceiptController {


    @Autowired
    private ReceiptService receiptService;

    private String id;
    private String points;


    public ReceiptController(ReceiptService receiptService) {
        this.receiptService = receiptService;
    }


    @PostMapping("receipts/process")
    public ResponseEntity<String> processReceipt(@RequestBody Receipt receipt) {

        receiptService.processReceipt(receipt);

        return ResponseEntity.ok(id);

    }


    @GetMapping("/receipts/{id}/points")
    public ResponseEntity<String> getPoints(@PathVariable String id) {

        receiptService.getReceiptById(id);

        return ResponseEntity.ok(points);

    }


}
