package weixin.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import weixin.dao.mapper.DemoDao;
import weixin.domain.Demo;
import weixin.service.DemoService;

/**
 * @author liuyunyao
 * @version 1.0
 * Created on 2018/8/8 下午2:46
 **/

@Service
public class DemoServiceImpl extends ServiceImpl<DemoDao,Demo> implements DemoService {

    public String index() {

        return "nihao";
    }
}
