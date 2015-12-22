package bbtec.ta7ramani.trafficworkshop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by charatroek_n on 2558-12-22.
 */
public class MyAdapter extends BaseAdapter {
    //Explicit
    private Context objContext;
    private String[] titleStrings, detailStrings;
    private int[] iconInts;

    public MyAdapter(Context objContext, String[] titleStrings, String[] detailStrings, int[] iconInts) {
        this.objContext = objContext;
        this.titleStrings = titleStrings;
        this.detailStrings = detailStrings;
        this.iconInts = iconInts;
    }   //Constructor

    @Override
    public int getCount() {
        return titleStrings.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater objLayoutInflater = (LayoutInflater) objContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View objView = objLayoutInflater.inflate(R.layout.my_listview, parent,false);

        //For Title
        TextView titleTextView = (TextView) objView.findViewById(R.id.textView2);
        titleTextView.setText(titleStrings[position]);


        TextView detailTextView = (TextView) objView.findViewById(R.id.textView3);
        detailTextView.setText(detailStrings[position]);


        //For Icon
        ImageView iconImageView = (ImageView) objView.findViewById((R.id.imageView));
        iconImageView.setImageResource(iconInts[position]);


        return objView;
    }
}   //Main Class
