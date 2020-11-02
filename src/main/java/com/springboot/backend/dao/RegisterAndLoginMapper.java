package com.springboot.backend.dao;
import com.springboot.backend.bean.*;
import org.apache.ibatis.annotations.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
/**
 * @Description: TODO
 * @author: scott
 * @date: 2020年11月01日 19:08
 */
@Mapper
@Repository
@ComponentScan
@Service
public interface RegisterAndLoginMapper {

    /**
     * 注册  插入一条user记录
     * @param user
     * @return
     */

//    @Insert("insert into user(userId,username,password) values(#{userId},#{username},#{password})")
    //加入该注解可以保存对象后，查看对象插入id
    @Options(useGeneratedKeys = true,keyProperty = "userId",keyColumn = "userId")
    void regist(User user);

    /**
     * 登录
     * @param user
     * @return
     */
//    @Select("select user.userId from user u where user.username = #{username} and password = #{password}")
    Integer login(User user);

    @Select(value = "select u.username,u.password,u.activeCode from user u where u.username=#{username}")
    @Results({@Result(property = "username",column = "username"),
            @Result(property = "password",column = "password"),
            @Result(property = "active_code",column = "activeCode")})
    User findUserByName(@Param("username") String username);

    /**
     * 根据激活码查询用户
     * @param activeCode
     * @return
     */
    User selectUserByActiveCode(String activeCode);

    /**
     * 更新用户
     * @param user
     */
    void update(User user);

}
