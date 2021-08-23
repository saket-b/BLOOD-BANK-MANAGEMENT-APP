package com.knowlege.bloodbank.adapter;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.knowlege.bloodbank.MainActivity;
import com.knowlege.bloodbank.R;
import com.knowlege.bloodbank.user;

import java.util.List;

public class BloodListAdapter extends RecyclerView.Adapter<BloodListAdapter.Holder> {
    private Context context;
    private List<user> userList;

    public BloodListAdapter(Context context, List<user> user) {
        this.context = context;
        this.userList = user;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.blood_list, parent, false);
        return new BloodListAdapter.Holder(view);
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    @Override
    public void onBindViewHolder(@NonNull final Holder holder, int position) {
         final user user = userList.get(position);
        holder.name.setText(user.getFullname());
        holder.mobile.setText(user.getMobno());
        holder.address.setText(user.getAddress());
        holder.icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String number=user.getMobno();
               String call="tel:" +number;
              //  Intent phonecall=new Intent(Intent.ACTION_CALL); is not work;
               Intent phonecall=new Intent(Intent.ACTION_DIAL);
               phonecall.setData(Uri.parse(call));
               v.getContext().startActivity(phonecall);

//                Intent i = new Intent(Intent.ACTION_CALL,
//                        Uri.parse("tel:" + number);
//                context.startActivity(i);
            }
        });
    }


    public class Holder extends RecyclerView.ViewHolder {
        public TextView name;
        public ImageView icon;
        public TextView mobile;
        public TextView address;

        public Holder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.user_name);
            mobile = itemView.findViewById(R.id.user_mobile);
            address = itemView.findViewById(R.id.user_address);
            icon=itemView.findViewById(R.id.icon);
        }

    }
}