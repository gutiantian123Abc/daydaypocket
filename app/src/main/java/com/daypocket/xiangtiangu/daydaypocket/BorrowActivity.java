package com.daypocket.xiangtiangu.daydaypocket;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;
import android.graphics.Color;
import android.widget.EditText;
import android.widget.TextView;

import com.jjoe64.graphview.LegendRenderer;
import com.jjoe64.graphview.DefaultLabelFormatter;
import com.jjoe64.graphview.series.OnDataPointTapListener;
import com.jjoe64.graphview.series.Series;
import android.view.View;
import android.support.v7.widget.Toolbar;

public class BorrowActivity extends AppCompatActivity {

    private TextView balance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_borrow);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        Bundle data = getIntent().getExtras();
        balance = (TextView)findViewById(R.id.balance);
        balance.setText("Current Balance $" + data.get("Payamount").toString());

        Toolbar toolbar = (Toolbar) findViewById(R.id.borrowToolbar);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // back button pressed
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        GraphView graph = (GraphView) findViewById(R.id.graph);

        LineGraphSeries<DataPoint> series;
        if(data.get("Payamount").toString().equals("500")) {
            series = new LineGraphSeries<DataPoint>(new DataPoint[] {
                    new DataPoint(1, 500),
                    new DataPoint(2, 512),
                    new DataPoint(3, 528),
                    new DataPoint(4, 539),
                    new DataPoint(5, 543)
            });
        }else if(data.get("Payamount").toString().equals("800")) {
            series = new LineGraphSeries<DataPoint>(new DataPoint[] {
                    new DataPoint(1, 800),
                    new DataPoint(2, 812),
                    new DataPoint(3, 823),
                    new DataPoint(4, 843),
                    new DataPoint(5, 848)
            });

        }else {
            series = new LineGraphSeries<DataPoint>(new DataPoint[] {
                    new DataPoint(1, 200),
                    new DataPoint(2, 222),
                    new DataPoint(3, 230),
                    new DataPoint(4, 253),
                    new DataPoint(5, 260)
            });

        }

        series.setTitle("Outcome Expectation");
        series.setDrawDataPoints(true);
        series.setDrawBackground(true);
        series.setBackgroundColor(Color.argb(150, 255, 0, 0));
        series.setAnimated(true);
        series.setColor(Color.argb(255, 255, 0, 0));
        series.setThickness(10);
        series.setDataPointsRadius(20);

        graph.addSeries(series);
        graph.setTitleTextSize(20);
        graph.getLegendRenderer().setVisible(true);
        graph.getLegendRenderer().setAlign(LegendRenderer.LegendAlign.TOP);
        graph.getGridLabelRenderer().setGridColor(Color.argb(255, 0, 0, 0));
        graph.getGridLabelRenderer().setVerticalLabelsColor(Color.argb(255, 255, 0, 0));
        graph.getGridLabelRenderer().setHorizontalLabelsColor(Color.argb(255, 255, 0, 0));
        graph.getGridLabelRenderer().setTextSize(60);

        graph.getGridLabelRenderer().setLabelFormatter(new DefaultLabelFormatter() {
            @Override
            public String formatLabel(double value, boolean isValueX) {
                if (isValueX) {
                    // show normal x values
                    return super.formatLabel(value, isValueX) + "/15";
                } else {
                    // show currency for y values
                    return "$" + super.formatLabel(value, isValueX);
                }
            }
        });
    }


    public void borrow(View view) {
        Intent intent = new Intent(getApplicationContext(), BorrowKeepBorrowActivity.class);
        startActivity(intent);
    }

    public void pay(View view) {
        Intent intent = new Intent(getApplicationContext(), BorrowPaySelectActivity.class);
        startActivity(intent);
    }


}
