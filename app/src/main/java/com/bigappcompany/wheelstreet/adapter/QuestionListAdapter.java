package com.bigappcompany.wheelstreet.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bigappcompany.wheelstreet.R;
import com.bigappcompany.wheelstreet.model.ResponseModel;
import com.bigappcompany.wheelstreet.model.ResponseModelData;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by shankar on 3/4/18.
 */

public class QuestionListAdapter extends RecyclerView.Adapter<QuestionListAdapter.MyViewHolder> {

    private List<ResponseModelData> categoryListModels;
    private Context context;
    private int categorylist_row;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.tv_ques)
        TextView tv_ques;
        @BindView(R.id.et_ans)
        TextView et_ans;

        public MyViewHolder(View view) {
            super(view);
            ButterKnife.bind(this,view);
        }
    }


    public QuestionListAdapter(Context context, ArrayList<ResponseModelData> categoryListModels, int categorylist_row) {
        this.context = context;
        this.categoryListModels = categoryListModels;
        this.categorylist_row = categorylist_row;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(categorylist_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        final ResponseModelData pl = categoryListModels.get(position);

        holder.tv_ques.setText(pl.getQuestion());
        if (pl.getDataType().equals("integer")){
            holder.et_ans.setText(pl.getAnswer());
            holder.et_ans.setInputType(InputType.TYPE_CLASS_TEXT |
                    InputType.TYPE_TEXT_VARIATION_PASSWORD);
        }





    }

    @Override
    public int getItemCount() {
        return categoryListModels.size();
    }
}
