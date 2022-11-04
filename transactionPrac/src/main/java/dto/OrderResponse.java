package dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderResponse {
    private String orderTrackinbgNumber;
    private String status;
    private String message;
}
