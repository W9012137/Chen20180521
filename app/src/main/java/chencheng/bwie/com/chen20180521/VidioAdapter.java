package chencheng.bwie.com.chen20180521;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

import chencheng.bwie.com.chen20180521.bean.StainBean;
import fm.jiecao.jcvideoplayer_lib.JCVideoPlayer;

public class VidioAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
  List<StainBean.DataBean> list;
  Context context;

    public VidioAdapter(List<StainBean.DataBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       View view=View.inflate(context,R.layout.vidio,null);
        return new MyVidio(view);
    }


    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
      MyVidio myVidio=(MyVidio)holder;
      myVidio.sim.setImageURI(list.get(position).getProfile_image());
      myVidio.name.setText(list.get(position).getName());
        myVidio.title.setText(list.get(position).getText());
      myVidio.jcVideoPlayer.setUp(list.get(position).getVideouri(),null);
    }


    @Override
    public int getItemCount() {
        return list.size();
    }
    class MyVidio extends RecyclerView.ViewHolder {
        SimpleDraweeView sim;
        TextView name,title;
        JCVideoPlayer jcVideoPlayer;
        public MyVidio(View itemView) {
            super(itemView);
            sim=itemView.findViewById(R.id.sim);
            name=itemView.findViewById(R.id.name);
            title=itemView.findViewById(R.id.title);
            jcVideoPlayer=itemView.findViewById(R.id.videocontroller1);
        }
    }


}
