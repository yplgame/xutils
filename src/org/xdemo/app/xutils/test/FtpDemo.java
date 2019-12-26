package org.xdemo.app.xutils.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.xdemo.app.xutils.ext.sftp.SFTPUtils;

/**
 * FtpDemo
 * 
 * @version 3
 * @author y
 * @create.tag 2019年12月26日
 */
public class FtpDemo {

	public static void main(String[] args) throws Exception {

//		SFTPUtils sftp = SFTPUtils.getInstance("192.168.15.151", 22, "root", "wxzd*123");
//		//	    Vector<SFTPFile> v=sftp.listAll("/2010");
//		//	    for(SFTPFile f:v){
//		//	       System.out.println(f.toString());
//		//	    }
//		//	    sftp.deleteDir("/2010 - 副本 - 副本",true);
//		//	    System.out.println(sftp.isFile("/2019/3.doc"));
//		//	    sftp.rename("/xx.bat", "/xxxx.bat");
//		//	    sftp.createDir("/xxx/fdsa");
//		sftp.upload("/usr/local/software", "C:\\Users\\y\\Desktop\\vncServer\\libXaw-1.0.13-4.el7.x86_64.rpm", "C:\\Users\\y\\Desktop\\vncServer\\VNC-Server-6.6.0-Linux-x64.rpm",
//				"C:\\Users\\y\\Desktop\\vncServer\\xterm-295-3.el7.x86_64.rpm");
//		//	    sftp.downloadDirToZip("/2010 - 副本 (2)", "D:\\x.zip");
//		//		sftp.downloadFiles("D:\\xxxxxx.zip", "/dd/fd/pom.xml");

		Map<String, String> ips = new HashMap<String, String>();
		Map<String, String> users = new HashMap<String, String>();
		Map<String, String> passwords = new HashMap<String, String>();
		String key = "git";
		ips.put(key, "192.168.200.11");
		users.put(key, "root");
		passwords.put(key, "wxzd*123");
		
		key = "nexus";
		ips.put(key, "192.168.200.14");
		users.put(key, "root");
		passwords.put(key, "wxzd*123");
		
		key = "mysqlmaster";
		ips.put(key, "192.168.200.17");
		users.put(key, "root");
		passwords.put(key, "wxzd*123");
		
		key = "mysqlslave";
		ips.put(key, "192.168.200.18");
		users.put(key, "root");
		passwords.put(key, "wxzd*123");
		
		key = "other";
		ips.put(key, "192.168.200.16");
		users.put(key, "root");
		passwords.put(key, "wxzd*123");
		
		key = "box1";
		ips.put(key, "192.168.15.151");
		users.put(key, "root");
		passwords.put(key, "wxzd*123");
		
		key = "box2";
		ips.put(key, "192.168.15.152");
		users.put(key, "root");
		passwords.put(key, "wxzd*123");
		
		key = "box3";
		ips.put(key, "192.168.15.153");
		users.put(key, "root");
		passwords.put(key, "wxzd*123");
		
		Set<String> keySet = ips.keySet();
		
		for(String keyTemp:keySet) {
			
			SFTPUtils sftp = SFTPUtils.getInstance(ips.get(keyTemp), 22, users.get(keyTemp), passwords.get(keyTemp));
			sftp.upload("/usr/local/software", "C:\\Users\\y\\Desktop\\vncServer\\libXaw-1.0.13-4.el7.x86_64.rpm", "C:\\Users\\y\\Desktop\\vncServer\\VNC-Server-6.6.0-Linux-x64.rpm",
					"C:\\Users\\y\\Desktop\\vncServer\\xterm-295-3.el7.x86_64.rpm");
			
			
		}
		
		
	}

}
