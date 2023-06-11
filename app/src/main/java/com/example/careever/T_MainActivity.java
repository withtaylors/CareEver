package com.example.careever;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class T_MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tmain);

        ListView listview;
        ListViewAdapter adapter;

        adapter = new ListViewAdapter();

        listview = (ListView) findViewById(R.id.listview1);
        listview.setAdapter(adapter);

/*        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.book),
                "First", "첫번째");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.magic),
                "Second", "두번째");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.unicorn),
                "Third", "세번째");*/

        adapter.addItem("웰컴독코리아", "대한민국 > 미국", "태백이의 입양을 도와주세요", "2023.06.02", "2023.06.04");
        adapter.addItem("개인봉사자", "청주 > 강남역", "차량이동봉사자를 모집합니다", "2023.06.02", "2023.06.02");
        adapter.addItem("개인봉사자", "청주 > 강남역", "차량이동봉사자를 모집합니다", "2023.06.02", "2023.06.02");
        adapter.addItem("개인봉사자", "청주 > 강남역", "차량이동봉사자를 모집합니다", "2023.06.02", "2023.06.02");
        adapter.addItem("개인봉사자", "청주 > 강남역", "차량이동봉사자를 모집합니다", "2023.06.02", "2023.06.02");

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id) {
                String toastMessage = (String) parent.getItemAtPosition(position).toString() + " is selected. ";
                Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_SHORT).show();

                if (position == 0) {
                    Intent it1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                    startActivity(it1);
                } else if (position == 1) {
                    Intent it2 = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-1234-1234"));
                    startActivity(it2);
                } else if (position == 2) {
                    Intent it3 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.naver.com"));
                    startActivity(it3);
                }
            }
        });
    }
}