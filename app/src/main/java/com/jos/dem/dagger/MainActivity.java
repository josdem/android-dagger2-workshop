package com.jos.dem.dagger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.jos.dem.dagger.component.ActivityComponent;
import com.jos.dem.dagger.component.DaggerActivityComponent;
import com.jos.dem.dagger.module.ActivityModule;
import com.jos.dem.dagger.service.UserService;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

  @Inject
  UserService userService;

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
    setContentView(R.layout.activity_main);
    TextView usernameTextView = (TextView) findViewById(R.id.usernameLabel);
    TextView emailTextView = (TextView) findViewById(R.id.emailLabel);
    usernameTextView.setText("Username: " + userService.getUser().getUsername());
    emailTextView.setText("Email: " + userService.getUser().getEmail());
  }

}
