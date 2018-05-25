package chencheng.bwie.com.chen20180521.model;

import java.util.HashMap;

import chencheng.bwie.com.chen20180521.bean.StainBean;
import chencheng.bwie.com.chen20180521.net.NetListenter;
import chencheng.bwie.com.chen20180521.net.RetrofitUtils;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class StaionModel implements IStaionModel{
    @Override
    public void Getshow(String type, String page, final NetListenter<StainBean> netListenter) {
        final HashMap<String,String> map = new HashMap<>();
        map.put("type",type);
        map.put("page",page);
        Observable observable= RetrofitUtils.getServerApi().staion("satinApi",map);
        observable.observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Consumer<StainBean>() {

                    @Override
                    public void accept(StainBean stainBean) throws Exception {

netListenter.onSccess(stainBean);                    }



                });
    }
}
