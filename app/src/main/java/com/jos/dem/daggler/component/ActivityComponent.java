package com.jos.dem.daggler.component;

import dagger.Component;
import javax.inject.Singleton;

@Singleton
@Component(dependencies = ApplicationComponent.class, modules = MainModule.class)
public interface ActivityComponent {

}
