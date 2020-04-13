package ahmed.com.recycleradapter.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import ahmed.com.recycleradapter.Model.Model;
import ahmed.com.recycleradapter.R;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerHolder> {

    private Context mContext;
    private List<Model> mListModel;
    private LayoutInflater inflater;

    public RecyclerAdapter(Context mContext, List<Model> mListModel) {
        this.mContext = mContext;
        this.mListModel = mListModel;

        inflater = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public RecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View layoutView = inflater.inflate(R.layout.raw_item, parent, false);
        return new RecyclerHolder(layoutView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerHolder holder, int position) {

        Picasso.get().load(mListModel.get(position).getImage()).into(holder.mImg);
        holder.mTxt1.setText(mListModel.get(position).getText1());
        holder.mTxt2.setText(mListModel.get(position).getText2());
    }

    @Override
    public int getItemCount() {
        return mListModel.size();
    }

    class RecyclerHolder extends RecyclerView.ViewHolder{

        ImageView mImg;
        TextView mTxt1, mTxt2;


        public RecyclerHolder(@NonNull View itemView) {
            super(itemView);

            mImg = itemView.findViewById(R.id.img);
            mTxt1 = itemView.findViewById(R.id.text1);
            mTxt2 = itemView.findViewById(R.id.text2);
        }
    }
}
