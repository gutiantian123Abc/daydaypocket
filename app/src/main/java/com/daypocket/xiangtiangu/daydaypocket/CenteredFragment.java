package com.daypocket.xiangtiangu.daydaypocket;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;


/**
 * Created by yarolegovich on 25.03.2017.
 */

public class CenteredFragment extends Fragment {

    private static final String EXTRA_TEXT = "text";

    public static CenteredFragment createFor(String text) {
        CenteredFragment fragment = new CenteredFragment();
        Bundle args = new Bundle();
        args.putString(EXTRA_TEXT, text);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        String text = getArguments().getString(EXTRA_TEXT);
        FrameLayout frameLayout = (FrameLayout) rootView.findViewById(R.id.fragment_main_layout);

        if(text.equals("Dashboard")) {
            Button button = new Button(getActivity());
            button.setText(text);
            frameLayout.addView(button);
        }

        return rootView;
    }

}
