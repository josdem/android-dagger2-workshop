package com.jos.dem.dagger.component;

import com.jos.dem.dagger.MainActivity;
import com.jos.dem.dagger.context.PerActivity;
import com.jos.dem.dagger.module.ActivityModule;

import dagger.Component;

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

  void inject(MainActivity mainActivity);

}
