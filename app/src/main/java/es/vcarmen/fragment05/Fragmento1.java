package es.vcarmen.fragment05;

import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.support.annotation.Nullable;


public class Fragmento1 extends PreferenceFragment {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.preferencias);


    }
}
