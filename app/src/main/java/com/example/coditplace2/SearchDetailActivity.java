package com.example.coditplace2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SearchDetailActivity extends BaseActivity{
    SearchDetailFrag searchDetailFrag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_detail);

        String getpidx = getIntent().getStringExtra("pidx");
        Log.d("pidx", "상세activity pidx: ");
        searchDetailFrag = new SearchDetailFrag(getpidx);

        // 화면 전환 프래그먼트 선언 및 초기 화면 설정
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.my_layout, searchDetailFrag).commit();
    }
    public void replaceFragment(Fragment fragment){ //프래그먼트 전환해주는 메소드
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = manager.beginTransaction();
        fragmentTransaction.replace(R.id.my_layout, fragment);
        fragmentTransaction.commit();
    }


}