package ge.android.liberty.lbmobilebanking.login;

import ge.android.liberty.lbmobinebanking.R;
import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;

public class LoginMain extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login_main);
		
		ActionBar bar = getActionBar();
		bar.setBackgroundDrawable(getResources().getDrawable(R.drawable.lbheader));
		bar.setDisplayShowHomeEnabled(false);
		bar.setDisplayShowTitleEnabled(false);
		
	}
}
