package examples.demo.controller;



import examples.demo.RequestToObjectMapper.MapReceiptDTORequestReceiptMapper;
import examples.demo.domain.ProcessReceiptResponse;
import examples.demo.domain.ReceiptPointResponse;
import examples.demo.domain.ReceiptRequest;
import examples.demo.model.Receipt;
import examples.demo.service.ReceiptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class ReceiptController {


    @Autowired
    private ReceiptService receiptService;

    @Autowired
    private MapReceiptDTORequestReceiptMapper mapRequestToBusinessModelMapper;



    @PostMapping("/process")
    public ResponseEntity<ProcessReceiptResponse> processReceipt(@RequestBody ReceiptRequest receiptRequest) {

        Receipt receipt = mapRequestToBusinessModelMapper.toReceiptDTO(receiptRequest);
        String id = receiptService.processReceipt(receipt);

        return new ResponseEntity<>(new ProcessReceiptResponse(id), HttpStatus.CREATED);

    }


    @RequestMapping(value ="/points", method = RequestMethod.GET)
    public ResponseEntity<ReceiptPointResponse> getPoints(@PathVariable String id) {
        System.out.println("Inside points");

        String points = receiptService.getReceiptById(id);

        return new ResponseEntity<>(new ReceiptPointResponse(points), HttpStatus.OK);

    }


}
