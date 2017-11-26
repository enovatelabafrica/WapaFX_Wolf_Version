package ng.com.androidlife.bellokanoex;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by shaheed on 11/6/17.
 */

public class DBHelper extends SQLiteOpenHelper {

    public static final String DB_Name = "WAPA_DB";
    public static final String TB_Name = "WAPA_TB";
    public static final int DB_VERSION = 1;
    public static final String ID = "ID";
    public static final String Buy_Dollar = "BuyDollar";
    public static final String Sell_Dollar = "SellDollar";
    public static final String Buy_Euro = "BuyEuro";
    public static final String Sell_Euro= "SellEuro";
    public static final String Buy_Yen = "BuyYen";
    public static final String Sell_Yen = "SellYen";

    public DBHelper(Context context) {
        super(context, DB_Name, null, DB_VERSION);


    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS " + TB_Name + " ("
                + ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +Buy_Dollar+ " TEXT, " +Sell_Dollar+ " TEXT," +
                " " +Buy_Euro+ " TEXT, " +Sell_Euro+ " TEXT, " +Buy_Yen+ " TEXT, " +Sell_Yen+ " TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TB_Name);
        onCreate(db);
    }

    public boolean insertData(String title, String image, String desc, String weeklydate,
                              String weeklytime, String usbweek, String ussweek,
                              String ukbweek, String uksweek, String eubweek, String eusweek,
                              String cnbweek, String cnsweek, String usbweeka, String ussweeka,
                              String ukbweeka, String uksweeka, String eubweeka, String eusweeka,
                              String cnbweeka, String cnsweeka, String usbweeke, String ussweeke,
                              String ukbweeke, String uksweeke, String eubweeke, String eusweeke,
                              String cnbweeke, String cnsweeke, String cfbweek, String cfsweek,
                              String cfbweeka, String cfsweeka, String cfbweeke, String cfsweeke,
                              String rybweek, String rysweek, String rybweeka, String rysweeka,
                              String rybweeke, String rysweeke) {

        SQLiteDatabase mDB = this.getReadableDatabase();

        ContentValues mContentValues = new ContentValues();

        mContentValues.put(Buy_Dollar, title);
        mContentValues.put(Buy_Euro, image);
        mContentValues.put(Buy_Yen, desc);
        mContentValues.put(Sell_Dollar, weeklydate);
        mContentValues.put(Sell_Euro, weeklytime);
        mContentValues.put(Sell_Yen, usbweek);
        mContentValues.put(Buy_Dollar, ussweek);
        mContentValues.put(Buy_Euro, ukbweek);
        mContentValues.put(Buy_Yen, uksweek);
        mContentValues.put(Sell_Dollar, eubweek);
        mContentValues.put(Sell_Euro, eusweek);
        mContentValues.put(Sell_Yen, cnbweek);
        mContentValues.put(Buy_Dollar, cnsweek);
        mContentValues.put(Buy_Euro, usbweeka);
        mContentValues.put(Buy_Yen, ussweeka);
        mContentValues.put(Sell_Dollar, ukbweeka);
        mContentValues.put(Sell_Euro, uksweeka);
        mContentValues.put(Sell_Yen, eubweeka);
        mContentValues.put(Buy_Dollar, eusweeka);
        mContentValues.put(Buy_Euro, cnbweeka);
        mContentValues.put(Buy_Yen, cnsweeka);
        mContentValues.put(Sell_Dollar, usbweeke);
        mContentValues.put(Sell_Euro, ussweeke);
        mContentValues.put(Sell_Yen, ukbweeke);
        mContentValues.put(Buy_Dollar, rysweek);
        mContentValues.put(Buy_Euro, rybweeka);
        mContentValues.put(Buy_Yen, rysweeka);
        mContentValues.put(Buy_Dollar, rybweeke);
        mContentValues.put(Buy_Euro, rysweeke);
        mContentValues.put(Buy_Dollar, cfbweeke);
        mContentValues.put(Buy_Euro, cfsweeke);
        mContentValues.put(Buy_Yen, rybweek);
        mContentValues.put(Buy_Dollar, uksweeke);
        mContentValues.put(Buy_Euro, eubweeke);
        mContentValues.put(Buy_Yen, eusweeke);
        mContentValues.put(Sell_Dollar, cnbweeke);
        mContentValues.put(Sell_Euro, cnsweeke);
        mContentValues.put(Sell_Yen, cfbweek);
        mContentValues.put(Buy_Dollar, cfsweek);
        mContentValues.put(Buy_Euro, cfbweeka);
        mContentValues.put(Buy_Yen, cfsweeka);



        long result = mDB.insert(TB_Name, null, mContentValues);

        if (result == -1) {
            return false;
        } else {
            return true;
        }
    }

    public Cursor getAllData(){
        SQLiteDatabase db =  this.getWritableDatabase();
        Cursor result = db.rawQuery("SELECT * FROM " +TB_Name, null);
        return result;
    }

    public boolean updateData(String id, String title, String image, String desc, String weeklydate,
                              String weeklytime, String usbweek, String ussweek,
                              String ukbweek, String uksweek, String eubweek, String eusweek,
                              String cnbweek, String cnsweek, String usbweeka, String ussweeka,
                              String ukbweeka, String uksweeka, String eubweeka, String eusweeka,
                              String cnbweeka, String cnsweeka, String usbweeke, String ussweeke,
                              String ukbweeke, String uksweeke, String eubweeke, String eusweeke,
                              String cnbweeke, String cnsweeke, String cfbweek, String cfsweek,
                              String cfbweeka, String cfsweeka, String cfbweeke, String cfsweeke,
                              String rybweek, String rysweek, String rybweeka, String rysweeka,
                              String rybweeke, String rysweeke){
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues mContentValues = new ContentValues();
        mContentValues.put(Buy_Dollar, title);
        mContentValues.put(Buy_Euro, image);
        mContentValues.put(Buy_Yen, desc);
        mContentValues.put(Sell_Dollar, weeklydate);
        mContentValues.put(Sell_Euro, weeklytime);
        mContentValues.put(Sell_Yen, usbweek);
        mContentValues.put(Buy_Dollar, ussweek);
        mContentValues.put(Buy_Euro, ukbweek);
        mContentValues.put(Buy_Yen, uksweek);
        mContentValues.put(Sell_Dollar, eubweek);
        mContentValues.put(Sell_Euro, eusweek);
        mContentValues.put(Sell_Yen, cnbweek);
        mContentValues.put(Buy_Dollar, cnsweek);
        mContentValues.put(Buy_Euro, usbweeka);
        mContentValues.put(Buy_Yen, ussweeka);
        mContentValues.put(Sell_Dollar, ukbweeka);
        mContentValues.put(Sell_Euro, uksweeka);
        mContentValues.put(Sell_Yen, eubweeka);
        mContentValues.put(Buy_Dollar, eusweeka);
        mContentValues.put(Buy_Euro, cnbweeka);
        mContentValues.put(Buy_Yen, cnsweeka);
        mContentValues.put(Sell_Dollar, usbweeke);
        mContentValues.put(Sell_Euro, ussweeke);
        mContentValues.put(Sell_Yen, ukbweeke);
        mContentValues.put(Buy_Dollar, rysweek);
        mContentValues.put(Buy_Euro, rybweeka);
        mContentValues.put(Buy_Yen, rysweeka);
        mContentValues.put(Buy_Dollar, rybweeke);
        mContentValues.put(Buy_Euro, rysweeke);
        mContentValues.put(Buy_Dollar, cfbweeke);
        mContentValues.put(Buy_Euro, cfsweeke);
        mContentValues.put(Buy_Yen, rybweek);
        mContentValues.put(Buy_Dollar, uksweeke);
        mContentValues.put(Buy_Euro, eubweeke);
        mContentValues.put(Buy_Yen, eusweeke);
        mContentValues.put(Sell_Dollar, cnbweeke);
        mContentValues.put(Sell_Euro, cnsweeke);
        mContentValues.put(Sell_Yen, cfbweek);
        mContentValues.put(Buy_Dollar, cfsweek);
        mContentValues.put(Buy_Euro, cfbweeka);
        mContentValues.put(Buy_Yen, cfsweeka);

        db.update(TB_Name, mContentValues, "id = ?", new String[]{ id });
        return true;
    }

    public Integer deleteData(String id){
        SQLiteDatabase db = this.getWritableDatabase();

        return db.delete(TB_Name, "id = ?", new String[]{ id });
    }
}
