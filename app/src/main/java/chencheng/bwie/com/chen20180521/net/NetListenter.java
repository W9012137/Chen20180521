package chencheng.bwie.com.chen20180521.net;

public interface NetListenter<T> {
    //成功
    public void onSccess(T t);
    //失败
    public void onFailuer(Exception e);
}
