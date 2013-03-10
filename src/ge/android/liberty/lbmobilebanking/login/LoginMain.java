package ge.android.liberty.lbmobilebanking.login;

import ge.android.liberty.lbmobinebanking.GeneralOnClickListener;
import ge.android.liberty.lbmobinebanking.R;
import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ToggleButton;

public class LoginMain extends Activity implements OnCheckedChangeListener {

	private Button btnBack, btnHome;
	private Spinner spinner;
	private ToggleButton toggleBtn;
	private TextView onOff;

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
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.login_type, android.R.layout.simple_spinner_item);
		spinner.setAdapter(adapter);
		
		onOff = (TextView) findViewById(R.id.textView7);
		toggleBtn = (ToggleButton) findViewById(R.id.toggleButton1);
		toggleBtn.setChecked(true);
		toggleBtn.setOnCheckedChangeListener(this);
	}

	@Override
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		if(isChecked){
			onOff.setText("Yes");
			onOff.setGravity(Gravity.CENTER_VERTICAL);
			onOff.setBackground(getResources().getDrawable(R.drawable.toggle_on));
			RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) toggleBtn.getLayoutParams();
			params.addRule(RelativeLayout.ALIGN_PARENT_RIGHT, 1);
		} else {
			onOff.setText("No");
			onOff.setGravity(Gravity.END | Gravity.CENTER_VERTICAL);
			onOff.setBackground(getResources().getDrawable(R.drawable.toggle_off));
			RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) toggleBtn.getLayoutParams();
			params.addRule(RelativeLayout.ALIGN_PARENT_RIGHT, 0);
			toggleBtn.setLayoutParams(params);
		}
	}
}
