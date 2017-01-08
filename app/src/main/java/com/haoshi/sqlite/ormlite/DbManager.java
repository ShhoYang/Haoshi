package com.haoshi.sqlite.ormlite;

import android.content.Context;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.stmt.DeleteBuilder;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.stmt.UpdateBuilder;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by yugu on 2017/1/8.
 */

public class DbManager {

    private OpenHelper openHelper;
    private Dao dao;
    private Context context;

    public DbManager(Context context) throws SQLException {
        this.context = context;
        openHelper = new OpenHelper(context);
        dao = openHelper.getDao(Personnel.class);
    }

    public int insert(Personnel personnel) throws SQLException {
        return dao.create(personnel);
    }

    public int delete(Personnel personnel) throws SQLException {
        return dao.delete(personnel);
    }

    public int deleteByNum(String num) throws SQLException {
        DeleteBuilder builder = dao.deleteBuilder();
        builder.where().eq("num", 1);
        return builder.delete();
    }

    public void deleteAll() throws SQLException {
        for (Personnel personnel : query()) {
            delete(personnel);
        }
    }

    public int updata(Personnel personnel) throws SQLException {
        return dao.delete(personnel);
    }

    public void updataByNum(Personnel personnel) throws SQLException {
        UpdateBuilder builder = dao.updateBuilder();
        builder.where().eq("num", personnel.getNum());
        builder.updateColumnValue("name", personnel.getName());
    }

    public List<Personnel> queryByNum(String num) throws SQLException {
        QueryBuilder builder = dao.queryBuilder();
        builder.where().eq("num", num);
        return builder.query();
    }

    public List<Personnel> query() throws SQLException {
        return dao.queryForAll();
    }
}
