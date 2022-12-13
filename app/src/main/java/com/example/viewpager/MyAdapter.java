package com.example.viewpager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.PagerAdapter;

public class MyAdapter extends PagerAdapter {
    Context mcontext;

    public MyAdapter(Context mcontext) {
        this.mcontext = mcontext;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        ViewModel model=ViewModel.values()[position];
        LayoutInflater inflater =LayoutInflater.from(mcontext);
        View layout=inflater.inflate(model.getMlayout(),container,false);
        container.addView(layout);
        return  layout;




//        return super.instantiateItem(container, position);
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
//        super.destroyItem(container, position, object);
    }

    @Override
    public int getCount() {
        return ViewModel.values().length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        ViewModel pages=ViewModel.values()[position];

        return mcontext.getString(pages.getMtitle());

//        return super.getPageTitle(position);
    }
}
