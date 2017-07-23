package com.jos.dem.daggler.component;

import com.jos.dem.daggler.MainActivity;
import com.jos.dem.daggler.PerActivity;
import com.jos.dem.daggler.module.ActivityModule;

import dagger.Component;
import javax.inject.Singleton;

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

  void inject(MainActivity mainActivity);

}
