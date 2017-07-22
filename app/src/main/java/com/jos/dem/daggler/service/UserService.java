package com.jos.dem.daggler.service;

import javax.inject.Singleton;

import com.jos.dem.daggler.model.User;

@Singleton
public class UserService {

  User user = new User("josdem", "joseluis.delacruz@gmail.com");

  public User getUser() {
    return user;
  }

}
