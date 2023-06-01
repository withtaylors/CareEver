package com.example.careever;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import android.os.Bundle;

public class MainMenuActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    Menu menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        bottomNavigationView = findViewById(R.id.menu_bottom_navigation);
        menu=bottomNavigationView.getMenu();

        bottomNavigationView.setOnNavigationItemSelectedListener(new ItemSelectedListener());
        bottomNavigationView.setSelectedItemId(R.id.volunteer);  //선택된 아이템 지정
    }

    class ItemSelectedListener implements BottomNavigationView.OnNavigationItemSelectedListener{
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            switch(menuItem.getItemId())
            {
                case R.id.volunteer:
                    menuItem.setIcon(R.drawable.ic_volunteer_active);    // 선택한 이미지 변경
                    menu.findItem(R.id.volunteer_status).setIcon(R.drawable.ic_volunteer_status_unactive);
                    menu.findItem(R.id.mypage).setIcon(R.drawable.ic_mypage_unactive);
                    //startActivity(new Intent(getApplicationContext(),VolunteerActivity.class));
                    overridePendingTransition(0,0);
                    return true;

                case R.id.volunteer_status:
                    menuItem.setIcon(R.drawable.ic_volunteer_status_active);    // 선택한 이미지 변경
                    menu.findItem(R.id.volunteer).setIcon(R.drawable.ic_volunteer_unactive);
                    menu.findItem(R.id.mypage).setIcon(R.drawable.ic_mypage_unactive);
                    //startActivity(new Intent(getApplicationContext(),VolunteerStatusActivity.class));
                    overridePendingTransition(0,0);
                    return true;


                case R.id.mypage:
                    menuItem.setIcon(R.drawable.ic_mypage_active);    // 선택한 이미지 변경
                    menu.findItem(R.id.volunteer).setIcon(R.drawable.ic_volunteer_unactive);
                    menu.findItem(R.id.volunteer_status).setIcon(R.drawable.ic_volunteer_status_unactive);
                    //startActivity(new Intent(getApplicationContext(),MyPageActivity.class));
                    overridePendingTransition(0,0);
                    return true;
            }// switch()..
            return false;
        }
}
}