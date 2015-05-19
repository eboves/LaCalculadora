//starts at 0, crash you click del too many times


package eboves.c4q.nyc.calculator;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

/**
 * Created by elvisboves on 5/13/15.
 */
public class ButtonOnClickListener implements View.OnClickListener {

    TextView textView;
    String input;

    public ButtonOnClickListener(TextView textView) {
        this.textView = textView;
        input = ""; ;
    }

    public void onClick(View view){
        String string = textView.getText().toString();
        String last = string.substring(string.length() - 1);
        Log.d("last",last);

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

            case R.id.butDot://crashes without zero look at iphone cal
                if (last.equals(".")){ //prevents dot from being clicked twice in a row
                    input += "";
                }
                else if (last.equals("+")){
                    input+="0.";
                }
                else if (last.equals("-")){
                    input+="0.";
                }
                else if (last.equals("/")){
                    input+="0.";
                }
                else if (last.equals("*")) {
                    input += "0.";
                }
                else if (string.equals(" ")) {
                    input += "0.";
                }
                else {
                    input += ".";
                }
        break;
            case R.id.butSum:
                if (last.equals("+")){
                    input+="";
                }
                else if (last.equals("-")){
                    input+="";
                }
                else if (last.equals("/")){
                    input+="";
                }
                else if (last.equals("*")) {
                    input += "";
                }
                else if (string.equals(" ")) {
                    input += "";
                }
                else {
                    input += "+";
                }break;

            case R.id.butSub:
                if (last.equals("+")){
                    input+="";
                }
                else if (last.equals("-")){
                    input+="";
                }
                else if (last.equals("/")){
                    input+="";
                }
                else if (last.equals("*")) {
                    input += "";
                }
                else {
                    input += "-";
                }break;

            case R.id.butMult:
                if (last.equals("+")){
                    input+="";
                }
                else if (last.equals("-")){
                    input+="";
                }
                else if (last.equals("/")){
                    input+="";
                }
                else if (last.equals("*")) {
                    input += "";
                }
                else if (string.equals(" ")) {
                        input += "";
                }
                else {
                    input += "*";
                }break;

            case R.id.butDiv:
                if (last.equals("+")){
                    input+="";
                }
                else if (last.equals("-")){
                    input+="";
                }
                else if (last.equals("/")){
                    input+="";
                }
                else if (last.equals("*")) {
                    input += "";
                }
                else if (string.equals(" ")) {
                        input += "";
                }
                else {
                    input += "/";
                }break;

            case R.id.butDelete:
               if (input.length() > 1 ) { // 1 not zerp or crush
                    input = input.substring(0, input.length() - 1);
                }
               else {
                   input = " ";
               }
                break;
            case R.id.butClr:
               // if (input.length() != 0) { not needed
                    input = " "; //needs space or crash if clicked twice
                //} not needed
                break;
            case R.id.butSin:
                input += "Sin(";
                //TODO
                break;
            case R.id.butCos:
                input += "Cos(";
                //TODO
                break;
            case R.id.butTan:
                input += "Tan(";
                //TODO
                break;
            case R.id.butLog:
                input += "Log(";
                //TODO
                break;
            case R.id.butLn:
                input += "Ln(";
                //TODO
                break;
            case R.id.butLeftParent:
                input += "(";
                break;
            case R.id.butRightParent:
                input += ")";
                break;
            case R.id.butExponent:
                input += "e^(";
                //TODO
                break;
            case R.id.butPI:
                input += "π";
                //TODO
                break;
            case R.id.butPercent:
                input += "%";
                //TODO
                break;

        }

        textView.setText(input);
    }
}

