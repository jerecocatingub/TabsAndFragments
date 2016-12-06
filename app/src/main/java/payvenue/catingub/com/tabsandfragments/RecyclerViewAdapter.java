package payvenue.catingub.com.tabsandfragments;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Jotine on 12/6/2016.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.CardViewHolder>{

    private final LayoutInflater inflater;
    
    public RecyclerViewAdapter(Context context){
        inflater = LayoutInflater.from(context);
    }

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.cardview_layout, parent, false);
        CardViewHolder holder = new CardViewHolder(view);
        return null;
    }

    @Override
    public void onBindViewHolder(CardViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class CardViewHolder extends RecyclerView.ViewHolder{

        //Components;
        TextView WorkOrderNumber;
        TextView AccountName;

        public CardViewHolder(View itemView) {
            super(itemView);
        }
    }
}