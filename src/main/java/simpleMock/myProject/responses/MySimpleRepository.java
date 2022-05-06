package simpleMock.myProject.responses;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Data
@Component
public class MySimpleRepository {
    public static List<String> ids = new ArrayList<>();
    }


