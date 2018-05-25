package chencheng.bwie.com.chen20180521.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import chencheng.bwie.com.chen20180521.R;
import chencheng.bwie.com.chen20180521.RvAdapter;
import chencheng.bwie.com.chen20180521.bean.StainBean;
import chencheng.bwie.com.chen20180521.presenter.StainPresenter;

public class Three extends Fragment implements IThreeView {
    private View view;
    private RecyclerView mRv;
    StainPresenter presenter;
    String type="3";
    String page="1";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.item_three, container, false);
        initView(view);
        presenter=new StainPresenter(this);
        presenter.ShowView(type,page);
        return view;
    }

    @Override
    public void show(StainBean stainBean) {
        RvAdapter rvAdapter=new RvAdapter(stainBean.getData(),getActivity());
        mRv.setAdapter(rvAdapter);
    }

    private void initView(View view) {
        mRv = (RecyclerView) view.findViewById(R.id.rv);
        mRv.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false));
    }
}
