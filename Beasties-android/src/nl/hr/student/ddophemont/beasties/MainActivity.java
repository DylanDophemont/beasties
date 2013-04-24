package nl.hr.student.ddophemont.beasties;

import nl.hr.student.ddophemont.beasties.enemies.Beasties;
import android.os.Bundle;
import android.view.View;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;

public class MainActivity extends AndroidApplication {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        AndroidApplicationConfiguration cfg = new AndroidApplicationConfiguration();
        cfg.useGL20 = true;
        
        initialize(new Beasties(), cfg);
    }

	@SuppressWarnings("deprecation")
	@Override
	protected void onResume() {
		View rootView = getWindow().getDecorView();
		rootView.setSystemUiVisibility(View.STATUS_BAR_HIDDEN);
		
		super.onResume();
	}
    
}