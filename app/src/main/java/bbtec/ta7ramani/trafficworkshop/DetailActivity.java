package bbtec.ta7ramani.trafficworkshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    //Explicit ประกาศตัวแกร
    private ImageView trafficImageView;
    private TextView titleTextView;
    private TextView detailTextView;

 

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //Bind Widget
        bindWidget();


        //Bind data
        bindData();
    }

    private void bindData() {

        String strTitle = getIntent().getStringExtra("Title");
        titleTextView.setText(strTitle);

        int intIcon = getIntent().getIntExtra("Image", R.drawable.traffic_01);
        trafficImageView.setImageResource(intIcon);

        int lineIndex =  getIntent().getIntExtra("Index",0);




         String[] strLongStrings = getResources().getStringArray(R.array.detail_long);

        detailTextView.setText( strLongStrings[lineIndex]);



    } //bindData (showView)

    private void bindWidget() {

        trafficImageView = (ImageView) findViewById(R.id.imageView2);
        titleTextView = (TextView) findViewById(R.id.textView4);
        detailTextView = (TextView) findViewById(R.id.textView6);




    }
}

