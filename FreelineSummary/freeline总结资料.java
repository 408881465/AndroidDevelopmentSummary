1���ڹ��̵�build.gradle�������£�

	buildscript {
		repositories {
			jcenter()
		}
		dependencies {
			classpath 'com.antfortune.freeline:gradle:0.8.4'
		}
	}

2����module��build.gradle�������£�
	
	apply plugin: 'com.antfortune.freeline'
	android {
		...
	}

3����AndroidStudio��������������������

	gradlew initFreeline -Pmirror
	python freeline.py
	
    **************ע�����Python�汾����Ϊ 2.7 < version < 3.0*****************