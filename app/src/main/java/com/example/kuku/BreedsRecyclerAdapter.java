package com.example.kuku;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BreedsRecyclerAdapter extends RecyclerView.Adapter<BreedsRecyclerAdapter.ViewHolder> {

    private final Context mContext;
    private Cursor mCursor;
    private final LayoutInflater mLayoutInflater;
    private int mBreedPos;
    private int mPurposePos;
    private int mIdPos;

    public BreedsRecyclerAdapter(Context context, Cursor cursor) {
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
    public BreedsRecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

      View itemView = mLayoutInflater.inflate(R.layout.item_breed,parent,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull BreedsRecyclerAdapter.ViewHolder holder, int position) {
        mCursor.moveToPosition(position);

        String breed = mCursor.getString(mBreedPos);
        String purpose = mCursor.getString(mPurposePos);
        int id = mCursor.getInt(mIdPos);

        holder.mTextBreed.setText(breed);
        holder.mTextPurpose.setText(purpose);
        holder.mId = id;

    }

    @Override
    public int getItemCount() {
        return mCursor == null ? 0 : mCursor.getCount();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public final TextView mTextBreed;
        public final TextView mTextPurpose;
        public int mId;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            mTextBreed = itemView.findViewById(R.id.text_view_breed);
            mTextPurpose = itemView.findViewById(R.id.text_view_purpose);

        }
    }
}
