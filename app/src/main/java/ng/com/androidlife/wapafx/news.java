package ng.com.androidlife.wapafx;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.squareup.picasso.Picasso;

public class news extends Fragment {

    private RecyclerView mBlogList;
    FirebaseDatabase database;
    DatabaseReference myRef;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.activity_news, container, false);

        //Recycler View
        mBlogList = (RecyclerView)rootView.findViewById(R.id.newsList);
        mBlogList.setHasFixedSize(true);
        mBlogList.setLayoutManager(new LinearLayoutManager(this.getActivity()));

        // Send a Query to the database
        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("News");
        myRef.keepSynced(true);


        return rootView;
    }

    @Override
    public void onStart() {
        super.onStart();

        FirebaseRecyclerAdapter<ModelClass, BlogViewHolder>
                firebaseRecyclerAdapter = new FirebaseRecyclerAdapter<ModelClass, BlogViewHolder>(
                        ModelClass.class,
                        R.layout.design_row,
                        BlogViewHolder.class,
                        myRef)  {



                    @Override
                    protected void populateViewHolder(BlogViewHolder viewHolder, ModelClass model,int position) {
                        viewHolder.setTitle(model.getTitle());
                        viewHolder.setDesc(model.getDesc());
                        viewHolder.setImage(getContext(), model.getImage());
                    }
                };
        mBlogList.setAdapter(firebaseRecyclerAdapter);
    }
    //View Holder For Recycler View
    public static class BlogViewHolder extends RecyclerView.ViewHolder  {
        View mView;
        public BlogViewHolder(View itemView) {
            super(itemView);
            mView= itemView;
        }
        public void setTitle(String title){
            TextView post_title = (TextView) mView.findViewById(R.id.post_title);
            post_title.setText(title);
        }
        public void setDesc(String title){
            TextView post_desc = (TextView)mView.findViewById(R.id.post_desc);
            post_desc.setText(title);
        }
        public void setImage(Context ctx , String image){
            ImageView post_image = (ImageView)mView.findViewById(R.id.imageView);
            // We Need TO pass Context
            Picasso.with(ctx).load(image).into(post_image);
        }
    }
}
