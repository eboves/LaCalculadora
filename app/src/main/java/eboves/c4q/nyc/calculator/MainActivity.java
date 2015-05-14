package eboves.c4q.nyc.calculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {

    private Button butSum;
    private Button butSub;
    private Button butMult;
    private Button butDiv;
    private Button butPercent;
    private Button butEquals;
    private Button butClr;
    private Button butDot;
    private Button but0;
    private Button but1;
    private Button but2;
    private Button but3;
    private Button but4;
    private Button but5;
    private Button but6;
    private Button but7;
    private Button but8;
    private Button but9;
    private String string;

    private TextView result;
    private float saveText;
    private String operators;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        but0 = (Button) findViewById(R.id.but0);
        but1 = (Button) findViewById(R.id.but1);
        but2 = (Button) findViewById(R.id.but2);


        result = (TextView) findViewById(R.id.textResult1);

        ButtonOnClickListener listener = new ButtonOnClickListener(result);

        ArrayList<Button> buttons = new ArrayList<Button>();
        buttons.add(but0);
        buttons.add(but1);
        buttons.add(but2);

        for (Button button : buttons) {
            button.setOnClickListener(listener);
        }


    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
