package com.example.careever;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class VolunteerFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_volunteer, container, false);

        ListView listview;
        ListViewAdapter adapter;

        adapter = new ListViewAdapter();

        listview = (ListView) view.findViewById(R.id.listview1);
        listview.setAdapter(adapter);

        adapter.addItem("웰컴독코리아", "대한민국 > 미국", "태백이의 입양을 도와주세요", "2023.06.02", "2023.06.04");
        adapter.addItem("개인봉사자", "청주 > 강남역", "차량이동봉사자를 모집합니다", "2023.06.02", "2023.06.02");
        adapter.addItem("개인봉사자", "청주 > 강남역", "차량이동봉사자를 모집합니다", "2023.06.02", "2023.06.02");
        adapter.addItem("개인봉사자", "청주 > 강남역", "차량이동봉사자를 모집합니다", "2023.06.02", "2023.06.02");
        adapter.addItem("개인봉사자", "청주 > 강남역", "차량이동봉사자를 모집합니다", "2023.06.02", "2023.06.02");

        return view;
    }
}