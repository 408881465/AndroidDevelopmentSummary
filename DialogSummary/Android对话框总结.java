1��AlertDialogʹ�÷������£�

	(1)ʾ�����룺
	 
		AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
		dialog.setTitle("�Ի���");
		dialog.setMessage("�����ϴ�ͼƬ...");
		dialog.setCancelable(true);
		dialog.setPositiveButton("ȷ��", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				//�߼�����
			}
		});
		dialog.setNegativeButton("ȡ��", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				//�߼�����
			}
		});
		dialog.show();

2��ProgressDialogʹ�÷������£�

	(1)ʾ���������£�
	
		ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);
		progressDialog.setTitle("�������Ի���");
		progressDialog.setMessage("���ڼ���...");
		progressDialog.setCancelable(true);//�����Ƿ�����ȡ��
		progressDialog.show();