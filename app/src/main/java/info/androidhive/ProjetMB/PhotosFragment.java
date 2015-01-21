package info.androidhive.ProjetMB;

import android.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import info.androidhive.ProjetMB.adapter.ItemListBaseAdapter;


public class PhotosFragment extends Fragment {

    public PhotosFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.fragment_photos, container, false);

        ArrayList<ItemDetails> image_details = GetSearchResults();

        final ListView lv1 = (ListView)rootView.findViewById(R.id.listV_main);
        lv1.setAdapter(new ItemListBaseAdapter(getActivity(), image_details));

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Object o = lv1.getItemAtPosition(position);
                ItemDetails obj_itemDetails = (ItemDetails)o;
                Toast.makeText(rootView.getContext(), "You have chosen : " + " " + obj_itemDetails.getName(), Toast.LENGTH_SHORT).show();
            }
        });
        return rootView;
    }

    private ArrayList<ItemDetails> GetSearchResults() {
        ArrayList<ItemDetails> results = new ArrayList<ItemDetails>();

        ItemDetails item_details = new ItemDetails();
        item_details.setName("Pizza");
        item_details.setItemDescription("Spicy Chiken Pizza");
        item_details.setPrice("RS 310.00");
        item_details.setImageNumber(1);
        results.add(item_details);

        item_details = new ItemDetails();
        item_details.setName("Burger");
        item_details.setItemDescription("Beef Burger");
        item_details.setPrice("RS 350.00");
        item_details.setImageNumber(2);
        results.add(item_details);

        item_details = new ItemDetails();
        item_details.setName("Pizza");
        item_details.setItemDescription("Chiken Pizza");
        item_details.setPrice("RS 250.00");
        item_details.setImageNumber(3);
        results.add(item_details);

        item_details = new ItemDetails();
        item_details.setName("Burger");
        item_details.setItemDescription("Chicken Burger");
        item_details.setPrice("RS 350.00");
        item_details.setImageNumber(4);
        results.add(item_details);

        item_details = new ItemDetails();
        item_details.setName("Burger");
        item_details.setItemDescription("Fish Burger");
        item_details.setPrice("RS 310.00");
        item_details.setImageNumber(5);
        results.add(item_details);

        item_details = new ItemDetails();
        item_details.setName("Mango");
        item_details.setItemDescription("Mango Juice");
        item_details.setPrice("RS 250.00");
        item_details.setImageNumber(6);
        results.add(item_details);


        return results;
    }


}
