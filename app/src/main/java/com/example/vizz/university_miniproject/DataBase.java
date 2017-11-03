package com.example.vizz.university_miniproject;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

/**
 * Created by vizz on 3/9/2017.
 */

public class DataBase extends SQLiteOpenHelper {
   public DataBase(Context context)
   {
       super(context,"database",null,1);
   }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE STUDENT (ID INTEGER PRIMARY KEY,NAME TEXT,MOBILE TEXT,EMAIL_ID TEXT,SUBJECT TEXT,DESCRIPTION TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    void add(Student student)
    {
        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("NAME",student.getName());
        contentValues.put("MOBILE",student.getMobile());
        contentValues.put("EMAIL_ID",student.getEmail());
        contentValues.put("SUBJECT",student.getSubject());
        contentValues.put("DESCRIPTION",student.getDescription());
        sqLiteDatabase.insert("STUDENT",null,contentValues);
        sqLiteDatabase.close();
    }

    public ArrayList<Student> getArrayList()
    {
        ArrayList<Student> arrayList=new ArrayList<Student>();
        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
        Cursor cursor=sqLiteDatabase.query("STUDENT",null,null,null,null,null,null);
        if(cursor.moveToFirst())
        {
            do {
                Student student=new Student(cursor.getString(0),cursor.getString(1),cursor.getString(2),cursor.getString(3),cursor.getString(4),cursor.getString(5));
                arrayList.add(student);
            }while (cursor.moveToNext());
        }
        return arrayList;
    }
}
