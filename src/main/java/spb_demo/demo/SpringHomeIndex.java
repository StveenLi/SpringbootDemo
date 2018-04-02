package spb_demo.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringHomeIndex {

    @RequestMapping("/hello")
    public Object hello(){
        return "hello spring boot";
    }

}
