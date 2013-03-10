package ge.android.liberty.lbmobinebanking;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class FirstScreen extends Activity {

	private TextView dateToday, dateYesterday, dateBeforeYesterday,
			dateTomorrow, dateAfterTomorrow;
	private TextView dolarRate;
	private Button loginBtn, settings;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_first_screen);

		ActionBar bar = getActionBar();
		bar.setDisplayShowCustomEnabled(true);
		bar.setCustomView(R.layout.action_bar);
		bar.setDisplayShowHomeEnabled(false);

		loginBtn = (Button) findViewById(R.id.button1);
		loginBtn.setOnClickListener(new GeneralOnClickListener(this));

		settings = (Button) findViewById(R.id.btnSetting);

		dateToday = (TextView) findViewById(R.id.textView8);
		dateYesterday = (TextView) findViewById(R.id.textView9);
		dateBeforeYesterday = (TextView) findViewById(R.id.textView11);
		dateTomorrow = (TextView) findViewById(R.id.textView10);
		dateAfterTomorrow = (TextView) findViewById(R.id.textView12);

		dolarRate = (TextView) findViewById(R.id.usdrate);
		dolarRate.setText("1.6767");

		DateFormat dtf = new SimpleDateFormat("dd");
		Calendar calendar = Calendar.getInstance();
		String today = dtf.format(calendar.getTime());
		calendar.add(Calendar.DATE, -1);
		String yesterday = dtf.format(calendar.getTime());
		calendar.add(Calendar.DATE, -1);
		String beforeYesterday = dtf.format(calendar.getTime());
		calendar.add(Calendar.DATE, 3);
		String tomorrow = dtf.format(calendar.getTime());
		calendar.add(Calendar.DATE, 1);
		String afterTomorrow = dtf.format(calendar.getTime());

		dateToday.setText(today);
		dateYesterday.setText(yesterday);
		dateBeforeYesterday.setText(beforeYesterday);
		dateTomorrow.setText(tomorrow);
		dateAfterTomorrow.setText(afterTomorrow);
	}
}
