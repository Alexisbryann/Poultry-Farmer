package com.example.kuku;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

import static com.example.kuku.DataBaseContract.*;

public class DataManager {
    private static DataManager ourInstance = null;
    private List<BreedInfo> mBreeds = new ArrayList<>();

    public static DataManager getInstance(){
        if (ourInstance == null){
            ourInstance=new DataManager();
        }
        return ourInstance;
    }
    public static void loadFromDatabase (DataBaseOpenHelper dataBaseOpenHelper){
        SQLiteDatabase database = dataBaseOpenHelper.getReadableDatabase();
        final  String[] breedsColumns = {
                BreedsEntry.COLUMN_BREED,
                BreedsEntry.COLUMN_PURPOSE,
                BreedsEntry.COLUMN_EXAMPLES,
                BreedsEntry.COLUMN_CHARACTERISTICS};
        final Cursor breedsCursor = database.query(BreedsEntry.TABLE_NAME,breedsColumns,null,null,null,null,BreedsEntry.COLUMN_BREED+"DESC" );
        loadBreedsFromDatabase(breedsCursor);
    }

    private static void loadBreedsFromDatabase(Cursor breedsCursor) {

        int breedPos = breedsCursor.getColumnIndex(BreedsEntry.COLUMN_BREED);
        int purposePos = breedsCursor.getColumnIndex(BreedsEntry.COLUMN_PURPOSE);
        int examplesPos = breedsCursor.getColumnIndex(BreedsEntry.COLUMN_EXAMPLES);
        int characteristicsPos = breedsCursor.getColumnIndex(BreedsEntry.COLUMN_CHARACTERISTICS);

        DataManager dm = getInstance();
        dm.mBreeds.clear();
        while (breedsCursor.moveToNext()){

            String breed = breedsCursor.getString(breedPos);
            String purpose = breedsCursor.getString(purposePos);
            String examples = breedsCursor.getString(examplesPos);
            String characteristics = breedsCursor.getString(characteristicsPos);

            BreedInfo breedInfo = new BreedInfo(breed,purpose,examples,characteristics);

            dm.mBreeds.add(breedInfo);
        }
        breedsCursor.close();
    }

    public List<BreedInfo> getBreeds() {return mBreeds;}

    public BreedInfo getBreed(String id){
        for (BreedInfo breedInfo:mBreeds){
            if (id.equals(breedInfo.getBreed()))
                return breedInfo;
        }
        return null;
    }
}
