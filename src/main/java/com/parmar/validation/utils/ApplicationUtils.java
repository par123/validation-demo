package com.parmar.validation.utils;

import com.parmar.validation.model.User;
import com.parmar.validation.requests.UserRequest;
import org.springframework.beans.BeanUtils;

public class ApplicationUtils {

    public static User convertUserRequestToUser(UserRequest request) {
        User user = new User();
        //copy values of properties from source to destination
        BeanUtils.copyProperties(request, user);
        return user;
    }

    public static UserRequest convertUserRequestToUser(User user) {
        UserRequest request = new UserRequest();
        //copy values of properties from source to destination
        BeanUtils.copyProperties(user, request);
        return request;
    }


}
