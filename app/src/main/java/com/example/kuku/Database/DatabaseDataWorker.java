package com.example.kuku.Database;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import com.example.kuku.R;

public class DatabaseDataWorker {
    private SQLiteDatabase mDb;
    public DatabaseDataWorker(SQLiteDatabase db){ mDb = db;}

    public void insertBreeds() {
        insertBreed("Layer.\n",
                R.drawable.leghorn,

                "PURPOSE. \n" +
                        "1. Specifically kept for Egg production, meat from layers is considered a by-product.\n" +
                        "2. For commercial layers, the productive period is usually one " +
                        "year at an average production of Two hundred and forty Three hundred eggs a year.\n",

                "EXAMPLE.\n" +
                        "Leghorn.\n",

                "CHARACTERISTICS.\n" +
                        "1. It's colour ranges are white,black or orange.\n" +
                        "2. Usually light weight.\n" +
                        "3. Have low tendencies for broodiness.\n" +
                        "4. Can lay up to Three hundred eggs per year.\n");

        insertBreed("Layer.\n",
                R.drawable.isa_brown,

                "PURPOSE. \n" +
                        "1. Specifically kept for Egg production, meat from layers is considered a by-product.\n" +
                        "2. For commercial layers, the productive period is usually one " +
                        "year at an average production of Two hundred and forty Three hundred eggs a year.\n",

                "EXAMPLE.\n" +
                        "Isa Brown.\n",

                "CHARACTERISTICS.\n" +
                        "1. Cocks are usually white with black shades while hens are usually brownish in colour.\n" +
                        "2. This is a hybrid bird.\n" +
                        "3. Starts laying at four and a half to five months.\n" +
                        "4. Have low tendencies for broodiness.\n");

        insertBreed("Broiler.\n",
                R.drawable.broiler,

                "PURPOSE. \n" +
                        "1. These are specifically bred for meat production and their meat is very soft.\n" +
                        "2. They grow very fast and attain market weight in about six to eight weeks of age if " +
                        "fed on feed rations that support their genetic requirements, by this time, they will have consumed about 5.5 kg of feed.\n" +
                        "3. They attain live weight of about two to two and a half kg within seven to eight weeks of age.\n" +
                        "4. Their production cycle is relatively short, ranging between six to eight weeks.\n",
                "EXAMPLE.\n" +
                        "Plymouth Rock, Cornish, Sussex, Brahma and hybrids.\n",

                "CHARACTERISTICS.\n" +

                        "1. Comparatively, weigh much heavier than other poultry breeds.\n" +
                        "2. Do not go broody.\n" +
                        "3. Have high feed conversion efficiency.\n" +
                        "4. Grow very fast.\n" +
                        "5. They are very poor layers.\n" +
                        "6. They can grow to a very large size.\n");

        insertBreed("Dual purpose.\n", R.drawable.oprington,

                "PURPOSE. \n" +
                        "These birds can be raised for either eggs or meat or for both.\n",

                "EXAMPLE.\n" +
                        "Orpington.\n",

                "CHARACTERISTICS.\n" +
                        "1. Black, white, blue or brownish in colour.\n" +
                        "2. Begin laying at five to six months of age.\n" +
                        "3. Heavy bird attaining three and a half to four kg.\n");

        insertBreed("Dual purpose.\n", R.drawable.rhode_island_red,

                "PURPOSE. \n" +
                        "These birds can be raised for either eggs or meat or for both.\n",

                "EXAMPLE.\n" +
                        "Rhode Island Red.\n",

                "CHARACTERISTICS.\n" +
                        "1. Brownish-red in colour.\n" +
                        "2. Attains three and a half to four kg.\n" +
                        "3. Brown shelled eggs.\n" +
                        "4. Low tendencies for broodiness.\n");

        insertBreed("Indigenous (local).\n", R.drawable.kienyeji,

                "PURPOSE. \n" +
                        "This is the local chicken. Kept for both its meat and eggs.\n",

                "EXAMPLE.\n" +
                        "",

                "CHARACTERISTICS\n" +
                        "1. Small body size.\n" +
                        "2. Very low egg production, usually thirty to forty eggs per year.\n" +
                        "3. Broody.\n" +
                        "4. Good mothering ability.\n" +
                        "5. Low growth rate and low meat yield.\n");

        insertBreed("IMPROVED INDIGENOUS CHICKEN.\n", R.drawable.kenbro,

                "PURPOSE. \n" +
                        "1. Improved indigenous (kienyeji) chicken developed through genetic improvement of the local chicken.\n" +
                        "2. This improved breed has superior qualities compared  to local breeds, these qualities include," +
                        "3. higher egg production, higher growth rate, higher mature weight and low tendencies for broodiness.\n",

                "EXAMPLE.\n" +
                        "Kenbro chicken.\n",

                "CHARACTERISTICS.\n" +
                        "1. Dual purpose breed that requires less intensive management.\n" +
                        "2. More resistant to diseases hence easily adapts to the local conditions.\n" +
                        "3. Survives on free range local production system, though it is a heavy feeder.\n" +
                        "4. Attains a mature weight of four and a half kg within five and a half months.\n" +
                        "5. Tasty and soft meet, hence in demand in the market.\n");

        insertBreed("IMPROVED INDIGENOUS CHICKEN.\n", R.drawable.rainbow,

                "PURPOSE. \n" +
                        "1. A number of improved indigenous (kienyeji) chicken have been developed through genetic improvement of the local chicken. \n" +
                        "2. This improved breed has superior qualities compared  to local breeds, these qualities include," +
                        "higher egg production, higher growth rate, higher mature weight and low tendencies for broodiness.\n",

                "EXAMPLE.\n" +
                        "Rainbow Rooster.\n",

                "CHARACTERISTICS\n" +
                        "1. Dual purpose breed with a high growth rate.\n" +
                        "2. Can do well on free range local production system.\n" +
                        "3. Attains a mature weight of four kg within six months.\n" +
                        "4. Heavy feeder, this is suppressed by its good feed conversion efficiency.\n");

        insertBreed("IMPROVED INDIGENOUS CHICKEN.\n", R.drawable.kuroiler,

                "PURPOSE. \n" +
                        "1. A number of improved indigenous (kienyeji) chicken have been developed through genetic improvement of the local chicken.\n" +
                        "2. This improved breed has superior qualities compared  to local breeds, these qualities include," +
                        "higher egg production, higher growth rate, higher mature weight and low tendencies for broodiness.\n",

                "EXAMPLE.\n" +
                        "Kuroiler chicken.",

                "CHARACTERISTICS.\n" +
                        "1. Dual purpose breed that can do well on free range.\n" +
                        "2. Lays between one hundred and forty to one hundred and fifty eggs per year.\n" +
                        "3. More resistant to diseases hence easily adapts to the local conditions.\n" +
                        "4. Can scavenge on kitchen left overs and farm by-products.\n" +
                        "5. Attains a mature weight of four kg within six months.\n" +
                        "6. Does not brood, hence will not sit on eggs, a farmer will have to give its eggs to local chicken or use an incubator.\n");

        insertBreed("IMPROVED INDIGENOUS CHICKEN.\n",
                R.drawable.improved_indigenous_chicken,

                "PURPOSE. \n" +
                        "1. A number of improved indigenous (kienyeji) chicken have been developed through genetic improvement of the local chicken.\n" +
                        "2. This improved breed has superior qualities compared  to local breeds, these qualities include," +
                        "higher egg production, higher growth rate, higher mature weight and low tendencies for broodiness.\n",

                "EXAMPLE.\n" +
                        "Improved KARI indigenous chicken.\n",

                "CHARACTERISTICS.\n" +
                        "1. Dual purpose breed kept for both eggs and meat.\n" +
                        "2. It is hardy and more resistant to diseases than hybrids.\n" +
                        "3. Attains a mature weight of two and a half kg and above in five months for cocks" +
                        " while hens attain two kg and above in the same period.\n" +
                        "4. Does quite well in egg production, producing up to two hundred and twenty eggs per year .\n");
    }

    private void insertBreed(String breed, int image, String purpose, String example, String characteristics) {

        ContentValues values = new ContentValues();

        values.put(DataBaseContract.BreedsEntry.COLUMN_BREED,breed);
        values.put(DataBaseContract.BreedsEntry.COLUMN_IMAGE, image);
        values.put(DataBaseContract.BreedsEntry.COLUMN_EXAMPLES,example);
        values.put(DataBaseContract.BreedsEntry.COLUMN_PURPOSE,purpose);
        values.put(DataBaseContract.BreedsEntry.COLUMN_CHARACTERISTICS,characteristics);

        long newRowId = mDb.insert(DataBaseContract.BreedsEntry.TABLE_NAME,null,values);
    }

    public void insertMains(){
        insertMain( "Breeds", "An overview of various chicken breeds and their characteristics.");
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
