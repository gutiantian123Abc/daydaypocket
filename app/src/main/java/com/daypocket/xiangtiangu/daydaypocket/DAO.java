package com.daypocket.xiangtiangu.daydaypocket;

import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class DAO {
    private LineGraphSeries<DataPoint> series1 = new LineGraphSeries<DataPoint>(new DataPoint[] {
            new DataPoint(1, 500),
            new DataPoint(2, 512),
            new DataPoint(3, 528),
            new DataPoint(4, 539),
            new DataPoint(5, 543)
    });

    public LineGraphSeries<DataPoint> getSeries1() {
        return series1;
    }

    public LineGraphSeries<DataPoint> getSeries2() {
        return series2;
    }

    private LineGraphSeries<DataPoint> series2 = new LineGraphSeries<DataPoint>(new DataPoint[] {
            new DataPoint(1, 300),
            new DataPoint(2, 312),
            new DataPoint(3, 328),
            new DataPoint(4, 339),
            new DataPoint(5, 343)
    });



}
