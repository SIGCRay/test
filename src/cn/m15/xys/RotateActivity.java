package cn.m15.xys;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class RotateActivity extends Activity {

    /**������ת������ť**/
    Button mButton0 = null;
  
    /**������ת������ť**/
    Button mButton1 = null;
  
    /**��ʾ������ImageView**/
    ImageView mImageView = null;
  
    /**������ת����**/
    Animation mLeftAnimation = null;
    
    /**������ת����**/
    Animation mRightAnimation = null; 
    
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.retate);

	/**�õ�ImageView����**/
	mImageView = (ImageView)findViewById(R.id.imageView);

	/**����������������ת����**/
	mLeftAnimation = AnimationUtils.loadAnimation(this, R.anim.retateleft);
	mRightAnimation = AnimationUtils.loadAnimation(this, R.anim.retateright);
	
	mButton0 = (Button)findViewById(R.id.button0);
	mButton0.setOnClickListener(new OnClickListener() {
	    
	    @Override
	    public void onClick(View arg0) {
	    
		/**����������ת����**/
		mImageView.startAnimation(mLeftAnimation);
	    
	    }
	});
	
	mButton1 = (Button)findViewById(R.id.button1);
	mButton1.setOnClickListener(new OnClickListener() {
	    
	    @Override
	    public void onClick(View arg0) {
		/**����������ת����**/
		mImageView.startAnimation(mRightAnimation);
	    }
	});
    }
}