package com.daypocket.xiangtiangu.daydaypocket;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.DrawableRes;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.util.DisplayMetrics;
import android.view.WindowManager;



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
        int screenWidth = getScreenWeight();
        int screenHeight = getScreenHeight();



        if(text.equals("Dashboard")) {
            Button payBtn = new Button(getActivity());
            RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                    RelativeLayout.LayoutParams.WRAP_CONTENT);
            params.topMargin = screenHeight / 4;
            params.leftMargin = screenWidth / 4;
            payBtn.setLayoutParams(params);
            payBtn.setText("INVEST");
            payBtn.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
            frameLayout.addView(payBtn);

            Button borrowBtn = new Button(getActivity());
            params.topMargin = screenHeight / 3;
            params.leftMargin = screenWidth / 3;
            borrowBtn.setLayoutParams(params);
            borrowBtn.setText("BORROW");
            borrowBtn.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
            frameLayout.addView(borrowBtn);

        }

        return rootView;
    }

    private int getScreenHeight() {
        return getResources().getDisplayMetrics().heightPixels;
    }

    private int getScreenWeight() {
        return getResources().getDisplayMetrics().widthPixels;
    }


}
