package simpleMock.myProject.responses;

import lombok.Data;
import org.springframework.stereotype.Component;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Data
@Component
public class MySimpleMap {
    public static Map<UUID, String> map = new HashMap<>();
   }



