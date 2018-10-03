package br.com.senaijandira.examplefragment;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import br.com.senaijandira.examplefragment.fragments.Fragment1;
import br.com.senaijandira.examplefragment.fragments.Fragment2;

public class MainActivity extends AppCompatActivity {

    FragmentManager fm;
    TabLayout tab_menu;

    BottomNavigationView bottom_nav;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fm = getSupportFragmentManager();
        tab_menu = findViewById(R.id.tabMenu);
        tab_menu.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                //função que ocorre quando um aba e selecionada
                if(tab.getPosition()==0){
                    openFragment1(null);
                }else if(tab.getPosition()==1){
                    openFragment2(null);
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {}

            @Override
            public void onTabReselected(TabLayout.Tab tab) {}
        });

        /*##    Fim deo codigo de tabLayout    ##*/

        bottom_nav= findViewById(R.id.menu_nav_bottom);

        bottom_nav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId()== R.id.menu_frag1){
                    openFragment1(null);
                    return true;
                }
                if(item.getItemId()== R.id.menu_frag2){
                    openFragment2(null);
                    return true;
                }
                return false;
            }
        });

    }

    public void openFragment1(View view) {
        FragmentTransaction ft = fm.beginTransaction();

        ft.replace(R.id.frame_layout, new Fragment1());

        ft.commit();
    }

    public void openFragment2(View view) {
        FragmentTransaction ft = fm.beginTransaction();

        ft.replace(R.id.frame_layout, new Fragment2());

        ft.commit();
    }
}
