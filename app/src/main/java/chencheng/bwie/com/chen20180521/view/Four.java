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
import chencheng.bwie.com.chen20180521.VidioAdapter;
import chencheng.bwie.com.chen20180521.bean.StainBean;
import chencheng.bwie.com.chen20180521.presenter.StainPresenter;

public class Four extends Fragment implements IThreeView {
    private View view;
    private RecyclerView mRvVidio;
    String type="4";
    String page="1";

    StainPresenter presenter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.item_four, container, false);
        initView(view);
        presenter=new StainPresenter(this);
        presenter.ShowView(type,page);
        return view;
    }

    private void initView(View view) {
        mRvVidio = (RecyclerView) view.findViewById(R.id.rv_vidio);
        mRvVidio.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false));

    }

    @Override
    public void show(StainBean stainBean) {
        VidioAdapter rvAdapter=new VidioAdapter(stainBean.getData(),getActivity());
        mRvVidio.setAdapter(rvAdapter);

    }
}
