package br.com.senaigo.mobile.mpt.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import br.com.senaigo.mobile.mpt.util.DebugActivity;
import br.com.senaigo.mobile.mpt.R;
import br.com.senaigo.mobile.mpt.models.Servico;

public class HomeActivity extends DebugActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }


}
