package xu.small.com.takeout.model.dao.bean;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.support.ConnectionSource;

import xu.small.com.takeout.MyApplication;

/**
 * author: senseLo
 * date: 2018/3/13
 */

public class DBHelper extends OrmLiteSqliteOpenHelper {
    private static final String DATABASENAME = "itheima.db";
    private static final int DATABASEVERSION = 1;

    public DBHelper(Context context) {
        super(context, DATABASENAME, null, DATABASEVERSION);
    }

    /*
    * 单例的处理：懒汉式（线程安全， 线程不安全）,饿汉式， 双重校验锁：提高效率
    * */
    private static DBHelper instance;

    public static DBHelper getInstance() {
        if (instance == null) {
            synchronized (DBHelper.class) {
                if (instance == null) { //第二次校验，防止多次创建对象
                    instance = new DBHelper(MyApplication.getContext());
                }
            }
        }
        return instance;
    }

    @Override
    public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion) {

    }
}
