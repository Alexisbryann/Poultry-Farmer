package com.example.kuku;

import android.provider.BaseColumns;

public class DataBaseContract implements BaseColumns {

    private DataBaseContract(){} // makes it non-creatable


    public static final class BreedsEntry implements BaseColumns{

        public static final String TABLE_NAME = "breeds";
        public static final String COLUMN_BREED = "breed";
        public static final String COLUMN_PURPOSE = "purpose";
        public static final String COLUMN_EXAMPLES = "examples";
        public static final String COLUMN_CHARACTERISTICS = "characteristics";

        // CREATE INDEX course_info_index1 ON course_info (course_title)
        public static final String INDEX1 = TABLE_NAME + "_index1";
        public static final String SQL_CREATE_INDEX1 =
                "CREATE INDEX " + INDEX1 + " ON " + TABLE_NAME +
                        "(" + COLUMN_BREED + ")";

        public static final String getQName(String columnName) {
            return TABLE_NAME + "." + columnName;
        }
        public static final String SQL_CREATE_TABLE =
                "CREATE TABLE " + TABLE_NAME + "(" +
                        _ID + "INTEGER PRIMARY KEY, " +
                        COLUMN_BREED + " TEXT" +
                        COLUMN_PURPOSE + " TEXT" +
                        COLUMN_EXAMPLES + " TEXT" +
                        COLUMN_CHARACTERISTICS + " TEXT)";
    }

    public static final class HousingAndEquipment implements BaseColumns{

        public static final String TABLE_NAME = "HOUSING AND EQUIPMENT";
//        public static final String COLUMN

//        public static final String SQL_CREATE_TABLE = "CREATE TABLE " + TABLE_NAME "(" +

    }
}
