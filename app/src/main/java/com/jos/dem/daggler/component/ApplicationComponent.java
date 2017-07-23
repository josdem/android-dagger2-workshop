package com.jos.dem.daggler.component;

import android.app.Application;
import android.content.Context;

import com.jos.dem.daggler.context.ApplicationContext;
import com.jos.dem.daggler.DemoApplication;
import com.jos.dem.daggler.module.ApplicationModule;
import com.jos.dem.daggler.service.UserService;

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