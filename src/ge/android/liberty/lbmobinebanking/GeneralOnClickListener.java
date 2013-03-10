package ge.android.liberty.lbmobinebanking;

import ge.android.liberty.lbmobilebanking.login.LoginMain;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ToggleButton;

public class GeneralOnClickListener implements OnClickListener {

	private Context context;
	private Intent intent;

	public GeneralOnClickListener(Context context) {
		this.context = context;
	}

	@Override
	public void onClick(View v) {
		if (v.getId() == R.id.button5) {
			((Activity) context).finish();
			return;
		}
		if (v.getId() == R.id.button1) {
			intent = new Intent(context, LoginMain.class);
			context.startActivity(intent);
			return;
		}
		if (v.getId() == R.id.btn_back) {
			((Activity) context).finish();
			return;
		}
	}
}
