package com.example.map;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link fragment2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fragment2 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    ListView list_users;


    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public fragment2() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fragment2.
     */
    // TODO: Rename and change types and number of parameters
    public static fragment2 newInstance(String param1, String param2) {
        fragment2 fragment = new fragment2();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View contentView = inflater.inflate(R.layout.fragment_fragment2, container, false);
        ListView list_users = contentView.findViewById(R.id.listview);



        ArrayList<User> values = new ArrayList<>();
        values.add(new User("Challenge Nouvelle ville uv3  Date: 12/05/2020", "id :1 nombre des participent :50 distance 15.0",R.drawable.effort));
        values.add(new User("Challenge Nouvelle ville uv2  Date: 02/10/2020", "id :2 nombre des participent :33 distance 10.0",R.drawable.goal));
        values.add(new User("Challenge Constantine uv1  Date: 19/09/2020", "id :3 nombre des participent :91 distance 50.0",R.drawable.struggle));
        values.add(new User("Challenge Nouvelle ville uv3  Date: 12/05/2020", "id :4 nombre des participent :50 distance 15.0",R.drawable.difficulties));
        values.add(new User("Challenge Nouvelle ville uv2  Date: 02/10/2020", "id :5 nombre des participent :33 distance 10.0",R.drawable.struggle));
        values.add(new User("Challenge Constantine uv1  Date: 19/09/2020", "id :6 nombre des participent :91 distance 50.0",R.drawable.goal));
        values.add(new User("Challenge Nouvelle ville uv3  Date: 12/05/2020", "id :7 nombre des participent :50 distance 15.0",R.drawable.difficulties));
        values.add(new User("Challenge Nouvelle ville uv2  Date: 02/10/2020", "id :8 nombre des participent :33 distance 10.0",R.drawable.effort));
        values.add(new User("Challenge Constantine uv1  Date: 19/09/2020", "id :9 nombre des participent :91 distance 50.0",R.drawable.struggle));
        values.add(new User("Challenge Nouvelle ville uv3  Date: 12/05/2020", "id :10 nombre des participent :50 distance 15.0",R.drawable.goal));
        values.add(new User("Challenge Nouvelle ville uv2  Date: 02/10/2020", "id :11 nombre des participent :33 distance 10.0",R.drawable.difficulties));
        values.add(new User("Challenge Constantine uv1  Date: 19/09/2020", "id :12 nombre des participent :91 distance 50.0",R.drawable.effort));
        values.add(new User("Challenge Nouvelle ville uv3  Date: 12/05/2020", "id :13 nombre des participent :50 distance 15.0",R.drawable.difficulties));
        values.add(new User("Challenge Nouvelle ville uv2  Date: 02/10/2020", "id :14 nombre des participent :33 distance 10.0",R.drawable.struggle));
        values.add(new User("Challenge Constantine uv1  Date: 19/09/2020", "id :15 nombre des participent :91 distance 50.0",R.drawable.goal));



        CustomAdapter listAdapter = new CustomAdapter(values, R.layout.item_user);
        list_users.setAdapter(listAdapter);

        return contentView;
    }
}