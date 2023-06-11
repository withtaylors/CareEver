package com.example.careever;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {

    private ArrayList<VolunteerListViewItem> listViewItemVolunteerList = new ArrayList<VolunteerListViewItem>();

    public ListViewAdapter() {

    }

    @Override
    public int getCount(){
        return listViewItemVolunteerList.size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        final int pos = position;
        final Context context = parent.getContext();

        if(convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.activity_volunteerlistview_item, parent, false);
        }
        //ImageView iconImageView = (ImageView) convertView.findViewById(R.id.imageView1);
        TextView nameTextView = (TextView) convertView.findViewById(R.id.name);
        TextView destinationTextView = (TextView) convertView.findViewById(R.id.destination);
        TextView titleTextView = (TextView) convertView.findViewById(R.id.title);
        TextView date1TextView = (TextView) convertView.findViewById(R.id.date1);
        TextView date2TextView = (TextView) convertView.findViewById(R.id.date2);

        VolunteerListViewItem volunteerListViewItem = listViewItemVolunteerList.get(position);

        //iconImageView.setImageDrawable(listViewItem.getIcon());

        nameTextView.setText(volunteerListViewItem.getName());
        destinationTextView.setText(volunteerListViewItem.getDestination());
        titleTextView.setText(volunteerListViewItem.getTitle());
        date1TextView.setText(volunteerListViewItem.getDate1());
        date2TextView.setText(volunteerListViewItem.getDate2());

        return convertView;
    }

    @Override
    public Object getItem(int position) {
        return listViewItemVolunteerList.get(position).getTitle();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public void addItem( String name, String destination, String title, String date1, String date2) {
        VolunteerListViewItem item = new VolunteerListViewItem();

        item.setName(name);
        item.setDestination(destination);
        item.setTitle(title);
        item.setDate1(date1);
        item.setDate2(date2);

        listViewItemVolunteerList.add(item);
    }

}
