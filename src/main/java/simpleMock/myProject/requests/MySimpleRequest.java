package simpleMock.myProject.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;
import java.util.UUID;

@JsonPropertyOrder({"id",
        "paramA", "paramB"})
@Data
public class MySimpleRequest {
    @JsonProperty("id")
    private UUID id = UUID.randomUUID();
    @JsonProperty("paramA")
    private Integer paramA;
    @JsonProperty("paramB")
    private Integer paramB;
    }

