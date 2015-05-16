package eboves.c4q.nyc.calculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.math.BigDecimal;
import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {

    public TextView input;
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
    private Button butDelete;
    private String string;

    private TextView result;
    private float saveText;
    private String operators;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = (TextView) findViewById(R.id.textResult1);

        but0 = (Button) findViewById(R.id.but0);
        but1 = (Button) findViewById(R.id.but1);
        but2 = (Button) findViewById(R.id.but2);
        but3 = (Button) findViewById(R.id.but3);
        but4 = (Button) findViewById(R.id.but4);
        but5 = (Button) findViewById(R.id.but5);
        but6 = (Button) findViewById(R.id.but6);
        but7 = (Button) findViewById(R.id.but7);
        but8 = (Button) findViewById(R.id.but8);
        but9 = (Button) findViewById(R.id.but9);
        butDelete = (Button) findViewById(R.id.butDelete);
        butDot = (Button) findViewById(R.id.butDot);
        butSub = (Button) findViewById(R.id.butSub);
        butDiv = (Button) findViewById(R.id.butDiv);
        butMult = (Button) findViewById(R.id.butMult);
        butSum = (Button) findViewById(R.id.butSum);
        butClr = (Button) findViewById(R.id.butClr);
        butClr.setEnabled(false);

        result = (TextView) findViewById(R.id.textResult1);

        ButtonOnClickListener listener = new ButtonOnClickListener(result);

        ArrayList<Button> buttons = new ArrayList<Button>();
        buttons.add(but0);
        buttons.add(but1);
        buttons.add(but2);
        buttons.add(but3);
        buttons.add(but4);
        buttons.add(but5);
        buttons.add(but6);
        buttons.add(but6);
        buttons.add(but7);
        buttons.add(but8);
        buttons.add(but9);
        buttons.add(butDelete);
        buttons.add(butDot);
        buttons.add(butDiv);
        buttons.add(butSum);
        buttons.add(butSub);
        buttons.add(butMult);
        buttons.add(butClr);

        for (Button button : buttons) {
            button.setOnClickListener(listener);


        }
        butDelete.setEnabled(false);
        butDot.setEnabled(false);
        butSub.setEnabled(false);
        butDiv.setEnabled(false);
        butMult.setEnabled(false);
        butSum.setEnabled(false);
        butClr.setEnabled(false);
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

    public void inputToSting(View v) throws Exception{
        String inputString = input.getText().toString();
        BigDecimal resultBigDecimal = null;
        resultBigDecimal = new Expression(inputString).eval();
        String resultString = resultBigDecimal.toString();
        input.setText(resultString);
            }
        }



