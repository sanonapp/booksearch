package com.codepath.android.booksearch.activities;

import android.view.MenuItem;
import android.widget.SearchView;

public class OnQueryTextListener implements SearchView.OnQueryTextListener {
    @Override
    public boolean onQueryTextSubmit(String s) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String s) {
        return false;
    }

    protected boolean onOptionsItemSelected(MenuItem item) {
        return false;
    }
}
