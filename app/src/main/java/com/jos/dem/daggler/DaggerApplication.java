package com.jos.dem.daggler;

import android.app.Application;

public class DaggerApplication extends Application {

  private DaggerComponent daggerComponent;

  public DaggerComponent getComponent() {
    return daggerComponent;
  }

  protected DaggerComponent initDagger(DaggerApplication application) {
    return DaggerAppComponent.builder()
            .appModule(new MainModule(application))
            .build();
  }

  @Override
  public void onCreate() {
    super.onCreate();
    daggerComponent = initDagger(this);
  }

}
