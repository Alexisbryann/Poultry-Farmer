package com.example.kuku;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BreedsActivityRecyclerAdapter extends RecyclerView.Adapter<BreedsActivityRecyclerAdapter.ViewHolder> {

    private static Context mContext;
    private Cursor mCursor;
    private final LayoutInflater mLayoutInflater;
    private int mBreedPos;
    private int mPurposePos;
    private int mIdPos;

    public BreedsActivityRecyclerAdapter(Context context, Cursor cursor) {
        mContext = context;
        mCursor = cursor;
        mLayoutInflater = LayoutInflater.from(mContext);
        populateColumnPositions();
    }

    private void populateColumnPositions() {

        if (mCursor == null)
            return;
        mBreedPos = mCursor.getColumnIndex(DataBaseContract.BreedsEntry.COLUMN_BREED);
        mPurposePos = mCursor.getColumnIndex(DataBaseContract.BreedsEntry.COLUMN_PURPOSE);
        mIdPos = mCursor.getColumnIndex(DataBaseContract.BreedsEntry._ID);
    }

    public void changeCursor(Cursor cursor) {
        if(mCursor != null)
            mCursor.close();
        mCursor = cursor;
        populateColumnPositions();
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public BreedsActivityRecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

      View itemView = mLayoutInflater.inflate(R.layout.item_breed,parent,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull BreedsActivityRecyclerAdapter.ViewHolder holder, int position) {
        mCursor.moveToPosition(position);

        String breed = mCursor.getString(mBreedPos);
        String purpose = mCursor.getString(mPurposePos);
//        String example = mCursor.getString(mExamplePos);
        int id = mCursor.getInt(mIdPos);

        holder.mTextBreed.setText(breed);
        holder.mTextPurpose.setText(purpose);
//        holder.mTextExample.setText(example);
        holder.mId = id;
    }

    @Override
    public int getItemCount() {
        return mCursor == null ? 0 : mCursor.getCount();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public final TextView mTextBreed;
        public final TextView mTextPurpose;
        public int mId;
//        private final TextView mTextExample;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            itemView.setOnClickListener(this);
            mTextBreed = itemView.findViewById(R.id.text_view_breed);
            mTextPurpose = itemView.findViewById(R.id.text_view_main_description);
//            mTextExample = itemView.findViewById(R.id.text_view_breeds_example);
        }

        @Override
        public void onClick(View view) {

            int pos = getLayoutPosition();

            if (pos == 0) {
                mContext.startActivity(new Intent(mContext, BreedsExamplesActivity.class));
            }
        }
    }
}
