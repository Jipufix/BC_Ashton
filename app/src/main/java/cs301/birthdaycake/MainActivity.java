package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        CakeView cakeView = (CakeView) findViewById(R.id.cakeview);
        Button blowOut = (Button) findViewById(R.id.button);


        CakeController cakeController = new CakeController(cakeView, blowOut);
        blowOut.setOnClickListener(cakeController);


        Switch candles = (Switch) findViewById(R.id.switch2);
        candles.setOnCheckedChangeListener(cakeController);

        SeekBar candleNum = (SeekBar)findViewById(R.id.seekBar);
        candleNum.setOnSeekBarChangeListener(cakeController);
    }
    public void goodbye(View button) {
        Log.i("button","Goodbye");
    }
}
