package Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ReqTestController {
    @RequestMapping(value = "/ReqTest",produces="text/html;charset=UTF-8")
    public String TestString(){
        System.out.print("公元");
        return "当前时间：公元2018年";
    }
}
