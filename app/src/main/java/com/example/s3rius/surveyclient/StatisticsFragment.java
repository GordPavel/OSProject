package com.example.s3rius.surveyclient;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class StatisticsFragment extends Fragment {


    public StatisticsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        ImageView imageView = (ImageView)().findViewById(R.id.image_on_statistics);
//        imageView.setImageResource(R.drawable.statistics);
        getActivity().setTitle("Statistics");
        return inflater.inflate(R.layout.fragment_statistics, container, false);
    }
    public void takeStatistics(){
        // FIXME: 18.03.17 get Statistics List with links from server.
    }
}
