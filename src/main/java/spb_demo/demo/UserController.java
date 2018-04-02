package spb_demo.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import spb_demo.pojo.JSONResult;
import spb_demo.pojo.User;
import spb_demo.service.UserService;

import java.util.List;

@RestController()
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/getUser")
    @ResponseBody
    public JSONResult getUser(){
        List<User> userList = userService.findByName("st");
        return JSONResult.ok(userList);
    }

    @RequestMapping(value = "/update" )
    public JSONResult update(int id, String name){
        int res = userService.update(id, name);
        if(res>0){
            return JSONResult.ok();
        }
        return JSONResult.errorException("失败");
    }
}


