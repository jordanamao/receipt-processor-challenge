package examples.demo.controller;



import examples.demo.databaseModel.ReceiptDatabaseModel;
import examples.demo.domain.ProcessReceiptResponse;
import examples.demo.domain.ReceiptPointResponse;
import examples.demo.service.ReceiptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/receipts")
public class ReceiptController {


    @Autowired
    private ReceiptService receiptService;

//    @Autowired
//    private MapReceiptDTORequestReceiptMapper mapRequestToBusinessModelMapper;



    @PostMapping("/process")
    public ResponseEntity<ProcessReceiptResponse> processReceipt(@RequestBody ReceiptDatabaseModel receiptDatabaseModel) {

 //     Receipt receipt = mapRequestToBusinessModelMapper.toReceiptDTO(receiptRequest);
        String id = receiptService.processReceipt(receiptDatabaseModel);

        return new ResponseEntity<>(new ProcessReceiptResponse(id), HttpStatus.CREATED);
        //return ResponseEntity.status(HttpStatus.CREATED).body(id);
    }


    @GetMapping("/{id}/points")
    public ResponseEntity<ReceiptPointResponse> getPoints(@PathVariable String id) {
        String points = receiptService.getReceiptById(id);

        return new ResponseEntity<>(new ReceiptPointResponse(points), HttpStatus.OK);
        //return ResponseEntity.status(HttpStatus.OK).body(points);

    }


}
