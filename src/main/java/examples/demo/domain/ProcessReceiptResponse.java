package examples.demo.domain;

import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor
public class ProcessReceiptResponse {

    String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public ProcessReceiptResponse(String id) {
        this.id = id;
    }
}
