package simpleMock.myProject.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@JsonPropertyOrder({"id", "sum"})
@Data
public class MySimpleResponse {
    @JsonProperty("id")
    private String id;
    @JsonProperty("sum")
    private Integer sum;
}





