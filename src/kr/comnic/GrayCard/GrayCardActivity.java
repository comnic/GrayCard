package kr.comnic.GrayCard;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.google.ads.*;

public class GrayCardActivity extends Activity {
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
    }
}