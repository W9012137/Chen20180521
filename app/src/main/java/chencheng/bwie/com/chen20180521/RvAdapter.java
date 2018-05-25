package chencheng.bwie.com.chen20180521;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

import chencheng.bwie.com.chen20180521.bean.StainBean;


public class RvAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    List<StainBean.DataBean> list;
    Context context;

    public RvAdapter(List<StainBean.DataBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=View.inflate(context,R.layout.rv_item,null);
        return new myView(view);
    }


    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
     myView myView= (RvAdapter.myView) holder;
     myView.sim.setImageURI(list.get(position).getCdn_img());
     myView.simv.setImageURI(list.get(position).getImage0());
     myView.name.setText(list.get(position).getName());
     myView.title.setText(list.get(position).getText());
    }


    @Override
    public int getItemCount() {
        return list.size();
    }
    class  myView extends RecyclerView.ViewHolder {
        SimpleDraweeView sim,simv;
        TextView name,title;
        public myView(View itemView) {
            super(itemView);
            sim=itemView.findViewById(R.id.sim);
            simv=itemView.findViewById(R.id.simv);
            name=itemView.findViewById(R.id.name);
            title=itemView.findViewById(R.id.title);
        }
    }
}
