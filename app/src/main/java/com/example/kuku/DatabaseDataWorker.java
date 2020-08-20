package com.example.kuku;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

public class DatabaseDataWorker {
    private SQLiteDatabase mDb;

    public DatabaseDataWorker(SQLiteDatabase db){ mDb = db;}

    public void insertBreeds(){
        insertBreed("Layer.",

                    "Specifically kept for Egg production, meat from layers is considered a by-product.",
//                           "For commercial layers, the productive period is usually 1 (one)" +
//                            "year at an average production of 240 (Two hundred and forty) - 300 (Three hundred) eggs a year.",

                    "Leghorn.",

                    "It's colour ranges are white,black or orange." +
                            "Usually light weight." +
                            "Have low tendencies for broodiness." +
                            "Can lay up to 300 (Three hundred) eggs per year.");

//        insertBreed("Layer.",
//
//                    "Specifically kept for Egg production." +
//                        "Meet from layers is considered a by-product." +
//                        "For commercial layers, the productive period is usually 1 year at" +
//                            " an average production of 240 (Two hundred and forty) - 300 (Three hundred) eggs a year",
//
//                    "Isa Brown.",
//
//                    "Cocks are usually white with black shades while hens are usually brownish in colour." +
//                            "This is a hybrid bird." +
//                            "Starts laying at 4.5 (four and a half)  to 5 (five) months." +
//                            "Have low tendencies for broodiness.");

        insertBreed("Broiler.",

                    "These are specifically bred for meat production and their meat is very soft." ,
//                            "They grow very fast and attain market weight in about 6 (six) to 8 (eight) weeks of age if " +
//                            "fed on feed rations that support their genetic requirements, by this time, they will have consumed about 5.5 kg of feed." +
//                            "They attain live weight of about 2 (two) to 2.5 (two and a half) kg within 7 (seven) to 8 (eight) weeks of age." +
//                            "Their production cycle is relatively short, ranging between 6 (six) to 8 (eight) weeks",

                    "Plymouth Rock, Cornish, Sussex, Brahma and hybrids",

                    "Comparatively, weigh much heavier than other poultry breeds." +
                            "Do not go broody." +
                            "Have high feed conversion efficiency." +
                            "Grow very fast." +
                            "They are very poor layers." +
                            "They can grow to a very large size.");

        insertBreed("Dual purpose.",

                    "These birds can be raised for either eggs or meat or for both.",

                    "Orpington.",

                    "Black, white, blue or brownish in colour." +
                        "Begin laying at 5 (five) to 6 (six) months of age." +
                        "Heavy bird attaining 3.5 (three and a half) to 4.0 (four) kg.");

//        insertBreed("Dual purpose.",
//
//                    "These birds can be raised for either eggs or meat or for both.",
//
//                    "Rhode Island Red.",
//
//                    "Brownish-red in colour." +
//                        "Attains 3.5 (three and a half) to 4.0 (four) kg." +
//                        "Brown shelled eggs." +
//                        "Low tendencies for broodiness.");

        insertBreed("Indigenous (local)",

                    "This is the local chicken. Kept for both its meat and eggs.",

                    "",

                    "Small body size." +
                        "Very low egg production, usually 30 (thirty) to 40 (forty) eggs per year." +
                        "Broody." +
                        "Good mothering ability." +
                        "Low growth rate and low meat yield.");

        insertBreed("Improved indigenous chicken.",

                    "Improved indigenous (kienyeji) chicken developed through genetic improvement of the local chicken." ,
//                        "This improved breed has superior qualities compared  to local breeds, these qualities include," +
//                        "higher egg production, higher growth rate, higher mature weight and low tendencies for broodiness.",

                    "Kenbro chicken.",

                    "Dual purpose breed that requires less intensive management." +
                        "More resistant to diseases hence easily adapts to the local conditions." +
                        "Survives on free range local production system, though it is a heavy feeder." +
                        "Attains a mature weight of 4.5 (four and a half) kg within 5.5 (five and a half) months." +
                        "Tasty and soft meet, hence in demand in the market.");

//        insertBreed("Improved indigenous chicken.",
//
//                    "A number of improved indigenous (kienyeji) chicken have been developed through genetic improvement of the local chicken." +
//                        "This improved breed has superior qualities compared  to local breeds, these qualities include," +
//                        "higher egg production, higher growth rate, higher mature weight and low tendencies for broodiness.",
//
//                    "Rainbow Rooster.",
//
//                    "Dual purpose breed with a high growth rate." +
//                        "Can do well on free range local production system." +
//                        "Attains a mature weight of 4 (four) kg within 6 (six) months." +
//                        "Heavy feeder, this is suppressed by its good feed conversion efficiency.");
//
//        insertBreed("Improved indigenous chicken.",
//
//                    "A number of improved indigenous (kienyeji) chicken have been developed through genetic improvement of the local chicken." +
//                        "This improved breed has superior qualities compared  to local breeds, these qualities include," +
//                        "higher egg production, higher growth rate, higher mature weight and low tendencies for broodiness.",
//
//                    "Kuroiler chicken.",
//
//                    "Dual purpose breed that can do well on free range." +
//                        "Lays between 140 (one hundred and forty) to 150 (one hundred and fifty) eggs per year."+
//                        "More resistant to diseases hence easily adapts to the local conditions." +
//                        "Can scavenge on kitchen left overs and farm by-products." +
//                        "Attains a mature weight of 4 (four) kg within 6 (six) months." +
//                        "Does not brood, hence will not sit on eggs, a farmer will have to give its eggs to local chicken or use an incubator.");
//
//        insertBreed("Improved indigenous chicken.",
//
//                    "A number of improved indigenous (kienyeji) chicken have been developed through genetic improvement of the local chicken." +
//                        "This improved breed has superior qualities compared  to local breeds, these qualities include," +
//                        "higher egg production, higher growth rate, higher mature weight and low tendencies for broodiness.",
//
//                    "Improved KARI indigenous chicken.",
//
//                    "Dual purpose breed kept for both eggs and meat." +
//                        "It is hardy and more resistant to diseases than hybrids." +
//                        "Attains a mature weight of 2.5 (two and a half) kg and above in 5  (five) months for cocks" +
//                        " while hens attain 2.0 (two) kg and above in the same period." +
//                        "Does quite well in egg production, producing up to 220 (two hundred and twenty) eggs per year .");
    }

    public void insertBroilers(){
        insertBroiler("PURPOSE. \n" +
                        "1.Specifically bred for meat production and their meat is very soft.\n" +
                        "2.They grow very fast and attain market weight in about six to eight weeks of age if"+
                        "fed on feed rations that support their genetic requirements, by this time, they will have consumed about five and a half kilograms of feed.\n"+
                        "3.They attain live weight of about two to two and a half kg within seven to eight weeks of age.\n "+
                        "4.Their production cycle is relatively short, ranging between six to eight weeks.\n",
                "EXAMPLES. \n" +
                        "Plymouth Rock, Cornish, Sussex, Brahma and hybrids.",
                "CHARACTERISTICS. \n" +
                        "1.Comparatively, weigh much heavier than other poultry breeds.\n" +
                        "2.Do not go broody.\n" +
                        "3.Have high feed conversion efficiency.\n" +
                        "4.Grow very fast.\n" +
                        "5.They are very poor layers.\n" +
                        "6.They can grow to a very large size.");
    }

    private void insertBroiler(String purpose, String example, String characteristics){
        ContentValues values = new ContentValues();
        values.put(DataBaseContract.BroilersEntry.COLUMN_PURPOSE,purpose);
        values.put(DataBaseContract.BroilersEntry.COLUMN_EXAMPLE,example);
        values.put(DataBaseContract.BroilersEntry.COLUMN_CHARACTERISTICS,characteristics);

        long newRowId = mDb.insert(DataBaseContract.BroilersEntry.TABLE_NAME,null,values);
    }
    private void insertBreed(String breed, String purpose, String example, String characteristics) {

        ContentValues values = new ContentValues();

        values.put(DataBaseContract.BreedsEntry.COLUMN_BREED,breed);
        values.put(DataBaseContract.BreedsEntry.COLUMN_PURPOSE,purpose);
//        values.put(DataBaseContract.BreedsEntry.COLUMN_EXAMPLES,example);
//        values.put(DataBaseContract.BreedsEntry.COLUMN_CHARACTERISTICS,characteristics);

        long newRowId = mDb.insert(DataBaseContract.BreedsEntry.TABLE_NAME,null,values);
    }

    public void insertMains(){
        insertMain( "Breeds", "Discusses various chicken breeds and their characteristics.");
        insertMain("Housing and equipment","Recommendations on requirements and consideration while building a chicken coop.");
        insertMain("Brooding","Describes how to provide heat for newly hatched chicks.");
        insertMain("Poultry management","Entails various systems you can use to rear your chicken.");
        insertMain("Poultry health management","Directions on how to ensure a healthy flock and diagnose common diseases early.");
        insertMain("Bad Habits","Describes common bad habits among poultry and how to manage the vices.");
        insertMain("Best practice","Entails standard techniques and management strategies.");
    }
    private void insertMain(String title, String description){
        ContentValues values = new ContentValues();

        values.put(DataBaseContract.MainEntry.COLUMN_TITLE,title);
        values.put(DataBaseContract.MainEntry.COLUMN_DESCRIPTION,description);

        long newRowId = mDb.insert(DataBaseContract.MainEntry.TABLE_NAME,null,values);
    }
}
