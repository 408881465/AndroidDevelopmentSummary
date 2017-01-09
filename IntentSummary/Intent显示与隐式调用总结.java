һ��Intent��ʾ����

   1��������������
        Intent intent=new Intent(MainActivity.this,Main2Activity.class);  //��ǰActivity��Ҫ��ת��Activity
        startActivity(intent); //����Activity
    
����Intent��ʽ����

   1��ע������
        Intent��ʽ����ʱ����������ȷָ��������һ���������ϵͳȥ�����ҳ����ʵĻȥ������
        һ��Intent��ֻ����һ��action�������԰������category��
		<category android:name="android.intent.category.DEFAULT"/> //���д��벻��ʡ�ԣ���������г���
   
   2��������������
        Intent intent=new Intent("com.dumin.zsc.intentdemo.ACTION_START");
        startActivity(intent);
		
   3��AndroidManifest�ļ���������
        <activity
            android:name=".Main2Activity">
            <intent-filter>
                <action android:name="com.dumin.zsc.intentdemo.ACTION_START"/>   //����Ҫ������Activity
                <category android:name="android.intent.category.DEFAULT"/>       //����Ĭ��������ʽ
				<category android:name="com.dumin.zsc.intentdemo.MY_CATEGORY"/>
            </intent-filter>
        </activity>
        <activity
            android:name=".Main3Activity">
            <intent-filter>
                <action android:name="com.dumin.zsc.intentdemo.ACTION_START"/>   //����Ҫ������Activity
                <category android:name="android.intent.category.DEFAULT"/>       //����Ĭ��������ʽ
				<category android:name="com.dumin.zsc.intentdemo.MY_CATEGORY"/>
            </intent-filter>
        </activity>
		
		/************************ϵͳ����������ѡ����ѡ�������Լ�����������һ���**********************/
		
   4��Intent������������Ļ
        (1) ����ϵͳ�������"�ٶ���ҳ"
		    //ָ��Intent��ActionΪ��Intent.ACTION_VIEW������ǰ�׿ϵͳ���õ�һ������
			Intent it=new Intent(Intent.ACTION_VIEW);
			//���ַ���������Uri���󣬲�����setData������������󴫵ݽ�ȥ
			it.setData(Uri.parse("https://www.baidu.com"));
			startActivity(it);
		
		(2) ����ϵͳ���Ž���
		    Intent it = new Intent(Intent.ACTION_DIAL);
            it.setData(Uri.parse("tel:10086"));
            startActivity(it);
			
		(3) ����һ�����������
		
		      MainActivity�������£�
				String data="Hello SecondActivity!";
				Intent intent = new Intent(MainActivity.this,SecondActivity.class);
				intent.putExtra("extra_data",data);
				startActivity(intent);
				
			  SecondActivity�������£�
			    Intent intent=getIntent();
				String data=intent.getStringExtra("extra_data");
				Log.i("data",data);
		
		(4) ����һ�����������
		    MainActivity�������£�
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this,SecondActivity.class);
				startActivityForResult(intent,1);
			}
			
            //��SecondActivity������ʱ��ص���һ�����onActivityResult()����
			@Override
			protected void onActivityResult(int requestCode, int resultCode, Intent data) {
				//ͨ��requestCode�ж�������Դ��ͨ��resultCode�жϴ������Ƿ�ɹ�����data��ȡ������
				switch (requestCode){
					case 1:
						if(resultCode==RESULT_OK){
							String returnedData=data.getStringExtra("data_extra");
							Log.d("FirstActivity",returnedData);
						}
						break;
					default:
				}
			}
			
	        SecondActivity�������£�
			
			@Override
			public void onClick(View v) {
				Intent intent=getIntent();
				intent.putExtra("data_extra","Hello FirstActivity!");
				setResult(RESULT_OK,intent);
				finish();
			}