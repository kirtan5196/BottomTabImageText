package iglobe.apple.com.bottomtabimagetext;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.widget.TabHost;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnMenuTabClickListener;

public class MainActivity extends AppCompatActivity {

    TabHost frame;
    BottomBar mbottomBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mbottomBar = BottomBar.attach(this, savedInstanceState);
        mbottomBar.setItemsFromMenu(R.menu.menu_nav, new OnMenuTabClickListener() {
            public void onMenuTabSelected(@IdRes int i) {
                if (i == R.id.home) {
                    Home f = new Home();
                    getFragmentManager().beginTransaction().replace(R.id.frame, f).commit();
                } else if (i == R.id.profile) {
                    Profile f = new Profile();
                    getFragmentManager().beginTransaction().replace(R.id.frame, f).commit();
                } else if (i == R.id.settings) {
                    Settings f = new Settings();
                    getFragmentManager().beginTransaction().replace(R.id.frame, f).commit();
                }
            }

            @Override
            public void onMenuTabReSelected(@IdRes int menuItemId) {

            }
        });

    }
}