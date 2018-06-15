package com.every.nongnong.adapters;

import android.content.Context;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.every.nongnong.R;

/**
 * Created by Dongju on 2018. 6. 14..
 */

public class TeamInfoAdapter extends PagerAdapter {
    Context context;
    LayoutInflater inflater;

    public TeamInfoAdapter(Context context) {
        super();
        this.context = context;
        //inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater = LayoutInflater.from(context);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
//        View v = inflater.inflate(R.layout.single_view_team_info, null);
//        TextView textView = (TextView) v.findViewById(R.id.teamName);
//
//        textView.setText(""+position);
//
//        container.addView(v);

        LinearLayout linearLayout = (LinearLayout) inflater.inflate(R.layout.single_view_team_info,container,false);
        TextView textView = linearLayout.findViewById(R.id.teamName);
        textView.setText("111111111");
        container.addView(linearLayout, 0);
        return linearLayout;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((ViewGroup) object);
    }

}

