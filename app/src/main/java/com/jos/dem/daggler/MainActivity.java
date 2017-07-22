package com.jos.dem.daggler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.jos.dem.daggler.service.UserService;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

  @Inject
  UserService userService;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    Toast.makeText(this, userService.getUser().getUsername(), Toast.LENGTH_LONG).show();
    setContentView(R.layout.activity_main);
  }
}
