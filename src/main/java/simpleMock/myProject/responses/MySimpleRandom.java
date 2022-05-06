package simpleMock.myProject.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@JsonPropertyOrder({"random"})
@Data

public class MySimpleRandom {
    @JsonProperty("random")
    private Integer random = (int) (Math.random()*100);
    }



