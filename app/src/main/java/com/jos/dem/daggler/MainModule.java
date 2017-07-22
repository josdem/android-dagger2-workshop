package com.jos.dem.daggler;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {

  private Application application;

  public MainModule(Application application){
    this.application = application;
  }

  @Provides
  @Singleton
  public Context getContext(){
    return application;
  }

}
