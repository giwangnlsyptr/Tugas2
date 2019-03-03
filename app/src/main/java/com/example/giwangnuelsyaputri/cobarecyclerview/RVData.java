package com.example.giwangnuelsyaputri.cobarecyclerview;

import java.util.ArrayList;

public class RVData {
    private static String[] title = new String[]{"Jennie Blackpink", "Jisoo Blackpink",
            "Rose Blackpink", "Lisa Blackpink", "Kim Ji Won", "Suzy", "Song Hye Kyo", "Lee Sung Kyung"};


    private static int[] thumbnail = new
            int[]{R.drawable.jennie_bp, R.drawable.jisoo_bp, R.drawable.rose_bp, R.drawable.lisa_bp,
            R.drawable.kim, R.drawable.suzy, R.drawable.song, R.drawable.lee};

    public static ArrayList<RVModel> getListData() {
        RVModel rvModel = null;
        ArrayList<RVModel> list = new ArrayList<>();
        for (int i = 0; i < title.length; i++) {
            rvModel = new RVModel();
            rvModel.setLogo(thumbnail[i]);
            rvModel.setName(title[i]);
            list.add(rvModel);
        }
        return list;
    }
}


