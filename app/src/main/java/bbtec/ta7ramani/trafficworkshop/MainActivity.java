package bbtec.ta7ramani.trafficworkshop;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //Explicit ประกาศตัวแกร
    private ListView trafficListView;
    private Button aboutMeButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Bind Widget
        bindWidget();

        //Button Controller
        buttonController();


        //Listview Controller
        listviewController();





    }   //Main Method

    private void listviewController() {
        //#1
        int[] intIcon = {R.drawable.traffic_01, R.drawable.traffic_02,
                R.drawable.traffic_03, R.drawable.traffic_04,
                R.drawable.traffic_05, R.drawable.traffic_06,
                R.drawable.traffic_07, R.drawable.traffic_08,
                R.drawable.traffic_09, R.drawable.traffic_10,
                R.drawable.traffic_11, R.drawable.traffic_12,
                R.drawable.traffic_13, R.drawable.traffic_14,
                R.drawable.traffic_15, R.drawable.traffic_16,
                R.drawable.traffic_17, R.drawable.traffic_18,
                R.drawable.traffic_19, R.drawable.traffic_20};

        //#2
        String[] strTitleStrings = new String[20];
         for (int i=1;i<=20;i++) {

             strTitleStrings[i - 1] = ("หัวข้อที่ y " + i);
         }



        /*ArrayList<String> strTitleListStrings = new ArrayList<>();
        for (int i=1;i<=20;i++) {


            strTitleListStrings.add("หัวข้อที่ z " + i);
        }*/


       /* strTitleStrings[0]="หัวข้อ x 01";
        strTitleStrings[1]="หัวข้อ x 02";
        strTitleStrings[2]="หัวข้อ x 03";
        strTitleStrings[3]="หัวข้อ x 04";
        strTitleStrings[4]="หัวข้อ x 05";
        strTitleStrings[5]="หัวข้อ x 06";
        strTitleStrings[6]="หัวข้อ x 07";
        strTitleStrings[7]="หัวข้อ x 08";
        strTitleStrings[8]="หัวข้อ x 09";
        strTitleStrings[9]="หัวข้อ x 10";

        strTitleStrings[10]="หัวข้อ x 11";
        strTitleStrings[11]="หัวข้อ x 12";
        strTitleStrings[12]="หัวข้อ x 13";
        strTitleStrings[13]="หัวข้อ x 14";
        strTitleStrings[14]="หัวข้อ x 15";
        strTitleStrings[15]="หัวข้อ x 16";
        strTitleStrings[16]="หัวข้อ x 17";
        strTitleStrings[17]="หัวข้อ x 18";
        strTitleStrings[18]="หัวข้อ x 19";
        strTitleStrings[19]="หัวข้อ x 20"; */

        //#3
        String[] strDetailStrings = getResources().getStringArray(R.array.detail_short);

        MyAdapter objMyAdapter = new MyAdapter(MainActivity.this, strTitleStrings, strDetailStrings, intIcon);
        trafficListView.setAdapter(objMyAdapter);


    } // listViewController

    private void buttonController() {
        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer buttonMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.sheep);
                buttonMediaPlayer.start();
                //https://youtu.be/unU8SdLtd3E

                Intent objIntent = new Intent(Intent.ACTION_VIEW);
                objIntent.setData(Uri.parse("https://youtu.be/unU8SdLtd3E"));
                startActivity(objIntent);





            }   //event
        });

    }

    private void bindWidget() {
        trafficListView = (ListView) findViewById(R.id.listView);

        aboutMeButton = (Button) findViewById(R.id.button);
    }


}   // Main Class
