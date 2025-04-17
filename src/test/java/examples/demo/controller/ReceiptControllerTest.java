package examples.demo.controller;

import examples.demo.databaseModel.ItemDatabaseModel;
import examples.demo.databaseModel.ReceiptDatabaseModel;
import examples.demo.domain.ProcessReceiptResponse;
import examples.demo.domain.ReceiptPointResponse;
import examples.demo.service.ReceiptService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;


import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(MockitoExtension.class)
class ReceiptControllerTest {


    @Mock
    HttpResponse<ProcessReceiptResponse> httpresponse;


    @Mock
    private ReceiptService receiptService;


    @InjectMocks
    private ReceiptController receiptController;


    String uuid = UUID.randomUUID().toString();




    @Test
    void processReceipt() {


        ItemDatabaseModel itemDatabaseModelOne = new ItemDatabaseModel();
        itemDatabaseModelOne.setId(1L);
        itemDatabaseModelOne.setShortDescription("Pepsi - 12-oz");
        itemDatabaseModelOne.setPrice("1.25");


        ItemDatabaseModel itemDatabaseModelTWO = new ItemDatabaseModel();
        itemDatabaseModelOne.setId(1L);
        itemDatabaseModelOne.setShortDescription("Dasani");
        itemDatabaseModelOne.setPrice("1.40");


        List<ItemDatabaseModel> items = new ArrayList<>();
        items.add(itemDatabaseModelOne);
        items.add(itemDatabaseModelTWO);


        ReceiptDatabaseModel receiptDatabaseModel = new ReceiptDatabaseModel();
        ReceiptDatabaseModel newReceipt = new ReceiptDatabaseModel();
        newReceipt.setId("2f9a9b4b-0925-434d-a1bf-8335cb1694c7");
        newReceipt.setRetailer("Walgreens");
        newReceipt.setPurchaseTime("08:13");
        newReceipt.setPurchaseDate("2022-01-02");
        newReceipt.setItems(items);



        // Arrange: Use when().thenReturn() to mock service behavior
        when(receiptService.processReceipt(receiptDatabaseModel)).thenReturn(uuid);


        // Act: Call the controller method
        ResponseEntity<ProcessReceiptResponse> processReceiptResponse = receiptController.processReceipt(receiptDatabaseModel);


        // Assert: Verify the returned object
        assertNotNull(processReceiptResponse);
        assertEquals("201 CREATED",processReceiptResponse.getStatusCode().toString());
        assertEquals( uuid, processReceiptResponse.getBody().getId().toString());

        // Verify the mocked service was called
        verify(receiptService, times(1)).processReceipt(receiptDatabaseModel);


    }

    @Test
    void getPoints() {


        String points = "15";

        // Arrange: Use when().thenReturn() to mock service behavior

        when(receiptService.getReceiptById("2f9a9b4b-0925-434d-a1bf-8335cb1694c7")).thenReturn(String.valueOf(new ReceiptPointResponse(points)));


        // Act: Call the controller method
        ResponseEntity<ReceiptPointResponse> receiptPointResponse = receiptController.getPoints("2f9a9b4b-0925-434d-a1bf-8335cb1694c7");


        // Assert: Verify the returned object
        assertNotNull(receiptPointResponse);
        assertEquals("200 OK",receiptPointResponse.getStatusCode().toString());

        // Verify the mocked service was called
        verify(receiptService, times(1)).getReceiptById("2f9a9b4b-0925-434d-a1bf-8335cb1694c7");


    }
}