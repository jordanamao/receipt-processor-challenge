package examples.demo.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;



@Getter
@NoArgsConstructor
public class ReceiptPointResponse {

    String points;

    public String getPoints() {
        return points;
    }

    public ReceiptPointResponse(String points) {
            this.points = points;
        }
}
