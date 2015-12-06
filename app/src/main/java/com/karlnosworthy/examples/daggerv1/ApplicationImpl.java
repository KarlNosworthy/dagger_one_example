package com.karlnosworthy.examples.daggerv1;

import android.app.Application;
import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import dagger.ObjectGraph;


public class ApplicationImpl extends Application {

    private ObjectGraph objectGraph;

    public static ApplicationImpl using(Context context) {
        return (ApplicationImpl) context.getApplicationContext();
    }


    @Override
    public void onCreate() {
        super.onCreate();
        objectGraph = ObjectGraph.create(getModules().toArray());
    }

    public <T> T inject(T object) {
        return objectGraph.inject(object);
    }

    protected List<Object> getModules() {
        List<Object> modules = new ArrayList<>(1);
        modules.add(new ApplicationModule());
        return modules;
    }
}
