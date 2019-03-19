package com.cofel.core.system.controller;

import com.cofel.core.base.BaseController;
import com.cofel.core.base.Result;
import com.cofel.core.constants.BaseEnums;
import com.cofel.core.constants.Constants;
import com.cofel.core.system.dto.User;
import com.cofel.core.util.Dates;
import com.cofel.core.util.Results;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


/**
 * 用户Controller
 */
@RequestMapping("/sys/user")
@RestController
public class UserController extends BaseController {

    private static List<User> userList = new ArrayList<>();

    //先静态模拟数据
    static{
        User user1 = new User();
        user1.setUserId(1L);
        user1.setUsername("test1");
        user1.setNickname("泰斯特1");
        user1.setBirthday(Dates.parseDate("2005-05-05"));
        user1.setSex(Constants.Sex.MALE);
        user1.setEnabled(Constants.Flag.YES);
        userList.add(user1);

        User user2 = new User();
        user2.setUserId(2L);
        user2.setUsername("test2");
        user2.setNickname("泰斯特2");
        user2.setBirthday(Dates.parseDate("2006-05-05"));
        user2.setSex(Constants.Sex.FEMALE);
        user2.setEnabled(Constants.Flag.YES);
        userList.add(user2);
    }

    @RequestMapping("/queryAll")
    public Result queryAll(){
        return Results.successWithData(userList, BaseEnums.SUCCESS.code(),BaseEnums.SUCCESS.desc());
    }

    @RequestMapping("/queryOne/{userId}")
    public Result queryOne(@PathVariable Long userId){
        User user = null;
        for (User u : userList){
            if (u.getUserId().longValue() == userId){
                user = u;
            }
        }
        return Results.successWithData(user);
    }



}
