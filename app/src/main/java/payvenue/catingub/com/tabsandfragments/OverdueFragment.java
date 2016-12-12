package payvenue.catingub.com.tabsandfragments;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupMenu;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class OverdueFragment extends Fragment implements PopupMenu.OnMenuItemClickListener{

    private Button mStatus;
    private RecyclerViewAdapter mAdapter;
    private RecyclerView mRecycler;

    public OverdueFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.cardview_layout, container, false);

//        mRecycler = (RecyclerView) view.findViewById(R.id.rvCards);
//        mAdapter = new RecyclerViewAdapter(getActivity(), getData());
//        mRecycler.setAdapter(mAdapter);
//        mRecycler.setLayoutManager(new LinearLayoutManager(getActivity()));
        
        mStatus = (Button) view.findViewById(R.id.btnStatus);
        mStatus.setBackgroundColor(Color.parseColor("#E82C45"));
        mStatus.setText("On Process - Overdue");
        mStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showPopup(view);
            }
        });
        return view;
    }

    public void showPopup(View view){
        PopupMenu popUp = new PopupMenu(getContext(), view);
        MenuInflater menuInflater = popUp.getMenuInflater();
        menuInflater.inflate(R.menu.menu_popup, popUp.getMenu());
        popUp.setOnMenuItemClickListener(OverdueFragment.this);
        popUp.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.OnProcess_option:
                mStatus.setBackgroundColor(Color.parseColor("#D3AA2E"));
                mStatus.setText("On Process");
                break;
            case R.id.Overdue_option:
                mStatus.setBackgroundColor(Color.parseColor("#E82C45"));
                mStatus.setText("On Process - Overdue");
                break;
            case R.id.Completed_option:
                mStatus.setBackgroundColor(Color.parseColor("#FF29B06C"));
                mStatus.setText("Completed");
                break;
            default: break;
        }
        return false;
    }

    public static List<Data> getData() {
        List<Data> data = new ArrayList<>();
        String[] workOrderNumber = {"112233", "445566", "778899"};
        String[] accountName = {"Miller, Mark Ethan H.", "Aguiar, Will Richard S.", "Trinidad, Samuel G."};
        String[] accountNum = {"2016071222", "2016071239", "2016071251"};
        String[] workOrderType = {"Electric", "Electric", "Electric"};
        String[] meterSerialNumber = {"123", "456", "789"};
        String[] address = {"Indianapolis, Indiana", "West Holliwood, California", "Pasil, Cebu"};
        String[] contactPerson = {"Name 1", "Name 2", "Name 3"};
        String[] contactNum = {"09234567890", "09153334444", "09274729180"};
        String[] instructions = {"hwhs", "hjdwe", "urixwo"};
        String[] date = {"08/22/2016 12:45:00 PM", "08/25/2016 9:20:00 AM", "08/30/2016 01:10:00 PM"};
        String[] time = {"10 Hrs. Remaining", "2 Days Remaining", "5 Days Remaining"};
        String[] status = {"On Process", "Completed", "Completed"};

        for (int count = 0; count < workOrderNumber.length; count++) {
            Data current = new Data();
            current.orderNumber = workOrderNumber[count];
            current.accountName = accountName[count];
            current.accountNumber = accountNum[count];
            current.workOrderType = workOrderType[count];
            current.meterSerialNumber = meterSerialNumber[count];
            current.address = address[count];
            current.contactPerson = contactPerson[count];
            current.contactNumber = contactNum[count];
            current.instructions = instructions[count];
            current.date = date[count];
            current.time = time[count];
            current.status = status[count];

            data.add(current);
        }
        return data;
    }

}
