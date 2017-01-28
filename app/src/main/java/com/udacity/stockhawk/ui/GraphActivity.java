package com.udacity.stockhawk.ui;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.content.Intent;
import com.udacity.stockhawk.R;

/**
 * Created by Martin on 1/26/2017.
 */

public class GraphActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.graph_detail);
        if (savedInstanceState == null){
            // Create the detail fragment and add it to the activity
            // using a fragment transaction.
            Bundle arguments = new Bundle();
            arguments.putParcelable(GraphDetailFragment.DETAIL_URI, getIntent().getData());

            GraphDetailFragment fragment = new GraphDetailFragment();
            fragment.setArguments(arguments);

            getSupportFragmentManager().beginTransaction()
                    .add(R.id.graph_detail_container, fragment)
                    .commit();


        }


    }
}
