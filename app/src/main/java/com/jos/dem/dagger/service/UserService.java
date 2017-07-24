package com.jos.dem.dagger.service;

import javax.inject.Inject;
import javax.inject.Singleton;

import com.jos.dem.dagger.model.User;

@Singleton
public class UserService {

  User user = new User("josdem", "joseluis.delacruz@gmail.com");

  @Inject
  public UserService(){}


  public User getUser() {
    return user;
  }

}
