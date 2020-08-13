package com.example.kuku;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBaseOpenHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "kuku.db";
    public static final int DATABASE_VERSION = 1;

    public DataBaseOpenHelper(Context context) {
        super(context,DATABASE_NAME, null, DATABASE_VERSION);
}

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(DataBaseContract.BreedsEntry.SQL_CREATE_TABLE);
//        sqLiteDatabase.execSQL(DataBaseContract.HousingAndEquipment.SQL_CREATE_TABLE);

        DatabaseDataWorker worker = new DatabaseDataWorker(sqLiteDatabase);
        worker.insertBreeds();
//        worker.insertHousingAndEquipment();
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
