package weixin.service;


import com.baomidou.mybatisplus.service.IService;
import weixin.domain.Demo;

/**
 * @author liuyunyao
 * @version 1.0
 * Created on 2018/8/8 上午11:35
 **/

public interface DemoService extends IService<Demo> {
    String index();
}
