package examples.demo.controller;



import examples.demo.domain.ProcessReceiptResponse;
import examples.demo.domain.ReceiptPointResponse;
import examples.demo.domain.ReceiptRequest;
import examples.demo.service.ReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/receipts")
public class ReceiptController {


    @Autowired
    private ReceiptService receiptService;


    @PostMapping("/process")
    public ResponseEntity<ProcessReceiptResponse> processReceipt(@RequestBody ReceiptRequest receipt) {

        String id = receiptService.processReceipt(receipt);
        return new ResponseEntity<>(new ProcessReceiptResponse(id), HttpStatus.CREATED);

    }


    @GetMapping("/{id}/points")
    public ResponseEntity<ReceiptPointResponse> getPoints(@PathVariable String id) {

        String points = receiptService.getReceiptById(id);

        return new ResponseEntity<>(new ReceiptPointResponse(points), HttpStatus.OK);

    }


}
