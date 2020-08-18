package com.example.kuku;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivityRecyclerAdapter extends RecyclerView.Adapter<MainActivityRecyclerAdapter.ViewHolder> {

    private final Context mContext;
    private Cursor mCursor;
    private final LayoutInflater mLayoutInflater;
    private int mTitlePos;
    private int mTitleDesc;
    private int mIdPos;

    public MainActivityRecyclerAdapter(Context context, Cursor cursor){
        mContext = context;
        mCursor = cursor;
        mLayoutInflater = LayoutInflater.from(mContext);
        populateColumnPositions();
    }

    private void populateColumnPositions() {
        if (mCursor == null)
            return;
        mTitlePos = mCursor.getColumnIndex(DataBaseContract.MainEntry.COLUMN_TITLE);
        mTitleDesc = mCursor.getColumnIndex(DataBaseContract.MainEntry.COLUMN_DESCRIPTION);
        mIdPos = mCursor.getColumnIndex(DataBaseContract.MainEntry._ID);

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
    public MainActivityRecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = mLayoutInflater.inflate(R.layout.items_main,parent,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MainActivityRecyclerAdapter.ViewHolder holder, int position) {
        mCursor.moveToPosition(position);

        String TitlePos = mCursor.getString(this.mTitlePos);
        String TitleDesc = mCursor.getString(mTitleDesc);
        int id = mCursor.getInt(mIdPos);

        holder.mTextTitle.setText(TitlePos);
        holder.mTextDescription.setText(TitleDesc);
        holder.mId = id;
    }

    @Override
    public int getItemCount() { return mCursor == null ? 0 :mCursor.getCount(); }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private final TextView mTextTitle;
        private final TextView mTextDescription;
        public int mId;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            mTextTitle = itemView.findViewById(R.id.text_view_title);
            mTextDescription = itemView.findViewById(R.id.text_view_main_description);
        }
    }
}
