package oslomet.data1700.DATA1700_demo_march;

import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class SomeController {
    @GetMapping("/stuff")
    public Map<String, String> someEndpoint() {
        return Map.of("Quote", "Some wise words");
    }
}
