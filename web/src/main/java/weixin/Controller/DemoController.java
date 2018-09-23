package weixin.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import weixin.annotation.Validate;
import weixin.service.DemoService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author liuyunyao
 * @version 1.0
 * Created on 2018/8/9 上午10:39
 **/

@RestController
@RequestMapping("/test")
public class DemoController {

    @Resource
    DemoService demoService;

    @Validate
    @GetMapping("/index")
    public String index(HttpServletRequest request, HttpServletResponse response){
//        Demo demo=new Demo();
//        demo.setMoney(534);
//        demo.setName("刘云遥");
//        demoService.insert(demo);
        System.out.println("hello");
        return "fsfs";
    }

    @GetMapping("/hello")
    public  String testWeixin(){
        return "hello";
    }
}
