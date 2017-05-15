package com.mzusman.bluetooth.activities;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;

import com.mzusman.bluetooth.R;
import com.mzusman.bluetooth.fragments.LoginFragment;
import com.mzusman.bluetooth.utils.logger.Log4jRuntime;


public class LoginActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log4jRuntime log4jRuntime = new Log4jRuntime();
        Thread.setDefaultUncaughtExceptionHandler(log4jRuntime);
        setContentView(R.layout.activity_login);

        Fragment DeviceList = new LoginFragment();
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.add(R.id.fragment_container_login, DeviceList);
        transaction.commit();

    }


}
