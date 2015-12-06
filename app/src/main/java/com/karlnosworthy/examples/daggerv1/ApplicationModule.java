package com.karlnosworthy.examples.daggerv1;

import com.karlnosworthy.examples.daggerv1.activity.OtherActivity;
import com.karlnosworthy.examples.daggerv1.activity.MainActivity;
import com.karlnosworthy.examples.daggerv1.reporting.ActivityEntryReporter;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(injects = {MainActivity.class, OtherActivity.class})
public class ApplicationModule {

    public ApplicationModule() {
        super();
    }

    @Singleton
    @Provides
    public ActivityEntryReporter providesActivityEntryReporter() {
        return new ActivityEntryReporter();
    }
}
