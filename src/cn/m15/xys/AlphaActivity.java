package cn.m15.xys;

import android.app.Activity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class AlphaActivity extends Activity {
    /**��ʾ������ImageView**/
    ImageView mImageView = null;
  
    /**͸������**/
    Animation mAnimation = null;
    @Override
    public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.translate);

	/**�õ�ImageView����**/
	mImageView = (ImageView)findViewById(R.id.imageView);

	/**����͸������**/
	mAnimation = AnimationUtils.loadAnimation(this, R.anim.alpha);
	
	/**����͸������**/
	mImageView.startAnimation(mAnimation);
    }
}