package eboves.c4q.nyc.calculator;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by elvisboves on 5/13/15.
 */
public class ButtonOnClickListener implements View.OnClickListener {
    
    TextView textView;
    String input;
    
    public ButtonOnClickListener(TextView textView) {
        this.textView = textView;
        input = "";
    }
    


    public void onClick(View view){

        // associate editText

        int click = view.getId();


            switch (click) {

                case R.id.but0:
                    input += "0";
                    break;
                case R.id.but1:
                    input += "1";
                    break;
                case R.id.but2:
                    input += "2";
                    break;

            }

            textView.setText(input);
        }        
 }
