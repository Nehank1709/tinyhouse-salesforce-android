package in.tinyhouse.salesforce.Billing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import in.tinyhouse.salesforce.Home.HomeActivity;
import in.tinyhouse.salesforce.Onboarding.LoginActivity;
import in.tinyhouse.salesforce.R;

public class BillComplete extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill_complete);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(BillComplete.this, HomeActivity.class));
                finish();
            }
        }, 2000);
    }
}