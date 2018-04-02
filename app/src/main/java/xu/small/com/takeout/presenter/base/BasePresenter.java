package xu.small.com.takeout.presenter.base;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import xu.small.com.takeout.model.dao.bean.DBHelper;
import xu.small.com.takeout.presenter.api.ResponseInfoApi;
import xu.small.com.takeout.utils.Constant;

/**
 * author: senseLo
 * date: 2018/3/13
 */
/*
业务层公共部分代码封装
*/

public class BasePresenter {
    protected static ResponseInfoApi api;

    //数据库
    protected DBHelper helper;

    public BasePresenter() {
        //网络
        if (api == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(Constant.BASEURL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            api = retrofit.create(ResponseInfoApi.class);
        }
        helper = DBHelper.getInstance();
    }
}
