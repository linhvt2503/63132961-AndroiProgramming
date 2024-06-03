package linhvothuy.l63132961.onthi;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavigationView = findViewById(R.id.BottomNavigationView);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment selectedFragment =null;
                int itemID = menuItem.getItemId();
                if(itemID == R.id.navCau1 ){
                    selectedFragment = new Cau1Fragment();
                } else if (itemID == R.id.navCau2) {
                    selectedFragment = new Cau2Fragment();
                } else if (itemID == R.id.navCau3) {
                    selectedFragment = new Cau3Fragment();
                } else if (itemID == R.id.navCau4) {
                    selectedFragment = new Cau4Fragment();
                }
                if (selectedFragment != null){
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragmentSpace,selectedFragment).commit();
                }
                return true;
            }
        });
        Fragment homeFragment = new Cau1Fragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentSpace, homeFragment).commit();
    }
}