package com.example.try_yam2;

import jp.co.yahoo.android.maps.MapActivity;
import jp.co.yahoo.android.maps.MapView;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class MyMapActivity extends MapActivity {

	private MapView _mv;

	@Override
	public void onCreate( Bundle savedInstanceState ) {
		super.onCreate( savedInstanceState );

		// MapView
		_mv = new MapView( this, getString( R.string.appid ) );
		_mv.setScalebar( true );

		// Layout
		final FrameLayout fl = (FrameLayout)getLayoutInflater().inflate( R.layout.main, null );
		fl.addView( _mv, 0 );
		setContentView( fl );
	}

	@Override
	protected boolean isRouteDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}

	public void onImageButtonClick( View v ) {
		getFragmentManager().beginTransaction().show( getFragmentManager().findFragmentById( R.id.frag_map ) ).commit();
	}

}
