package com.example.gittestproject.newfeature;

import android.app.Activity;
import android.os.Bundle;

public class NewActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		System.out.println("New");
	}
}
