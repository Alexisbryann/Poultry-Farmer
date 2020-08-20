package com.example.kuku;

import android.provider.BaseColumns;

public class DataBaseContract implements BaseColumns {

    private DataBaseContract() {
    } // makes it non-creatable


    public static final class BreedsEntry implements BaseColumns {

        public static final String TABLE_NAME = "breeds";
        public static final String COLUMN_DESCRIPTION = "description";
        public static final String COLUMN_BREED = "breed";
        public static final String COLUMN_PURPOSE = "purpose";
        public static final String COLUMN_EXAMPLES = "examples";
        public static final String COLUMN_CHARACTERISTICS = "characteristics";

        //         CREATE INDEX breed_info_index1 ON breed_info (course_title)
        public static final String INDEX1 = TABLE_NAME + "_index1";
        public static final String SQL_CREATE_INDEX1 =
                "CREATE INDEX " + INDEX1 + " ON " + TABLE_NAME +
                        "(" + COLUMN_BREED + ")";

        public static final String getQName(String columnName) {
            return TABLE_NAME + "." + columnName;
        }

        public static final String SQL_CREATE_TABLE =
                "CREATE TABLE " + TABLE_NAME + "(" +
                        _ID + " INTEGER PRIMARY KEY," +
                        COLUMN_DESCRIPTION + " TEXT," +
                        COLUMN_BREED + " TEXT," +
                        COLUMN_PURPOSE + " TEXT," +
                        COLUMN_EXAMPLES + " TEXT," +
                        COLUMN_CHARACTERISTICS + " TEXT)";
    }

    public static final class HousingAndEquipmentEntry implements BaseColumns {

        public static final String TABLE_NAME = "housingAndEquipment";
        public static final String COLUMN_DESCRIPTION = "description";
        public static final String COLUMN_CONSIDERATIONS = "considerations";
        public static final String COLUMN_CONSTRUCTION = "construction";
        public static final String COLUMN_EQUIPMENT = "equipment";

        public static final String SQL_CREATE_TABLE =
                "CREATE TABLE " + TABLE_NAME + "(" +
                        _ID + " INTEGER PRIMARY KEY," +
                        COLUMN_DESCRIPTION + "TEXT," +
                        COLUMN_CONSIDERATIONS + "TEXT," +
                        COLUMN_CONSTRUCTION + "TEXT," +
                        COLUMN_EQUIPMENT + "TEXT)";

    }

    public static final class BroodingEntry implements BaseColumns {

        public static final String TABLE_NAME = "brooding";
        public static final String COLUMN_DESCRIPTION = "description";
        public static final String COLUMN_NATURAL_BROODING = "natural brooding";
        public static final String COLUMN_ARTIFICIAL_BROODING = "artificial brooding";

        public static final String SQL_CREATE_TABLE =
                "CREATE TABLE " + TABLE_NAME + "(" +
                        _ID + "INTEGER PRIMARY KEY, " +
                        COLUMN_DESCRIPTION + "TEXT, " +
                        COLUMN_NATURAL_BROODING + "TEXT, " +
                        COLUMN_ARTIFICIAL_BROODING + "TEXT)";
    }

    public static final class PoultryManagementEntry implements BaseColumns {

        public static final String TABLE_NAME = "poultryManagement";
        public static final String COLUMN_DESCRIPTION = "description";
        public static final String COLUMN_SYSTEMS = "systems";


        public static final String SQL_CREATE_TABLE =
                "CREATE TABLE " + TABLE_NAME + "(" +
                        _ID + "INTEGER PRIMARY KEY, " +
                        COLUMN_DESCRIPTION + "TEXT, " +
                        COLUMN_SYSTEMS + "TEXT)";

    }

    public static final class CommonDiseasesEntry implements BaseColumns {
        public static final String TABLE_NAME = "commonDiseases";
        public static final String COLUMN_DESCRIPTION = "description";


        public static final String SQL_CREATE_TABLE =
                "CREATE TABLE " + TABLE_NAME + "(" +
                        _ID + "INTEGER PRIMARY KEY, " +
                        COLUMN_DESCRIPTION + "TEXT )";
    }

    public static final class BadHabitsEntry implements BaseColumns {
        public static final String TABLE_NAME = "badHabits";
        public static final String COLUMN_DESCRIPTION = "description";

        public static final String SQL_CREATE_TABLE =
                "CREATE TABLE " + TABLE_NAME + "(" +
                        _ID + "INTEGER PRIMARY KEY, " +
                        COLUMN_DESCRIPTION + "TEXT)";
    }

    public static final class BestPracticeEntry implements BaseColumns {
        public static final String TABLE_NAME = "bestPractice";
        public static final String COLUMN_DESCRIPTION = "description";

        public static final String SQL_CREATE_TABLE =
                "CREATE TABLE " + TABLE_NAME + "(" +
                        _ID + "INTEGER PRIMARY KEY, " +
                        COLUMN_DESCRIPTION + "TEXT)";
    }

    public static final class MainEntry implements BaseColumns {
        public static final String TABLE_NAME = "main";
        public static final String COLUMN_TITLE = "title";
        public static final String COLUMN_DESCRIPTION = "description";

        public static final String INDEX1 = TABLE_NAME + "_index1";
        public static final String SQL_CREATE_INDEX1 =
                "CREATE INDEX " + INDEX1 + " ON " + TABLE_NAME +
                        "(" + COLUMN_TITLE + ")";

        public static String getQName(String columnName) {
            return TABLE_NAME + "." + columnName;
        }

        public static final String SQL_CREATE_TABLE =
                "CREATE TABLE " + TABLE_NAME + "(" +
                        _ID + " INTEGER PRIMARY KEY, " +
                        COLUMN_TITLE + " TEXT, " +
                        COLUMN_DESCRIPTION + " TEXT)";
    }
    public static final class BroilersEntry implements BaseColumns {
        public static final String TABLE_NAME = "broilers";
        public static final String COLUMN_PURPOSE = "purpose";
        public static final String COLUMN_EXAMPLE = "example";
        public static final String COLUMN_CHARACTERISTICS = "characteristics";

        public static final String getQName(String columnName) {
            return TABLE_NAME + "." + columnName;
        }
        public static final String SQL_CREATE_TABLE =
                "CREATE TABLE " + TABLE_NAME + "(" +
                        _ID + " INTEGER PRIMARY KEY, " +
                        COLUMN_PURPOSE+ " TEXT, " +
                        COLUMN_EXAMPLE+ " TEXT, " +
                        COLUMN_CHARACTERISTICS+ " TEXT)";
    }
}
