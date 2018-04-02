package xu.small.com.takeout.presenter.api;

import retrofit2.Call;
import retrofit2.http.GET;
import xu.small.com.takeout.model.net.bean.ResponseInfo;
import xu.small.com.takeout.utils.Constant;

/**
 * author: senseLo
 * date: 2018/3/13
 */

public interface ResponseInfoApi {
    @GET(Constant.LOGIN)
    Call<ResponseInfo> login();
}
