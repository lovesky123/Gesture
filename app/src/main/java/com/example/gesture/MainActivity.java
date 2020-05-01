package com.example.gesture;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

/**
 * 作者：xin on 2018/7/9 0009 15:03
 * <p>
 * 邮箱：ittfxin@126.com
 * <p>
 * https://github.com/wzx54321/XinFrameworkLib
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.gesture_password).setOnClickListener(this);
        fragmentManager = getSupportFragmentManager();

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.gesture_password:
                GesturePswMainActivity.Launcher(this);
                break;
        }
    }


    @Override
    public void onBackPressed() {

        if (fragmentManager.getBackStackEntryCount() > 0) {
            fragmentManager.popBackStack();
            findViewById(R.id.layout_).setVisibility(View.VISIBLE);
        } else {
            super.onBackPressed();
        }
    }
}
