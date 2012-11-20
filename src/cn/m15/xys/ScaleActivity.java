package cn.m15.xys;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class ScaleActivity extends Activity {

    /**��С������ť**/
    Button mButton0 = null;
  
    /**�Ŵ󶯻���ť**/
    Button mButton1 = null;
  
    /**��ʾ������ImageView**/
    ImageView mImageView = null;
  
    /**��С����**/
    Animation mLitteAnimation = null;
    
    /**�Ŵ󶯻�**/
    Animation mBigAnimation = null; 
    
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.scale);

	/**�õ�ImageView����**/
	mImageView = (ImageView)findViewById(R.id.imageView);

	/**������С��Ŵ󶯻�**/
	mLitteAnimation = AnimationUtils.loadAnimation(this, R.anim.scalelitte);
	mBigAnimation = AnimationUtils.loadAnimation(this, R.anim.scalebig);
	
	mButton0 = (Button)findViewById(R.id.button0);
	mButton0.setOnClickListener(new OnClickListener() {
	    
	    @Override
	    public void onClick(View arg0) {
	    
		/**������С����**/
		mImageView.startAnimation(mLitteAnimation);
	    
	    }
	});
	
	mButton1 = (Button)findViewById(R.id.button1);
	mButton1.setOnClickListener(new OnClickListener() {
	    
	    @Override
	    public void onClick(View arg0) {
		/**���ŷŴ󶯻�**/
		mImageView.startAnimation(mBigAnimation);
	    }
	});
    }
}