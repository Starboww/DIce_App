package in.starbow.diceappv20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
   ImageView blue;
   ImageView red;
  private Random myRandomNum = new Random();
  private ImageButton imageButton;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        blue= findViewById(R.id.blueDice);
        red =findViewById(R.id.redDice);
        imageButton=findViewById(R.id.playBtn);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rolldice();
            }
        });

    }
    private void rolldice()
    {
        int ramdomNum1 = myRandomNum.nextInt(6)+1;
       int randomNum2 =myRandomNum.nextInt(6)+1;
        switch(ramdomNum1)
        {
            case 1: red.setImageResource(R.drawable.dice1);
                break;
            case 2: red.setImageResource(R.drawable.dice2);
                break;

            case 3: red.setImageResource(R.drawable.dice3);
                break;

            case 4: red.setImageResource(R.drawable.dice4);
                break;

            case 5: red.setImageResource(R.drawable.dice5);
                break;

            case 6: red.setImageResource(R.drawable.dice6);
                break;

        }
        switch(randomNum2)
        {
            case 1: blue.setImageResource(R.drawable.bluedice1);
                break;
            case 2: blue.setImageResource(R.drawable.bluedice2);
                break;

            case 3: blue.setImageResource(R.drawable.bluedice3);
                break;

            case 4: blue.setImageResource(R.drawable.bluedice4);
                break;

            case 5: blue.setImageResource(R.drawable.bluedice5);
                break;

            case 6: blue.setImageResource(R.drawable.bluedice6);
                break;
        }
    }

}