package com.example.android.moviesapi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class sentimental_analysis extends AppCompatActivity {
    TextView r1, r2, r3, r4, r5, pc, nc, rating;
    DbHandler db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sentimental_analysis);
        r1 = (TextView) findViewById(R.id.r1);
        r2 = (TextView) findViewById(R.id.r2);
        r3 = (TextView) findViewById(R.id.r3);
        r4 = (TextView) findViewById(R.id.r4);
        r5 = (TextView) findViewById(R.id.r5);
        pc = (TextView) findViewById(R.id.pc_ans);
        nc = (TextView) findViewById(R.id.nc_ans);
        rating = (TextView) findViewById(R.id.rating_ans);

        // db = new DbHandler(sentimental_analysis.this);
        String mn = getIntent().getExtras().getString("original_title");
        //   db.addUser(new User(mn,getString(R.string.infinity_ur1),getString(R.string.infinity_ur2),getString(R.string.infinity_ur3),getString(R.string.infinity_ur4),getString(R.string.infinity_ur5),"4512","123","9.1"));
        //db.addUser(new User());
        if (mn.contains("Avengers")) {
            r1.setText(getString(R.string.infinity_ur1));
            r2.setText(getString(R.string.infinity_ur2));
            r3.setText(getString(R.string.infinity_ur3));
            r4.setText(getString(R.string.infinity_ur4));
            r5.setText(getString(R.string.infinity_ur5));
            pc.setText(getString(R.string.infinity_pc));
            nc.setText(getString(R.string.infinity_nc));
            rating.setText(getString(R.string.infinity_rating));
        } else if (mn.contains("Quiet")) {
            r1.setText(getString(R.string.aquietplace_ur1));
            r2.setText(getString(R.string.aquietplace_ur2));
            r3.setText(getString(R.string.aquietplace_ur3));
            r4.setText(getString(R.string.aquietplace_ur4));
            r5.setText(getString(R.string.aquietplace_ur5));
            pc.setText(getString(R.string.aquietplace_pc));
            nc.setText(getString(R.string.aquietplace_nc));
            rating.setText(getString(R.string.aquietplace_rating));
        }
        else if(mn.contains("Your")){
            r1.setText(getString(R.string.yourname_ur1));
            r2.setText(getString(R.string.yourname_ur2));
            r3.setText(getString(R.string.yourname_ur3));
            r4.setText(getString(R.string.yourname_ur4));
            r5.setText(getString(R.string.yourname_ur5));
            pc.setText(getString(R.string.yourname_pc));
            nc.setText(getString(R.string.yourname_nc));
            rating.setText(getString(R.string.yourname_rating));
        }
        else if(mn.contains("Whiplash")){
            r1.setText(getString(R.string.whiplash_ur1));
            r2.setText(getString(R.string.whiplash_ur2));
            r3.setText(getString(R.string.whiplash_ur3));
            r4.setText(getString(R.string.whiplash_ur4));
            r5.setText(getString(R.string.whiplash_ur5));
            pc.setText(getString(R.string.whiplash_pc));
            nc.setText(getString(R.string.whiplash_nc));
            rating.setText(getString(R.string.whiplash_rating));
        }
        else if(mn.contains("Training")){
            r1.setText(getString(R.string.training_ur1));
            r2.setText(getString(R.string.training_ur2));
            r3.setText(getString(R.string.training_ur3));
            r4.setText(getString(R.string.training_ur4));
            r5.setText(getString(R.string.training_ur5));
            pc.setText(getString(R.string.training_pc));
            nc.setText(getString(R.string.training_nc));
            rating.setText(getString(R.string.training_rating));
        }
        else if(mn.contains("Shawshank")){
            r1.setText(getString(R.string.shawshank_ur1));
            r2.setText(getString(R.string.shawshank_ur2));
            r3.setText(getString(R.string.shawshank_ur3));
            r4.setText(getString(R.string.shawshank_ur4));
            r5.setText(getString(R.string.shawshank_ur5));
            pc.setText(getString(R.string.shawshank_pc));
            nc.setText(getString(R.string.shawshank_nc));
            rating.setText(getString(R.string.shawshank_rating));
        }
        else if(mn.contains("Witness")){
            r1.setText(getString(R.string.witness_ur1));
            r2.setText(getString(R.string.witness_ur2));
            r3.setText(getString(R.string.witness_ur3));
            r4.setText(getString(R.string.witness_ur4));
            r5.setText(getString(R.string.witness_ur5));
            pc.setText(getString(R.string.witness_pc));
            nc.setText(getString(R.string.witness_nc));
            rating.setText(getString(R.string.witness_rating));
        }
        else if(mn.contains("Green")){
            r1.setText(getString(R.string.green_ur1));
            r2.setText(getString(R.string.green_ur2));
            r3.setText(getString(R.string.green_ur3));
            r4.setText(getString(R.string.green_ur4));
            r5.setText(getString(R.string.green_ur5));
            pc.setText(getString(R.string.green_pc));
            nc.setText(getString(R.string.green_nc));
            rating.setText(getString(R.string.green_rating));
        }
        else if(mn.contains("Godfather")){
            r1.setText(getString(R.string.god_ur1));
            r2.setText(getString(R.string.god_ur2));
            r3.setText(getString(R.string.god_ur3));
            r4.setText(getString(R.string.god_ur4));
            r5.setText(getString(R.string.god_ur5));
            pc.setText(getString(R.string.god_pc));
            nc.setText(getString(R.string.god_nc));
            rating.setText(getString(R.string.god_rating));
        }
        else if(mn.contains("Dark")){
            r1.setText(getString(R.string.darkknight_ur1));
            r2.setText(getString(R.string.darkknight_ur2));
            r3.setText(getString(R.string.darkknight_ur3));
            r4.setText(getString(R.string.darkknight_ur4));
            r5.setText(getString(R.string.darkknight_ur5));
            pc.setText(getString(R.string.darkknight_pc));
            nc.setText(getString(R.string.darkknight_nc));
            rating.setText(getString(R.string.darkknight_rating));
        }
        else if(mn.contains("Spirited")){
            r1.setText(getString(R.string.spirited_ur1));
            r2.setText(getString(R.string.spirited_ur2));
            r3.setText(getString(R.string.spirited_ur3));
            r4.setText(getString(R.string.spirited_ur4));
            r5.setText(getString(R.string.spirited_ur5));
            pc.setText(getString(R.string.spirited_pc));
            nc.setText(getString(R.string.spirited_nc));
            rating.setText(getString(R.string.spirited_rating));
        }
        else if(mn.contains("Solo")){
            r1.setText(getString(R.string.solo_ur1));
            r2.setText(getString(R.string.solo_ur2));
            r3.setText(getString(R.string.solo_ur3));
            r4.setText(getString(R.string.solo_ur4));
            r5.setText(getString(R.string.solo_ur5));
            pc.setText(getString(R.string.solo_pc));
            nc.setText(getString(R.string.solo_nc));
            rating.setText(getString(R.string.solo_rating));
        }
        else if(mn.contains("Sherlock")){
            r1.setText(getString(R.string.sherlok_ur1));
            r2.setText(getString(R.string.sherlok_ur2));
            r3.setText(getString(R.string.sherlok_ur3));
            r4.setText(getString(R.string.sherlok_ur4));
            r5.setText(getString(R.string.sherlok_ur5));
            pc.setText(getString(R.string.sherlok_pc));
            nc.setText(getString(R.string.sherlok_nc));
            rating.setText(getString(R.string.sherlok_rating));
        }
        else if(mn.contains("Schindler's")){
            r1.setText(getString(R.string.schindler_ur1));
            r2.setText(getString(R.string.schindler_ur2));
            r3.setText(getString(R.string.schindler_ur3));
            r4.setText(getString(R.string.schindler_ur4));
            r5.setText(getString(R.string.schindler_ur5));
            pc.setText(getString(R.string.schindler_pc));
            nc.setText(getString(R.string.schindler_nc));
            rating.setText(getString(R.string.schindler_rating));
        }
        else if(mn.contains("Rampage")){
            r1.setText(getString(R.string.rampage_ur1));
            r2.setText(getString(R.string.rampage_ur2));
            r3.setText(getString(R.string.rampage_ur3));
            r4.setText(getString(R.string.rampage_ur4));
            r5.setText(getString(R.string.rampage_ur5));
            pc.setText(getString(R.string.rampage_pc));
            nc.setText(getString(R.string.rampage_nc));
            rating.setText(getString(R.string.rampage_rating));
        }
        else if(mn.contains("Pulp")){
            r1.setText(getString(R.string.pulp_ur1));
            r2.setText(getString(R.string.pulp_ur2));
            r3.setText(getString(R.string.pulp_ur3));
            r4.setText(getString(R.string.pulp_ur4));
            r5.setText(getString(R.string.pulp_ur5));
            pc.setText(getString(R.string.pulp_pc));
            nc.setText(getString(R.string.pulp_nc));
            rating.setText(getString(R.string.pulp_rating));
        }
        else if(mn.contains("Psycho")){
            r1.setText(getString(R.string.psycho_ur1));
            r2.setText(getString(R.string.psycho_ur2));
            r3.setText(getString(R.string.psycho_ur3));
            r4.setText(getString(R.string.psycho_ur4));
            r5.setText(getString(R.string.psycho_ur5));
            pc.setText(getString(R.string.psycho_pc));
            nc.setText(getString(R.string.psycho_nc));
            rating.setText(getString(R.string.psycho_rating));
        }
        else if(mn.contains("Pope")){
            r1.setText(getString(R.string.pope_ur1));
            r2.setText(getString(R.string.pope_ur2));
            r3.setText(getString(R.string.pope_ur3));
            r4.setText(getString(R.string.pope_ur4));
            r5.setText(getString(R.string.pope_ur5));
            pc.setText(getString(R.string.pope_pc));
            nc.setText(getString(R.string.pope_nc));
            rating.setText(getString(R.string.pope_rating));
        }
        else if(mn.contains("Once")){
            r1.setText(getString(R.string.once_ur1));
            r2.setText(getString(R.string.once_ur2));
            r3.setText(getString(R.string.once_ur3));
            r4.setText(getString(R.string.once_ur4));
            r5.setText(getString(R.string.once_ur5));
            pc.setText(getString(R.string.once_pc));
            nc.setText(getString(R.string.once_nc));
            rating.setText(getString(R.string.once_rating));
        }
        else if(mn.contains("Mary")){
            r1.setText(getString(R.string.mary_ur1));
            r2.setText(getString(R.string.mary_ur2));
            r3.setText(getString(R.string.mary_ur3));
            r4.setText(getString(R.string.mary_ur4));
            r5.setText(getString(R.string.mary_ur5));
            pc.setText(getString(R.string.mary_pc));
            nc.setText(getString(R.string.mary_nc));
            rating.setText(getString(R.string.mary_rating));
        }
        else if(mn.contains("Love")){
            r1.setText(getString(R.string.love_ur1));
            r2.setText(getString(R.string.love_ur2));
            r3.setText(getString(R.string.love_ur3));
            r4.setText(getString(R.string.love_ur4));
            r5.setText(getString(R.string.love_ur5));
            pc.setText(getString(R.string.love_pc));
            nc.setText(getString(R.string.love_nc));
            rating.setText(getString(R.string.love_rating));
        }
        else if(mn.contains("Life")){
            r1.setText(getString(R.string.life_ur1));
            r2.setText(getString(R.string.life_ur2));
            r3.setText(getString(R.string.life_ur3));
            r4.setText(getString(R.string.life_ur4));
            r5.setText(getString(R.string.life_ur5));
            pc.setText(getString(R.string.life_pc));
            nc.setText(getString(R.string.life_nc));
            rating.setText(getString(R.string.life_rating));

        }
        else if(mn.contains("Angryman")){
            r1.setText(getString(R.string.angryman_ur1));
            r2.setText(getString(R.string.angryman_ur2));
            r3.setText(getString(R.string.angryman_ur3));
            r4.setText(getString(R.string.angryman_ur4));
            r5.setText(getString(R.string.angryman_ur5));
            pc.setText(getString(R.string.angryman_pc));
            nc.setText(getString(R.string.angryman_nc));
            rating.setText(getString(R.string.angryman_rating));
        }
        else if(mn.contains("Action")){
            r1.setText(getString(R.string.actionpoint_ur1));
            r2.setText(getString(R.string.actionpoint_ur2));
            r3.setText(getString(R.string.actionpoint_ur3));
            r4.setText(getString(R.string.actionpoint_ur4));
            r5.setText(getString(R.string.actionpoint_ur5));
            pc.setText(getString(R.string.actionpoint_pc));
            nc.setText(getString(R.string.actionpoint_nc));
            rating.setText(getString(R.string.actionpoint_rating));
        }
        else if(mn.contains("American")){
            r1.setText(getString(R.string.americananimals_ur1));
            r2.setText(getString(R.string.americananimals_ur2));
            r3.setText(getString(R.string.americananimals_ur3));
            r4.setText(getString(R.string.americananimals_ur4));
            r5.setText(getString(R.string.americananimals_ur5));
            pc.setText(getString(R.string.americananimals_pc));
            nc.setText(getString(R.string.americananimals_nc));
            rating.setText(getString(R.string.americananimals_rating));
        }
        else if(mn.contains("Avengers")){
            r1.setText(getString(R.string.avengers_ur1));
            r2.setText(getString(R.string.avengers_ur2));
            r3.setText(getString(R.string.avengers_ur3));
            r4.setText(getString(R.string.avengers_ur4));
            r5.setText(getString(R.string.avengers_ur5));
            pc.setText(getString(R.string.avengers_pc));
            nc.setText(getString(R.string.avengers_nc));
            rating.setText(getString(R.string.avengers_rating));
        }
        else if(mn.contains("Blackwater")) {
            r1.setText(getString(R.string.blackwater_ur1));
            r2.setText(getString(R.string.blackwater_ur2));
            r3.setText(getString(R.string.blackwater_ur3));
            r4.setText(getString(R.string.blackwater_ur4));
            r5.setText(getString(R.string.blackwater_ur5));
            pc.setText(getString(R.string.blackwater_pc));
            nc.setText(getString(R.string.blackwater_nc));
            rating.setText(getString(R.string.blackwater_rating));
        }
    else{
            Toast.makeText(this,"No reviews avalaible",Toast.LENGTH_LONG).show();

        }



    }
}
