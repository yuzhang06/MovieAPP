package com.example.team101.testtablayout;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

// In this case, the fragment displays simple text based on the page
public class PageFragment extends Fragment {
    public static final String ARG_PAGE = "ARG_PAGE";

    private int mPage;

    public static PageFragment newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        PageFragment fragment = new PageFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPage = getArguments().getInt(ARG_PAGE);
    }

//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        View view = inflater.inflate(R.layout.fragment_page, container, false);
//        TextView textView = (TextView) view;
//        textView.setText("Fragment #" + mPage);
//        return view;
//    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_page, container, false);
        TextView textView = (TextView) view;
        textView.setText("Fragment #" + mPage);

        switch (getArguments().getInt(ARG_PAGE)) {
//            case 1: {
//                View view = inflater.inflate(R.layout.fragment_page, container, false);
//                TextView textView = (TextView) view;
//                textView.setText("Fragment #" + mPage);
//                break;
//            }
            case 2: {
                view = inflater.inflate(R.layout.button_on_frag2, null);
                final Context context = view.getContext();
                Button button = view.findViewById(R.id.button);
                button.setOnClickListener(new View.OnClickListener(){

                    @Override
                    public void onClick(View view) {
                        context.startActivity(new Intent(context, AnotherActivity.class));
                    }

                });
                break;
            }

//            case 3: {
//                View view = inflater.inflate(R.layout.fragment_page, container, false);
//                TextView textView = (TextView) view;
//                textView.setText("Fragment #" + mPage);
//                break;
//            }

        }
        return view;
    }
}
