package payvenue.catingub.com.tabsandfragments;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupMenu;


/**
 * A simple {@link Fragment} subclass.
 */
public class CompletedFragment extends Fragment implements PopupMenu.OnMenuItemClickListener{

    private Button mStatus;

    public CompletedFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.cardview_layout, container, false);
        mStatus = (Button) view.findViewById(R.id.btnStatus);
        mStatus.setBackgroundColor(Color.parseColor("#FF29B06C"));
        mStatus.setText("   Completed");
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
        popUp.setOnMenuItemClickListener(CompletedFragment.this);
        popUp.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.OnProcess_option:
                mStatus.setBackgroundColor(Color.parseColor("#D3AA2E"));
                mStatus.setText("   On Process");
                break;
            case R.id.Overdue_option:
                mStatus.setBackgroundColor(Color.parseColor("#E82C45"));
                mStatus.setText("   On Process - Overdue");
                break;
            case R.id.Completed_option:
                mStatus.setBackgroundColor(Color.parseColor("#FF29B06C"));
                mStatus.setText("   Completed");
                break;
            default: break;
        }
        return false;
    }
}
