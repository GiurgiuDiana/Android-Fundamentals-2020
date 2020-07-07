package recycleViewTestAgain.com.recyclerview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private static final String TAG = "RecyclerViewAdapter";

    private ArrayList<String> descrp = new ArrayList<>();
    private ArrayList<String> title = new ArrayList<>();
    private ArrayList<String> ratings = new ArrayList<>();
    private Context mContext;

    public RecyclerViewAdapter(Context context, ArrayList<String> descrps, ArrayList<String> images,ArrayList<String> rating ) {
        descrp = descrps;
        title = images;
        ratings= rating;
        mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_listitem, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        Log.d(TAG, "onBindViewHolder: called.");

        holder.imageName.setText(title.get(position));


        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: clicked on: " + descrp.get(position));

                Toast.makeText(mContext, title.get(position), Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(mContext, GalleryActivity.class);
                intent.putExtra("title", title.get(position));
                intent.putExtra("descrp", descrp.get(position));
                intent.putExtra("rating", ratings.get(position));
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return title.size();
    }
    public int getRating() {
        return ratings.size();
    }
    public int getItemDescCount() {
        return descrp.size();
    }



    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView ImageDescr;
        TextView ImageRatung;
        TextView imageName;
        RelativeLayout parentLayout;

        public ViewHolder(View itemView) {
            super(itemView);

            ImageDescr=itemView.findViewById(R.id.image_description);
            ImageRatung= itemView.findViewById(R.id.image_rating);
            imageName = itemView.findViewById(R.id.image_name);
            parentLayout = itemView.findViewById(R.id.parent_layout);
        }
    }
}















