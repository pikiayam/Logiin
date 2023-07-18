package com.vickyhadisaputra202102353.logiin;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MyFragmentPagerAdapter#
 * create an instance of this fragment.
 *
 */
public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    private BeritaFragment _beritaFragment = new BeritaFragment();
    private Context _context;
    private ECommerceFragment _eCommerceFragment = new ECommerceFragment();
    private int _tabCount;
    private KampusFragment _kampusFragment = new KampusFragment();

    public MyFragmentPagerAdapter(Context context, FragmentManager fragmentManager, int tabCount)
    {
        super(fragmentManager);

        _context = context;
        _tabCount = tabCount;
    }
    @NonNull
    @Override
    public Fragment getItem(int position)
    {
        switch (position)
        {
            case 0:
                return _eCommerceFragment;
            case 1:
                return _beritaFragment;
            default:
                return _kampusFragment;
        }
    }

    @Override
    public int getCount() {
        return _tabCount;
    }
}
