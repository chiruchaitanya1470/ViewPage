package com.example.viewpager;

public enum ViewModel {
    RED(R.string.Red,R.layout.view_red),
    Green(R.string.Green,R.layout.view_green),
    Blue(R.string.Blue,R.layout.view_blue);
    private int mtitle;
    private int mlayout;

    ViewModel(int mtitle, int mlayout) {
        this.mtitle = mtitle;
        this.mlayout = mlayout;
    }


    public int getMtitle() {
        return mtitle;
    }

    public int getMlayout() {
        return mlayout;
    }
}
