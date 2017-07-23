package com.jos.dem.daggler;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.jos.dem.daggler.component.ActivityComponent;
import com.jos.dem.daggler.component.DaggerActivityComponent;
import com.jos.dem.daggler.module.ActivityModule;

public class MainActivity extends AppCompatActivity {

  private ActivityComponent activityComponent;

  public ActivityComponent getActivityComponent() {
    if (activityComponent == null) {
      activityComponent = DaggerActivityComponent.builder()
              .activityModule(new ActivityModule(this))
              .applicationComponent(DemoApplication.get(this).getComponent())
              .build();
    }
    return activityComponent;
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getActivityComponent().inject(this);
    Toast.makeText(this, "Hello World!", Toast.LENGTH_LONG).show();
    setContentView(R.layout.activity_main);
  }
}
