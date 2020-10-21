package com.alexis.kuku.Database;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import com.alexis.kuku.R;

public class DatabaseDataWorker {
    private SQLiteDatabase mDb;
    public DatabaseDataWorker(SQLiteDatabase db){ mDb = db;}

    public void insertBreeds() {
        insertBreed("Layer.\n",
                R.drawable.leghorn,

                "PURPOSE. \n" +
                        "\u2714 Specifically kept for Egg production, meat from layers is considered a by-product.\n" +
                        "\u2714 For commercial layers, the productive period is usually one " +
                            "year at an average production of Two hundred and forty Three hundred eggs a year.\n",

                "EXAMPLE.\n"+
                        "Leghorn.\n",

                "CHARACTERISTICS.\n" +
                        "\u2714 It's colour ranges are white,black or orange.\n" +
                        "\u2714 Usually light weight.\n" +
                        "\u2714 Have low tendencies for broodiness.\n" +
                        "\u2714 Can lay up to Three hundred eggs per year.\n");

        insertBreed("Layer.\n",
                R.drawable.isa_brown,

                "PURPOSE. \n" +
                        "\u2714 Specifically kept for Egg production, meat from layers is considered a by-product.\n" +
                        "\u2714 For commercial layers, the productive period is usually one " +
                        "   year at an average production of Two hundred and forty Three hundred eggs a year.\n",

                "EXAMPLE.\n" +
                        "Isa Brown.\n",

                "CHARACTERISTICS.\n" +
                        "\u2714 Cocks are usually white with black shades while hens are usually brownish in colour.\n" +
                        "\u2714 This is a hybrid bird.\n" +
                        "\u2714 Starts laying at four and a half to five months.\n" +
                        "\u2714 Have low tendencies for broodiness.\n");

        insertBreed("Broiler.\n",
                R.drawable.broiler,

                "PURPOSE. \n" +
                        "\u2714 These are specifically bred for meat production and their meat is very soft.\n" +
                        "\u2714 They grow very fast and attain market weight in about six to eight weeks of age if " +
                            "fed on feed rations that support their genetic requirements, by this time, they will have consumed about 5.5 kg of feed.\n" +
                        "\u2714 They attain live weight of about two to two and a half kg within seven to eight weeks of age.\n" +
                        "\u2714 Their production cycle is relatively short, ranging between six to eight weeks.\n",
                "EXAMPLE.\n" +
                        "Plymouth Rock, Cornish, Sussex, Brahma and hybrids.\n",

                "CHARACTERISTICS.\n" +

                        "\u2714 Comparatively, weigh much heavier than other poultry breeds.\n" +
                        "\u2714 Do not go broody.\n" +
                        "\u2714 Have high feed conversion efficiency.\n" +
                        "\u2714 Grow very fast.\n" +
                        "\u2714 They are very poor layers.\n" +
                        "\u2714 They can grow to a very large size.\n");

        insertBreed("Dual purpose.\n", R.drawable.oprington,

                "PURPOSE. \n" +
                        "These birds can be raised for either eggs or meat or for both.\n",

                "EXAMPLE.\n" +
                        "Orpington.\n",

                "CHARACTERISTICS.\n" +
                        "\u2714 Black, white, blue or brownish in colour.\n" +
                        "\u2714 Begin laying at five to six months of age.\n" +
                        "\u2714 Heavy bird attaining three and a half to four kg.\n");

        insertBreed("Dual purpose.\n", R.drawable.rhode_island_red,

                "PURPOSE. \n" +
                        "These birds can be raised for either eggs or meat or for both.\n",

                "EXAMPLE.\n" +
                        "Rhode Island Red.\n",

                "CHARACTERISTICS.\n" +
                        "\u2714 Brownish-red in colour.\n" +
                        "\u2714 Attains three and a half to four kg.\n" +
                        "\u2714 Brown shelled eggs.\n" +
                        "\u2714 Low tendencies for broodiness.\n");

        insertBreed("Indigenous (local).\n", R.drawable.kienyeji,

                "PURPOSE. \n" +
                        "This is the local chicken. Kept for both its meat and eggs.\n",

                "EXAMPLE.\n" +
                        "",

                "CHARACTERISTICS\n" +
                        "\u2714 Small body size.\n" +
                        "\u2714 Very low egg production, usually thirty to forty eggs per year.\n" +
                        "\u2714 Broody.\n" +
                        "\u2714 Good mothering ability.\n" +
                        "\u2714 Low growth rate and low meat yield.\n");

        insertBreed("IMPROVED INDIGENOUS CHICKEN.\n", R.drawable.kenbro,

                "PURPOSE. \n" +
                        "\u2714 Improved indigenous (kienyeji) chicken developed through genetic improvement of the local chicken.\n" +
                        "\u2714 This improved breed has superior qualities compared  to local breeds, these qualities include," +
                            "higher egg production, higher growth rate, higher mature weight and low tendencies for broodiness.\n",

                "EXAMPLE.\n" +
                        "Kenbro chicken.\n",

                "CHARACTERISTICS.\n" +
                        "\u2714 Dual purpose breed that requires less intensive management.\n" +
                        "\u2714 More resistant to diseases hence easily adapts to the local conditions.\n" +
                        "\u2714 Survives on free range local production system, though it is a heavy feeder.\n" +
                        "\u2714 Attains a mature weight of four and a half kg within five and a half months.\n" +
                        "\u2714 Tasty and soft meet, hence in demand in the market.\n");

        insertBreed("IMPROVED INDIGENOUS CHICKEN.\n", R.drawable.rainbow,

                "PURPOSE. \n" +
                        "\u2714 A number of improved indigenous (kienyeji) chicken have been developed through genetic improvement of the local chicken. \n" +
                        "\u2714 This improved breed has superior qualities compared  to local breeds, these qualities include," +
                            "higher egg production, higher growth rate, higher mature weight and low tendencies for broodiness.\n",

                "EXAMPLE.\n" +
                        "Rainbow Rooster.\n",

                "CHARACTERISTICS\n" +
                        "\u2714 Dual purpose breed with a high growth rate.\n" +
                        "\u2714 Can do well on free range local production system.\n" +
                        "\u2714 Attains a mature weight of four kg within six months.\n" +
                        "\u2714 Heavy feeder, this is suppressed by its good feed conversion efficiency.\n");

        insertBreed("IMPROVED INDIGENOUS CHICKEN.\n", R.drawable.kuroiler,

                "PURPOSE. \n" +
                        "\u2714 A number of improved indigenous (kienyeji) chicken have been developed through genetic improvement of the local chicken.\n" +
                        "\u2714 This improved breed has superior qualities compared  to local breeds, these qualities include," +
                            "higher egg production, higher growth rate, higher mature weight and low tendencies for broodiness.\n",

                "EXAMPLE.\n" +
                        "Kuroiler chicken.",

                "CHARACTERISTICS.\n" +
                        "\u2714 Dual purpose breed that can do well on free range.\n" +
                        "\u2714 Lays between one hundred and forty to one hundred and fifty eggs per year.\n" +
                        "\u2714 More resistant to diseases hence easily adapts to the local conditions.\n" +
                        "\u2714 Can scavenge on kitchen left overs and farm by-products.\n" +
                        "\u2714 Attains a mature weight of four kg within six months.\n" +
                        "\u2714 Does not brood, hence will not sit on eggs, a farmer will have to give its eggs to local chicken or use an incubator.\n");

        insertBreed("IMPROVED INDIGENOUS CHICKEN.\n",
                R.drawable.improved_indigenous_chicken,

                "PURPOSE. \n" +
                        "\u2714 A number of improved indigenous (kienyeji) chicken have been developed through genetic improvement of the local chicken.\n" +
                        "\u2714 This improved breed has superior qualities compared  to local breeds, these qualities include," +
                            "higher egg production, higher growth rate, higher mature weight and low tendencies for broodiness.\n",

                "EXAMPLE.\n" +
                        "Improved KARI indigenous chicken.\n",

                "CHARACTERISTICS.\n" +
                        "\u2714 Dual purpose breed kept for both eggs and meat.\n" +
                        "\u2714 It is hardy and more resistant to diseases than hybrids.\n" +
                        "\u2714 Attains a mature weight of two and a half kg and above in five months for cocks" +
                            "while hens attain two kg and above in the same period.\n" +
                        "\u2714 Does quite well in egg production, producing up to two hundred and twenty eggs per year .\n");
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
    public void insertBadHabits(){
        insertBadHabit("Egg eating by chicken.\n",

                " Sometimes birds develop the tendency to eat their own eggs.\n",

                "\u2714 It may start due to the presence of cracked eggs or accidental breaking of eggs and once" +
                        " the birds develop taste for it they start breaking their own eggs.\n" +
                        "\u2714 Factors responsible for breaking of egg or cracking of egg are thin or soft egg shell" +
                        " or lack of sufficient bedding material in the laying area.\n" +
                        "\u2714 Presence of eggs for longer period in the coop may also encourage the birds to start egg eating.\n" +
                        "\u2714 Nutritional deficiency, especially absence of calcium and vitamin D.\n ",

                "\u2714 Isolate the birds which have developed this habit. \n" +
                            "\u2714 In consultation with the expert, the quantity of lime stone and protein should be increased in the diet. \n" +
                            "\u2714 Egg eaters should be kept in a cage in which egg rolls away, beyond the reach of the bird after laying of the eggs due to slope.\n " +
                            "\u2714 De-beaking also reduces this tendency. \n" +
                            "\u2714 Darkness in the laying area may prevent his habit. \n" +
                            "\u2714 Frequent collection of eggs.\n");

        insertBadHabit("Cannibalism.",

                "\u2714 Cannibalism is a condition in which birds of a flock attack their pen mate and eat its flesh," +
                        "which may impose deep wounds and heavy mortality.\n" +
                        "\u2714 Pecking is common in laying birds. Once the birds adopt this vice it spreads rapidly through the flock.\n" +
                        "\u2714 Poultry farmer must remain vigilant to prevent cannibalism as it has got no direct treatment.\n" +
                        "\u2714 Presence of wounded or dead birds which are showing wound but otherwise appear healthy are indicative of cannibalism.\n",

                "\u2714 Overcrowding.\n" +
                        "\u2714 Bleeding in the external genitalia due to laying of large eggs.\n" +
                        "\u2714 Protein deficiency in the diet or provision of feeds or feeding/drinking space.\n" +
                        "\u2714 Lack of properly designed nest boxes.\n" +
                        "\u2714 Too much heat.\n" +
                        "\u2714 Loss of feathers from the body or bleeding from the skin due to parasitic infestation.\n" +
                        "\u2714 Wounds inflicted by fighting between the birds.\n",
                "\u2714 De-beaking, which can be done right from the day old chicks to any age." +
                        " One- third of the upper beak and tip of the lower beak is to be trimmed." +
                        "\u2714 To stop bleeding after de-beaking, hot iron rod is touched at the site of cut." +
                        "De-beaking must be performed by a competent and trained person, otherwise there may be excessive bleeding and the bird may die due to starvation." +
                        "\u2714 Birds involved in cannibalism must be isolated and culled to stop this vice." +
                        "\u2714 Provision of adequate feeders and drinkers." +
                        "\u2714 Controlling stock density so that birds have adequate floor space for feeding, watering and exercise.");

        insertBadHabit("Egg hiding.",

                "Poultry birds can hide the eggs in the field, bushes etc.\n",

                "\u2714 This habit may develop in the domestic fowl which are allowed ample freedom of movement.\n",

                "\u2714 Restrict freedom of movement of the birds.\n" +
                        "\u2714 Laying area should be built inside poultry house and made comfortable by providing sawdust, dry grass etc.");

    }
    private void insertBadHabit(String habit, String description, String causes, String prevention){

        ContentValues values = new ContentValues();

        values.put(DataBaseContract.BadHabitsEntry.COLUMN_HABIT,habit);
        values.put(DataBaseContract.BadHabitsEntry.COLUMN_DESCRIPTION,description);
        values.put(DataBaseContract.BadHabitsEntry.COLUMN_CAUSES,causes);
        values.put(DataBaseContract.BadHabitsEntry.COLUMN_PREVENTION,prevention);

        long newRowId = mDb.insert(DataBaseContract.BadHabitsEntry.TABLE_NAME,null,values);
    }
}
