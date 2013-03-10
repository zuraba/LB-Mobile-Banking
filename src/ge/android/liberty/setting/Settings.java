package ge.android.liberty.setting;

import ge.android.liberty.lbmobinebanking.R;
import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ToggleButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class Settings extends Activity implements OnCheckedChangeListener {

	private ToggleButton langToggleBtn;
	private TextView langSelector;
	Button settingBtn;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.setings);
		
		ActionBar bar = getActionBar();
		bar.setDisplayShowHomeEnabled(false);
		bar.setDisplayShowCustomEnabled(true);
		bar.setCustomView(R.layout.action_bar_with_back_button);
		
		langSelector = (TextView) findViewById(R.id.textView3);
		langToggleBtn = (ToggleButton) findViewById(R.id.toggleButton1);
		langToggleBtn.setChecked(true);
		langToggleBtn.setOnCheckedChangeListener(this);
	}

	@Override
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		if(isChecked){
			
		}
		
		
		
		if(!isChecked){
			langSelector.setText(getResources().getString(R.string.geo));
			langSelector.setGravity(Gravity.END | Gravity.CENTER_VERTICAL);
			RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) langToggleBtn.getLayoutParams();
			params.addRule(RelativeLayout.ALIGN_PARENT_RIGHT, 0);
			langToggleBtn.setLayoutParams(params);
		}
	}
}
