package spb_demo.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import spb_demo.pojo.JSONResult;
import spb_demo.pojo.User;

@RestController()
public class UserController {

    @RequestMapping("/getUser")
    @ResponseBody
    public JSONResult getUser(){
        User user = new User();
        user.setAge(10);
        user.setName("Stveen Li");
        user.setDescription("这里是usercontroller");
        return JSONResult.ok(user);
    }
}


