package vn.edu.usth.weather;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class WeatherActivity extends AppCompatActivity {
    private static final String TAG = "Weather";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        PagerAdapter adapter = new HomeFragmentPagerAdapter(getSupportFragmentManager());
        ViewPager pager = (ViewPager) findViewById(R.id.paper);
        pager.setOffscreenPageLimit(3);
        pager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(pager);

        Log.i(TAG, "On Create");
    };

    @Override
    protected void onStart(){
        super.onStart();
        Log.i(TAG, "On Start");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i(TAG, "On Resume");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i(TAG, "On Pause");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i(TAG, "On Stop");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i(TAG, "On Destroy");
    }
}