package com.example.multibutton;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		findViews();
	}

	private TextView result;
	private Button btn_1, btn_2, btn_3, btn_4, btn_5, btn_clean;

	private void findViews() {
		btn_clean = (Button) findViewById(R.id.clean);
		btn_1 = (Button) findViewById(R.id.btn_1);
		btn_2 = (Button) findViewById(R.id.btn_2);
		btn_3 = (Button) findViewById(R.id.btn_3);
		btn_4 = (Button) findViewById(R.id.btn_4);
		btn_5 = (Button) findViewById(R.id.btn_5);
		result = (TextView) findViewById(R.id.input_view);
	}

	public void input(View v) {
		String s = result.getText().toString();
		switch (v.getId()) {

		case R.id.btn_1:

			result.setText(s + "1");
			break;
		case R.id.btn_2:

			result.setText(s + "2");
			break;
		case R.id.btn_3:

			result.setText(s + "3");
			break;
		case R.id.btn_4:

			result.setText(s + "4");
			break;
		case R.id.btn_5:

			result.setText(s + "5");
			break;

		default:
			result.setText("");
			s = "";
			break;
		}
	}
}
