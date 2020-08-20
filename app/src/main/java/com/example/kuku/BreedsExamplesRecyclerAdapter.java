package com.example.kuku;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BreedsExamplesRecyclerAdapter extends RecyclerView.Adapter<BreedsExamplesRecyclerAdapter.ViewHolder> {

    private static Context mContext;
    private Cursor mCursor;
    private final LayoutInflater mLayoutInflater;
    private int mPurposePos;
    private int mExamplePos;
    private int mCharacteristics;
    private int mIdPos;

    public BreedsExamplesRecyclerAdapter(Context context, Cursor cursor) {
        mContext = context;
        mCursor = cursor;
        mLayoutInflater = LayoutInflater.from(mContext);
        populateColumnPositions();
    }

    private void populateColumnPositions() {

            if (mCursor == null)
                return;
        mPurposePos = mCursor.getColumnIndex(DataBaseContract.BroilersEntry.COLUMN_PURPOSE);
        mExamplePos = mCursor.getColumnIndex(DataBaseContract.BroilersEntry.COLUMN_EXAMPLE);
        mCharacteristics = mCursor.getColumnIndex(DataBaseContract.BroilersEntry.COLUMN_CHARACTERISTICS);
        mIdPos = mCursor.getColumnIndex(DataBaseContract.BroilersEntry._ID);
    }

    public void changeCursor(Cursor cursor){
        if (mCursor != null)
            mCursor.close();
        mCursor = cursor;
        populateColumnPositions();
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public BreedsExamplesRecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = mLayoutInflater.inflate(R.layout.item_breeds_example,parent,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull BreedsExamplesRecyclerAdapter.ViewHolder holder, int position) {

        mCursor.moveToPosition(position);

        String PurposePos = mCursor.getString(this.mPurposePos);
        String ExamplePos = mCursor.getString(this.mExamplePos);
        String CharacteristicsPos = mCursor.getString(this.mCharacteristics);
        int id = mCursor.getInt(mIdPos);

        holder.mTextPurpose.setText(PurposePos);
        holder.mTextExample.setText(ExamplePos);
        holder.mTextCharacteristics.setText(CharacteristicsPos);
        holder.mId = id;
    }

    @Override
    public int getItemCount() {
        return mCursor == null ? 0 : mCursor.getCount();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {


        private final TextView mTextCharacteristics;
        private final TextView mTextExample;
        private final TextView mTextPurpose;
        public int mId;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            mTextPurpose = itemView.findViewById(R.id.text_view_breeds_example_purpose);
            mTextExample = itemView.findViewById(R.id.text_view_breeds_example_examples);
            mTextCharacteristics = itemView.findViewById(R.id.text_view_breeds_example_characteristics);
        }
    }
}
