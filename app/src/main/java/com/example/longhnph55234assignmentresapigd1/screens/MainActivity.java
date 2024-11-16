package com.example.longhnph55234assignmentresapigd1.screens;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.example.longhnph55234assignmentresapigd1.Adapter.ViewPager2Adapter;
import com.example.longhnph55234assignmentresapigd1.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bottomNav;
    private ViewPager2 viewPager2;
    private ViewPager2Adapter pager2Adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        bottomNav = findViewById(R.id.nav_bottom);
        viewPager2 = findViewById(R.id.view_pager2);
        setUpViewPager2();
        bottomNav.setOnItemSelectedListener(item -> {
            onNavBottomItemSelected(item.getItemId());
            return true;
        });
    }


    private void onNavBottomItemSelected(int id) {
        if(id == R.id.nav_home) {
            viewPager2.setCurrentItem(0);
        } else if(id == R.id.nav_cart) {
            viewPager2.setCurrentItem(1);
        } else if(id == R.id.nav_category) {
            viewPager2.setCurrentItem(2);
        } else {
            viewPager2.setCurrentItem(3);
        }
    }

    private void setUpViewPager2() {
        pager2Adapter = new ViewPager2Adapter(getSupportFragmentManager(), getLifecycle() );
        viewPager2.setAdapter(pager2Adapter);
        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);

                switch (position) {
                    case 0:
                        bottomNav.getMenu().findItem(R.id.nav_home).setChecked(true);
                        break;
                    case 1:
                        bottomNav.getMenu().findItem(R.id.nav_cart).setChecked(true);
                        break;
                    case 2:
                        bottomNav.getMenu().findItem(R.id.nav_category).setChecked(true);
                        break;
                    case 3:
                        bottomNav.getMenu().findItem(R.id.nav_profile).setChecked(true);
                        break;
                }
            }
        });
    }
}