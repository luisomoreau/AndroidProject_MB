package fr.hei.moreaubernaert.model;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import fr.hei.moreaubernaert.R;


import fr.hei.moreaubernaert.View.TouchImageView;

public class ZoomFragment extends Fragment {

    public ImageView image;

    private static int[] images = {R.drawable.bb1, R.drawable.bb2,R.drawable.bb4,R.drawable.bb5, R.drawable.bb6,R.drawable.d1 };
    //    Bundle objetbunble = this.getIntent().getExtras();
    // récupération de la valeur
    //String InfoPasse= objetbunble .getString("idPhoto");
    //Integer  idPhoto = Integer.parseInt(InfoPasse);
    //On doit récupérer la variable correspondant à l'id de la photo que l'on veut afficher
    int idPhoto;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.fragment_zoom);
        //return R.layout.fragment_zoom;

        final View rootView = inflater.inflate(fr.hei.moreaubernaert.R.layout.fragment_zoom, container, false);
        image = (ImageView) rootView.findViewById(R.id.img);
        idPhoto=2;

        image.setImageResource(images[idPhoto]);


        return rootView;


    }

}
