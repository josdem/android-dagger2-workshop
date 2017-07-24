package com.jos.dem.dagger.module;

import android.app.Application;
import android.content.Context;

import com.jos.dem.dagger.context.ApplicationContext;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

  private final Application application;

  public ApplicationModule(Application application) {
    this.application = application;
  }

  @Provides
  @ApplicationContext
  Context provideContext() {
    return application;
  }

  @Provides
  Application provideApplication() { return application; }

}
