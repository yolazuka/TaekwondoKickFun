package com.example.usuario.taekwondokickfun;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import java.text.NumberFormat;

import static android.R.id.message;
import static com.example.usuario.taekwondokickfun.R.id.bodyattack;
import static com.example.usuario.taekwondokickfun.R.id.marcador;
import static com.example.usuario.taekwondokickfun.R.id.marcador2;
import static com.example.usuario.taekwondokickfun.R.id.textomarcador;
import static com.example.usuario.taekwondokickfun.R.id.textomarcador2;

public class MainActivity extends AppCompatActivity {

    private static final String SCORE_GIRL = "Score_Girl";
    private static final String SCORE_BOY = "Score_Boy";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // Save the current state
        savedInstanceState.putInt(SCORE_GIRL, quantity);
        savedInstanceState.putInt(SCORE_BOY, quantity2);

        // Always call the superclass so it can save the view hierarchy state
        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        // Always call the superclass so it can restore the view hierarchy
        super.onRestoreInstanceState(savedInstanceState);
        // Restore state members from saved instance
        quantity = savedInstanceState.getInt(SCORE_GIRL);
        quantity2 = savedInstanceState.getInt(SCORE_BOY);

    }


    int quantity = 0;
    int quantity2 = 0;


    /**
     * This method is called when the bodyattack button is clicked.
     */
    public void bodyattack(View view) {

        quantity = quantity + 1;
        display(quantity);
        String contadorMessage = "Wow, you added 1 point!" + "\n Awesome!";
        displayMessage(contadorMessage);
    }

    /* This method is called when the bodykick button is clicked.
    */
    public void bodykick(View view) {

        quantity = quantity + 3;
        display(quantity);
        String contadorMessage = "3 points more to your counter!!" +  "\nNice!";
        displayMessage(contadorMessage);
    }

    /* This method is called when the headattack button  is clicked.
   */
    public void headattack(View view) {

        quantity = quantity + 3;
        display(quantity);
        String contadorMessage = "You are doing it really good... 3 plus points" +  "\nSuper!";
        displayMessage(contadorMessage);
    }


    /* This method is called when the caution button is clicked.
  */
    public void caution(View view) {

        quantity = quantity - 1;
        display(quantity);
        String contadorMessage = "Oooouch ! that was painful... 1 point is going away :(" +  "\nBe careful!";
        displayMessage(contadorMessage);
    }

    /**
     * This method displays the given quantity of points on the counter1
     */
    public void display(int score) {

        TextView marcador = (TextView) findViewById(R.id.marcador);

        marcador.setText(String.valueOf(score));

    }
    /**
     * This method displays the given quantity of points on the counter1
     */
    public void display(int score) {

        TextView marcador2 = (TextView) findViewById(R.id.marcador2);

        marcador2.setText(String.valueOf(score));

    }

    public void bodyattack2(View view) {

        quantity2 = quantity2 + 1;
        display(quantity2);
        String contadorMessage2 = "Wow, you added 1 points!" + "\n Awesome!";
        displayMessage2(contadorMessage2);
    }

    /* This method is called when the bodykick2 button is clicked.
    */
    public void bodykick2(View view) {

        quantity2 = quantity2 + 3;
        display(quantity2);
        String contadorMessage2 = "3 points more your counter!!" +  "\nNice!";
        displayMessage2(contadorMessage2);
    }

    /* This method is called when the headattack2 button  is clicked.
   */
    public void headattack2(View view) {

        quantity2 = quantity2 + 3;
        display(quantity2);
        String contadorMessage2 = "You are doing it really good... 3 plus points" +  "\nSuper!";
        displayMessage2(contadorMessage2);
    }


    /* This method is called when the caution2 button is clicked.
  */
    public void caution2(View view) {

        quantity2 = quantity2 - 1;
        display(quantity2);
        String contadorMessage2 = "Oooouch ! that was hard... 1 point is going away :(" +  "\nWatch out!";
        displayMessage2(contadorMessage2);
    }

    /* This method is called when the RESET button is clicked.
  */
    public void botonreset(View view) {

        quantity = 0;
        quantity2 = 0;
        display(quantity);
        display(quantity2);
        String contadorMessage = "LETS START AGAIN!";
        String contadorMessage2 = "LETS START AGAIN! ";
        displayMessage(contadorMessage);
        displayMessage2(contadorMessage2);

    }

}
