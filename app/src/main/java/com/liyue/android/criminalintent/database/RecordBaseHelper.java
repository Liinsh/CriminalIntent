package com.liyue.android.criminalintent.database;

import android.content.Context;
import android.database.ContentObservable;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.liyue.android.criminalintent.database.RecordDbSchema.RecordTable;

/**
 * Created by hasee on 2016/10/19.
 */

public class RecordBaseHelper extends SQLiteOpenHelper {
    private static final int VERSION = 1;
    private static final String DATABASE_NAME = "recordBase.db";

    public RecordBaseHelper(Context context){
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL("create table " + RecordTable.NAME + "(" + "_id integer primary key autoincrement, " +
        RecordTable.Cols.UUID + "," +
        RecordTable.Cols.TITLE + "," +
        RecordTable.Cols.DATE + "," +
        RecordTable.Cols.SOLVED + ")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

    }
}
