package com.knowlege.bloodbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ServiceConfigurationError;

public class Search extends AppCompatActivity {
    String []blood_group;
    String []statearray;
    Spinner spinner,districtspinner,statespinner;
    ArrayAdapter arrayAdapterstate,arrayAdapterdistrict;
    String bloodgroup,state,district;

    String andman[],arunchal[],bihar[],sikkim[],jammu[],chhatishgarh[],himachal[],meghalay[],nagaland[],mizoram[],kerala[],tamilnadu[],telangana[],orissa[],westbangal[];
    String tripura[],delhi[],chandigarh[],laksh[],rajathan[],madhyap[],uttarp[],panjab[],hariyana[],arunachalp[],ladakh[],dadarnagar[],assam[],jharkhand[],gujrat[];
    String lakshdweep[],puducherry[],uttrakhand[],andrap[],manipur[],agartala[],telangna[],goa[],karnatak[],maharastra[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        spinner=(Spinner)findViewById(R.id.bloodg);
        statespinner=(Spinner)findViewById(R.id.state);
        districtspinner=(Spinner)findViewById(R.id.city);


        blood_group=getResources().getStringArray(R.array.bloodgroup);
        ArrayAdapter arrayAdapter= new ArrayAdapter(Search.this,android.R.layout.simple_spinner_item,blood_group);
        spinner.setAdapter(arrayAdapter);

        statearray=getResources().getStringArray(R.array.state);
        arrayAdapterstate=new ArrayAdapter(Search.this,android.R.layout.simple_list_item_1,statearray);


        statespinner.setAdapter(arrayAdapterstate);
        try {
            statespinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                    if (position == 1) {
                        arunachalp=getResources().getStringArray(R.array.Arunachalpradesh);
                        arrayAdapterdistrict = new ArrayAdapter(Search.this, android.R.layout.simple_list_item_1, arunachalp);
                    } else if (position == 2) {
                        andrap=getResources().getStringArray(R.array.Andrapradesh);
                        arrayAdapterdistrict = new ArrayAdapter(Search.this, android.R.layout.simple_list_item_1, andrap);
                    } else if (position == 3) {
                        assam=getResources().getStringArray(R.array.Assam);
                        arrayAdapterdistrict = new ArrayAdapter(Search.this, android.R.layout.simple_list_item_1, assam);
                    } else if (position == 4) {
                        bihar=getResources().getStringArray(R.array.Bihar);
                        arrayAdapterdistrict = new ArrayAdapter(Search.this, android.R.layout.simple_list_item_1, bihar);
                    } else if (position == 5) {
                        chhatishgarh=getResources().getStringArray(R.array.Chhatishgarh);
                        arrayAdapterdistrict = new ArrayAdapter(Search.this, android.R.layout.simple_list_item_1, chhatishgarh);
                    } else if (position == 6) {
                        goa=getResources().getStringArray(R.array.Goa);
                        arrayAdapterdistrict = new ArrayAdapter(Search.this, android.R.layout.simple_list_item_1, goa);
                    } else if (position == 7) {
                        gujrat=getResources().getStringArray(R.array.Gujrat);
                        arrayAdapterdistrict = new ArrayAdapter(Search.this, android.R.layout.simple_list_item_1, gujrat);
                    } else if (position == 8) {
                        hariyana=getResources().getStringArray(R.array.Hariyana);
                        arrayAdapterdistrict = new ArrayAdapter(Search.this, android.R.layout.simple_list_item_1, hariyana);
                    } else if (position == 9) {
                        himachal=getResources().getStringArray(R.array.Himachal_pradesh);
                        arrayAdapterdistrict = new ArrayAdapter(Search.this, android.R.layout.simple_list_item_1, himachal);
                    } else if (position == 10) {
                        jammu=getResources().getStringArray(R.array.Jammu_and_kashmir);
                        arrayAdapterdistrict = new ArrayAdapter(Search.this, android.R.layout.simple_list_item_1, jammu);
                    } else if (position == 11) {
                        jharkhand=getResources().getStringArray(R.array.Jharkhand);
                        arrayAdapterdistrict = new ArrayAdapter(Search.this, android.R.layout.simple_list_item_1, jharkhand);
                    } else if (position == 12) {
                        karnatak=getResources().getStringArray(R.array.Karnatak);
                        arrayAdapterdistrict = new ArrayAdapter(Search.this, android.R.layout.simple_list_item_1, karnatak);
                    } else if (position == 13) {
                        kerala=getResources().getStringArray(R.array.Kerala);
                        arrayAdapterdistrict = new ArrayAdapter(Search.this, android.R.layout.simple_list_item_1, kerala);
                    } else if (position == 14) {
                        madhyap=getResources().getStringArray(R.array.Madya_pradesh);
                        arrayAdapterdistrict = new ArrayAdapter(Search.this, android.R.layout.simple_list_item_1, madhyap);
                    } else if (position == 15) {
                        maharastra=getResources().getStringArray(R.array.Maharastra);
                        arrayAdapterdistrict = new ArrayAdapter(Search.this, android.R.layout.simple_list_item_1, maharastra);
                    } else if (position == 16) {
                        manipur=getResources().getStringArray(R.array.Manipur);
                        arrayAdapterdistrict = new ArrayAdapter(Search.this, android.R.layout.simple_list_item_1, manipur);
                    } else if (position == 17) {
                        meghalay=getResources().getStringArray(R.array.Meghalay);
                        arrayAdapterdistrict = new ArrayAdapter(Search.this, android.R.layout.simple_list_item_1, meghalay);
                    } else if (position == 18) {
                        mizoram=getResources().getStringArray(R.array.Mizoram);
                        arrayAdapterdistrict = new ArrayAdapter(Search.this, android.R.layout.simple_list_item_1, mizoram);
                    } else if (position == 19) {
                        nagaland=getResources().getStringArray(R.array.Nagaland);
                        arrayAdapterdistrict = new ArrayAdapter(Search.this, android.R.layout.simple_list_item_1, nagaland);
                    } else if (position == 20) {
                        orissa=getResources().getStringArray(R.array.Odissa);
                        arrayAdapterdistrict = new ArrayAdapter(Search.this, android.R.layout.simple_list_item_1, orissa);
                    } else if (position == 21) {
                        panjab=getResources().getStringArray(R.array.Panjab);
                        arrayAdapterdistrict = new ArrayAdapter(Search.this, android.R.layout.simple_list_item_1, panjab);
                    } else if (position == 22) {
                        rajathan=getResources().getStringArray(R.array.Rajathan);
                        arrayAdapterdistrict = new ArrayAdapter(Search.this, android.R.layout.simple_list_item_1, rajathan);
                    } else if (position == 23) {
                        sikkim=getResources().getStringArray(R.array.Sikkim);
                        arrayAdapterdistrict = new ArrayAdapter(Search.this, android.R.layout.simple_list_item_1, sikkim);
                    } else if (position == 24) {
                        tamilnadu=getResources().getStringArray(R.array.Tamilnadu);
                        arrayAdapterdistrict = new ArrayAdapter(Search.this, android.R.layout.simple_list_item_1, tamilnadu);
                    } else if (position == 25) {
                        telangana=getResources().getStringArray(R.array.Telengana);
                        arrayAdapterdistrict = new ArrayAdapter(Search.this, android.R.layout.simple_list_item_1, telangana);
                    } else if (position == 26) {
                        tripura=getResources().getStringArray(R.array.Tripura);
                        arrayAdapterdistrict = new ArrayAdapter(Search.this, android.R.layout.simple_list_item_1, tripura);
                    } else if (position == 27) {
                        uttarp=getResources().getStringArray(R.array.Uttar_pradesh);
                        arrayAdapterdistrict = new ArrayAdapter(Search.this, android.R.layout.simple_list_item_1, uttarp);
                    }
                    else if (position == 28) {
                        uttrakhand = getResources().getStringArray(R.array.Uttarakhand);
                        arrayAdapterdistrict = new ArrayAdapter(Search.this, android.R.layout.simple_list_item_1, uttrakhand);
                    }
                    else if (position == 29) {
                        westbangal=getResources().getStringArray(R.array.West_bangal);
                        arrayAdapterdistrict = new ArrayAdapter(Search.this, android.R.layout.simple_list_item_1, westbangal);
                    } else if (position == 30) {
                        chandigarh=getResources().getStringArray(R.array.chhandigarh);
                        arrayAdapterdistrict = new ArrayAdapter(Search.this, android.R.layout.simple_list_item_1, chandigarh);
                    } else if (position == 31) {
                        andman=getResources().getStringArray(R.array.Andaman_and_nicobar);
                        arrayAdapterdistrict = new ArrayAdapter(Search.this, android.R.layout.simple_list_item_1, andman);
                    } else if (position == 32) {
                        delhi=getResources().getStringArray(R.array.Delhi);
                        arrayAdapterdistrict = new ArrayAdapter(Search.this, android.R.layout.simple_list_item_1, delhi);
                    } else if (position == 33) {
                        dadarnagar=getResources().getStringArray(R.array.Dadar_and_haveli);
                        arrayAdapterdistrict = new ArrayAdapter(Search.this, android.R.layout.simple_list_item_1, dadarnagar);
                    } else if (position == 34) {
                        jammu=getResources().getStringArray(R.array.Jammu_and_kashmir);
                        arrayAdapterdistrict = new ArrayAdapter(Search.this, android.R.layout.simple_list_item_1, jammu);
                    } else if (position == 35) {
                        ladakh=getResources().getStringArray(R.array.Ladakh);
                        arrayAdapterdistrict = new ArrayAdapter(Search.this, android.R.layout.simple_list_item_1, ladakh);
                    } else if (position == 36) {
                        lakshdweep=getResources().getStringArray(R.array.Lakshadweep);
                        arrayAdapterdistrict = new ArrayAdapter(Search.this, android.R.layout.simple_list_item_1, lakshdweep);
                    } else {
                        puducherry=getResources().getStringArray(R.array.Puducherry);
                        arrayAdapterdistrict = new ArrayAdapter(Search.this, android.R.layout.simple_list_item_1, puducherry);
                    }


                    districtspinner.setAdapter(arrayAdapterdistrict);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
        }
        catch (Exception e)
        {
            Log.i("messege","Exception is accur");
        }
    }

    public void searching(View view) {

         bloodgroup=spinner.getSelectedItem().toString().trim();
         state=statespinner.getSelectedItem().toString().trim();
         district=districtspinner.getSelectedItem().toString().trim();
        if(TextUtils.isEmpty(bloodgroup)||bloodgroup.equals("select bloodgroup"))
        {
            Toast.makeText(Search.this,"please enter the blood group",Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(state)||state.equals("select state"))
        {
            Toast.makeText(Search.this,"please enter the state",Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(district) ||state.equals("select city"))
        {
            Toast.makeText(Search.this,"please enter the district",Toast.LENGTH_SHORT).show();
            return;
        }

        Bundle bundle=new Bundle();
        bundle.putString("bloodgroup",bloodgroup);
        bundle.putString("state",state);
        bundle.putString("city",district);
        Intent intent=new Intent(Search.this,read_blood_group.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}