1���������£�

	 (1)module��������
	 
		dependencies {
		  compile 'com.jakewharton:butterknife:8.4.0'
		  annotationProcessor 'com.jakewharton:butterknife-compiler:8.4.0'
		}

     (2)����������������

		buildscript {
		  repositories {
			mavenCentral()
		   }
		  dependencies {
			classpath 'com.jakewharton:butterknife-gradle-plugin:8.4.0'
		  }
		}

		apply plugin: 'com.android.library'
		apply plugin: 'com.jakewharton.butterknife'

		dependencies {
		  compile 'com.jakewharton:butterknife:8.4.0'
		  annotationProcessor 'com.jakewharton:butterknife-compiler:8.4.0'
		}
   
2��ʹ��ʾ��
    (1)����module��ʹ�õĴ������£�
	
		class ExampleActivity extends Activity {
		  @BindView(R.id.user) EditText username;
		  @BindView(R.id.pass) EditText password;
		  @BindString(R.string.login_error) String loginErrorMessage;
		  @OnClick(R.id.submit) void submit() {
			// TODO call server...
		  }

		  @Override public void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.simple_activity);
			ButterKnife.bind(this);
			// TODO Use fields...
		  }
		  
		  @UiThread
		  public void updateUI(){
			//����UI����
		  }
		}
		
	(2)��������ʹ�õĴ������£�
	
	    class ExampleActivity extends Activity {
		  @BindView(R2.id.user) EditText username;
		  @BindView(R2.id.pass) EditText password;
		  ...
		}
		
3��ButterKnife���ƣ�

	(1)ǿ���View�󶨺�Click�¼������ܣ��򻯴��룬��������Ч��
	(2)����Ĵ���Adapter���ViewHolder������
	(3)����ʱ����Ӱ��APPЧ�ʣ�ʹ�����÷���
	(4)�����������ɶ���ǿ

4��ʹ���ĵã�

	(1)Activity ButterKnife.bind(this);������setContentView();
	   ֮��,�Ҹ���bind�󶨺�,���಻��Ҫ��bind().
	(2)Fragment ButterKnife.bind(this, mRootView);
	(3)���Բ��ֲ�����private or static ���Σ�����ᱨ��
	(4)setContentView()����ͨ��ע��ʵ�֡�����������Щע���ܿ��ԣ�