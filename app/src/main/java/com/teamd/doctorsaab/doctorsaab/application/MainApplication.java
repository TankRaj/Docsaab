package com.teamd.doctorsaab.doctorsaab.application;

import android.app.Application;

import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;
import com.teamd.doctorsaab.doctorsaab.helpers.Constants;

public class MainApplication extends Application {


    public static GoogleAnalytics analytics;
    public static Tracker tracker;
    @Override
    public void onCreate() {
        super.onCreate();
        analytics = GoogleAnalytics.getInstance(this);
        analytics.setLocalDispatchPeriod(1800);

        tracker = analytics.newTracker(Constants.ANALYTICS_ID);
        tracker.enableExceptionReporting(true);
        tracker.enableAdvertisingIdCollection(true);
        tracker.enableAutoActivityTracking(true);
    }
}
