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
                case R.id.but3:
                    input += "3";
                    break;
                case R.id.but4:
                    input += "4";
                    break;
                case R.id.but5:
                    input += "5";
                    break;
                case R.id.but6:
                    input += "6";
                    break;
                case R.id.but7:
                    input += "7";
                    break;
                case R.id.but8:
                    input += "8";
                    break;
                case R.id.but9:
                    input += "9";
                    break;
                case R.id.butDot:
                    input += ".";
                    break;
                case R.id.butDelete:
                    if (input.length() != 0) {
                        input = input.substring(0, input.length() - 1);
                    }
                    break;
                case R.id.butSum:
                    input += "+";
                    break;
                case R.id.butSub:
                    input += "-";
                    break;
                case R.id.butMult:
                    input += "*";
                    break;
                case R.id.butDiv:
                    input += "/";
                    break;
                case R.id.butClr:
                    if (input.length() != 0) {
                        input = "";
                    }
                    break;

            }

            textView.setText(input);
        }        
 }
