package kr.comnic.GrayCard;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.google.ads.AdRequest;
import com.google.ads.AdSize;
import com.google.ads.AdView;

public class GrayCardActivity extends Activity {
	View viewCard1, viewCard2, viewCard3;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        // Create the adView
        AdView adView = new AdView(this, AdSize.BANNER, "a14de48ad00fdd4");
        // Lookup your LinearLayout assuming it¡¯s been given
        // the attribute android:id="@+id/mainLayout"
        LinearLayout layout = (LinearLayout)findViewById(R.id.adLayout);
        // Add the adView to it
        layout.addView(adView);
        // Initiate a generic request to load it with an ad
        adView.loadAd(new AdRequest());
        
        viewCard1 = findViewById(R.id.imgGrayCard);
        viewCard2 = findViewById(R.id.imgWGBCard);
        viewCard3 = findViewById(R.id.imgStopCard);
        
        findViewById(R.id.btnGrayCard).setOnClickListener(btnOnClickListener);
        findViewById(R.id.btnWGBCard).setOnClickListener(btnOnClickListener);
        findViewById(R.id.btnStopCard).setOnClickListener(btnOnClickListener);
    }
    
    Button.OnClickListener btnOnClickListener = new Button.OnClickListener(){

		@Override
		public void onClick(View v) {
			viewCard1.setVisibility(View.INVISIBLE);
			viewCard2.setVisibility(View.INVISIBLE);
			viewCard3.setVisibility(View.INVISIBLE);

			// TODO Auto-generated method stub
			switch(v.getId()){
			case R.id.btnGrayCard :
				viewCard1.setVisibility(View.VISIBLE);
				break;
			case R.id.btnWGBCard :
				viewCard2.setVisibility(View.VISIBLE);
				break;
			case R.id.btnStopCard :
				viewCard3.setVisibility(View.VISIBLE);
				break;
			}
			
		}
    	
    };
}