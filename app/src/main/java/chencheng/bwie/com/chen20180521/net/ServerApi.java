package chencheng.bwie.com.chen20180521.net;

import java.util.Map;

import chencheng.bwie.com.chen20180521.bean.StainBean;
import io.reactivex.Observable;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

public interface ServerApi {
@POST
    Observable<StainBean> staion(@Url String url, @QueryMap Map<String, String> map);
}

