package chencheng.bwie.com.chen20180521.model;

import chencheng.bwie.com.chen20180521.bean.StainBean;
import chencheng.bwie.com.chen20180521.net.NetListenter;

public interface IStaionModel {
    void Getshow(String type, String page, NetListenter<StainBean> netListenter);
}
