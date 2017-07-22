package com.jos.dem.daggler;

import dagger.Component;
import javax.inject.Singleton;

@Singleton
@Component(modules = {MainModule.class})
public interface DaggerComponent {

}
