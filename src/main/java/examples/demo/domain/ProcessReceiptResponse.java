package examples.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor
public class ProcessReceiptResponse {

    String id;

    public ProcessReceiptResponse(String id) {
        this.id = id;
    }
}
