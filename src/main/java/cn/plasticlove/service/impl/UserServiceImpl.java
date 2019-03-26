package cn.plasticlove.service.impl;

import cn.plasticlove.dao.UserMapper;
import cn.plasticlove.dto.UserDto;
import cn.plasticlove.entity.User;
import cn.plasticlove.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author luka-seu
 * @description 用户接口实现
 * @create 2019/3/26-20:07
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public User getUserByUserId(Long id){
        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }

    @Override
    public UserDto getUserDtoById(Long id){
        User user = this.getUserByUserId(id);
        if (user!=null) {
            UserDto userDto = new UserDto();
            userDto.setId(user.getId());
            userDto.setBlog(user.getBlog());
            userDto.setEmail(user.getEmail());
            userDto.setLocation(user.getLocation());
            userDto.setNickname(user.getNickname());
            userDto.setQq(user.getQq());
            userDto.setRemark(user.getRemark());
            userDto.setUsername(user.getUsername());
            return userDto;
        }
        return null;



    }

}