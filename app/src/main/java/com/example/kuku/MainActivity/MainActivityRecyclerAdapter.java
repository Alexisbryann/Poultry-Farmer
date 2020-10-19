package com.example.kuku.MainActivity;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kuku.BadHabits.BadHabitsActivity;
import com.example.kuku.BestPractice.BestPracticeActivity;
import com.example.kuku.Breeds.BreedsActivity;
import com.example.kuku.Breeds.BreedsExamplesActivity;
import com.example.kuku.Brooding.BroodingActivity;
import com.example.kuku.Database.DataBaseContract;
import com.example.kuku.HousingAndEquipment.HousingAndEquipmentActivity;
import com.example.kuku.PoultryHealthManagement.PoultryHealthManagementActivity;
import com.example.kuku.PoultryManagement.PoultryManagementActivity;
import com.example.kuku.R;

public class MainActivityRecyclerAdapter extends RecyclerView.Adapter<MainActivityRecyclerAdapter.ViewHolder> {

    private static Context mContext;
    private Cursor mCursor;
    private final LayoutInflater mLayoutInflater;
    private int mTitlePos;
    private int mTitleDesc;
    private int mIdPos;

    public MainActivityRecyclerAdapter(Context context, Cursor cursor) {
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
        if (mCursor != null)
            mCursor.close();
        mCursor = cursor;
        populateColumnPositions();
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MainActivityRecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = mLayoutInflater.inflate(R.layout.items_main, parent, false);
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
    public int getItemCount() {
        return mCursor == null ? 0 : mCursor.getCount();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private final TextView mTextTitle;
        private final TextView mTextDescription;
        public int mId;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            itemView.setOnClickListener(this);
            mTextTitle = itemView.findViewById(R.id.text_view_title_main);
            mTextDescription = itemView.findViewById(R.id.text_view_main_description);

        }

        @Override
        public void onClick(View view) {
            int pos = getLayoutPosition();

            switch (pos) {
                case 0:
                    mContext.startActivity(new Intent(mContext, BadHabitsActivity.class));
                    break;
                case 1:
                    mContext.startActivity(new Intent(mContext, BestPracticeActivity.class));
                    break;
                case 2:
                    mContext.startActivity(new Intent(mContext, BreedsExamplesActivity.class));
                    break;
                case 3:
                    mContext.startActivity(new Intent(mContext, BroodingActivity.class));
                    break;
                case 4:
                    mContext.startActivity(new Intent(mContext, HousingAndEquipmentActivity.class));
                    break;
                case 5:
                    mContext.startActivity(new Intent(mContext, PoultryHealthManagementActivity.class));
                    break;
                case 6:
                    mContext.startActivity(new Intent(mContext, PoultryManagementActivity.class));
                    break;
            }
        }
    }
}
