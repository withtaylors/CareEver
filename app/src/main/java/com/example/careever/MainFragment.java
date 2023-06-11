package com.example.careever;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainFragment extends AppCompatActivity {
    private Fragment VolunteerFragment, VolunteerStatusFragment, MyPageFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_fragment);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        WindowManager.LayoutParams.FLAG_FULLSCREEN);

        FrameLayout frameLayout = findViewById(R.id.frameLayout);
        BottomNavigationView bottomView = findViewById(R.id.bottomNavigationView);

        bottomView.setOnNavigationItemSelectedListener(listener);

        VolunteerFragment = new VolunteerFragment();
        VolunteerStatusFragment = new VolunteerStatusFragment();
        MyPageFragment = new MyPageFragment();

        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, VolunteerFragment).commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener listener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()){
                case R.id.volunteer:
                    getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, VolunteerFragment).commit();
                    return true;
                case R.id.volunteer_status:
                    getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, VolunteerStatusFragment).commit();
                    return true;
                case R.id.mypage:
                    getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, MyPageFragment).commit();
                    return true;
            }
            return false;
        }
    };
}