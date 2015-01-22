package fr.hei.moreaubernaert.View;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import fr.hei.moreaubernaert.R;

public class ZoomFragment extends Fragment {

    public ImageView image;
    public Integer idPhoto;

    private static int[] images = { R.drawable.pizza_regina1,R.drawable.pizza_chocolate2,R.drawable.pizza_love3, R.drawable.pizza_meat4,R.drawable.pizza_cheese5,R.drawable.pizza_veggie6};

    //On doit récupérer la variable correspondant à l'id de la photo que l'on veut afficher
    //int idPhoto;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle objetbunble = this.getActivity().getIntent().getBundleExtra("infoPasser");
        // récupération de la valeur
        System.out.println("infopasser");
        String tes=getArguments().getString("infoPasser");
        System.out.println(tes);
        //String infoPasse= objetbunble.getString(String.valueOf(objetbunble));
       // System.out.println(infoPasse);
          idPhoto = Integer.parseInt(tes);
        System.out.println("id :"+idPhoto);

        //setContentView(R.layout.fragment_zoom);
        //return R.layout.fragment_zoom;

        final View rootView = inflater.inflate(fr.hei.moreaubernaert.R.layout.fragment_zoom, container, false);
        image = (ImageView) rootView.findViewById(R.id.img);


        image.setImageResource(images[idPhoto]);


        return rootView;


    }

}
