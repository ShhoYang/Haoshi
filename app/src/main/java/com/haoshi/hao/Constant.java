package com.haoshi.hao;

import android.os.Environment;

/**
 * Created by Haoshi on 2017/1/8.
 */

public class Constant {

    public static final String rootDir = Environment.getExternalStorageDirectory().getAbsolutePath() + "/haoshi";

    public static final String BASE_URL = "http://news-at.zhihu.com/api/3/";

    public static final String NEWS_HOT = "news/hot";
}
