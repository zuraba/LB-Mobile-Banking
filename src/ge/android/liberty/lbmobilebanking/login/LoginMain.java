package ge.android.liberty.lbmobilebanking.login;

import ge.android.liberty.lbmobinebanking.GeneralOnClickListener;
import ge.android.liberty.lbmobinebanking.R;
import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class LoginMain extends Activity {

	private Button btnBack, btnHome;
	Spinner spinner;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login_main);

		ActionBar bar = getActionBar();
		bar.setDisplayShowHomeEnabled(false);
		bar.setDisplayShowCustomEnabled(true);
		bar.setCustomView(R.layout.action_bar_with_back_button);

		btnBack = (Button) findViewById(R.id.btn_back);
		btnBack.setOnClickListener(new GeneralOnClickListener(this));

		btnHome = (Button) findViewById(R.id.button5);
		btnHome.setOnClickListener(new GeneralOnClickListener(this));

		spinner = (Spinner) findViewById(R.id.spinner1);
		 ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.login_type, android.R.layout.simple_spinner_dropdown_item);
		 adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
		 spinner.setAdapter(adapter);

	}
}
