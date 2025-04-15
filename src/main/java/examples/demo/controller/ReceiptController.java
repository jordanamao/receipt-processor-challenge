package examples.demo.controller;


import examples.demo.model.Receipt;
import examples.demo.service.ReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/receipts")
public class ReceiptController {


    @Autowired
    private ReceiptService receiptService;

    public ReceiptController(ReceiptService receiptService) {
        this.receiptService = receiptService;
    }


    @PostMapping("/process")
    public ResponseEntity<String> processReceipt(@RequestBody Receipt receipt) {

        return ResponseEntity.ok().body(receiptService.processReceipt(receipt));

    }


    @GetMapping("/{id}/points")
    public ResponseEntity<String> getPoints(@PathVariable String id) {

       return ResponseEntity.ok().body(receiptService.getReceiptById(id));

    }


}
