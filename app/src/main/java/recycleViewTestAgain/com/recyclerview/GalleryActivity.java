package recycleViewTestAgain.com.recyclerview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class GalleryActivity extends AppCompatActivity {

    private static final String TAG = "GalleryActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        Log.d(TAG, "onCreate: started.");

        getIncomingIntent();
    }

    private void getIncomingIntent(){
        Log.d(TAG, "getIncomingIntent: checking for incoming intents.");

        if(getIntent().hasExtra("title") && getIntent().hasExtra("descrp")&& getIntent().hasExtra("rating")){
            Log.d(TAG, "getIncomingIntent: found intent extras.");

            String imageUrl = getIntent().getStringExtra("title");
            String imageName = getIntent().getStringExtra("descrp");
            String rating = getIntent().getStringExtra("rating");

            setImage(imageUrl, imageName,rating);
        }
    }


    private void setImage(String title, String descrp,String rating){
        Log.d(TAG, "setImage: setting te image and name to widgets.");

        TextView name = findViewById(R.id.image_title);
        name.setText(title);
        TextView name2 = findViewById(R.id.image_description);
        name2.setText(descrp);
        TextView name3 = findViewById(R.id.image_rating);
        name3.setText(rating);

    }

}


















