package examples.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor
public class ProcessReceiptResponse {

    public void setId(String id) {
        this.id = id;
    }

    String id;

    public ProcessReceiptResponse(String id) {
        this.id = id;
    }
}
