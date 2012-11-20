package cn.m15.xys;

import android.app.Activity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class AllActivity extends Activity {
    /**��ʾ������ImageView**/
    ImageView mImageView = null;
  
    /**�ۺ϶���**/
    Animation mAnimation = null;
    @Override
    public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.translate);

	/**�õ�ImageView����**/
	mImageView = (ImageView)findViewById(R.id.imageView);

	/**�����ۺ϶���**/
	mAnimation = AnimationUtils.loadAnimation(this, R.anim.all);
	
	/**�����ۺ϶���**/
	mImageView.startAnimation(mAnimation);
    }
}