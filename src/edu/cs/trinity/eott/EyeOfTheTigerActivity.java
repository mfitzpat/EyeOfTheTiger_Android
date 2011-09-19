package edu.cs.trinity.eott;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class EyeOfTheTigerActivity extends Activity {
	/** Called when the activity is first created. */
	private ListView lv1;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.list_item);
		lv1=(ListView)findViewById(R.id.list);
		lv1.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1 , SPORTS));
		lv1.setTextFilterEnabled(true);
		lv1.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Toast.makeText(getApplicationContext(), ((TextView) view).getText(),
						Toast.LENGTH_SHORT).show();
			}
		});
	}

	static final String[] SPORTS = new String[] {
		"Baseball", "Basketball (Men's)", "Basketball (Women's)", "Cross Country", "Football", "Golf (Men's)", "Golf (Women's)", "Soccer (Men's)", "Soccer (Women's)", "Softball", "StarCraft", "Swimming/Diving", "Tennis (Men's)", "Tennis (Women's)", "Track & Field", "Volleyball"
	};
}