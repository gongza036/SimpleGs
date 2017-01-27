package com.gongza.simplegs.activity;

import android.app.Activity;
import android.os.Bundle;

import com.gongza.library.utils.PreferencesManager;
import com.gongza.simplegs.R;


/**
 *PreferencesManager使用方法
 */
public class PreferencesManagerAct extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        show();
    }

    private void show() {
        new PreferencesManager(this)
                .setName("PreferencesManagerAct")
                .init();

        //用法1
        // put int to preferences
        PreferencesManager.putInt("key100", 100);
        // get int from preferences
        PreferencesManager.getInt("key100");
        PreferencesManager.getInt("key100", -1);


        //用法2
        // put object to preferences
        PreferencesManager.putObject("object1", new Person("gongza"));
        // get object from preferences
        PreferencesManager.getObject("object1", Person.class);
    }

    // your object
    class Person {

        public String name;

        public Person(String name) {
            this.name = name;
        }

    }
}
