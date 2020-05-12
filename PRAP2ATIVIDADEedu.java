package com.example.agendiario;



import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity(tableName = "Stresses")



public class Stress {


    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "StressesId")
    private int mId;

    @Nullable
    @ColumnInfo(name = "StressesDescription")
    private String mDescription;

    private string mSelfControl;

    public Stress(@Nullable String description, String selfControl, int level, String creationDate) {
        mDescription = description;
        mSelfControl = selfControl;
        mLevel = level;
        mCreationDate = creationDate;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDiscription(String description) {
        mDescription = description;
    }

    public String getSelfControl() {
        return mSelfControl;
    }

    public void setSelfControl(String SelfControl) {
        mSelfControl = selfControl;
    }

    public int getLevel() {
        return mLevel;
    }

    public void setLevel(int level) {
        mLevel = level;
    }

    public String getCreationDate() {
        return mCreationDate;
    }

    public void setCreationDate(String creationDate) {
        mCreationDate = creationDate;
    }

    private int mLevel;
    private String mCreationDate;

}
