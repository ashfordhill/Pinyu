package com.example.learnchinese.VocabReviewActivities;

import android.os.Bundle;


public class PeopleActivity extends VocabActivity {

    private String mCategory = "PEOPLE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public String sendCategory() {
        return mCategory;
    }

}
