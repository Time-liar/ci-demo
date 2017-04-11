package date.timeliar.controller;

import com.google.common.collect.ImmutableMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.Map;

/**
 * @author lijiading
 * @since 2017-04-11 18:20
 */
@RestController
public class MainController {
    @RequestMapping({"/info", "/", "/index"})
    public Map<String, ? extends Serializable> info() {
        return ImmutableMap.of(
                "code", 12345,
                "name", "ci-demo",
                "message", "hello"
        );
    }
}
