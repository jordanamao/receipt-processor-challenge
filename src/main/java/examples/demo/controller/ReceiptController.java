package examples.demo.controller;


import examples.demo.model.Receipt;
import examples.demo.model.ReceiptRequest;
import examples.demo.service.ReceiptService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@RequestMapping("/receipts")
public class ReceiptController {


    @Autowired
    private ReceiptService receiptService;


    @PostMapping("/process")
    public ResponseEntity<String> processReceipt(@RequestBody ReceiptRequest receipt) {

        return ResponseEntity.accepted().body(receiptService.processReceipt(receipt));

    }


    @GetMapping("/{id}/points")
    public ResponseEntity<String> getPoints(@PathVariable String id) {

       return ResponseEntity.ok().body(receiptService.getReceiptById(id));

    }


}
