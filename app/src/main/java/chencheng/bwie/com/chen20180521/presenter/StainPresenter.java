package chencheng.bwie.com.chen20180521.presenter;


import chencheng.bwie.com.chen20180521.bean.StainBean;
import chencheng.bwie.com.chen20180521.model.IStaionModel;
import chencheng.bwie.com.chen20180521.model.StaionModel;
import chencheng.bwie.com.chen20180521.net.NetListenter;
import chencheng.bwie.com.chen20180521.view.IThreeView;

public class StainPresenter {
    private IThreeView iThreeView;
    private IStaionModel iStaionModel;

    public StainPresenter(IThreeView iThreeView) {
        this.iThreeView = iThreeView;
        iStaionModel=new StaionModel();
    }
    public void ShowView(String type,String page){
        iStaionModel.Getshow(type, page, new NetListenter<StainBean>() {
            @Override
            public void onSccess(StainBean stainBean) {
                iThreeView.show(stainBean);
            }

            @Override
            public void onFailuer(Exception e) {

            }
        });
    }
}
