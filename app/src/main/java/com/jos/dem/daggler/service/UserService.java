package com.jos.dem.daggler.service;

import com.jos.dem.daggler.model.User;

public class UserService {

  User create(){
    return new User("josdem", "joseluis.delacruz@gmail.com");
  }

}
