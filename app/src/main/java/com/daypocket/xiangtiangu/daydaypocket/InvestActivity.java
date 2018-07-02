package com.daypocket.xiangtiangu.daydaypocket;

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


public class InvestActivity extends AppCompatActivity {

    private TextView balance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invest);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        balance = (TextView)findViewById(R.id.balance);
        balance.setText("Current Balance $500");


        GraphView graph = (GraphView) findViewById(R.id.graph);
        LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[] {
                new DataPoint(1, 500),
                new DataPoint(2, 512),
                new DataPoint(3, 528),
                new DataPoint(4, 539),
                new DataPoint(5, 543)
        });
        series.setTitle("Income Expectation");
        series.setDrawDataPoints(true);
        series.setDrawBackground(true);
        series.setBackgroundColor(Color.argb(100, 24, 101, 224));
        series.setAnimated(true);
        series.setColor(Color.argb(255, 24, 101, 224));
        series.setThickness(5);
        series.setDataPointsRadius(15);

        graph.addSeries(series);
        graph.setTitleTextSize(20);
        graph.getLegendRenderer().setVisible(true);
        graph.getLegendRenderer().setAlign(LegendRenderer.LegendAlign.TOP);
        graph.getGridLabelRenderer().setGridColor(Color.argb(255, 24, 101, 224));
        graph.getGridLabelRenderer().setVerticalLabelsColor(Color.argb(255, 24, 101, 224));
        graph.getGridLabelRenderer().setHorizontalLabelsColor(Color.argb(255, 24, 101, 224));
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


}
