package com.pe.trickmarket;

import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import com.herprogramacion.trickmarket.GridFragment;
import com.pe.trickmarket.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        // Setear adaptador al viewpager.
        mViewPager = (ViewPager) findViewById(R.id.pager);
        setupViewPager(mViewPager);

        // Preparar las pestañas
        TabLayout tabs = (TabLayout) findViewById(R.id.tabs);

        tabs.setupWithViewPager(mViewPager);
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }




    /**
     * Muestra una {@link Snackbar} prefabricada
     *
     * @param msg Mensaje a proyectar
     */


    /**
     * Establece la toolbar como action bar
     */


    /**
     * Crea una instancia del view pager con los datos
     * predeterminados
     *
     * @param viewPager Nueva instancia
     */
    private void setupViewPager(ViewPager viewPager) {
        SectionsPagerAdapter adapter = new SectionsPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(GridFragment.newInstance(1), getString(R.string.title_section1));
        adapter.addFragment(GridFragment.newInstance(2), getString(R.string.title_section2));
        adapter.addFragment(GridFragment.newInstance(3), getString(R.string.title_section3));
        adapter.addFragment(GridFragment.newInstance(4), getString(R.string.title_section4));
        adapter.addFragment(GridFragment.newInstance(5), getString(R.string.title_section5));
        adapter.addFragment(GridFragment.newInstance(6), getString(R.string.title_section6));
        adapter.addFragment(GridFragment.newInstance(7), getString(R.string.title_section7));
        adapter.addFragment(GridFragment.newInstance(8), getString(R.string.title_section8));
        adapter.addFragment(GridFragment.newInstance(9), getString(R.string.title_section9));
        adapter.addFragment(GridFragment.newInstance(10), getString(R.string.title_section10));
        adapter.addFragment(GridFragment.newInstance(12), getString(R.string.title_section12));
        adapter.addFragment(GridFragment.newInstance(13), getString(R.string.title_section13));
        adapter.addFragment(GridFragment.newInstance(14), getString(R.string.title_section14));
        adapter.addFragment(GridFragment.newInstance(15), getString(R.string.title_section15));
        adapter.addFragment(GridFragment.newInstance(16), getString(R.string.title_section16));
        adapter.addFragment(GridFragment.newInstance(17), getString(R.string.title_section17));
        adapter.addFragment(GridFragment.newInstance(18), getString(R.string.title_section18));
        adapter.addFragment(GridFragment.newInstance(19), getString(R.string.title_section19));

        viewPager.setAdapter(adapter);
    }

    /**
     * Método onClick() del FAB
     *
     * @param v View presionado
     */


    /**
     * Un {@link FragmentPagerAdapter} que gestiona las secciones, fragmentos y
     * títulos de las pestañas
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragments = new ArrayList<>();
        private final List<String> mFragmentTitles = new ArrayList<>();

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragments.get(position);
        }

        @Override
        public int getCount() {
            return mFragments.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragments.add(fragment);
            mFragmentTitles.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitles.get(position);
        }
    }

}
