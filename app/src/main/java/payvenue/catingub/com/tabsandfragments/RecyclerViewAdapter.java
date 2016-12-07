package payvenue.catingub.com.tabsandfragments;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

/**
 * Created by Jotine on 12/6/2016.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.CardViewHolder>{

    private final LayoutInflater inflater;
    List<Data> data = Collections.emptyList();
    
    public RecyclerViewAdapter(Context context, List<Data> data){
        inflater = LayoutInflater.from(context);
    }

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.cardview_layout, parent, false);
        CardViewHolder holder = new CardViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(CardViewHolder holder, int position) {
        Data current = data.get(position);
        holder.WorkOrderNumber.setText(current.orderNumber);
        holder.AccountName.setText(current.accountName);
        holder.AccountNumber.setText(current.accountNumber);
        holder.WorkOrderType.setText(current.workOrderType);
        holder.MeterSerialNumber.setText(current.meterSerialNumber);
        holder.Address.setText(current.address);
        holder.ContactPerson.setText(current.contactPerson);
        holder.ContactNumber.setText(current.contactNumber);
        holder.Instructions.setText(current.instructions);
        holder.Date.setText(current.date);
        holder.Time.setText(current.time);
        holder.Status.setText(current.status);


    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class CardViewHolder extends RecyclerView.ViewHolder{

        //Components;
        TextView WorkOrderNumber;
        TextView AccountName;
        TextView AccountNumber;
        TextView WorkOrderType;
        TextView MeterSerialNumber;
        TextView Address;
        TextView ContactPerson;
        TextView ContactNumber;
        TextView Instructions;
        TextView Date;
        TextView Time;
        Button Status;

        public CardViewHolder(View itemView) {
            super(itemView);
            WorkOrderNumber = (TextView) itemView.findViewById(R.id.txtWorkNumber);
            AccountName = (TextView) itemView.findViewById(R.id.txtAccntName);
            AccountNumber = (TextView) itemView.findViewById(R.id.txtAccntNumber);
            WorkOrderType = (TextView) itemView.findViewById(R.id.txtWorkType);
            MeterSerialNumber = (TextView) itemView.findViewById(R.id.txtMeterNumber);
            Address = (TextView) itemView.findViewById(R.id.txtAddress);
            ContactPerson = (TextView) itemView.findViewById(R.id.txtContactPerson);
            ContactNumber = (TextView) itemView.findViewById(R.id.txtContactNum);
            Instructions = (TextView) itemView.findViewById(R.id.txtInstructions);
            Date = (TextView) itemView.findViewById(R.id.txtDate);
            Time = (TextView) itemView.findViewById(R.id.txtTime);
            Status = (Button) itemView.findViewById(R.id.btnStatus);
        }
    }
}