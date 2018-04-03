package com.bigappcompany.wheelstreet;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.bigappcompany.wheelstreet.fragment.ShowFormFragment;

/**
 * Created by shankar on 3/4/18.
 */

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gotoFirstFrsgment();
    }

    private void gotoFirstFrsgment() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fl_holder, new ShowFormFragment())
                .commit();
    }
}
