1�����jar��

	dependencies {
	    compile 'org.litepal.android:core:1.4.1'
	}

2����assets�ļ���������ļ�litepal.xml����res�ļ��в��У�

	<?xml version="1.0" encoding="utf-8" ?>
	<litepal>
	    <dbname value="Book"/>
	    <version value="1"/>
	    <list>
	       <mapping class="com.dumin.zsc.litepaldemo.Book"/>
	    </list>
	</litepal>

3����AndroidManifest�ļ�������Ӧ�ó�������
	<application
	        android:name="org.litepal.LitePalApplication"
	        ....
	        ....
	</application>

4�����ݿ�

  ��1���������ݿ����
        Connector.getDatabase();

  ��2���������ݱ�
        Book book=new Book();
	    book.setName("Android");
	    book.setAuthor("Dumin");
	    book.setPrice(30);
	    book.setPages(250);
	    book.save();

  ��3���޸����ݱ�
        Book book2=new Book();
        book2.setName("Android1");
        book2.setAuthor("Dumin1");
        book2.setPrice(30);
        book2.setPages(250);
        book2.update(142);

  ��4��ɾ�����ݱ�
        DataSupport.deleteAll(Book.class);
        DataSupport.delete(Book.class,1);//����Id��ɾ��

  ��5����ѯ���ݱ�
        List<Book> books = DataSupport.findAll(Book.class);
        for(Book book1 : books){
            Log.d("MainActivity",book1.getId()+"");
            Log.d("MainActivity",book1.getName()+"");
            Log.d("MainActivity",book1.getAuthor()+"");
            Log.d("MainActivity",book1.getPrice()+"");
            Log.d("MainActivity",book1.getPages()+"");
        }
