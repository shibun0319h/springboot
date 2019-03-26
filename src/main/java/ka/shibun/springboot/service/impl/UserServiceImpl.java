package ka.shibun.springboot.service.impl;

import ka.shibun.springboot.domain.User;
import ka.shibun.springboot.mapper.UserMapper;
import ka.shibun.springboot.service.IUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author shibun
 * @since 2019-03-26
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
