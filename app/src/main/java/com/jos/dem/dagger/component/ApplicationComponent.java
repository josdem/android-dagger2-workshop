package com.jos.dem.dagger.component;

import android.app.Application;
import android.content.Context;

import com.jos.dem.dagger.context.ApplicationContext;
import com.jos.dem.dagger.DemoApplication;
import com.jos.dem.dagger.module.ApplicationModule;
import com.jos.dem.dagger.service.UserService;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

  void inject(DemoApplication demoApplication);

  @ApplicationContext
  Context getContext();

  Application getApplication();

  UserService getUserService();

}