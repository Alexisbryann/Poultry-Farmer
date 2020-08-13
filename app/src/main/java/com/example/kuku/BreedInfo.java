package com.example.kuku;

import android.os.Parcel;
import android.os.Parcelable;

public final class BreedInfo implements Parcelable {
    private  String mBreed;
    private  String mPurpose;
    private  String mExample;
    private  String mCharacteristics;

    public BreedInfo (String breed, String purpose, String example, String characteristics ){

        mBreed = breed;
        mPurpose = purpose;
        mExample = example;
        mCharacteristics = characteristics;
    }

    protected BreedInfo(Parcel in) {
        mBreed = in.readString();
        mPurpose = in.readString();
        mExample = in.readString();
        mCharacteristics = in.readString();
    }

    public static final Creator<BreedInfo> CREATOR = new Creator<BreedInfo>() {
        @Override
        public BreedInfo createFromParcel(Parcel in) {
            return new BreedInfo(in);
        }

        @Override
        public BreedInfo[] newArray(int size) {
            return new BreedInfo[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }


    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(mBreed);
        parcel.writeString(mPurpose);
        parcel.writeString(mExample);
        parcel.writeString(mCharacteristics);
    }

    public String getBreed() {
        return mBreed;
    }

    public void setBreed(String breed) {
        mBreed = breed;
    }

    public String getPurpose() {
        return mPurpose;
    }

    public void setPurpose(String purpose) {mPurpose = purpose;}

    public String getExample() {
        return mExample;
    }

    public void setExample(String example) {
        mExample = example;
    }

    public String getCharacteristics() {
        return mCharacteristics;
    }

    public void setCharacteristics(String characteristics) {
        mCharacteristics = characteristics;
    }
}
