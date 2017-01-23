package id.sch.smktelkom_mlg.learn.intent1;

import android.icu.util.Calendar;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.textservice.TextInfo;
import android.widget.TextView;

@RequiresApi(api = Build.VERSION_CODES.N)
public class HasilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        setTitle("Hasil");
        

        
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        String nama = getIntent().getStringExtra(MainActivity.NAMA);
        int umur = getIntent().getIntExtra(MainActivity.UMUR,0);

        int yearNow = Calendar.getInstance().get(Calendar.YEAR);
        int tahunLahir  = yearNow - umur ;

        TextView tvHasil = (TextView) findViewById(R.id.textViewHasil);
        tvHasil.setText(nama + "lahir pada tahun" + tahunLahir);
        
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId()==android.R.id.home )
        {
            onBackPressed();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
