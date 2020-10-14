package com.example.kuku.Breeds;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.app.LoaderManager;
import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import com.example.kuku.Database.DataBaseOpenHelper;
import com.example.kuku.Database.DataManager;
import com.example.kuku.R;

import static com.example.kuku.Database.DataBaseContract.*;

public class BreedsExamplesActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<Cursor> {

    public static final int LOADER_BREEDS_EXAMPLE = 0;
    private DataBaseOpenHelper mDbOpenHelper;
    private LinearLayoutManager mBreedsExampleLayoutManager;
    private BreedsExamplesRecyclerAdapter mBreedsExamplesRecyclerAdapter;
    private RecyclerView mRecyclerBreedsExample;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breeds_examples);

        mDbOpenHelper = new DataBaseOpenHelper(this);
        initializeDisplayContent();
    }

    @Override
    protected void onDestroy() {
        mDbOpenHelper.close();
        super.onDestroy();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mBreedsExamplesRecyclerAdapter.notifyDataSetChanged();
        getLoaderManager().restartLoader(LOADER_BREEDS_EXAMPLE, null,this);
    }

    private void initializeDisplayContent() {

        DataManager.loadFromDatabase(mDbOpenHelper);

        mRecyclerBreedsExample = findViewById(R.id.item_breeds_example);
        mBreedsExampleLayoutManager = new LinearLayoutManager(this);

        mBreedsExamplesRecyclerAdapter = new BreedsExamplesRecyclerAdapter(this,null);

        displayBreedsExamples();
    }

    private void displayBreedsExamples() {
            mRecyclerBreedsExample.setLayoutManager(mBreedsExampleLayoutManager);
            mRecyclerBreedsExample.setAdapter(mBreedsExamplesRecyclerAdapter);

    }
    @SuppressLint("StaticFieldLeak")
    @Override
    public Loader<Cursor> onCreateLoader(int id,  Bundle bundle) {
            CursorLoader loader = null;
            if (id == LOADER_BREEDS_EXAMPLE) {
                loader = new CursorLoader(this) {
                    @Override
                    public Cursor loadInBackground() {
                        SQLiteDatabase db = mDbOpenHelper.getReadableDatabase();
                        final String[] Columns = {
                                BroilersEntry.getQName(BroilersEntry._ID),
                                BroilersEntry.COLUMN_PURPOSE,
                                BroilersEntry.COLUMN_EXAMPLE,
                                BroilersEntry.COLUMN_CHARACTERISTICS};

                        final String exampleOrderBy = BroilersEntry.COLUMN_PURPOSE;

                        return db.query(BroilersEntry.TABLE_NAME, Columns, null, null, null, null, exampleOrderBy);
                    }
                };
        }

        return loader;
    }

    @Override
    public void onLoadFinished(Loader<Cursor> loader, Cursor data) {
        if (loader.getId() == LOADER_BREEDS_EXAMPLE) {
            mBreedsExamplesRecyclerAdapter.changeCursor(data);
        }
    }

    @Override
    public void onLoaderReset(Loader<Cursor> loader) {
        if (loader.getId()== LOADER_BREEDS_EXAMPLE) {
            mBreedsExamplesRecyclerAdapter.changeCursor(null);
        }

    }
}