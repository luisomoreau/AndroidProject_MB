package fr.hei.moreaubernaert.View;

import android.app.Fragment;

import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import fr.hei.moreaubernaert.adapter.ItemListBaseAdapter;
import fr.hei.moreaubernaert.model.ItemDetails;
import fr.hei.moreaubernaert.View.ZoomFragment;


public class PhotosFragment extends Fragment {

    public PhotosFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView = inflater.inflate(fr.hei.moreaubernaert.R.layout.fragment_photos, container, false);

        ArrayList<ItemDetails> image_details = GetSearchResults();

        final ListView lv1 = (ListView)rootView.findViewById(fr.hei.moreaubernaert.R.id.listV_main);
        lv1.setAdapter(new ItemListBaseAdapter(getActivity(), image_details));

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
               ZoomFragment fragment = new ZoomFragment();
                String infoPasser=Integer.toString(position);
                Bundle bundle = new Bundle();
                System.out.println(infoPasser);

                //Intent intent = new Intent(this, fr.hei.moreaubernaert.View.ZoomFragment.class);

                bundle.putString("infoPasser", infoPasser);
                FragmentManager fragmentManager = getFragmentManager();
                fragment.setArguments(bundle);
                fragmentManager.beginTransaction()
                        .replace(fr.hei.moreaubernaert.R.id.frame_container, fragment).commit();

                //startFragment(new Intent(getActivity(), ZoomFragment.class));
               // Object o = lv1.getItemAtPosition(position);
                //ItemDetails obj_itemDetails = (ItemDetails)o;
                //Toast.makeText(rootView.getContext(), "You have chosen : " + " " + obj_itemDetails.getName(), Toast.LENGTH_SHORT).show();
            }
        });
        return rootView;
    }



    private ArrayList<ItemDetails> GetSearchResults() {
        ArrayList<ItemDetails> results = new ArrayList<ItemDetails>();

        ItemDetails item_details = new ItemDetails();
        item_details.setName("Pizza Regina");
        item_details.setImageNumber(1);
        results.add(item_details);

        item_details = new ItemDetails();
        item_details.setName("Pizza Chocolat");
        item_details.setImageNumber(2);
        results.add(item_details);

        item_details = new ItemDetails();
        item_details.setName("Pizza Love");
        item_details.setImageNumber(3);
        results.add(item_details);

        item_details = new ItemDetails();
        item_details.setName("Pizza Viande");
        item_details.setImageNumber(4);
        results.add(item_details);

        item_details = new ItemDetails();
        item_details.setName("Pizza Fromage");
        item_details.setImageNumber(5);
        results.add(item_details);

        item_details = new ItemDetails();
        item_details.setName("Pizza Vegetarienne");
        item_details.setImageNumber(6);
        results.add(item_details);

        return results;
    }


}
