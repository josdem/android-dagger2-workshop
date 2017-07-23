package com.jos.dem.daggler.module;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import com.jos.dem.daggler.ApplicationContext;

import dagger.Provides;

/**
 * Created by josdem on 22/07/17.
 */

public class ApplicationModule {

  private final Application mApplication;

  public ApplicationModule(Application app) {
    mApplication = app;
  }

  @Provides
  @ApplicationContext
  Context provideContext() {
    return mApplication;
  }

  @Provides
  Application provideApplication() {
    return mApplication;
  }

  @Provides
  SharedPreferences provideSharedPrefs() {
    return mApplication.getSharedPreferences("demo-prefs", Context.MODE_PRIVATE);
  }
}
