package recycleViewTestAgain.com.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    //vars
    private ArrayList<String> title = new ArrayList<>();
    private ArrayList<String> descrp = new ArrayList<>();
    private ArrayList<String> ratings = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started.");

        init();
    }

    private void init(){

        descrp.add("Forever alone in a crowd, failed comedian Arthur Fleck seeks connection as he walks the streets of Gotham City. Arthur wears two masks -- the one he paints for his day job as a clown, and the guise he projects in a futile attempt to feel like he's part of the world around him. Isolated, bullied and disregarded by society, Fleck begins a slow descent into madness as he transforms into the criminal mastermind known as the Joker.");
        title.add("Joker");
        ratings.add("9/10");

        descrp.add("A nuclear conflict has decimated civilisation. Ninety-seven years later, a spaceship accommodating humanity's lone survivors despatches 100 juvenile delinquents back to the Earth.");
        title.add("100");
        ratings.add("8/10");

        descrp.add("In 1912, 1,316 passengers, from poor emigrants looking for new life in America to some of the world's wealthiest people, boarded the RMS Titanic for her maiden voyage across the Atlantic. The tragic events that followed have captured imaginations for a century, not the least of which is that of award-winning writer Julian Fellowes (`Downton Abbey'), who has brought the story to life again in this miniseries. Events unfold through the points of view of those aboard, from first class to steerage, as the early jubilant mood turns dark and the passengers are shaken from their private worlds of secrets, love and resentment. The individual stories come together in a playing field levelled by disaster as everyone struggles to survive, leaving the lives of those involved forever changed.");
        title.add("Titanic");
        ratings.add("5/10");

        descrp.add("Thirty years ago, Clifford McBride led a voyage into deep space, but the ship and crew were never heard from again. Now his son -- a fearless astronaut -- must embark on a daring mission to Neptune to uncover the truth about his missing father and a mysterious power surge that threatens the stability of the universe.");
        title.add("Ad Astra");
        ratings.add("8/10");
        descrp.add("Life with Louie is an American animated sitcom. The show is based on the childhood of stand-up comedian Louie Anderson, growing up with his family in Wisconsin, although Anderson himself is from Minnesota.");
    title.add("Life with Louie");
        ratings.add("8/10");

        descrp.add("Widely regarded as one of the greatest films of all time, this mob drama, based on Mario Puzo's novel of the same name, focuses on the powerful Italian-American crime family of Don Vito Corleone (Marlon Brando). When the don's youngest son, Michael (Al Pacino), reluctantly joins the Mafia, he becomes involved in the inevitable cycle of violence and betrayal. Although Michael tries to maintain a normal relationship with his wife, Kay (Diane Keaton), he is drawn deeper into the family business.");
        title.add("The Godfather");
        ratings.add("10/10");
        descrp.add("After staging his own suicide, a crazed scientist uses his power to become invisible to stalk and terrorize his ex-girlfriend. When the police refuse to believe her story, she decides to take matters into her own hands and fight back.");
        title.add("The Invisible Man");
        ratings.add("9.5/10");
        descrp.add("Evolving from single-celled yellow organisms at the dawn of time, Minions live to serve, but find themselves working for a continual series of unsuccessful masters, from T. Rex to Napoleon. Without a master to grovel for, the Minions fall into a deep depression. But one minion, Kevin, has a plan; accompanied by his pals Stuart and Bob, Kevin sets forth to find a new evil boss for his brethren to follow. Their search leads them to Scarlet Overkill, the world's first-ever super-villainess.");
        title.add("Minions");
        ratings.add("8/10");
        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this,  descrp,title,ratings);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}






















