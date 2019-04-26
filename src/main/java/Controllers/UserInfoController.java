package Controllers;

import Entity.UserInfo;
import Service.IUserInfoService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/api")
public class UserInfoController {
    @Autowired
    IUserInfoService iUserInfoService;
    @RequestMapping(value = "/getUser",produces="text/html;charset=UTF-8")
    public ModelAndView getUserInfo(){
        ModelAndView modelAndView = new ModelAndView();
        UserInfo userInfo = iUserInfoService.selectByPrimaryKey(2);
        modelAndView.addObject("userInfo",userInfo);
        modelAndView.setViewName("jsp/getUser");
       return modelAndView;
    }
}
