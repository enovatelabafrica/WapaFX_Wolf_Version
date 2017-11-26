package ng.com.androidlife.bellokanoex;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Monday extends AppCompatActivity {

    private RecyclerView WeeklyList;
    FirebaseDatabase database;
    DatabaseReference myRef;

    private ProgressDialog mProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weekly);

        mProgress = new ProgressDialog(this);

        WeeklyList = (RecyclerView) findViewById(R.id.weekyList);
        WeeklyList.setHasFixedSize(true);
        WeeklyList.setLayoutManager(new LinearLayoutManager(this));

        // Send a Query to the database
        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("WeeklyFX");
        myRef.keepSynced(true);


    }

    @Override
    public void onStart(){
        super.onStart();

        mProgress.setMessage("Loading updates...");
        mProgress.show();

        FirebaseRecyclerAdapter<ModelClass, WeeklyViewHolder>
                firebaseRecyclerAdapter = new FirebaseRecyclerAdapter<ModelClass, WeeklyViewHolder>(
                ModelClass.class,
                R.layout.weeklyfx,
                WeeklyViewHolder.class,
                myRef){
            @Override
            protected void populateViewHolder(WeeklyViewHolder viewHolder, ModelClass model,int position) {
                viewHolder.setWeeklydate(model.getWeeklydate());
                //viewHolder.setWeeklytime(model.getWeeklytime());
                viewHolder.setUsbweekly(model.getUsbweek());
                viewHolder.setUssweekly(model.getUssweek());
                viewHolder.setUkbweekly(model.getUkbweek());
                viewHolder.setUksweekly(model.getUksweek());
                viewHolder.setEubweekly(model.getEubweek());
                viewHolder.setEusweekly(model.getEusweek());
                viewHolder.setCnbweekly(model.getCnbweek());
                viewHolder.setCnsweekly(model.getCnsweek());
                viewHolder.setCfbweekly(model.getCfbweek());
                viewHolder.setCfsweekly(model.getCfsweek());
                viewHolder.setRybweekly(model.getRybweek());
                viewHolder.setRysweekly(model.getRysweek());

                viewHolder.setUsbweekaly(model.getUsbweeka());
                viewHolder.setUssweekaly(model.getUssweeka());
                viewHolder.setUkbweekaly(model.getUkbweeka());
                viewHolder.setUksweekaly(model.getUksweeka());
                viewHolder.setEubweekaly(model.getEubweeka());
                viewHolder.setEusweekaly(model.getEusweeka());
                viewHolder.setCnbweekaly(model.getCnbweeka());
                viewHolder.setCnsweekaly(model.getCnsweeka());
                viewHolder.setCfbweekaly(model.getCfbweeka());
                viewHolder.setCfsweekaly(model.getCfsweeka());
                viewHolder.setRybweekaly(model.getRybweeka());
                viewHolder.setRysweekaly(model.getRysweeka());

                viewHolder.setUsbweekely(model.getUsbweeke());
                viewHolder.setUssweekely(model.getUssweeke());
                viewHolder.setUkbweekely(model.getUkbweeke());
                viewHolder.setUksweekely(model.getUksweeke());
                viewHolder.setEubweekely(model.getEubweeke());
                viewHolder.setEusweekely(model.getEusweeke());
                viewHolder.setCnbweekely(model.getCnbweeke());
                viewHolder.setCnsweekely(model.getCnsweeke());
                viewHolder.setCfbweekely(model.getCfbweeke());
                viewHolder.setCfsweekely(model.getCfsweeke());
                viewHolder.setRybweekely(model.getRybweeke());
                viewHolder.setRysweekely(model.getRysweeke());
            }
        };

        WeeklyList.setAdapter(firebaseRecyclerAdapter);
        mProgress.dismiss();
    }

    //View Holder For Recycler View
    public static class WeeklyViewHolder extends RecyclerView.ViewHolder  {
        View mView;
        public WeeklyViewHolder(View itemView) {
            super(itemView);
            mView= itemView;
        }
        public void setWeeklydate(String weekdate){
            TextView weeklydate = (TextView) mView.findViewById(R.id.weekdate);
            weeklydate.setText(weekdate);
        }
        public void setUsbweekly(String usbweek){
            TextView usbweekly = (TextView)mView.findViewById(R.id.usbweekm);
            usbweekly.setText(usbweek);
        }
        public void setUssweekly(String ussweek){
            TextView ussweekly = (TextView)mView.findViewById(R.id.ussweekm);
            ussweekly.setText(ussweek);
        }
        public void setUkbweekly(String ukbweek){
            TextView ukbweekly = (TextView)mView.findViewById(R.id.ukbweekm);
            ukbweekly.setText(ukbweek);
        }
        public void setUksweekly(String uksweek){
            TextView uksweekly = (TextView)mView.findViewById(R.id.uksweekm);
            uksweekly.setText(uksweek);
        }
        public void setEubweekly(String eubweek){
            TextView eubweekly = (TextView)mView.findViewById(R.id.eubweekm);
            eubweekly.setText(eubweek);
        }
        public void setEusweekly(String eusweek){
            TextView eusweekly = (TextView)mView.findViewById(R.id.eusweekm);
            eusweekly.setText(eusweek);
        }
        public void setCnbweekly(String cnbweek){
            TextView cnbweekly = (TextView)mView.findViewById(R.id.cnbweekm);
            cnbweekly.setText(cnbweek);
        }
        public void setCnsweekly(String cnsweek){
            TextView cnsweekly = (TextView)mView.findViewById(R.id.cnsweekm);
            cnsweekly.setText(cnsweek);
        }

        public void setUsbweekaly(String usbweeka){
            TextView usbweekaly = (TextView)mView.findViewById(R.id.usbweeka);
            usbweekaly.setText(usbweeka);
        }
        public void setUssweekaly(String ussweeka){
            TextView ussweekaly = (TextView)mView.findViewById(R.id.ussweeka);
            ussweekaly.setText(ussweeka);
        }
        public void setUkbweekaly(String ukbweeka){
            TextView ukbweekaly = (TextView)mView.findViewById(R.id.ukbweeka);
            ukbweekaly.setText(ukbweeka);
        }
        public void setUksweekaly(String uksweeka){
            TextView uksweekaly = (TextView)mView.findViewById(R.id.uksweeka);
            uksweekaly.setText(uksweeka);
        }
        public void setEubweekaly(String eubweeka){
            TextView eubweekaly = (TextView)mView.findViewById(R.id.eubweeka);
            eubweekaly.setText(eubweeka);
        }
        public void setEusweekaly(String eusweeka){
            TextView eusweekaly = (TextView)mView.findViewById(R.id.eusweeka);
            eusweekaly.setText(eusweeka);
        }
        public void setCnbweekaly(String cnbweeka){
            TextView cnbweekaly = (TextView)mView.findViewById(R.id.cnbweeka);
            cnbweekaly.setText(cnbweeka);
        }
        public void setCnsweekaly(String cnsweeka){
            TextView cnsweekaly = (TextView)mView.findViewById(R.id.cnsweeka);
            cnsweekaly.setText(cnsweeka);
        }

        public void setUsbweekely(String usbweeke){
            TextView usbweekely = (TextView)mView.findViewById(R.id.usbweeke);
            usbweekely.setText(usbweeke);
        }
        public void setUssweekely(String ussweeke){
            TextView ussweekely = (TextView)mView.findViewById(R.id.ussweeke);
            ussweekely.setText(ussweeke);
        }
        public void setUkbweekely(String ukbweeke){
            TextView ukbweekely = (TextView)mView.findViewById(R.id.ukbweeke);
            ukbweekely.setText(ukbweeke);
        }
        public void setUksweekely(String uksweeke){
            TextView uksweekely = (TextView)mView.findViewById(R.id.uksweeke);
            uksweekely.setText(uksweeke);
        }
        public void setEubweekely(String eubweeke){
            TextView eubweekely = (TextView)mView.findViewById(R.id.eubweeke);
            eubweekely.setText(eubweeke);
        }
        public void setEusweekely(String eusweeke){
            TextView eusweekely = (TextView)mView.findViewById(R.id.eusweeke);
            eusweekely.setText(eusweeke);
        }
        public void setCnbweekely(String cnbweeke){
            TextView cnbweekely = (TextView)mView.findViewById(R.id.cnbweeke);
            cnbweekely.setText(cnbweeke);
        }
        public void setCnsweekely(String cnsweeke){
            TextView cnsweekely = (TextView)mView.findViewById(R.id.cnsweeke);
            cnsweekely.setText(cnsweeke);
        }
        public void setCfbweekly(String cfbweek){
            TextView cfbweekly = (TextView)mView.findViewById(R.id.cfbweekm);
            cfbweekly.setText(cfbweek);
        }
        public void setCfsweekly(String cfsweek){
            TextView cfsweekly = (TextView)mView.findViewById(R.id.cfsweekm);
            cfsweekly.setText(cfsweek);
        }
        public void setCfbweekaly(String cfbweeka){
            TextView cfbweekaly = (TextView)mView.findViewById(R.id.cfbweeka);
            cfbweekaly.setText(cfbweeka);
        }
        public void setCfsweekaly(String cfsweeka){
            TextView cfsweekaly = (TextView)mView.findViewById(R.id.cfsweeka);
            cfsweekaly.setText(cfsweeka);
        }
        public void setCfbweekely(String cfbweeke){
            TextView cfbweekely = (TextView)mView.findViewById(R.id.cfbweeke);
            cfbweekely.setText(cfbweeke);
        }
        public void setCfsweekely(String cfsweeke){
            TextView cfsweekely = (TextView)mView.findViewById(R.id.cfsweeke);
            cfsweekely.setText(cfsweeke);
        }
        public void setRybweekly(String rybweek){
            TextView rybweekly = (TextView)mView.findViewById(R.id.rybweekm);
            rybweekly.setText(rybweek);
        }
        public void setRysweekly(String rysweek){
            TextView rysweekly = (TextView)mView.findViewById(R.id.rysweekm);
            rysweekly.setText(rysweek);
        }
        public void setRybweekaly(String rybweeka){
            TextView rybweekaly = (TextView)mView.findViewById(R.id.rybweeka);
            rybweekaly.setText(rybweeka);
        }
        public void setRysweekaly(String rysweeka){
            TextView rysweekaly = (TextView)mView.findViewById(R.id.rysweeka);
            rysweekaly.setText(rysweeka);
        }
        public void setRybweekely(String rybweeke){
            TextView rybweekely = (TextView)mView.findViewById(R.id.rybweeke);
            rybweekely.setText(rybweeke);
        }
        public void setRysweekely(String rysweeke){
            TextView rysweekely = (TextView)mView.findViewById(R.id.rysweeke);
            rysweekely.setText(rysweeke);
        }
    }
}
