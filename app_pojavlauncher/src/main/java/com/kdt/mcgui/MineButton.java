package com.kdt.mcgui;

import android.content.*;
import android.graphics.*;
import android.graphics.drawable.Drawable;
import android.util.*;

import androidx.core.content.res.ResourcesCompat;

import net.kdt.pojavlaunch.R;

public class MineButton extends androidx.appcompat.widget.AppCompatButton
{
	
	public MineButton(Context ctx) {
		this(ctx, null);
	}
	
	public MineButton(Context ctx, AttributeSet attrs) {
		super(ctx, attrs);
		init();
	}

	public void init() {
		setBackgroundResource(R.drawable.mine_button_background);
		setTypeface(ResourcesCompat.getFont(getContext(), R.font.noto_sans_bold));
	}

}
