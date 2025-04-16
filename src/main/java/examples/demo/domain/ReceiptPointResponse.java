package examples.demo.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;



@Getter
@NoArgsConstructor
//@AllArgsConstructor
public class ReceiptPointResponse {
        String points;

        public ReceiptPointResponse(String points) {
            this.points = points;
        }
    }
